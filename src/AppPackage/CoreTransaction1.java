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
public class CoreTransaction1 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public CoreTransaction1() {
        initComponents();
        panels();
        
    }

    public void panels() {
        clientinfopanel.setBackground(new Color(200,200,200,40));
        clientinfopanel.setVisible(false);
        loanapplicationpanel.setBackground(new Color(200,200,200,40));
        loanapplicationpanel.setVisible(false);
        loanapprovalpanel.setBackground(new Color(200,200,200,40));
        loanapprovalpanel.setVisible(false);
        loanmonitoringpanel.setBackground(new Color(200,200,200,40));
        loanmonitoringpanel.setVisible(false);
        loanrestructurepanel.setBackground(new Color(200,200,200,40));
        loanrestructurepanel.setVisible(false);
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
        loanrestructure = new javax.swing.JLabel();
        loanmonitor = new javax.swing.JLabel();
        loanapproval = new javax.swing.JLabel();
        loadapplication = new javax.swing.JLabel();
        clientinfo = new javax.swing.JLabel();
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
        loanrestructurepanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        loanmonitoringpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        loanapprovalpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loanapplicationpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clientinfopanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/core1logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        loanrestructure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanrestructuredefault.png"))); // NOI18N
        loanrestructure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanrestructure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanrestructureMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loanrestructureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loanrestructureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loanrestructureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loanrestructureMouseReleased(evt);
            }
        });
        sidebarpanel.add(loanrestructure);
        loanrestructure.setBounds(0, 520, 260, 60);

        loanmonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanmonitordefault.png"))); // NOI18N
        loanmonitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanmonitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanmonitorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loanmonitorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loanmonitorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loanmonitorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loanmonitorMouseReleased(evt);
            }
        });
        sidebarpanel.add(loanmonitor);
        loanmonitor.setBounds(0, 460, 260, 60);

        loanapproval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingapprovaldefault.png"))); // NOI18N
        loanapproval.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanapproval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanapprovalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loanapprovalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loanapprovalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loanapprovalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loanapprovalMouseReleased(evt);
            }
        });
        sidebarpanel.add(loanapproval);
        loanapproval.setBounds(0, 400, 260, 60);

        loadapplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingdefault.png"))); // NOI18N
        loadapplication.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadapplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadapplicationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadapplicationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadapplicationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loadapplicationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loadapplicationMouseReleased(evt);
            }
        });
        sidebarpanel.add(loadapplication);
        loadapplication.setBounds(0, 340, 260, 60);

        clientinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/clientinfodefault.png"))); // NOI18N
        clientinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientinfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientinfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientinfoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientinfoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clientinfoMouseReleased(evt);
            }
        });
        sidebarpanel.add(clientinfo);
        clientinfo.setBounds(0, 280, 260, 60);

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

        loanrestructurepanel.setLayout(null);

        jLabel5.setText("loan restructuring");
        loanrestructurepanel.add(jLabel5);
        jLabel5.setBounds(60, 40, 160, 30);

        mainpanel.add(loanrestructurepanel);
        loanrestructurepanel.setBounds(20, 20, 970, 570);

        loanmonitoringpanel.setLayout(null);

        jLabel4.setText("loan payments and monitoring");
        loanmonitoringpanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(loanmonitoringpanel);
        loanmonitoringpanel.setBounds(20, 20, 970, 570);

        loanapprovalpanel.setLayout(null);

        jLabel3.setText("loan processng approval");
        loanapprovalpanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(loanapprovalpanel);
        loanapprovalpanel.setBounds(20, 20, 970, 570);

        loanapplicationpanel.setLayout(null);

        jLabel2.setText("loan processing application");
        loanapplicationpanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(loanapplicationpanel);
        loanapplicationpanel.setBounds(20, 20, 970, 570);

        clientinfopanel.setLayout(null);

        jLabel1.setText("Client information panel here");
        clientinfopanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 160, 40);

        mainpanel.add(clientinfopanel);
        clientinfopanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientinfoMouseEntered
       clientinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/clientinfohover.png")));
    }//GEN-LAST:event_clientinfoMouseEntered

    private void clientinfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientinfoMouseExited
      clientinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/clientinfodefault.png")));  
    }//GEN-LAST:event_clientinfoMouseExited

    private void clientinfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientinfoMousePressed
      clientinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/clientinfoclicked.png")));  
    }//GEN-LAST:event_clientinfoMousePressed

    private void clientinfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientinfoMouseReleased
      clientinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/clientinfohover.png")));  
    }//GEN-LAST:event_clientinfoMouseReleased

    private void loadapplicationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadapplicationMouseEntered
      loadapplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessinghover.png")));  
    }//GEN-LAST:event_loadapplicationMouseEntered

    private void loadapplicationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadapplicationMouseExited
      loadapplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingdefault.png"))); 
    }//GEN-LAST:event_loadapplicationMouseExited

    private void loadapplicationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadapplicationMousePressed
      loadapplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingclicked.png"))); 
    }//GEN-LAST:event_loadapplicationMousePressed

    private void loadapplicationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadapplicationMouseReleased
      loadapplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessinghover.png"))); 
    }//GEN-LAST:event_loadapplicationMouseReleased

    private void loanapprovalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanapprovalMouseEntered
      loanapproval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingapprovalhover.png")));
    }//GEN-LAST:event_loanapprovalMouseEntered

    private void loanapprovalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanapprovalMouseExited
      loanapproval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingapprovaldefault.png")));
    }//GEN-LAST:event_loanapprovalMouseExited

    private void loanapprovalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanapprovalMousePressed
       loanapproval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingapprovalclicked.png")));
    }//GEN-LAST:event_loanapprovalMousePressed

    private void loanapprovalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanapprovalMouseReleased
       loanapproval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanprocessingapprovalhover.png")));
    }//GEN-LAST:event_loanapprovalMouseReleased

    private void loanmonitorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanmonitorMouseEntered
        loanmonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanmonitorhover.png")));
    }//GEN-LAST:event_loanmonitorMouseEntered

    private void loanmonitorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanmonitorMouseExited
        loanmonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanmonitordefault.png")));
    }//GEN-LAST:event_loanmonitorMouseExited

    private void loanmonitorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanmonitorMousePressed
        loanmonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanmonitorclicked.png")));
    }//GEN-LAST:event_loanmonitorMousePressed

    private void loanmonitorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanmonitorMouseReleased
        loanmonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanmonitorhover.png")));
    }//GEN-LAST:event_loanmonitorMouseReleased

    private void loanrestructureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanrestructureMouseEntered
        loanrestructure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanrestructurehover.png")));
    }//GEN-LAST:event_loanrestructureMouseEntered

    private void loanrestructureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanrestructureMouseExited
        loanrestructure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanrestructuredefault.png")));
    }//GEN-LAST:event_loanrestructureMouseExited

    private void loanrestructureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanrestructureMousePressed
        loanrestructure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanrestructureclicked.png")));
    }//GEN-LAST:event_loanrestructureMousePressed

    private void loanrestructureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanrestructureMouseReleased
        loanrestructure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/loanrestructurehover.png")));
    }//GEN-LAST:event_loanrestructureMouseReleased

    private void clientinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientinfoMouseClicked
        clientinfopanel.setVisible(true);
        loanapplicationpanel.setVisible(false);
        loanapprovalpanel.setVisible(false);
        loanmonitoringpanel.setVisible(false);
        loanrestructurepanel.setVisible(false);
    }//GEN-LAST:event_clientinfoMouseClicked

    private void loadapplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadapplicationMouseClicked
        clientinfopanel.setVisible(false);
        loanapplicationpanel.setVisible(true);
        loanapprovalpanel.setVisible(false);
        loanmonitoringpanel.setVisible(false);
        loanrestructurepanel.setVisible(false);
    }//GEN-LAST:event_loadapplicationMouseClicked

    private void loanapprovalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanapprovalMouseClicked
        clientinfopanel.setVisible(false);
        loanapplicationpanel.setVisible(false);
        loanapprovalpanel.setVisible(true);
        loanmonitoringpanel.setVisible(false);
        loanrestructurepanel.setVisible(false);
    }//GEN-LAST:event_loanapprovalMouseClicked

    private void loanmonitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanmonitorMouseClicked
       clientinfopanel.setVisible(false);
       loanapplicationpanel.setVisible(false);
       loanapprovalpanel.setVisible(false);
       loanmonitoringpanel.setVisible(true);
       loanrestructurepanel.setVisible(false);
    }//GEN-LAST:event_loanmonitorMouseClicked

    private void loanrestructureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanrestructureMouseClicked
        clientinfopanel.setVisible(false);
        loanapplicationpanel.setVisible(false);
        loanapprovalpanel.setVisible(false);
        loanmonitoringpanel.setVisible(false);
        loanrestructurepanel.setVisible(true);
    }//GEN-LAST:event_loanrestructureMouseClicked

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
            java.util.logging.Logger.getLogger(CoreTransaction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoreTransaction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoreTransaction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoreTransaction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoreTransaction1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JLabel clientinfo;
    private javax.swing.JPanel clientinfopanel;
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
    private javax.swing.JLabel loadapplication;
    private javax.swing.JPanel loanapplicationpanel;
    private javax.swing.JLabel loanapproval;
    private javax.swing.JPanel loanapprovalpanel;
    private javax.swing.JLabel loanmonitor;
    private javax.swing.JPanel loanmonitoringpanel;
    private javax.swing.JLabel loanrestructure;
    private javax.swing.JPanel loanrestructurepanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
