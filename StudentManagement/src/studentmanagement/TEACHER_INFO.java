/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static studentmanagement.STUDENT_INFO.student_name;

/**
 *
 * @author sajid
 */
public class TEACHER_INFO extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form TEACHER_INFO
     */
    public TEACHER_INFO() {
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

        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        teacher_name = new javax.swing.JTextField();
        loginjButton1 = new javax.swing.JButton();
        backjButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        jTextField2.setBackground(new java.awt.Color(51, 255, 102));
        jTextField2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagement/light-blue-background-3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jTextField3.setBackground(new java.awt.Color(153, 255, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("            TEACHER'S INFO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 360, 59);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("      USER NAME :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 110, 150, 36);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("     PASSWORD :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 210, 122, 44);

        teacher_name.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        teacher_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_nameActionPerformed(evt);
            }
        });
        getContentPane().add(teacher_name);
        teacher_name.setBounds(530, 100, 199, 49);

        loginjButton1.setBackground(new java.awt.Color(0, 0, 153));
        loginjButton1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        loginjButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagement/Login-Button.jpg"))); // NOI18N
        loginjButton1.setText("LOG IN");
        loginjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginjButton1);
        loginjButton1.setBounds(430, 290, 130, 50);

        backjButton2.setBackground(new java.awt.Color(0, 0, 153));
        backjButton2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        backjButton2.setForeground(new java.awt.Color(255, 255, 255));
        backjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagement/back logo.jpg"))); // NOI18N
        backjButton2.setText("BACK");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(backjButton2);
        backjButton2.setBounds(600, 290, 130, 51);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(530, 210, 200, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagement/teacher_icon.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 80, 240, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacher_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_nameActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Startpage1 nj = new Startpage1();
        nj.setVisible(true);
        nj.setBounds(0, 0, 770, 545);
    }//GEN-LAST:event_backjButton2ActionPerformed

    private void loginjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButton1ActionPerformed
        String sql = "Select * from teacher where username=? and password=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "");
            pst = (PreparedStatement) conn.prepareStatement(sql);
            System.out.println("Password: " + teacher_name.getText());
            pst.setString(1, teacher_name.getText().trim());
            pst.setString(2, jPasswordField1.getText().trim());
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Username and Password Matched");

                this.setVisible(false);
                teacher_Choice tc = new teacher_Choice();
                tc.setVisible(true);
                tc.setBounds(0, 0, 480, 355);

                //si.setBounds(0, 0, 1213, 900);
            } else {
                JOptionPane.showMessageDialog(null, "Username and Password Not Matched");
                teacher_name.setText("");
                jPasswordField1.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TEACHER_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEACHER_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEACHER_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEACHER_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEACHER_INFO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton loginjButton1;
    public static javax.swing.JTextField teacher_name;
    // End of variables declaration//GEN-END:variables
}
