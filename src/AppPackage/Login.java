/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Login() {
        initComponents();
        transparent();
        SQLConnection();
        Register.setVisible(false);
        
    }

    public void transparent() {
        username.setBackground(new Color(38,38,38,40));
        password.setBackground(new Color(38,38,38,40));
    }
    
    private void SQLConnection(){
        try{
         conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=bsit4thyear;password=12345;DatabaseName=BankingSystemDB");   
         System.out.println("Connection Passed.");
         
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Register = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        signin1 = new javax.swing.JLabel();
        signup1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        usernameLine = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        passwordLine = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        forgot = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 300));
        setMinimumSize(new java.awt.Dimension(450, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 300));
        setSize(new java.awt.Dimension(450, 300));

        jPanel1.setLayout(null);

        Register.setLayout(null);

        jButton1.setBackground(new java.awt.Color(38, 38, 39));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(250, 250, 250));
        jButton1.setText("Register");
        Register.add(jButton1);
        jButton1.setBounds(80, 240, 71, 23);

        jTextField5.setBackground(new java.awt.Color(38, 38, 39));
        jTextField5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(210, 210, 210));
        jTextField5.setText("Password");
        Register.add(jTextField5);
        jTextField5.setBounds(20, 200, 200, 30);

        jTextField4.setBackground(new java.awt.Color(38, 38, 39));
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(210, 210, 210));
        jTextField4.setText("Username");
        Register.add(jTextField4);
        jTextField4.setBounds(20, 160, 200, 30);

        jTextField3.setBackground(new java.awt.Color(38, 38, 39));
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(210, 210, 210));
        jTextField3.setText("Last Name");
        Register.add(jTextField3);
        jTextField3.setBounds(120, 120, 100, 30);

        jTextField2.setBackground(new java.awt.Color(38, 38, 39));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(210, 210, 210));
        jTextField2.setText("First Name");
        Register.add(jTextField2);
        jTextField2.setBounds(20, 120, 90, 30);

        jTextField1.setBackground(new java.awt.Color(38, 38, 39));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(210, 210, 210));
        jTextField1.setText("Employee ID");
        Register.add(jTextField1);
        jTextField1.setBounds(20, 80, 200, 30);

        signin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signin-button.png"))); // NOI18N
        signin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signin1MouseReleased(evt);
            }
        });
        Register.add(signin1);
        signin1.setBounds(40, 40, 74, 26);

        signup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signup-button.png"))); // NOI18N
        signup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.add(signup1);
        signup1.setBounds(120, 40, 74, 26);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Register.add(jLabel6);
        jLabel6.setBounds(237, 0, 13, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/leftsidetemp.PNG"))); // NOI18N
        Register.add(jLabel3);
        jLabel3.setBounds(0, 0, 254, 300);

        jPanel1.add(Register);
        Register.setBounds(200, 0, 250, 300);

        Login.setLayout(null);

        username.setBackground(new java.awt.Color(38, 38, 39));
        username.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        username.setForeground(new java.awt.Color(210, 210, 210));
        username.setText("USERNAME");
        username.setBorder(null);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        Login.add(username);
        username.setBounds(60, 47, 140, 14);

        usernameLine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernameLine.setForeground(new java.awt.Color(255, 255, 255));
        usernameLine.setText("______________");
        Login.add(usernameLine);
        usernameLine.setBounds(50, 40, 160, 30);

        password.setBackground(new java.awt.Color(38, 38, 39));
        password.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        password.setForeground(new java.awt.Color(210, 210, 210));
        password.setText("PASSWORD");
        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        Login.add(password);
        password.setBounds(60, 97, 140, 14);

        passwordLine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordLine.setForeground(new java.awt.Color(255, 255, 255));
        passwordLine.setText("______________");
        Login.add(passwordLine);
        passwordLine.setBounds(50, 90, 160, 30);

        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signup-button.png"))); // NOI18N
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signupMouseReleased(evt);
            }
        });
        Login.add(signup);
        signup.setBounds(130, 170, 74, 26);

        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signin-button.png"))); // NOI18N
        signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinMouseExited(evt);
            }
        });
        Login.add(signin);
        signin.setBounds(50, 170, 74, 26);

        forgot.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        forgot.setForeground(new java.awt.Color(255, 255, 255));
        forgot.setText("Forgot Password?");
        forgot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.add(forgot);
        forgot.setBounds(90, 220, 70, 10);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        Login.add(jLabel5);
        jLabel5.setBounds(237, 0, 13, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/leftsidetemp.PNG"))); // NOI18N
        Login.add(jLabel2);
        jLabel2.setBounds(0, 0, 254, 300);

        jPanel1.add(Login);
        Login.setBounds(200, 0, 250, 300);

        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 200, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/LoginBG.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseReleased
        Register.setVisible(true);
        Login.setVisible(false);
    }//GEN-LAST:event_signupMouseReleased

    private void signin1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin1MouseReleased
        Register.setVisible(false);
        Login.setVisible(true);
    }//GEN-LAST:event_signin1MouseReleased

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
       xMouse = evt.getX();
      yMouse = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
       try {
           String sql = "SELECT * FROM Table_1 WHERE username = ? AND password = ?";
         pst = conn.prepareStatement(sql);
         pst.setString(1,username.getText());
         pst.setString(2, username.getText());
         
         rs = pst.executeQuery();
         if(rs.next()){
             HumanResources2 open = new HumanResources2();
             open.setVisible(true);
             this.dispose();
         }
         else {
             JOptionPane.showMessageDialog(null, "Please check your username or password");
         }
       }
       catch(Exception e){
           
       }
    }//GEN-LAST:event_signinMouseClicked

    private void signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseEntered
        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signin-buttonhover.png")));
    }//GEN-LAST:event_signinMouseEntered

    private void signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseExited
        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signin-button.png")));
    }//GEN-LAST:event_signinMouseExited

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signup-buttonhover.png")));
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/signup-button.png")));
    }//GEN-LAST:event_signupMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Register;
    private javax.swing.JLabel forgot;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField password;
    private javax.swing.JLabel passwordLine;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signin1;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel signup1;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLine;
    // End of variables declaration//GEN-END:variables
}
