/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import ConnectionProvider.ConnectionProviderCode;
import javax.swing.JOptionPane;
/**
 *
 * @author aman
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    
    public StudentResultPage(String rollNo){
        initComponents();
        rollNo_field.setText(rollNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rollNo_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        gender_field = new javax.swing.JTextField();
        course_field = new javax.swing.JTextField();
        fathername_field = new javax.swing.JTextField();
        branch_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        phy_field = new javax.swing.JTextField();
        chem_field = new javax.swing.JTextField();
        math_field = new javax.swing.JTextField();
        electrical_field = new javax.swing.JTextField();
        biology_field = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        total_marks = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        verdict_field = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(570, 500));
        setMinimumSize(new java.awt.Dimension(570, 500));
        setPreferredSize(new java.awt.Dimension(570, 500));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Roll No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        rollNo_field.setMinimumSize(new java.awt.Dimension(70, 22));
        rollNo_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(rollNo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 29, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 69, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 109, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Father's Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        name_field.setMinimumSize(new java.awt.Dimension(70, 22));
        name_field.setPreferredSize(new java.awt.Dimension(70, 22));
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 26, -1, -1));

        gender_field.setMinimumSize(new java.awt.Dimension(70, 22));
        gender_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(gender_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 66, -1, -1));

        course_field.setMinimumSize(new java.awt.Dimension(70, 22));
        course_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(course_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 106, -1, -1));

        fathername_field.setMinimumSize(new java.awt.Dimension(70, 22));
        fathername_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(fathername_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        branch_field.setMinimumSize(new java.awt.Dimension(70, 22));
        branch_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(branch_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Subjects");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Total Marks");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Passing Marks");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Marks Obatined");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Physics");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Maths");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Chemistry");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Electrical");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Biology");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("100");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("100");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("100");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("100");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("100");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("30");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("30");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("30");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("30");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("30");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        phy_field.setMinimumSize(new java.awt.Dimension(70, 22));
        phy_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(phy_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        chem_field.setMinimumSize(new java.awt.Dimension(70, 22));
        chem_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(chem_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        math_field.setMinimumSize(new java.awt.Dimension(70, 22));
        math_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(math_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        electrical_field.setMinimumSize(new java.awt.Dimension(70, 22));
        electrical_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(electrical_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        biology_field.setMinimumSize(new java.awt.Dimension(70, 22));
        biology_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(biology_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Total Marks");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        total_marks.setMinimumSize(new java.awt.Dimension(70, 22));
        total_marks.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(total_marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Verdict");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        verdict_field.setMinimumSize(new java.awt.Dimension(70, 22));
        verdict_field.setPreferredSize(new java.awt.Dimension(70, 22));
        getContentPane().add(verdict_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-logout-50.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 60, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel28.setText("jLabel28");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollNo=rollNo_field.getText();
        try{
            Connection con=ConnectionProviderCode.getCon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='"+rollNo+"' and result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                  JOptionPane.showMessageDialog(null, "Entered Roll Number dosen't exsist");
            }else{
                name_field.setText(rs.getString(1));
                gender_field.setText(rs.getString(3));
                course_field.setText(rs.getString(5));
                fathername_field.setText(rs.getString(4));
                branch_field.setText(rs.getString(6));
                phy_field.setText(rs.getString(8));
                math_field.setText(rs.getString(9));
                chem_field.setText(rs.getString(10));
                electrical_field.setText(rs.getString(11));
                biology_field.setText(rs.getString(12));
                total_marks.setText(rs.getString(13));
                
                 name_field.setEditable(false);
                gender_field.setEditable(false);
                course_field.setEditable(false);
                fathername_field.setEditable(false);
                branch_field.setEditable(false);
                phy_field.setEditable(false);
                math_field.setEditable(false);
                chem_field.setEditable(false);
                electrical_field.setEditable(false);
                biology_field.setEditable(false);
                total_marks.setEditable(false);
                
                int m1 = Integer.parseInt(rs.getString(8));
                int m2 = Integer.parseInt(rs.getString(9));
                int m3 = Integer.parseInt(rs.getString(10));
                int m4 = Integer.parseInt(rs.getString(11));
                int m5 = Integer.parseInt(rs.getString(12));
                
                if(m1<30 || m2<30 || m3<30 || m4<30 || m5<30){
                    verdict_field.setText("Fail");
                }
                else{
                    verdict_field.setText("Pass");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        int response=JOptionPane.showConfirmDialog(null, "Are you sure you want to Log Out?", "Submit", JOptionPane.YES_NO_OPTION);
        if(response==0){
            setVisible(false);
            Student frame=new Student();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biology_field;
    private javax.swing.JTextField branch_field;
    private javax.swing.JTextField chem_field;
    private javax.swing.JTextField course_field;
    private javax.swing.JTextField electrical_field;
    private javax.swing.JTextField fathername_field;
    private javax.swing.JTextField gender_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField math_field;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField phy_field;
    private javax.swing.JTextField rollNo_field;
    private javax.swing.JTextField total_marks;
    private javax.swing.JTextField verdict_field;
    // End of variables declaration//GEN-END:variables
}
