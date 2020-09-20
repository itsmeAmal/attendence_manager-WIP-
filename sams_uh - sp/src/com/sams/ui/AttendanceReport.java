/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sams.ui;

import com.sams.databaseconnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Amal
 */
public class AttendanceReport extends javax.swing.JFrame {

    /**
     * Creates new form ActivationUI
     */
    public AttendanceReport() {
        initComponents();

    }

    public void printAttendanceReport() {
        try {
            HashMap<String, Object> hm = new HashMap<>();
            hm.put("total_days", txtTotalLecDays.getText().trim());
            Connection con = DatabaseConnection.getDatabaseConnection();
            JasperDesign jsd = JRXmlLoader.load("reports\\report1.jrxml"); //src\\cazzendra\\pos\\
            JasperReport jr = JasperCompileManager.compileReport(jsd);
            JasperPrint jp = JasperFillManager.fillReport(jr, hm, con);
            JasperViewer jasperViewer = new JasperViewer(jp, false);
            jasperViewer.setVisible(true);
        } catch (SQLException | JRException ex) {
            Logger.getLogger(AttendanceReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        txtTotalLecDays = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ");
        setMaximumSize(new java.awt.Dimension(353, 239));
        setMinimumSize(new java.awt.Dimension(353, 239));
        setResizable(false);

        panel.setBackground(new java.awt.Color(153, 0, 51));
        panel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        panel.setMaximumSize(new java.awt.Dimension(325, 412));
        panel.setMinimumSize(new java.awt.Dimension(325, 412));
        panel.setPreferredSize(new java.awt.Dimension(325, 412));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 51));
        panel.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        txtTotalLecDays.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtTotalLecDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalLecDaysActionPerformed(evt);
            }
        });
        panel.add(txtTotalLecDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, 40));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Lecture Days");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jButton1.setText("Print Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalLecDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalLecDaysActionPerformed
    }//GEN-LAST:event_txtTotalLecDaysActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        printAttendanceReport();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AttendanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtTotalLecDays;
    // End of variables declaration//GEN-END:variables
}