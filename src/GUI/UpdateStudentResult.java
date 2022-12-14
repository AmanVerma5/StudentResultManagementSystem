/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author aman
 */
public class UpdateStudentResult extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStudentResult
     */
    public UpdateStudentResult() {
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

        rollNo_field = new javax.swing.JLabel();
        rollNo_textfield = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        physics_label = new javax.swing.JLabel();
        maths_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        physics_field = new javax.swing.JTextField();
        maths_field = new javax.swing.JTextField();
        chem_field = new javax.swing.JTextField();
        electrical_field = new javax.swing.JTextField();
        bio_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 400));
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(new java.awt.Dimension(550, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rollNo_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rollNo_field.setText("Roll No");
        getContentPane().add(rollNo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 17, 55, 28));
        getContentPane().add(rollNo_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 20, 145, -1));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-search-30.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setMaximumSize(new java.awt.Dimension(104, 35));
        searchButton.setMinimumSize(new java.awt.Dimension(104, 35));
        searchButton.setPreferredSize(new java.awt.Dimension(104, 35));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        physics_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        physics_label.setText("Physics");
        getContentPane().add(physics_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 103, 53, -1));

        maths_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maths_label.setText("Mathematics");
        getContentPane().add(maths_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 145, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Chemistry");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 187, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Electrical");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 232, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Biology");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 276, -1, -1));

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-submit-document-32.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setMaximumSize(new java.awt.Dimension(94, 39));
        saveButton.setMinimumSize(new java.awt.Dimension(94, 39));
        saveButton.setPreferredSize(new java.awt.Dimension(94, 39));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-cancel-24.png"))); // NOI18N
        exitButton.setText("Cancel");
        exitButton.setMaximumSize(new java.awt.Dimension(94, 39));
        exitButton.setMinimumSize(new java.awt.Dimension(94, 39));
        exitButton.setPreferredSize(new java.awt.Dimension(94, 39));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 320, 100, -1));

        physics_field.setPreferredSize(new java.awt.Dimension(100, 22));
        getContentPane().add(physics_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 100, -1, -1));

        maths_field.setPreferredSize(new java.awt.Dimension(100, 22));
        getContentPane().add(maths_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 142, -1, -1));

        chem_field.setPreferredSize(new java.awt.Dimension(100, 22));
        getContentPane().add(chem_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 184, -1, -1));

        electrical_field.setPreferredSize(new java.awt.Dimension(100, 22));
        electrical_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electrical_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(electrical_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 229, -1, -1));

        bio_field.setPreferredSize(new java.awt.Dimension(100, 22));
        getContentPane().add(bio_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 273, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, -620, -1, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void electrical_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electrical_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_electrical_fieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String rollNo=rollNo_textfield.getText();
        try{
        Connection con=ConnectionProviderCode.getCon();
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("Select * from result where rollno='"+rollNo+"'");
        if(!rs.first())
        {
            JOptionPane.showMessageDialog(null, "Entered Roll No dosen't exists");
        }else{
            rollNo_textfield.setEditable(false);
            physics_field.setText(rs.getString(2));
            maths_field.setText(rs.getString(3));
            chem_field.setText(rs.getString(4));
            electrical_field.setText(rs.getString(5));
            bio_field.setText(rs.getString(6));
            
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String rollNo=rollNo_textfield.getText();
        int phyMarks=Integer.parseInt(physics_field.getText());
        int mathMarks=Integer.parseInt(maths_field.getText());
        int chemMarks=Integer.parseInt(chem_field.getText());
        int electricalMarks=Integer.parseInt(electrical_field.getText());
        int bioMarks=Integer.parseInt(bio_field.getText());
        int total=phyMarks+mathMarks+chemMarks+electricalMarks+bioMarks;
        
        try{
            Connection con=ConnectionProviderCode.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update result set physics="+phyMarks+", math="+mathMarks+",chemistry="+chemMarks+", biology="+bioMarks+", total="+total+" where rollNo='"+rollNo+"'");
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            setVisible(false);
            UpdateStudentResult frame=new UpdateStudentResult();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        int response=JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Submit", JOptionPane.YES_NO_OPTION);
        if(response==0){
            setVisible(false);
        }
            
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bio_field;
    private javax.swing.JTextField chem_field;
    private javax.swing.JTextField electrical_field;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField maths_field;
    private javax.swing.JLabel maths_label;
    private javax.swing.JTextField physics_field;
    private javax.swing.JLabel physics_label;
    private javax.swing.JLabel rollNo_field;
    private javax.swing.JTextField rollNo_textfield;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
