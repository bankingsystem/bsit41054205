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
public class HumanResources4 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public HumanResources4() {
        initComponents();
        panels();
        
    }

    public void panels() {
        compensationPanel.setBackground(new Color(200,200,200,40));
        compensationPanel.setVisible(false);
        corehumanPanel.setBackground(new Color(200,200,200,40));
        corehumanPanel.setVisible(false);
        hranalyticsPanel.setBackground(new Color(200,200,200,40));
        hranalyticsPanel.setVisible(false);
        payrollPanel.setBackground(new Color(200,200,200,40));
        payrollPanel.setVisible(false);
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
        payrollbutton = new javax.swing.JLabel();
        hranalyticsbutton = new javax.swing.JLabel();
        corehumanbutton = new javax.swing.JLabel();
        compensationbutton = new javax.swing.JLabel();
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
        payrollPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        hranalyticsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        corehumanPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        compensationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/hr4logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        payrollbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/payrolldefault.png"))); // NOI18N
        payrollbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payrollbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payrollbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                payrollbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payrollbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                payrollbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                payrollbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(payrollbutton);
        payrollbutton.setBounds(0, 460, 260, 60);

        hranalyticsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/hranalyticsdefault.png"))); // NOI18N
        hranalyticsbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hranalyticsbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hranalyticsbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hranalyticsbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hranalyticsbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hranalyticsbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hranalyticsbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(hranalyticsbutton);
        hranalyticsbutton.setBounds(0, 400, 260, 60);

        corehumanbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/corehumandefault.png"))); // NOI18N
        corehumanbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        corehumanbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corehumanbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                corehumanbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                corehumanbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                corehumanbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                corehumanbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(corehumanbutton);
        corehumanbutton.setBounds(0, 340, 260, 60);

        compensationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/compensationdefault.png"))); // NOI18N
        compensationbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compensationbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compensationbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                compensationbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compensationbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                compensationbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                compensationbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(compensationbutton);
        compensationbutton.setBounds(0, 280, 260, 60);

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

        payrollPanel.setLayout(null);

        jLabel4.setText("payroll Panel");
        payrollPanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(payrollPanel);
        payrollPanel.setBounds(20, 20, 970, 570);

        hranalyticsPanel.setLayout(null);

        jLabel3.setText("HR Analytics Panel");
        hranalyticsPanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(hranalyticsPanel);
        hranalyticsPanel.setBounds(20, 20, 970, 570);

        corehumanPanel.setLayout(null);

        jLabel2.setText("Core Human Panel");
        corehumanPanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(corehumanPanel);
        corehumanPanel.setBounds(20, 20, 970, 570);

        compensationPanel.setLayout(null);

        jLabel1.setText("Compensation Panel");
        compensationPanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 160, 40);

        mainpanel.add(compensationPanel);
        compensationPanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compensationbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compensationbuttonMouseEntered
       compensationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/compensationhover.png")));
    }//GEN-LAST:event_compensationbuttonMouseEntered

    private void compensationbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compensationbuttonMouseExited
      compensationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/compensationdefault.png")));  
    }//GEN-LAST:event_compensationbuttonMouseExited

    private void compensationbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compensationbuttonMousePressed
      compensationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/compensationclicked.png")));  
    }//GEN-LAST:event_compensationbuttonMousePressed

    private void compensationbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compensationbuttonMouseReleased
      compensationbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/compensationhover.png")));  
    }//GEN-LAST:event_compensationbuttonMouseReleased

    private void corehumanbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corehumanbuttonMouseEntered
      corehumanbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/corehumanhover.png")));  
    }//GEN-LAST:event_corehumanbuttonMouseEntered

    private void corehumanbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corehumanbuttonMouseExited
      corehumanbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/corehumandefault.png"))); 
    }//GEN-LAST:event_corehumanbuttonMouseExited

    private void corehumanbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corehumanbuttonMousePressed
      corehumanbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/corehumanclicked.png"))); 
    }//GEN-LAST:event_corehumanbuttonMousePressed

    private void corehumanbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corehumanbuttonMouseReleased
      corehumanbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/corehumanhover.png"))); 
    }//GEN-LAST:event_corehumanbuttonMouseReleased

    private void hranalyticsbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hranalyticsbuttonMouseEntered
      hranalyticsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/hranalyticshover.png")));
    }//GEN-LAST:event_hranalyticsbuttonMouseEntered

    private void hranalyticsbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hranalyticsbuttonMouseExited
      hranalyticsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/hranalyticsdefault.png")));
    }//GEN-LAST:event_hranalyticsbuttonMouseExited

    private void hranalyticsbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hranalyticsbuttonMousePressed
       hranalyticsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/hranalyticsclicked.png")));
    }//GEN-LAST:event_hranalyticsbuttonMousePressed

    private void hranalyticsbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hranalyticsbuttonMouseReleased
       hranalyticsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/hranalyticshover.png")));
    }//GEN-LAST:event_hranalyticsbuttonMouseReleased

    private void payrollbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollbuttonMouseEntered
        payrollbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/payrollhover.png")));
    }//GEN-LAST:event_payrollbuttonMouseEntered

    private void payrollbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollbuttonMouseExited
        payrollbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/payrolldefault.png")));
    }//GEN-LAST:event_payrollbuttonMouseExited

    private void payrollbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollbuttonMousePressed
        payrollbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/payrollclicked.png")));
    }//GEN-LAST:event_payrollbuttonMousePressed

    private void payrollbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollbuttonMouseReleased
        payrollbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR4ModuleButton/payrollhover.png")));
    }//GEN-LAST:event_payrollbuttonMouseReleased

    private void compensationbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compensationbuttonMouseClicked
        compensationPanel.setVisible(true);
        corehumanPanel.setVisible(false);
        hranalyticsPanel.setVisible(false);
        payrollPanel.setVisible(false);

    }//GEN-LAST:event_compensationbuttonMouseClicked

    private void corehumanbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corehumanbuttonMouseClicked
        compensationPanel.setVisible(false);
        corehumanPanel.setVisible(true);
        hranalyticsPanel.setVisible(false);
        payrollPanel.setVisible(false);
 
    }//GEN-LAST:event_corehumanbuttonMouseClicked

    private void hranalyticsbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hranalyticsbuttonMouseClicked
        compensationPanel.setVisible(false);
        corehumanPanel.setVisible(false);
        hranalyticsPanel.setVisible(true);
        payrollPanel.setVisible(false);

    }//GEN-LAST:event_hranalyticsbuttonMouseClicked

    private void payrollbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollbuttonMouseClicked
       compensationPanel.setVisible(false);
       corehumanPanel.setVisible(false);
       hranalyticsPanel.setVisible(false);
       payrollPanel.setVisible(true);

    }//GEN-LAST:event_payrollbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(HumanResources4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HumanResources4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HumanResources4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HumanResources4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HumanResources4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JPanel compensationPanel;
    private javax.swing.JLabel compensationbutton;
    private javax.swing.JLabel core1logo;
    private javax.swing.JPanel corehumanPanel;
    private javax.swing.JLabel corehumanbutton;
    private javax.swing.JLabel deptname;
    private javax.swing.JLabel employeeimage;
    private javax.swing.JLabel employeename;
    private javax.swing.JLabel header;
    private javax.swing.JLabel headerbuttonbg;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel homebutton;
    private javax.swing.JPanel hranalyticsPanel;
    private javax.swing.JLabel hranalyticsbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel payrollPanel;
    private javax.swing.JLabel payrollbutton;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
