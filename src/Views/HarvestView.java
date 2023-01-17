/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author user
 */
public class HarvestView extends javax.swing.JFrame {

    /**
     * Creates new form HarvestView
     */
    public HarvestView() {
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

        jPanel3 = new javax.swing.JPanel();
        AddLivestockBtn1 = new javax.swing.JButton();
        UpdateLivestockBtn1 = new javax.swing.JButton();
        DeleteLivestockBtn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1850, 1050));
        setSize(new java.awt.Dimension(1850, 1050));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(14, 79, 85));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddLivestockBtn1.setBackground(new java.awt.Color(14, 79, 85));
        AddLivestockBtn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        AddLivestockBtn1.setForeground(new java.awt.Color(255, 255, 255));
        AddLivestockBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/feed.png"))); // NOI18N
        AddLivestockBtn1.setText("   FEED");
        AddLivestockBtn1.setBorder(null);
        AddLivestockBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddLivestockBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLivestockBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(AddLivestockBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

        UpdateLivestockBtn1.setBackground(new java.awt.Color(14, 79, 85));
        UpdateLivestockBtn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        UpdateLivestockBtn1.setForeground(new java.awt.Color(255, 255, 255));
        UpdateLivestockBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/water.png"))); // NOI18N
        UpdateLivestockBtn1.setText("   WATER");
        UpdateLivestockBtn1.setBorder(null);
        UpdateLivestockBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UpdateLivestockBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateLivestockBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateLivestockBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 40));

        DeleteLivestockBtn1.setBackground(new java.awt.Color(14, 79, 85));
        DeleteLivestockBtn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        DeleteLivestockBtn1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteLivestockBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/harvest.png"))); // NOI18N
        DeleteLivestockBtn1.setText("   HARVEST");
        DeleteLivestockBtn1.setBorder(null);
        DeleteLivestockBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DeleteLivestockBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLivestockBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteLivestockBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome,");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 23, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Admin");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 58, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/user.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jButton5.setBackground(new java.awt.Color(14, 79, 85));
        jButton5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/dashboard.png"))); // NOI18N
        jButton5.setText("   DASHBOARD");
        jButton5.setBorder(null);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, 930));

        jPanel4.setBackground(new java.awt.Color(237, 180, 106));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(14, 79, 85));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/inventory.png"))); // NOI18N
        jLabel13.setText("Inventory Management System");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, 80));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Date", "Amount ( Per Chicken )"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 1400, 540));

        jButton6.setBackground(new java.awt.Color(164, 196, 181));
        jButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton6.setText("Update Harvest");
        jButton6.setBorder(null);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 880, 200, 50));

        jButton7.setBackground(new java.awt.Color(164, 196, 181));
        jButton7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton7.setText("Add Harvest");
        jButton7.setBorder(null);
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 880, 200, 50));

        jButton8.setBackground(new java.awt.Color(164, 196, 181));
        jButton8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton8.setText("Delete Harvest");
        jButton8.setBorder(null);
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 680, 200, 50));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 810, 370, 50));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel15.setText("Amount(Per Chicken) :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 770, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 810, 290, 50));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel17.setText("ID :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 770, -1, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 810, 370, 50));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel18.setText("Amount(Per Chicken) :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 770, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddLivestockBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLivestockBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddLivestockBtn1ActionPerformed

    private void UpdateLivestockBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateLivestockBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateLivestockBtn1ActionPerformed

    private void DeleteLivestockBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLivestockBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteLivestockBtn1ActionPerformed

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
                new HarvestView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLivestockBtn1;
    private javax.swing.JButton DeleteLivestockBtn1;
    private javax.swing.JButton UpdateLivestockBtn1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}