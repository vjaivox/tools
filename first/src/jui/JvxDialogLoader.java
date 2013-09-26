/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jui;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import java.util.Map.Entry;

import com.jaivox.tools.*;
import com.jaivox.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author lin
 */
public class JvxDialogLoader {
    static String datadir = JvxConfiguration.datadir;
    
    public JvxDialogLoader() {
        
    }
    public void loadDialogs(JTree dialogTree) {
        
        String filename = datadir + "road.tree";
        File f = new File (filename);
        System.out.println (f.getAbsolutePath ());
        DefaultMutableTreeNode node1 = readConversation (datadir + "road.tree", "road");

        DefaultMutableTreeNode node2 = readConversation(datadir + "eattemplate.txt", "restaurant");
        readExpressions(datadir + "road.tree", node2);
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Dialogs");
        root.add(node1);
        root.add(node2);
        DefaultTreeModel model = (DefaultTreeModel)dialogTree.getModel();
        model.setRoot(root);
    }
    void readExpressions(String file, DefaultMutableTreeNode root) {
        QaList qs = new QaList(file);
        Vector <String []> hold = new Vector <String []> ();
        Set <String> keys = qs.getLookup().keySet ();
        for (Iterator<String> it = keys.iterator (); it.hasNext (); ) {
            String key = it.next ();
            QaNode node = qs.getLookup().get (key);
            String tail [] = node.getTail();
            DefaultMutableTreeNode knode = new DefaultMutableTreeNode(key);
            for(String s : tail) knode.add(new DefaultMutableTreeNode(s));
            root.add(knode);
        }
    }
    public DefaultMutableTreeNode readConversation(String filename, String rootName) {
        BufferedReader in = null;
        int level = 0;
        DefaultMutableTreeNode node[] = new DefaultMutableTreeNode[10];
        node[0] = new DefaultMutableTreeNode(rootName);
        
        try {
            in = new BufferedReader (new FileReader (filename));
            String line;
            boolean skip = false;
            
            while ((line = in.readLine ()) != null) {
                String tabline = line;
                line = line.trim();
                if(line.length() <= 0) continue;
                if(line.startsWith("{")) skip = true;
                if(line.startsWith("}")) { skip = false; continue; }
                if(skip) continue;
                level = 1;
                for(int i = 0; tabline.charAt(i) == '\t'; i++) level++;
                DefaultMutableTreeNode tn = new DefaultMutableTreeNode(line);
                node[level] = tn;
                node[level-1].add(tn);
                
                System.out.println(line);
            }
        } catch (Exception e) { e.printStackTrace(); }
        finally {
            try{ if(in != null) in.close(); } catch (Exception ex) { ex.printStackTrace(); }
        }
        return node[0];
    }

    public String [] loadGrammar () {
        ArrayList<String> lines = new ArrayList<String> ();
        try {
                BufferedReader in = new BufferedReader (new FileReader (datadir +"grammar.txt"));
                String line;
                while ((line = in.readLine ()) != null) {
                        lines.add (line);
                }
                in.close ();
                int n = lines.size ();
                String array [] = lines.toArray (new String [n]);
                return array;
        }
        catch (Exception e) {
                e.printStackTrace ();
                String array [] = new String [1];
                array [0] = "Error loading grammar samples.";
                return array;
        }
    }
	
    public String [][] loadQualData () {
        ArrayList<String> lines = new ArrayList<String> ();
        try {
                BufferedReader in = new BufferedReader (new FileReader (datadir +"road.qdb"));
                String line;
                while ((line = in.readLine ()) != null) {
                        if (line.trim ().length () == 0) continue;
                        lines.add (line);
                }
                in.close ();
                int n = lines.size ();
                String line0 = lines.get (0);
                StringTokenizer st = new StringTokenizer (line0, ",");
                int cols = st.countTokens ();
                String table [][] = new String [n-1][cols+1];
                for (int i=1; i<n; i++) {
                        int j = i-1;
                        String row = lines.get (i);
                        st = new StringTokenizer (row, ",");
                        if (st.countTokens () != cols) continue;
                        table [j][0] = ""+i;
                        for (int k=0; k<cols; k++) {
                                String word = st.nextToken ().trim ();
                                table [j][k+1] = word;
                        }
                }
                return table;
        }
        catch (Exception e) {
                e.printStackTrace ();
                String table [][] = new String [1][4];
                table [0][1] = "error";
                table [0][2] = "no value";
                table [0][3] = "no value";
                return table;
        }
    }

}