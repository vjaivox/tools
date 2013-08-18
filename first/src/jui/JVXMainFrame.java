/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jui;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author lin
 */
public class JVXMainFrame extends javax.swing.JFrame {

    DefaultMutableTreeNode rightClickedNode = null;
    /**
     * Creates new form JVXMainFrame
     */
    public JVXMainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        contentSpecPanel = new javax.swing.JPanel();
        langPanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        dgdPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        dialogTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        grammarList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        dictTab = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        dictRelationsTab = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        targetSpecPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        contentSpecPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Content Specification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(29, 103, 229)));

        langPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jComboBox1.setEditable(true);
        jComboBox1.setForeground(new java.awt.Color(112, 125, 209));
        jComboBox1.setMaximumRowCount(100);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English - US", "French", "Hindi", "Spanish" }));

        jLabel1.setText("Select Language:");

        javax.swing.GroupLayout langPanelLayout = new javax.swing.GroupLayout(langPanel);
        langPanel.setLayout(langPanelLayout);
        langPanelLayout.setHorizontalGroup(
            langPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, langPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        langPanelLayout.setVerticalGroup(
            langPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(langPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dgdPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dialog Mgmt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(151, 149, 198)));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Dialogs");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("are NNS JJ-N at this time ;");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("which NN is JJ-P");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        dialogTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        dialogTree.setEditable(true);
        dialogTree.setScrollsOnExpand(true);
        dialogTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dialogTreeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dialogTreeMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dialogTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dialogTree);

        jScrollPane1.setBounds(10, 10, 190, 230);
        jLayeredPane2.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grammarList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "are NNS JJ-N at this time", "which NN is JJ-P" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        grammarList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        grammarList.setToolTipText("");
        jScrollPane2.setViewportView(grammarList);

        jScrollPane2.setBounds(200, 10, 170, 230);
        jLayeredPane2.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dictTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"WH", "which", "what", null, null},
                {"NN", "road", "way", "route", "freeway"},
                {"JJN", "slow", "bad", "ugh", null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tag", "", "", "Title 4", "Title 5"
            }
        ));
        jScrollPane3.setViewportView(dictTab);

        jScrollPane3.setBounds(370, 10, 290, 110);
        jLayeredPane2.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dictRelationsTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dictRelationsTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"road", "which", "slow"},
                {"student", "who", "bad"},
                {"road", "what", "ugh"},
                {"road", "which", "busy"}
            },
            new String [] {
                "", "", ""
            }
        ));
        jScrollPane5.setViewportView(dictRelationsTab);

        jScrollPane5.setBounds(380, 140, 270, 90);
        jLayeredPane2.add(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Roads", "Students", "Employees" }));

        jLabel3.setText("Data:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Old Mill Road", "67.45", "64.61"},
                {"2", null, null, null}
            },
            new String [] {
                "Sl No.", "Road", "Fast", "smooth"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dgdPanelLayout = new javax.swing.GroupLayout(dgdPanel);
        dgdPanel.setLayout(dgdPanelLayout);
        dgdPanelLayout.setHorizontalGroup(
            dgdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dgdPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
            .addComponent(jLayeredPane2)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dgdPanelLayout.setVerticalGroup(
            dgdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dgdPanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentSpecPanelLayout = new javax.swing.GroupLayout(contentSpecPanel);
        contentSpecPanel.setLayout(contentSpecPanelLayout);
        contentSpecPanelLayout.setHorizontalGroup(
            contentSpecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dgdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentSpecPanelLayout.createSequentialGroup()
                .addComponent(langPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentSpecPanelLayout.setVerticalGroup(
            contentSpecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentSpecPanelLayout.createSequentialGroup()
                .addComponent(langPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        targetSpecPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Target Specification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(210, 90, 90)));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recognizer Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 8))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TTS options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 8))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Platform Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 8))); // NOI18N

        jLabel2.setText("OS: ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Linux-RH", "Linux-Debian", "Windows", "Mac", "Tab-Android", "Tab-iOS" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout targetSpecPanelLayout = new javax.swing.GroupLayout(targetSpecPanel);
        targetSpecPanel.setLayout(targetSpecPanelLayout);
        targetSpecPanelLayout.setHorizontalGroup(
            targetSpecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        targetSpecPanelLayout.setVerticalGroup(
            targetSpecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(targetSpecPanelLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentSpecPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(targetSpecPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(targetSpecPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(contentSpecPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void dialogTreeRClicked(java.awt.event.MouseEvent evt) {
         if( evt.isPopupTrigger() ) {
            int x = evt.getX();
            int y = evt.getY();
            JTree tree = (JTree)evt.getSource();
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
                JPopupMenu popup = new JPopupMenu();
                final JMenuItem refreshMenuItem = new JMenuItem("Add Item");
                refreshMenuItem.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.out.println("Add node...");
                        DefaultTreeModel model = (DefaultTreeModel)dialogTree.getModel();
                        //DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
                        rightClickedNode.add(new DefaultMutableTreeNode("another_child"));
                        model.reload(rightClickedNode);
                    }
                });
                popup.add(refreshMenuItem);
                popup.show(tree, x, y);
           // }
        }
    }
    private void dialogTreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dialogTreeMousePressed
        // TODO add your handling code here:
       new JvxDialogHelper().dialogTreeRClicked(evt);
        //rightClickedNode = null;
    }//GEN-LAST:event_dialogTreeMousePressed

    private void dialogTreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dialogTreeMouseReleased
        // TODO add your handling code here:
        new JvxDialogHelper().dialogTreeRClicked(evt);
        //rightClickedNode = null;
    }//GEN-LAST:event_dialogTreeMouseReleased

    private void dialogTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dialogTreeMouseClicked
        // TODO add your handling code here:
        // init and set the Grammar panel
    }//GEN-LAST:event_dialogTreeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JVXMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JVXMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JVXMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JVXMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JVXMainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentSpecPanel;
    private javax.swing.JPanel dgdPanel;
    private javax.swing.JTree dialogTree;
    private javax.swing.JTable dictRelationsTab;
    private javax.swing.JTable dictTab;
    private javax.swing.JList grammarList;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel langPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel targetSpecPanel;
    // End of variables declaration//GEN-END:variables
}