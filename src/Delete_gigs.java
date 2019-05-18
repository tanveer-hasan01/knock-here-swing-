
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cse92
 */
public class Delete_gigs extends javax.swing.JFrame {

     Connection conn,conn1;
    ResultSet rs,rs1;
    PreparedStatement pst,pst1;
    
    
    public Delete_gigs() {
        initComponents();
    }

    
      public Delete_gigs(String username)
    {
        
         super ("");
        initComponents();
        conn= database_connection.Connecrdb();
       
        jLabel1.setText(username);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete1.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 20, 128, 128);

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(580, 10, 94, 32);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(350, 340, 100, 40);

        jComboBox2.setBackground(new java.awt.Color(51, 51, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atrical Writing", "Presentation slide", "Lab report", "Photo Edit", "other" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(330, 110, 160, 50);

        jLabel5.setText("Gigs category");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(230, 120, 100, 27);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(330, 190, 160, 50);

        jButton1.setText("Delete all gigs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(330, 260, 160, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/n3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
          String sql = "delete from gigs where username=?";

       
        try {
            pst=conn.prepareStatement(sql);
          
            pst.setString(1,jLabel1.getText());
          
            pst.execute();
         
           
           JOptionPane.showMessageDialog(null,"Delete successfully");
            String usname=jLabel1.getText();
               
           setVisible(false);
                    //Search_gigs obj1= new Search_gigs();
                   new Writer_home(usname).setVisible(true);
           
           
           
            

        }catch (Exception e) {

            JOptionPane.showMessageDialog(null,"something wrong");
        } 
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        String sql = "delete from gigs where username=? and type=?";

       
        try {
            pst=conn.prepareStatement(sql);
          
            pst.setString(1,jLabel1.getText());
           pst.setString(2,jComboBox2.getSelectedItem().toString());
          
            pst.execute();
         
           
           JOptionPane.showMessageDialog(null,"Delete successfully");
            String usname=jLabel1.getText();
               
           setVisible(false);
                    //Search_gigs obj1= new Search_gigs();
                   new Writer_home(usname).setVisible(true);
           
           
           
            

        }catch (Exception e) {

            JOptionPane.showMessageDialog(null,"something wrong");
        } 
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
      String usname=jLabel1.getText();
                   
                    setVisible(false);
                
                  new Writer_home(usname).setVisible(true);   
        
        
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
            java.util.logging.Logger.getLogger(Delete_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_gigs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
