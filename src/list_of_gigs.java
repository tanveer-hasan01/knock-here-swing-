
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cse92
 */
public  class list_of_gigs extends javax.swing.JFrame {

   Connection conn;
    ResultSet rs;
   PreparedStatement pst;
 
    
    
    public list_of_gigs() {
        initComponents();
     show_user_taable();
    }
    
    
     public list_of_gigs(String username,String location,String type,String hardcopy, String softcopy)
    {
        
            super ("");
        initComponents();
   
       conn= database_connection.Connecrdb();
       
        jLabel1.setText(location);
              jLabel2.setText(type);
             jLabel3.setText(hardcopy);
              jLabel4.setText(softcopy);
              jLabel7.setText(username);
              
                 show_user_taable();
             
               
    }

    
  
   public Connection getConnection()
   {
       Connection con;
       try{
           con=DriverManager.getConnection("jdbc:derby://localhost:1527/knock","tanveer","123456");
           return con;
       }catch(Exception e )
               {
                   e.printStackTrace();
                   return null;
               }
   }

    
    
    
    
    
    
    
    
  public ArrayList<User> getUserslist()
  {
         
      
      
      
      
      ArrayList<User> userlist=new ArrayList<User>();
       Connection connection=database_connection.Connecrdb();
      String sql = "select name,email,phone,location,type,hard_copy,soft_copy from gigs where location=? and type=? and vacation_mood = 'off'  ";
     // Statement st;
     // ResultSet rs;
      
      try{
                 
        // st= connection.createStatement();
          
        //st.setString(1,jLabel1.getText());
          
           //rs=st.executeQuery(query);
          
           // st=connection.prepareStatement();
                  // st.setString(1,jLabel1.getText());
                  // rs=st.executeQuery();
                   
               pst=connection.prepareStatement(sql);
               pst.setString(1,jLabel1.getText());
                pst.setString(2,jLabel2.getText());
                // pst.setString(3,jLabel3.getText());
                 //pst.setString(4,jLabel4.getText());
                  
                   rs=pst.executeQuery();    
          
    
           User user;
           while(rs.next())
           {   
               user=new User(rs.getString("name"),rs.getString("email"),rs.getString("phone"),rs.getString("location"),rs.getString("type"),rs.getString("hard_copy"),rs.getString("soft_copy"));
               userlist.add(user);
               
          }
           rs.close();
           
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return userlist;
   }
   public void show_user_taable()
   {
       ArrayList<User>list=getUserslist();
       DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
       Object[]row = new Object[7];
       for(int i=0; i<list.size();i++)
       {
           row[0]=list.get(i).getname();
           row[1]=list.get(i).getemail();
           row[2]=list.get(i).getphone();
           row[3]=list.get(i).getlocation();
           row[4]=list.get(i).gettype();
           row[5]=list.get(i).gethard_copy();
           row[6]=list.get(i).getsoft_copy();
           model.addRow(row);
           
       }
   }
   
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(590, 440, 100, 40);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Phone", "Location", "Type", "Hard copy", "Soft copy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(51, 255, 204));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 670, 340);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(570, 0, 110, 40);

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tec.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 700, 490);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 82, 27);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 0, 93, 27);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 0, 63, 29);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(220, 10, 88, 29);

        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(630, 10, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
       
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
     String username=jLabel7.getText();
     setVisible(false);
    
        new Search_gigs(username).setVisible(true);
        
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(list_of_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(list_of_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(list_of_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(list_of_gigs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new list_of_gigs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   
}
