/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gazelle_boutiqe;

import javax.swing.JFrame;

/**
 *
 * @author Zaki_shah
 */
public class reports extends javax.swing.JFrame {

    /**
     * Creates new form reports
     */
    public reports() {
         initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         dark_mode.applyTheme(this);
         setLocationRelativeTo(null);
         setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        daily = new javax.swing.JButton();
        monthly = new javax.swing.JButton();
        year = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("به بخش گزارشات خوش آمدید");

        daily.setBackground(java.awt.Color.blue);
        daily.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        daily.setText("گزارشات روزانه");
        daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyActionPerformed(evt);
            }
        });

        monthly.setBackground(java.awt.Color.blue);
        monthly.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        monthly.setText("گزارشات ماهانه");
        monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyActionPerformed(evt);
            }
        });

        year.setBackground(java.awt.Color.blue);
        year.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        year.setText("گزارشات سالانه");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        customer.setBackground(java.awt.Color.blue);
        customer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        customer.setText("گزارشات مشتری");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });

        staff.setBackground(java.awt.Color.blue);
        staff.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        staff.setText("گزارشات کارمندان");
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.blue);
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("برگشت");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel11.setText("developed by Code-Crafters-Company    2024");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthly, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(daily, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel11))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(63, 63, 63)
                .addComponent(daily, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(monthly, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyActionPerformed
        // TODO add your handling code here:
        daily_rep obj=new daily_rep();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_dailyActionPerformed

    private void monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyActionPerformed
        // TODO add your handling code here:
        monthly_rep obj=new monthly_rep();
         obj.setVisible(true);
          dispose();
    }//GEN-LAST:event_monthlyActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
        year_rep obj=new year_rep();
         obj.setVisible(true);
          dispose();
    }//GEN-LAST:event_yearActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
        customer_rep obj=new customer_rep();
         obj.setVisible(true);
          dispose();
    }//GEN-LAST:event_customerActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        // TODO add your handling code here:
        staff_rep obj=new staff_rep();
         obj.setVisible(true);
          dispose();
    }//GEN-LAST:event_staffActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        home obj=new home();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customer;
    private javax.swing.JButton daily;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JButton monthly;
    private javax.swing.JButton staff;
    private javax.swing.JButton year;
    // End of variables declaration//GEN-END:variables
}