/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import static studentmanagement.TEACHER_INFO.teacher_name;
//import static studentmanagement.STUDENT_INFO.student_name;

/**
 *
 * @author sajid
 */
public class TeacherInfoShow extends javax.swing.JFrame {

    /**
     * Creates new form TeacherInfoShow
     */
    public TeacherInfoShow() {
        initComponents();
        getinfo();
    }
    
    public void getinfo()
    {
      String tcname = teacher_name.getText();
      System.out.println(tcname);
      String sql = "SELECT * FROM teacher";
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root", "");
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            //LOOP THROUGH ALL VALUES
            while(rs.next())
            {
                //GET VALUES
                String id = rs.getString(1);
                String name = rs.getString(2);
                String username = rs.getString(3);
                
                if(username.equalsIgnoreCase(tcname)== false)
                {
                    continue;
                }
                String password = rs.getString(4);
                String cellno = rs.getString(5);
                String department = rs.getString(6);
                String designation = rs.getString(7);
                String Email = rs.getString(8);
                
                //tc_name.setEditable(false);
                tc_name.setText(name);
                //jTextField2.setEditable(false);
                jTextField2.setText(cellno);
                //jTextField3.setEditable(false);
                jTextField3.setText(department);
                //jTextField4.setEditable(false);
                jTextField4.setText(designation);
                //jTextField5.setEditable(false);
                jTextField5.setText(Email);
                       
            }
            
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tc_name = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        signoutjButton1 = new javax.swing.JButton();
        reportjButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText(" Here is your information .");

        jLabel2.setText("NAME :");

        jLabel3.setText("CELL NO :");

        jLabel4.setText("DEPARTMENT :");

        jLabel5.setText("DESIGNATION :");

        jLabel6.setText("E-MAIL :");

        tc_name.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        signoutjButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        signoutjButton1.setText("SIGN OUT");
        signoutjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutjButton1ActionPerformed(evt);
            }
        });

        reportjButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        reportjButton2.setText("REPORT");
        reportjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(signoutjButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                    .addComponent(reportjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tc_name)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tc_name, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportjButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signoutjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signoutjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutjButton1ActionPerformed
        
        this.setVisible(false);
        TEACHER_INFO ti = new TEACHER_INFO();
        ti.setVisible(true);
        ti.setBounds(0, 0, 758, 390);
    }//GEN-LAST:event_signoutjButton1ActionPerformed

    private void reportjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportjButton2ActionPerformed
        
        try{
        Document document = new Document();
        String name = tc_name.getText();
        PdfWriter.getInstance(document,new FileOutputStream("Report("+name+").pdf"));
        document.open();
        
        Image image = Image.getInstance("LogoAust.jpg");
        //document.add(new Paragraph("Image"));
        document.add(image);
        
        document.add(new Paragraph("  AHSANULLAH UNIVERSITY OF SCIENCE AND            TECHNOLOGY",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.GREEN)));
        document.add(new Paragraph(new Date().toString()));
        
        document.add(new Paragraph("   -----------------------------------------------------------------------------------------------------------------------"));
        
        
        PdfPTable table = new PdfPTable(2);
        
        PdfPCell cell = new PdfPCell(new Paragraph("Personal History"));
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        
        
        String value1 = tc_name.getText();
        String value2 = jTextField2.getText();
        String value3 = jTextField3.getText();
        String value4 = jTextField4.getText();
        String value5 = jTextField5.getText();
        
        
        table.addCell(cell);
        cell.setColspan(4);
        table.addCell("teacher Name");
        table.addCell(value1);
        table.addCell("Cell No.");
        table.addCell(value2);
        table.addCell("Department");
        table.addCell(value3);
        table.addCell("Designation");
        table.addCell(value4);
        table.addCell("E-mail");
        table.addCell(value5);
        
        document.add(table);
        
        document.close();
        JOptionPane.showMessageDialog(null,"Report is saved");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_reportjButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherInfoShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherInfoShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    private javax.swing.JButton reportjButton2;
    private javax.swing.JButton signoutjButton1;
    public static javax.swing.JTextField tc_name;
    // End of variables declaration//GEN-END:variables
}
