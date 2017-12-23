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
public class Logistics2 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public Logistics2() {
        initComponents();
        panels();
        
    }

    public void panels() {
        auditPanel.setBackground(new Color(200,200,200,40));
        auditPanel.setVisible(false);
        documentPanel.setBackground(new Color(200,200,200,40));
        documentPanel.setVisible(false);
        fleetPanel.setBackground(new Color(200,200,200,40));
        fleetPanel.setVisible(false);
        vehiclePanel.setBackground(new Color(200,200,200,40));
        vehiclePanel.setVisible(false);
        vendorPanel.setBackground(new Color(200,200,200,40));
        vendorPanel.setVisible(false);
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
        vendorbutton = new javax.swing.JLabel();
        vehiclebutton = new javax.swing.JLabel();
        fleetbutton = new javax.swing.JLabel();
        docubutton = new javax.swing.JLabel();
        auditbutton = new javax.swing.JLabel();
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
        vendorPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        vehiclePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fleetPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        documentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        auditPanel = new javax.swing.JPanel();
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/log2logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        vendorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vendordefault.png"))); // NOI18N
        vendorbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vendorbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendorbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vendorbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vendorbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vendorbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vendorbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(vendorbutton);
        vendorbutton.setBounds(0, 520, 260, 60);

        vehiclebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vehicledefault.png"))); // NOI18N
        vehiclebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehiclebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehiclebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vehiclebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vehiclebuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vehiclebuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vehiclebuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(vehiclebutton);
        vehiclebutton.setBounds(0, 460, 260, 60);

        fleetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/fleetdefault.png"))); // NOI18N
        fleetbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fleetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fleetbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fleetbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fleetbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fleetbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fleetbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(fleetbutton);
        fleetbutton.setBounds(0, 400, 260, 60);

        docubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/docutrackdefault.png"))); // NOI18N
        docubutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docubutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docubuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docubuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                docubuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                docubuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                docubuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(docubutton);
        docubutton.setBounds(0, 340, 260, 60);

        auditbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/auditdefault.png"))); // NOI18N
        auditbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        auditbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                auditbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                auditbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                auditbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                auditbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                auditbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(auditbutton);
        auditbutton.setBounds(0, 280, 260, 60);

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

        vendorPanel.setLayout(null);

        jLabel5.setText("vendor portal management fucking panel");
        vendorPanel.add(jLabel5);
        jLabel5.setBounds(60, 40, 220, 30);

        mainpanel.add(vendorPanel);
        vendorPanel.setBounds(20, 20, 970, 570);

        vehiclePanel.setLayout(null);

        jLabel4.setText("vehicle panel");
        vehiclePanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(vehiclePanel);
        vehiclePanel.setBounds(20, 20, 970, 570);

        fleetPanel.setLayout(null);

        jLabel3.setText("fleet mangement panel");
        fleetPanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(fleetPanel);
        fleetPanel.setBounds(20, 20, 970, 570);

        documentPanel.setLayout(null);

        jLabel2.setText("document Panel");
        documentPanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(documentPanel);
        documentPanel.setBounds(20, 20, 970, 570);

        auditPanel.setLayout(null);

        jLabel1.setText("Audit Management Panel");
        auditPanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 160, 40);

        mainpanel.add(auditPanel);
        auditPanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void auditbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auditbuttonMouseEntered
       auditbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/audithover.png")));
    }//GEN-LAST:event_auditbuttonMouseEntered

    private void auditbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auditbuttonMouseExited
      auditbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/auditdefault.png")));  
    }//GEN-LAST:event_auditbuttonMouseExited

    private void auditbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auditbuttonMousePressed
      auditbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/auditclicked.png")));  
    }//GEN-LAST:event_auditbuttonMousePressed

    private void auditbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auditbuttonMouseReleased
      auditbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/audithover.png")));  
    }//GEN-LAST:event_auditbuttonMouseReleased

    private void docubuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docubuttonMouseEntered
      docubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/docutrackhover.png")));  
    }//GEN-LAST:event_docubuttonMouseEntered

    private void docubuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docubuttonMouseExited
      docubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/docutrackdefault.png"))); 
    }//GEN-LAST:event_docubuttonMouseExited

    private void docubuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docubuttonMousePressed
      docubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/docutrackclicked.png"))); 
    }//GEN-LAST:event_docubuttonMousePressed

    private void docubuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docubuttonMouseReleased
      docubutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/docutrackhover.png"))); 
    }//GEN-LAST:event_docubuttonMouseReleased

    private void fleetbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fleetbuttonMouseEntered
      fleetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/fleethover.png")));
    }//GEN-LAST:event_fleetbuttonMouseEntered

    private void fleetbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fleetbuttonMouseExited
      fleetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/fleetdefault.png")));
    }//GEN-LAST:event_fleetbuttonMouseExited

    private void fleetbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fleetbuttonMousePressed
       fleetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/fleetclicked.png")));
    }//GEN-LAST:event_fleetbuttonMousePressed

    private void fleetbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fleetbuttonMouseReleased
       fleetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/fleethover.png")));
    }//GEN-LAST:event_fleetbuttonMouseReleased

    private void vehiclebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclebuttonMouseEntered
        vehiclebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vehiclehover.png")));
    }//GEN-LAST:event_vehiclebuttonMouseEntered

    private void vehiclebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclebuttonMouseExited
        vehiclebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vehicledefault.png")));
    }//GEN-LAST:event_vehiclebuttonMouseExited

    private void vehiclebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclebuttonMousePressed
        vehiclebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vehicleclicked.png")));
    }//GEN-LAST:event_vehiclebuttonMousePressed

    private void vehiclebuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclebuttonMouseReleased
        vehiclebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vehiclehover.png")));
    }//GEN-LAST:event_vehiclebuttonMouseReleased

    private void vendorbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorbuttonMouseEntered
        vendorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vendorhover.png")));
    }//GEN-LAST:event_vendorbuttonMouseEntered

    private void vendorbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorbuttonMouseExited
        vendorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vendordefault.png")));
    }//GEN-LAST:event_vendorbuttonMouseExited

    private void vendorbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorbuttonMousePressed
        vendorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vendorclicked.png")));
    }//GEN-LAST:event_vendorbuttonMousePressed

    private void vendorbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorbuttonMouseReleased
        vendorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log2ModuleButton/vendorhover.png")));
    }//GEN-LAST:event_vendorbuttonMouseReleased

    private void auditbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auditbuttonMouseClicked
        auditPanel.setVisible(true);
        documentPanel.setVisible(false);
        fleetPanel.setVisible(false);
        vehiclePanel.setVisible(false);
        vendorPanel.setVisible(false);
    }//GEN-LAST:event_auditbuttonMouseClicked

    private void docubuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docubuttonMouseClicked
        auditPanel.setVisible(false);
        documentPanel.setVisible(true);
        fleetPanel.setVisible(false);
        vehiclePanel.setVisible(false);
        vendorPanel.setVisible(false);
    }//GEN-LAST:event_docubuttonMouseClicked

    private void fleetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fleetbuttonMouseClicked
        auditPanel.setVisible(false);
        documentPanel.setVisible(false);
        fleetPanel.setVisible(true);
        vehiclePanel.setVisible(false);
        vendorPanel.setVisible(false);
    }//GEN-LAST:event_fleetbuttonMouseClicked

    private void vehiclebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiclebuttonMouseClicked
       auditPanel.setVisible(false);
       documentPanel.setVisible(false);
       fleetPanel.setVisible(false);
       vehiclePanel.setVisible(true);
       vendorPanel.setVisible(false);
    }//GEN-LAST:event_vehiclebuttonMouseClicked

    private void vendorbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorbuttonMouseClicked
        auditPanel.setVisible(false);
        documentPanel.setVisible(false);
        fleetPanel.setVisible(false);
        vehiclePanel.setVisible(false);
        vendorPanel.setVisible(true);
    }//GEN-LAST:event_vendorbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Logistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logistics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logistics2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel auditPanel;
    private javax.swing.JLabel auditbutton;
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JLabel core1logo;
    private javax.swing.JLabel deptname;
    private javax.swing.JLabel docubutton;
    private javax.swing.JPanel documentPanel;
    private javax.swing.JLabel employeeimage;
    private javax.swing.JLabel employeename;
    private javax.swing.JPanel fleetPanel;
    private javax.swing.JLabel fleetbutton;
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
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JPanel vehiclePanel;
    private javax.swing.JLabel vehiclebutton;
    private javax.swing.JPanel vendorPanel;
    private javax.swing.JLabel vendorbutton;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
