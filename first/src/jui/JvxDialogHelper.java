/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jui;

import gengram.SentenceX;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.JTree;
import javax.swing.tree.TreePath;



/**
 *
 * @author lin
 */
public class JvxDialogHelper {
    static String datadir = JvxConfiguration.datadir;
    JvxMainFrame theFrame = null;
    private JTree dialogTree = null;
    DefaultMutableTreeNode rightClickedNode = null;
    
    
    public JvxDialogHelper(JvxMainFrame frame) {
        super();
        theFrame = frame;
    }
    public JPopupMenu createPopup() {
        final DialogMenuAction menuAction = new DialogMenuAction(dialogTree, rightClickedNode);
        
        JPopupMenu popup = new JPopupMenu();
        JMenuItem addMenuItem = new JMenuItem("Add");
        JMenuItem delMenuItem = new JMenuItem("Delete");
        JMenuItem editMenuItem = new JMenuItem("Edit");
        //JMenuItem synMenuItem = new JMenuItem("Synonyms");
        
        addMenuItem.addActionListener(menuAction);
        delMenuItem.addActionListener(menuAction);
        editMenuItem.addActionListener(menuAction);
        //synMenuItem.addActionListener(menuAction);
        
       
        
        popup.add(addMenuItem);
        popup.add(delMenuItem);
        popup.add(editMenuItem);
        popup.add(createSynonymsMenu());
        popup.add(createOkaysSynonymsMenu());
        
        return popup;
    }
    private JMenu createSynonymsMenu() {
        JMenu submenu = new JMenu("Synonyms");
        
        Object ox = rightClickedNode.getUserObject();
        if(ox instanceof SentenceX) {
            SentenceX sx = (SentenceX)ox;
            String words[] = sx.getWords();
            //String syns[] = JvxDialogLoader.gen.getSynonyms( words[words.length/2]);
            for(String word : words) {
                String syns[] = JvxDialogLoader.gen.getSynonyms( word );
                if(syns != null) {
                    JMenu syMenu = new JMenu(word);
                    for(String s : syns) {
                        JMenuItem menuItem = new JMenuItem(s);
                        syMenu.add(menuItem);
                    }
                    submenu.add(syMenu);
                }
            }
            
        }
        return submenu;
    }
    private JMenu createOkaysSynonymsMenu() {
        JMenu submenu = new JMenu("Synonyms");
        
        Object ox = rightClickedNode.getUserObject();
        if(ox instanceof SentenceX) {
            SentenceX sx = (SentenceX)ox;
            String words[] = sx.getWords();
            String[][] okwords = sx.getOkayWords();
            for(String word : words) {
                String[] syns = null;
                if(word == null) continue;
                for(String[] oks : okwords) {
                    if(oks == null) continue;
                    for(String ok : oks) {
                        if(ok == null) continue;
                        if(ok.equals(word) && oks.length > 1) {
                            syns = oks;
                            break;
                        }
                    }
                    if(syns != null) break;
                }
                if(syns != null) {
                    JMenu syMenu = new JMenu(word);
                    for(String s : syns) {
                        if(word.equals(s)) continue;
                        JMenuItem menuItem = new JMenuItem(s);
                        syMenu.add(menuItem);
                    }
                    submenu.add(syMenu);
                }
            }
            
        }
        return submenu;
    }     

    
    public void dialogTreeRClicked(java.awt.event.MouseEvent evt) {
        JTree tree = (JTree)evt.getSource();
            
        if( evt.isPopupTrigger() ) {
            int x = evt.getX();
            int y = evt.getY();
            dialogTree = tree;
            TreePath path = tree.getPathForLocation(x, y);
            if (path == null) return;
            
            rightClickedNode =
                            (DefaultMutableTreeNode)path.getLastPathComponent();

            TreePath[] selectionPaths = tree.getSelectionPaths();
            //check if node was selected
            boolean isSelected = false;
            if (selectionPaths != null) {
                for (TreePath selectionPath : selectionPaths) {
                    if (selectionPath.equals(path)) {
                        isSelected = true;
                    }
                }
            }
            //if clicked node was not selected, select it
            if(!isSelected){
                tree.setSelectionPath(path);
            }
            //if(rightClickedNode.isLeaf()){
                JPopupMenu popup = createPopup();
                popup.show(tree, x, y);
           // }
        }
        else {
        }
    }

