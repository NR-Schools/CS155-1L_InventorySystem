/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author user
 */
public class FeedView extends javax.swing.JFrame {

    /**
     * Creates new form FeedView
     */
    public FeedView() {
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

        jPanel1 = new javax.swing.JPanel();
        AddLivestockBtn = new javax.swing.JButton();
        UpdateLivestockBtn = new javax.swing.JButton();
        DeleteLivestockBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1850, 1050));
        setSize(new java.awt.Dimension(1850, 1050));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 79, 85));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddLivestockBtn.setBackground(new java.awt.Color(14, 79, 85));
        AddLivestockBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        AddLivestockBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddLivestockBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/feed.png"))); // NOI18N
        AddLivestockBtn.setText("   FEED");
        AddLivestockBtn.setBorder(null);
        AddLivestockBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddLivestockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLivestockBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddLivestockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

        UpdateLivestockBtn.setBackground(new java.awt.Color(14, 79, 85));
        UpdateLivestockBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        UpdateLivestockBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateLivestockBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/water.png"))); // NOI18N
        UpdateLivestockBtn.setText("   WATER");
        UpdateLivestockBtn.setBorder(null);
        UpdateLivestockBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UpdateLivestockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateLivestockBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateLivestockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 40));

        DeleteLivestockBtn.setBackground(new java.awt.Color(14, 79, 85));
        DeleteLivestockBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        DeleteLivestockBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteLivestockBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/harvest.png"))); // NOI18N
        DeleteLivestockBtn.setText("   HARVEST");
        DeleteLivestockBtn.setBorder(null);
        DeleteLivestockBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DeleteLivestockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLivestockBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteLivestockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 58, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/user.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jButton1.setBackground(new java.awt.Color(14, 79, 85));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/dashboard.png"))); // NOI18N
        jButton1.setText("   DASHBOARD");
        jButton1.setBorder(null);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, 930));

        jPanel2.setBackground(new java.awt.Color(237, 180, 106));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 79, 85));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/inventory.png"))); // NOI18N
        jLabel5.setText("Inventory Management System");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Date", "Amount ( kg )", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 1400, 540));

        jButton2.setBackground(new java.awt.Color(164, 196, 181));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton2.setText("Update Feed");
        jButton2.setBorder(null);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 880, 200, 50));

        jButton3.setBackground(new java.awt.Color(164, 196, 181));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton3.setText("Add Feed");
        jButton3.setBorder(null);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 880, 200, 50));

        jButton4.setBackground(new java.awt.Color(164, 196, 181));
        jButton4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton4.setText("Delete Feed");
        jButton4.setBorder(null);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 680, 200, 50));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 810, 200, 50));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 810, 200, 50));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setText("Price :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 770, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel6.setText("Amount(kg) :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 770, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 810, 200, 50));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 810, 200, 50));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel7.setText("Price :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 770, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel8.setText("ID :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 770, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 810, 200, 50));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel9.setText("Amount(kg) :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 770, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddLivestockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLivestockBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddLivestockBtnActionPerformed

    private void UpdateLivestockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateLivestockBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_UpdateLivestockBtnActionPerformed

    private void DeleteLivestockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLivestockBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_DeleteLivestockBtnActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLivestockBtn;
    private javax.swing.JButton DeleteLivestockBtn;
    private javax.swing.JButton UpdateLivestockBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
