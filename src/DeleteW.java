
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;




public class DeleteW extends javax.swing.JFrame {

     Connection conn,conn1;
    ResultSet rs,rs1;
    PreparedStatement pst,pst1;
    
     
    public DeleteW() {
        initComponents();
    }
    
    public DeleteW(String username)
    {
        
            super ("");
        initComponents();
        conn= database_connection.Connecrdb();
        conn1= database_connection.Connecrdb();
       
        jLabel3.setText(username);
    }
    
 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unfriend.png"))); // NOI18N
        jLabel7.setText("Deleting account");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(260, 50, 222, 64);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(" Dear");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(120, 130, 40, 26);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 130, 71, 26);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText(",we are sorry for our any unsetisfied serivece.");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(240, 130, 310, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("we will check our service as soon as possible. we hope you will back. Thank you sir.");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(120, 160, 510, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Note: Before to delete your account you have to delete your all gigs.");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 200, 470, 17);

        jToggleButton1.setBackground(new java.awt.Color(102, 102, 255));
        jToggleButton1.setText("Confirm Delete");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1);
        jToggleButton1.setBounds(160, 270, 120, 40);

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setText("Delete all gigs ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(300, 270, 119, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(430, 270, 108, 40);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 700, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      String usname=jLabel3.getText();
        
        
          setVisible(false);
                   // Create_gigs obj1= new Create_gigs();
                  new SettingW(usname).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       
        
        
          String sql = "select * from gigs where username=?";
            
        
        
         try {
             pst=conn.prepareStatement(sql);
             pst.setString(1,jLabel3.getText());
            
             rs= pst.executeQuery();
             if(rs.next()) 
             {
                 
                 
              
                 rs.close();
                 pst.close();
                 
                  JOptionPane.showMessageDialog(null, "please delete your all gigs");
                 
                 
             }
             
             else{
                 
                
                  String sql1 = "delete from writer_info where username=?";

       
        try {
            pst1=conn.prepareStatement(sql1);
          
            pst1.setString(1,jLabel3.getText());
          
            pst1.execute();
           
          
           
           
           
           JOptionPane.showMessageDialog(null,"Delete successfully");
           
               
          
           
           
           
            

        }catch (Exception e) {

            JOptionPane.showMessageDialog(null,"something wrong");
        } 
        
                 
                 
                 
             }
             
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Database Connection failed");
         } finally{
             try{
             rs.close();
             pst.close();
         }catch(Exception e){
                 
                 }
   
         }
        
        
        
        
        
        
        
        
       
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
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
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