    void dialogTreeMouseClicked(MouseEvent evt) {
        JTree tree = (JTree)evt.getSource();
        
        if(evt.getClickCount() == 1 || evt.getClickCount() == 2) {
            TreePath tpath = tree.getSelectionPath();
            if(tpath != null) {
                ArrayList<String> oks = new ArrayList<String>();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)tpath.getLastPathComponent();
                System.out.println(node);
                for(Enumeration e = node.breadthFirstEnumeration(); e.hasMoreElements();) {
                    DefaultMutableTreeNode nd = (DefaultMutableTreeNode)e.nextElement();
                    ArrayList<String> al = null;
                    Object sx = nd.getUserObject();
                    if(sx instanceof SentenceX) {
                        al = new ArrayList<String> ();
                        ((SentenceX)sx).generateokays(al);
                    }
                    if(al != null) {
                        oks.addAll(al);
                    }
                }
                theFrame.getGrammarList().setListData(oks.toArray());
            }
                
        }
    }
}
class DialogMenuAction implements ActionListener {

    private JTree dialogTree = null;
    DefaultMutableTreeNode rightClickedNode = null;
    
    DialogMenuAction(JTree tree, DefaultMutableTreeNode rNode) {
        dialogTree = tree;
        rightClickedNode = rNode;
    }
    
    public void actionPerformed(ActionEvent ae) {
        DefaultTreeModel model = (DefaultTreeModel)dialogTree.getModel();
        JMenuItem mi = (JMenuItem)ae.getSource();
        String action = mi.getText();
        System.out.println("Menu: " + action);
        // TODO - may be a confirm action here
        if(action.equals("Add")) {
            DefaultMutableTreeNode anotherNode = new DefaultMutableTreeNode(" ");
            rightClickedNode.add(anotherNode);
            model.reload(rightClickedNode);
            TreeNode[] nodes = ((DefaultTreeModel) dialogTree.getModel()).getPathToRoot(anotherNode);
            TreePath tpath = new TreePath(nodes);
            //dialogTree.scrollPathToVisible(tpath);
            dialogTree.expandPath(tpath);
            dialogTree.setSelectionPath(tpath);
            //dialogTree.startEditingAtPath(tpath);
        }
        else if(action.equals("Delete")) {
            rightClickedNode.removeAllChildren();
            model.removeNodeFromParent(rightClickedNode);
            rightClickedNode = null;
        }
        else if(action.equals("Edit")) {
            dialogTree.startEditingAtPath(dialogTree.getSelectionPath());
        }
        if(action.equals("Synonyms")) {
            TreePath tpath = dialogTree.getSelectionPath();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)tpath.getLastPathComponent();
            
            Object sx = node.getUserObject();
            if(sx instanceof SentenceX) {
   
                
            }
        }
        model.reload(rightClickedNode);
    }
}

class DragHandler extends TransferHandler {
    JvxMainFrame theFrame = null;
    public DragHandler(JvxMainFrame frame)
    {
        super();
        theFrame = frame;
    }
    public boolean canImport(TransferSupport support) {
         if (!support.isDrop()) {
             return false;
         }

         return support.isDataFlavorSupported(DataFlavor.stringFlavor);
     }

     public boolean importData(TransferSupport support) {
         if (!canImport(support)) {
           return false;
         }

         Transferable transferable = support.getTransferable();
         String line;
         try {
           line = (String) transferable.getTransferData(DataFlavor.stringFlavor);
         } catch (Exception e) {
           return false;
         }

         JTree.DropLocation dl = (JTree.DropLocation) support.getDropLocation();
         
         String[] data = line.split("\n");
         for (String item: data) {
             if (!item.isEmpty()) {
                //DefaultMutableTreeNode node = (DefaultMutableTreeNode)dl.getPath().getLastPathComponent();
                Point p = dl.getDropPoint();
                DefaultMutableTreeNode node = theFrame.getMouseOnNode((int)p.getX(), (int)p.getY());
                node.add(new DefaultMutableTreeNode(item));
                ((DefaultTreeModel)theFrame.getDialogTree().getModel()).reload(node);
             }
         }
         return true;
     }
}

