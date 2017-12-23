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
public class HumanResources3 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public HumanResources3() {
        initComponents();
        panels();
        
    }

    public void panels() {
        claimPanel.setBackground(new Color(200,200,200,40));
        claimPanel.setVisible(false);
        leavePanel.setBackground(new Color(200,200,200,40));
        leavePanel.setVisible(false);
        shiftPanel.setBackground(new Color(200,200,200,40));
        shiftPanel.setVisible(false);
        timeattPanel.setBackground(new Color(200,200,200,40));
        timeattPanel.setVisible(false);
        timesheetPanel.setBackground(new Color(200,200,200,40));
        timesheetPanel.setVisible(false);
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
        timesheetbutton = new javax.swing.JLabel();
        timeattbutton = new javax.swing.JLabel();
        shiftbutton = new javax.swing.JLabel();
        leavebutton = new javax.swing.JLabel();
        claimbutton = new javax.swing.JLabel();
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
        timesheetPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        timeattPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        shiftPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        leavePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        claimPanel = new javax.swing.JPanel();
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/hr3logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        timesheetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timesheetdefault.png"))); // NOI18N
        timesheetbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timesheetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timesheetbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timesheetbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timesheetbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                timesheetbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                timesheetbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(timesheetbutton);
        timesheetbutton.setBounds(0, 520, 260, 60);

        timeattbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timeAttdefault.png"))); // NOI18N
        timeattbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeattbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeattbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeattbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeattbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                timeattbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                timeattbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(timeattbutton);
        timeattbutton.setBounds(0, 460, 260, 60);

        shiftbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/shiftdefault.png"))); // NOI18N
        shiftbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shiftbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiftbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shiftbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shiftbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shiftbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shiftbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(shiftbutton);
        shiftbutton.setBounds(0, 400, 260, 60);

        leavebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/leavedefault.png"))); // NOI18N
        leavebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leavebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leavebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leavebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leavebuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leavebuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leavebuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(leavebutton);
        leavebutton.setBounds(0, 340, 260, 60);

        claimbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/claimdefault.png"))); // NOI18N
        claimbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        claimbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                claimbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                claimbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                claimbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                claimbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                claimbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(claimbutton);
        claimbutton.setBounds(0, 280, 260, 60);

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

        timesheetPanel.setLayout(null);

        jLabel5.setText("Timesheet Management Panel");
        timesheetPanel.add(jLabel5);
        jLabel5.setBounds(60, 40, 160, 30);

        mainpanel.add(timesheetPanel);
        timesheetPanel.setBounds(20, 20, 970, 570);

        timeattPanel.setLayout(null);

        jLabel4.setText("Time and Attendance Panel");
        timeattPanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(timeattPanel);
        timeattPanel.setBounds(20, 20, 970, 570);

        shiftPanel.setLayout(null);

        jLabel3.setText("Shift and Scheduling Panel");
        shiftPanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(shiftPanel);
        shiftPanel.setBounds(20, 20, 970, 570);

        leavePanel.setLayout(null);

        jLabel2.setText("Leave Management Panel");
        leavePanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(leavePanel);
        leavePanel.setBounds(20, 20, 970, 570);

        claimPanel.setLayout(null);

        jLabel1.setText("Claim and Reimbursement Panel");
        claimPanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 160, 40);

        mainpanel.add(claimPanel);
        claimPanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void claimbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claimbuttonMouseEntered
       claimbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/claimhover.png")));
    }//GEN-LAST:event_claimbuttonMouseEntered

    private void claimbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claimbuttonMouseExited
      claimbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/claimdefault.png")));  
    }//GEN-LAST:event_claimbuttonMouseExited

    private void claimbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claimbuttonMousePressed
      claimbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/claimclicked.png")));  
    }//GEN-LAST:event_claimbuttonMousePressed

    private void claimbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claimbuttonMouseReleased
      claimbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/claimhover.png")));  
    }//GEN-LAST:event_claimbuttonMouseReleased

    private void leavebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavebuttonMouseEntered
      leavebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/leavehover.png")));  
    }//GEN-LAST:event_leavebuttonMouseEntered

    private void leavebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavebuttonMouseExited
      leavebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/leavedefault.png"))); 
    }//GEN-LAST:event_leavebuttonMouseExited

    private void leavebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavebuttonMousePressed
      leavebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/leaveclicked.png"))); 
    }//GEN-LAST:event_leavebuttonMousePressed

    private void leavebuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavebuttonMouseReleased
      leavebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/leavehover.png"))); 
    }//GEN-LAST:event_leavebuttonMouseReleased

    private void shiftbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftbuttonMouseEntered
      shiftbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/shifthover.png")));
    }//GEN-LAST:event_shiftbuttonMouseEntered

    private void shiftbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftbuttonMouseExited
      shiftbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/shiftdefault.png")));
    }//GEN-LAST:event_shiftbuttonMouseExited

    private void shiftbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftbuttonMousePressed
       shiftbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/shiftclicked.png")));
    }//GEN-LAST:event_shiftbuttonMousePressed

    private void shiftbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftbuttonMouseReleased
       shiftbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/shifthover.png")));
    }//GEN-LAST:event_shiftbuttonMouseReleased

    private void timeattbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeattbuttonMouseEntered
        timeattbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timeAtthover.png")));
    }//GEN-LAST:event_timeattbuttonMouseEntered

    private void timeattbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeattbuttonMouseExited
        timeattbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timeAttdefault.png")));
    }//GEN-LAST:event_timeattbuttonMouseExited

    private void timeattbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeattbuttonMousePressed
        timeattbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timeAttclicked.png")));
    }//GEN-LAST:event_timeattbuttonMousePressed

    private void timeattbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeattbuttonMouseReleased
        timeattbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timeAtthover.png")));
    }//GEN-LAST:event_timeattbuttonMouseReleased

    private void timesheetbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesheetbuttonMouseEntered
        timesheetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timesheethover.png")));
    }//GEN-LAST:event_timesheetbuttonMouseEntered

    private void timesheetbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesheetbuttonMouseExited
        timesheetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timesheetdefault.png")));
    }//GEN-LAST:event_timesheetbuttonMouseExited

    private void timesheetbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesheetbuttonMousePressed
        timesheetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timesheetclicked.png")));
    }//GEN-LAST:event_timesheetbuttonMousePressed

    private void timesheetbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesheetbuttonMouseReleased
        timesheetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR3ModuleButton/timesheethover.png")));
    }//GEN-LAST:event_timesheetbuttonMouseReleased

    private void claimbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claimbuttonMouseClicked
        claimPanel.setVisible(true);
        leavePanel.setVisible(false);
        shiftPanel.setVisible(false);
        timeattPanel.setVisible(false);
        timesheetPanel.setVisible(false);
    }//GEN-LAST:event_claimbuttonMouseClicked

    private void leavebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavebuttonMouseClicked
        claimPanel.setVisible(false);
        leavePanel.setVisible(true);
        shiftPanel.setVisible(false);
        timeattPanel.setVisible(false);
        timesheetPanel.setVisible(false);
    }//GEN-LAST:event_leavebuttonMouseClicked

    private void shiftbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftbuttonMouseClicked
        claimPanel.setVisible(false);
        leavePanel.setVisible(false);
        shiftPanel.setVisible(true);
        timeattPanel.setVisible(false);
        timesheetPanel.setVisible(false);
    }//GEN-LAST:event_shiftbuttonMouseClicked

    private void timeattbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeattbuttonMouseClicked
       claimPanel.setVisible(false);
       leavePanel.setVisible(false);
       shiftPanel.setVisible(false);
       timeattPanel.setVisible(true);
       timesheetPanel.setVisible(false);
    }//GEN-LAST:event_timeattbuttonMouseClicked

    private void timesheetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesheetbuttonMouseClicked
        claimPanel.setVisible(false);
        leavePanel.setVisible(false);
        shiftPanel.setVisible(false);
        timeattPanel.setVisible(false);
        timesheetPanel.setVisible(true);
    }//GEN-LAST:event_timesheetbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(HumanResources3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HumanResources3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HumanResources3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HumanResources3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HumanResources3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JPanel claimPanel;
    private javax.swing.JLabel claimbutton;
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
    private javax.swing.JPanel leavePanel;
    private javax.swing.JLabel leavebutton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel shiftPanel;
    private javax.swing.JLabel shiftbutton;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JPanel timeattPanel;
    private javax.swing.JLabel timeattbutton;
    private javax.swing.JPanel timesheetPanel;
    private javax.swing.JLabel timesheetbutton;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
