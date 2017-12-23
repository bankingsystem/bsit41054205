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
public class HumanResources1 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public HumanResources1() {
        initComponents();
        panels();
        
    }

    public void panels() {
        applicantPanel.setBackground(new Color(200,200,200,40));
        applicantPanel.setVisible(false);
        newhiredPanel.setBackground(new Color(200,200,200,40));
        newhiredPanel.setVisible(false);
        performancePanel.setBackground(new Color(200,200,200,40));
        performancePanel.setVisible(false);
        recruitmentPanel.setBackground(new Color(200,200,200,40));
        recruitmentPanel.setVisible(false);
        socialPanel.setBackground(new Color(200,200,200,40));
        socialPanel.setVisible(false);
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
        socialrecbutton = new javax.swing.JLabel();
        recruitmentbutton = new javax.swing.JLabel();
        performancebutton = new javax.swing.JLabel();
        newhiredbutton = new javax.swing.JLabel();
        applicantbutton = new javax.swing.JLabel();
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
        socialPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        recruitmentPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        performancePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        newhiredPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        applicantPanel = new javax.swing.JPanel();
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/hr1logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        socialrecbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/socialdefault.png"))); // NOI18N
        socialrecbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socialrecbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                socialrecbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                socialrecbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                socialrecbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                socialrecbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                socialrecbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(socialrecbutton);
        socialrecbutton.setBounds(0, 520, 260, 60);

        recruitmentbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/recruitdefault.png"))); // NOI18N
        recruitmentbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recruitmentbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recruitmentbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recruitmentbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recruitmentbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                recruitmentbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                recruitmentbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(recruitmentbutton);
        recruitmentbutton.setBounds(0, 460, 260, 60);

        performancebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/perfdefault.png"))); // NOI18N
        performancebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        performancebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                performancebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                performancebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                performancebuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                performancebuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                performancebuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(performancebutton);
        performancebutton.setBounds(0, 400, 260, 60);

        newhiredbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/newhireddefault.png"))); // NOI18N
        newhiredbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newhiredbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newhiredbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newhiredbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newhiredbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newhiredbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newhiredbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(newhiredbutton);
        newhiredbutton.setBounds(0, 340, 260, 60);

        applicantbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/applicantdefault.png"))); // NOI18N
        applicantbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        applicantbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicantbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applicantbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applicantbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                applicantbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                applicantbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(applicantbutton);
        applicantbutton.setBounds(0, 280, 260, 60);

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

        socialPanel.setLayout(null);

        jLabel5.setText("Social Recognition Panel");
        socialPanel.add(jLabel5);
        jLabel5.setBounds(60, 40, 160, 30);

        mainpanel.add(socialPanel);
        socialPanel.setBounds(20, 20, 970, 570);

        recruitmentPanel.setLayout(null);

        jLabel4.setText("Recruitment Management Panel");
        recruitmentPanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(recruitmentPanel);
        recruitmentPanel.setBounds(20, 20, 970, 570);

        performancePanel.setLayout(null);

        jLabel3.setText("Performance Management Panel");
        performancePanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(performancePanel);
        performancePanel.setBounds(20, 20, 970, 570);

        newhiredPanel.setLayout(null);

        jLabel2.setText("New Hired On-Board Panel");
        newhiredPanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(newhiredPanel);
        newhiredPanel.setBounds(20, 20, 970, 570);

        applicantPanel.setLayout(null);

        jLabel1.setText("Applicant Management Panel");
        applicantPanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 160, 40);

        mainpanel.add(applicantPanel);
        applicantPanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applicantbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicantbuttonMouseEntered
       applicantbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/applicanthover.png")));
    }//GEN-LAST:event_applicantbuttonMouseEntered

    private void applicantbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicantbuttonMouseExited
      applicantbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/applicantdefault.png")));  
    }//GEN-LAST:event_applicantbuttonMouseExited

    private void applicantbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicantbuttonMousePressed
      applicantbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/applicantclicked.png")));  
    }//GEN-LAST:event_applicantbuttonMousePressed

    private void applicantbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicantbuttonMouseReleased
      applicantbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/applicanthover.png")));  
    }//GEN-LAST:event_applicantbuttonMouseReleased

    private void newhiredbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newhiredbuttonMouseEntered
      newhiredbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/newhiredhover.png")));  
    }//GEN-LAST:event_newhiredbuttonMouseEntered

    private void newhiredbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newhiredbuttonMouseExited
      newhiredbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/newhireddefault.png"))); 
    }//GEN-LAST:event_newhiredbuttonMouseExited

    private void newhiredbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newhiredbuttonMousePressed
      newhiredbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/newhiredclicked.png"))); 
    }//GEN-LAST:event_newhiredbuttonMousePressed

    private void newhiredbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newhiredbuttonMouseReleased
      newhiredbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/newhiredhover.png"))); 
    }//GEN-LAST:event_newhiredbuttonMouseReleased

    private void performancebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performancebuttonMouseEntered
      performancebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/perfhover.png")));
    }//GEN-LAST:event_performancebuttonMouseEntered

    private void performancebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performancebuttonMouseExited
      performancebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/perfdefault.png")));
    }//GEN-LAST:event_performancebuttonMouseExited

    private void performancebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performancebuttonMousePressed
       performancebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/perfclicked.png")));
    }//GEN-LAST:event_performancebuttonMousePressed

    private void performancebuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performancebuttonMouseReleased
       performancebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/perfhover.png")));
    }//GEN-LAST:event_performancebuttonMouseReleased

    private void recruitmentbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recruitmentbuttonMouseEntered
        recruitmentbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/recruithover.png")));
    }//GEN-LAST:event_recruitmentbuttonMouseEntered

    private void recruitmentbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recruitmentbuttonMouseExited
        recruitmentbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/recruitdefault.png")));
    }//GEN-LAST:event_recruitmentbuttonMouseExited

    private void recruitmentbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recruitmentbuttonMousePressed
        recruitmentbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/recruitclicked.png")));
    }//GEN-LAST:event_recruitmentbuttonMousePressed

    private void recruitmentbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recruitmentbuttonMouseReleased
        recruitmentbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/recruithover.png")));
    }//GEN-LAST:event_recruitmentbuttonMouseReleased

    private void socialrecbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialrecbuttonMouseEntered
        socialrecbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/socialhover.png")));
    }//GEN-LAST:event_socialrecbuttonMouseEntered

    private void socialrecbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialrecbuttonMouseExited
        socialrecbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/socialdefault.png")));
    }//GEN-LAST:event_socialrecbuttonMouseExited

    private void socialrecbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialrecbuttonMousePressed
        socialrecbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/socialclicked.png")));
    }//GEN-LAST:event_socialrecbuttonMousePressed

    private void socialrecbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialrecbuttonMouseReleased
        socialrecbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR1ModuleButton/socialhover.png")));
    }//GEN-LAST:event_socialrecbuttonMouseReleased

    private void applicantbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicantbuttonMouseClicked
        applicantPanel.setVisible(true);
        newhiredPanel.setVisible(false);
        performancePanel.setVisible(false);
        recruitmentPanel.setVisible(false);
        socialPanel.setVisible(false);
    }//GEN-LAST:event_applicantbuttonMouseClicked

    private void newhiredbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newhiredbuttonMouseClicked
        applicantPanel.setVisible(false);
        newhiredPanel.setVisible(true);
        performancePanel.setVisible(false);
        recruitmentPanel.setVisible(false);
        socialPanel.setVisible(false);
    }//GEN-LAST:event_newhiredbuttonMouseClicked

    private void performancebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_performancebuttonMouseClicked
        applicantPanel.setVisible(false);
        newhiredPanel.setVisible(false);
        performancePanel.setVisible(true);
        recruitmentPanel.setVisible(false);
        socialPanel.setVisible(false);
    }//GEN-LAST:event_performancebuttonMouseClicked

    private void recruitmentbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recruitmentbuttonMouseClicked
       applicantPanel.setVisible(false);
       newhiredPanel.setVisible(false);
       performancePanel.setVisible(false);
       recruitmentPanel.setVisible(true);
       socialPanel.setVisible(false);
    }//GEN-LAST:event_recruitmentbuttonMouseClicked

    private void socialrecbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socialrecbuttonMouseClicked
        applicantPanel.setVisible(false);
        newhiredPanel.setVisible(false);
        performancePanel.setVisible(false);
        recruitmentPanel.setVisible(false);
        socialPanel.setVisible(true);
    }//GEN-LAST:event_socialrecbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(HumanResources1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HumanResources1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HumanResources1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HumanResources1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HumanResources1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel applicantPanel;
    private javax.swing.JLabel applicantbutton;
    private javax.swing.JLabel bankingsystemtext;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel newhiredPanel;
    private javax.swing.JLabel newhiredbutton;
    private javax.swing.JPanel performancePanel;
    private javax.swing.JLabel performancebutton;
    private javax.swing.JPanel recruitmentPanel;
    private javax.swing.JLabel recruitmentbutton;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JPanel socialPanel;
    private javax.swing.JLabel socialrecbutton;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
