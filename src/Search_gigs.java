
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.util.Collections.list;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cse92
 */
public class Search_gigs extends javax.swing.JFrame {

    
    
      Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public Search_gigs() {
        initComponents();
    }
    
    
    public Search_gigs(String username)
    {
        
            super ("");
        initComponents();
        conn= database_connection.Connecrdb();
       
        jLabel8.setText(username);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worker.png"))); // NOI18N
        jLabel1.setText("  Search Gigs");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 20, 180, 70);

        jLabel2.setText("select your location ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(173, 126, 120, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dhanmondi", "Badda", "Uttara", "Air port", "Motijheel", "Sahabag", "Not need" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(329, 113, 127, 40);

        jLabel3.setText("Gigs category");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(196, 180, 90, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atrical Writing", "Presentation slide", "Lab report", "Photo Edit", "other" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(330, 169, 127, 40);

        jCheckBox1.setText("hard copy");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(330, 230, 90, 30);

        jCheckBox2.setText("soft copy");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(430, 230, 80, 30);

        jLabel7.setText("Delivery type");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 230, 80, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 340, 117, 40);

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(620, 20, 90, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(580, 10, 32, 32);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings-work-tool.png"))); // NOI18N
        jButton2.setText("Setting");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(600, 60, 93, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton3.setText("logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(600, 110, 93, 33);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 270, 40, 20);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(430, 270, 50, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/n2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        setVisible(false);
        login_type  obj1=  new login_type();
        obj1.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String uname=jLabel8.getText();

        setVisible(false);
        //  SettingF  obj1=  new SettingF();
        new SettingF(uname).setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      
         if(jCheckBox1.isSelected())
          {
            jLabel5.setText("yes");
              
              
          } 
        else{
            
             jLabel5.setText("no"); 
        }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String username=jLabel8.getText();
       String location=jComboBox1.getSelectedItem().toString();  
       String type=jComboBox2.getSelectedItem().toString(); 
      String hardcopy=jLabel5.getText();
       String softcopy=jLabel6.getText();
        
        
      setVisible(false);
       // list_of_gigs obj= new list_of_gigs();
      
      //new getUserslist(location,type,hardcopy,softcopy);
        new list_of_gigs(username,location,type,hardcopy,softcopy).setVisible(true);
        
      
     
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
       
          if(jCheckBox2.isSelected())
          {
            jLabel6.setText("yes");
              
              
          } 
        else{
            
             jLabel6.setText("no"); 
        }
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_gigs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}