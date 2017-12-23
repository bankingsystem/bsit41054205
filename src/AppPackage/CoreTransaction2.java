/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Color;

/**
 *
 * @author lynden ryanpogigago
 */
public class CoreTransaction2 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public CoreTransaction2() {
        initComponents();
        panels();
        
    }

    public void panels() {
        commmgmtpanel.setBackground(new Color(200,200,200,40));
        commmgmtpanel.setVisible(false);
        consolidationpanel.setBackground(new Color(200,200,200,40));
        consolidationpanel.setVisible(false);
        savingspanel.setBackground(new Color(200,200,200,40));
        savingspanel.setVisible(false);
        socialpanel.setBackground(new Color(200,200,200,40));
        socialpanel.setVisible(false);
        menupanel.setBackground(new Color(150,150,150,200));
        menupanel.setVisible(false);
        settingspanel.setBackground(new Color(150,150,150,200));
        settingspanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerpanel = new javax.swing.JPanel();
        homebutton = new javax.swing.JLabel();
        settingsbutton = new javax.swing.JLabel();
        menubutton = new javax.swing.JLabel();
        headerbuttonbg = new javax.swing.JLabel();
        bankingsystemtext = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        sidebarpanel = new javax.swing.JPanel();
        core1logo = new javax.swing.JLabel();
        socialbutton = new javax.swing.JLabel();
        savingsbutton = new javax.swing.JLabel();
        consolidationbutton = new javax.swing.JLabel();
        commmgmtbutton = new javax.swing.JLabel();
        deptname = new javax.swing.JLabel();
        employeename = new javax.swing.JLabel();
        employeeimage = new javax.swing.JLabel();
        whitepart = new javax.swing.JLabel();
        sidepanel = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        settingspanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        menupanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        socialpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        savingspanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        consolidationpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        commmgmtpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mainbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        headerpanel.setBackground(new java.awt.Color(102, 255, 255));
        headerpanel.setPreferredSize(new java.awt.Dimension(1280, 80));
        headerpanel.setVerifyInputWhenFocusTarget(false);
        headerpanel.setLayout(null);

        homebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/homeicon.png"))); // NOI18N
        headerpanel.add(homebutton);
        homebutton.setBounds(990, 10, 40, 70);

        settingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/settingicon.png"))); // NOI18N
        settingsbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsbuttonMouseClicked(evt);
            }
        });
        headerpanel.add(settingsbutton);
        settingsbutton.setBounds(1100, 30, 40, 40);

        menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuicon.png"))); // NOI18N
        menubutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menubuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menubuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menubuttonMousePressed(evt);
            }
        });
        headerpanel.add(menubutton);
        menubutton.setBounds(1220, 30, 38, 40);

        headerbuttonbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/headersidebutton2.png"))); // NOI18N
        headerpanel.add(headerbuttonbg);
        headerbuttonbg.setBounds(930, 0, 355, 80);

        bankingsystemtext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/bankName.png"))); // NOI18N
        headerpanel.add(bankingsystemtext);
        bankingsystemtext.setBounds(70, 0, 350, 80);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/logo.png"))); // NOI18N
        headerpanel.add(logo);
        logo.setBounds(0, 0, 110, 80);

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/headerbg.png"))); // NOI18N
        headerpanel.add(header);
        header.setBounds(0, 0, 1280, 80);

        getContentPane().add(headerpanel);
        headerpanel.setBounds(0, 0, 1280, 80);

        sidebarpanel.setBackground(new java.awt.Color(51, 153, 255));
        sidebarpanel.setPreferredSize(new java.awt.Dimension(640, 260));
        sidebarpanel.setLayout(null);

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/core2logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        socialbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/socialdefault.png"))); // NOI18N
        socialbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socialbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                socialbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                socialbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                socialbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                socialbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                socialbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(socialbutton);
        socialbutton.setBounds(0, 460, 260, 60);

        savingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/savingsdefault.png"))); // NOI18N
        savingsbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savingsbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savingsbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savingsbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savingsbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                savingsbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                savingsbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(savingsbutton);
        savingsbutton.setBounds(0, 400, 260, 60);

        consolidationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/consolidatedefault.png"))); // NOI18N
        consolidationbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consolidationbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consolidationbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consolidationbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consolidationbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consolidationbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                consolidationbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(consolidationbutton);
        consolidationbutton.setBounds(0, 340, 260, 60);

        commmgmtbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/commmgmtdefault.png"))); // NOI18N
        commmgmtbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        commmgmtbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commmgmtbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commmgmtbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commmgmtbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                commmgmtbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                commmgmtbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(commmgmtbutton);
        commmgmtbutton.setBounds(0, 280, 260, 60);

        deptname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deptname.setText("Department Name");
        sidebarpanel.add(deptname);
        deptname.setBounds(80, 190, 110, 17);

        employeename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employeename.setText("Employee Name");
        sidebarpanel.add(employeename);
        employeename.setBounds(80, 170, 110, 17);

        employeeimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/thumbnail.png"))); // NOI18N
        sidebarpanel.add(employeeimage);
        employeeimage.setBounds(50, 20, 160, 140);

        whitepart.setBackground(new java.awt.Color(204, 204, 204));
        whitepart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/whitepart.png"))); // NOI18N
        sidebarpanel.add(whitepart);
        whitepart.setBounds(0, 0, 260, 220);

        sidepanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/sidebar.png"))); // NOI18N
        sidebarpanel.add(sidepanel);
        sidepanel.setBounds(0, 0, 260, 640);

        getContentPane().add(sidebarpanel);
        sidebarpanel.setBounds(0, 80, 260, 640);

        mainpanel.setBackground(new java.awt.Color(255, 102, 102));
        mainpanel.setLayout(null);

        settingspanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        settingspanel.setLayout(null);

        jLabel6.setText("settings panel");
        settingspanel.add(jLabel6);
        jLabel6.setBounds(30, 30, 80, 40);

        mainpanel.add(settingspanel);
        settingspanel.setBounds(780, 0, 220, 330);

        menupanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menupanel.setLayout(null);

        jLabel7.setText("menu panel");
        menupanel.add(jLabel7);
        jLabel7.setBounds(30, 30, 80, 40);

        mainpanel.add(menupanel);
        menupanel.setBounds(780, 0, 220, 330);

        socialpanel.setLayout(null);

        jLabel4.setText("Social Performance Panel");
        socialpanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(socialpanel);
        socialpanel.setBounds(20, 20, 970, 570);

        savingspanel.setLayout(null);

        jLabel3.setText("Savings Management Panel");
        savingspanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(savingspanel);
        savingspanel.setBounds(20, 20, 970, 570);

        consolidationpanel.setLayout(null);

        jLabel2.setText("Consolidation Panel");
        consolidationpanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(consolidationpanel);
        consolidationpanel.setBounds(20, 20, 970, 570);

        commmgmtpanel.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Communication Management Panel");
        commmgmtpanel.add(jLabel1);
        jLabel1.setBounds(40, 40, 200, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        commmgmtpanel.add(jScrollPane1);
        jScrollPane1.setBounds(60, 170, 640, 402);

        mainpanel.add(commmgmtpanel);
        commmgmtpanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void commmgmtbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commmgmtbuttonMouseEntered
       commmgmtbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/commmgmthover.png")));
    }//GEN-LAST:event_commmgmtbuttonMouseEntered

    private void commmgmtbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commmgmtbuttonMouseExited
      commmgmtbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/commmgmtdefault.png")));  
    }//GEN-LAST:event_commmgmtbuttonMouseExited

    private void commmgmtbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commmgmtbuttonMousePressed
      commmgmtbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/commmgmtclicked.png")));  
    }//GEN-LAST:event_commmgmtbuttonMousePressed

    private void commmgmtbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commmgmtbuttonMouseReleased
      commmgmtbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/commmgmthover.png")));  
    }//GEN-LAST:event_commmgmtbuttonMouseReleased

    private void consolidationbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consolidationbuttonMouseEntered
      consolidationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/consolidatehover.png")));  
    }//GEN-LAST:event_consolidationbuttonMouseEntered

    private void consolidationbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consolidationbuttonMouseExited
      consolidationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/consolidatedefault.png"))); 
    }//GEN-LAST:event_consolidationbuttonMouseExited

    private void consolidationbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consolidationbuttonMousePressed
      consolidationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/consolidateclicked.png"))); 
    }//GEN-LAST:event_consolidationbuttonMousePressed

    private void consolidationbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consolidationbuttonMouseReleased
      consolidationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/consolidatehover.png"))); 
    }//GEN-LAST:event_consolidationbuttonMouseReleased

    private void savingsbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savingsbuttonMouseEntered
      savingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/savingshover.png")));
    }//GEN-LAST:event_savingsbuttonMouseEntered

    private void savingsbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savingsbuttonMouseExited
      savingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/savingsdefault.png")));
    }//GEN-LAST:event_savingsbuttonMouseExited

    private void savingsbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savingsbuttonMousePressed
       savingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/savingsclicked.png")));
    }//GEN-LAST:event_savingsbuttonMousePressed

    private void savingsbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savingsbuttonMouseReleased
       savingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/savingshover.png")));
    }//GEN-LAST:event_savingsbuttonMouseReleased

    private void socialbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialbuttonMouseEntered
        socialbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/socialhover.png")));
    }//GEN-LAST:event_socialbuttonMouseEntered

    private void socialbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialbuttonMouseExited
        socialbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/socialdefault.png")));
    }//GEN-LAST:event_socialbuttonMouseExited

    private void socialbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialbuttonMousePressed
        socialbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/socialclicked.png")));
    }//GEN-LAST:event_socialbuttonMousePressed

    private void socialbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialbuttonMouseReleased
        socialbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core2ModuleButton/socialhover.png")));
    }//GEN-LAST:event_socialbuttonMouseReleased

    private void commmgmtbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commmgmtbuttonMouseClicked
        commmgmtpanel.setVisible(true);
        consolidationpanel.setVisible(false);
        savingspanel.setVisible(false);
        socialpanel.setVisible(false);
       
    }//GEN-LAST:event_commmgmtbuttonMouseClicked

    private void consolidationbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consolidationbuttonMouseClicked
        commmgmtpanel.setVisible(false);
        consolidationpanel.setVisible(true);
        savingspanel.setVisible(false);
        socialpanel.setVisible(false);
        
    }//GEN-LAST:event_consolidationbuttonMouseClicked

    private void savingsbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savingsbuttonMouseClicked
        commmgmtpanel.setVisible(false);
        consolidationpanel.setVisible(false);
        savingspanel.setVisible(true);
        socialpanel.setVisible(false);
       
    }//GEN-LAST:event_savingsbuttonMouseClicked

    private void socialbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialbuttonMouseClicked
       commmgmtpanel.setVisible(false);
       consolidationpanel.setVisible(false);
       savingspanel.setVisible(false);
       socialpanel.setVisible(true);
    
    }//GEN-LAST:event_socialbuttonMouseClicked

    private void menubuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuttonMouseEntered
       // menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuiconhover.png")));
    }//GEN-LAST:event_menubuttonMouseEntered

    private void menubuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuttonMouseExited
      //  menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuicon.png")));
    }//GEN-LAST:event_menubuttonMouseExited

    private void menubuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuttonMousePressed
      //  menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuiconhover.png")));
    }//GEN-LAST:event_menubuttonMousePressed

    private void menubuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuttonMouseClicked
        showmenu++;
        if((showmenu%2)==1){
        menupanel.setVisible(true);
        menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuiconhover.png")));
        settingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/settingicon.png")));
        settingspanel.setVisible(false);
        }
        
        else{
        menupanel.setVisible(false); 
        menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuicon.png")));
        settingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/settingicon.png")));
         settingspanel.setVisible(false);
        }
    }//GEN-LAST:event_menubuttonMouseClicked

    private void settingsbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbuttonMouseClicked
       showsettings++;
        if((showsettings%2)==1){
        settingspanel.setVisible(true);
        settingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/settingiconhover.png")));
        menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuicon.png")));
        menupanel.setVisible(false);
        }
        
        else{
        settingspanel.setVisible(false); 
        settingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/settingicon.png")));
        menubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/menuicon.png")));
         menupanel.setVisible(false);
        }
    }//GEN-LAST:event_settingsbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(CoreTransaction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoreTransaction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoreTransaction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoreTransaction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoreTransaction2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JLabel commmgmtbutton;
    private javax.swing.JPanel commmgmtpanel;
    private javax.swing.JLabel consolidationbutton;
    private javax.swing.JPanel consolidationpanel;
    private javax.swing.JLabel core1logo;
    private javax.swing.JLabel deptname;
    private javax.swing.JLabel employeeimage;
    private javax.swing.JLabel employeename;
    private javax.swing.JLabel header;
    private javax.swing.JLabel headerbuttonbg;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel homebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel savingsbutton;
    private javax.swing.JPanel savingspanel;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JLabel socialbutton;
    private javax.swing.JPanel socialpanel;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
