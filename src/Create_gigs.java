
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
public class Create_gigs extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public Create_gigs() {
        initComponents();
    }

   public Create_gigs(String username)
    {
        
            super ("");
        initComponents();
        conn= database_connection.Connecrdb();
       
        jLabel8.setText(username);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(410, 280, 53, 23);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(500, 280, 54, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social-network.png"))); // NOI18N
        jLabel6.setText("  Create Gigs");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 20, 234, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(610, 0, 112, 32);

        jLabel1.setText("name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(325, 30, 50, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(400, 30, 150, 30);

        jLabel2.setText("Email");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 70, 40, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(400, 70, 150, 30);

        jLabel3.setText("phone");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 120, 60, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(400, 120, 150, 30);

        jLabel4.setText("select location");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(298, 170, 90, 20);

        jComboBox1.setBackground(new java.awt.Color(51, 51, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dhanmondi", "Badda", "Uttara", "Air port", "Motijheel", "Sahabag", "Not need" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(400, 160, 150, 30);

        jLabel5.setText("Gigs category");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 210, 90, 20);

        jComboBox2.setBackground(new java.awt.Color(51, 51, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atrical Writing", "Presentation slide", "Lab report", "Photo Edit", "other" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(400, 210, 150, 30);

        jLabel7.setText("Delivery type");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(304, 250, 80, 20);

        jCheckBox1.setText("hard copy");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(400, 250, 90, 30);

        jCheckBox2.setText("soft copy");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(500, 250, 90, 30);

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(382, 330, 100, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(500, 330, 90, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/n1.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        if(jCheckBox1.isSelected())
          {
            jLabel9.setText("yes");
              
              
          } 
        else{
            
             jLabel9.setText("no"); 
        }
        
        
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
        String uname=jLabel8.getText();
        
          setVisible(false);
        //  SettingF  obj1=  new SettingF();
        new Writer_home(uname).setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(jTextField1.getText().isEmpty()||jTextField2.getText().isEmpty()||jTextField3.getText().isEmpty())
        {
            
             JOptionPane.showMessageDialog(null,"field can't be empty");
          
        }
        
        else
        {
         
            
            
            try {

            String sql= "Insert into gigs (username,name,email,phone,location,type,hard_copy,soft_copy,vacation_mood) values(?,?,?,?,?,?,?,?,'off')";
            pst=conn.prepareStatement(sql);
           
            
            pst.setString(1,jLabel8.getText());
            pst.setString(2,jTextField1.getText());
            pst.setString(3,jTextField2.getText());
            pst.setString(4,jTextField3.getText());
            pst.setString(5,jComboBox1.getSelectedItem().toString());
            pst.setString(6,jComboBox2.getSelectedItem().toString());
            pst.setString(7,jLabel9.getText());
             pst.setString(8,jLabel10.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null,"succesfully created");

            String uname=jLabel8.getText();
            
            
            setVisible(false);
           // Writer_home obj= new Writer_home();
            new Writer_home(uname).setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,"something wrong");
        } 
            
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
       
        
        
           if (jCheckBox2.isSelected())
          {
              
              jLabel10.setText("yes");
          }
           
           else{
               
               jLabel10.setText("no"); 
           }
           
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Create_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_gigs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
