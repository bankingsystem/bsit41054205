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
public class Finance extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public Finance() {
        initComponents();
        panels();
        
    }

    public void panels() {
        aprPanel.setBackground(new Color(200,200,200,40));
        aprPanel.setVisible(false);
        budgetPanel.setBackground(new Color(200,200,200,40));
        budgetPanel.setVisible(false);
        collectionPanel.setBackground(new Color(200,200,200,40));
        collectionPanel.setVisible(false);
        disbursementPanel.setBackground(new Color(200,200,200,40));
        disbursementPanel.setVisible(false);
        glPanel.setBackground(new Color(200,200,200,40));
        glPanel.setVisible(false);
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
        glbutton = new javax.swing.JLabel();
        disbutton = new javax.swing.JLabel();
        colbutton = new javax.swing.JLabel();
        budgetbutton = new javax.swing.JLabel();
        aprbutton = new javax.swing.JLabel();
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
        glPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        disbursementPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        collectionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        budgetPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        aprPanel = new javax.swing.JPanel();
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/financelogo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        glbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/gldefault.png"))); // NOI18N
        glbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        glbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                glbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                glbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                glbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                glbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                glbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(glbutton);
        glbutton.setBounds(0, 520, 260, 60);

        disbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/disdefault.png"))); // NOI18N
        disbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                disbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                disbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                disbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(disbutton);
        disbutton.setBounds(0, 460, 260, 60);

        colbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/coldefault.png"))); // NOI18N
        colbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                colbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(colbutton);
        colbutton.setBounds(0, 400, 260, 60);

        budgetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/budgetdefault.png"))); // NOI18N
        budgetbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        budgetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                budgetbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                budgetbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                budgetbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                budgetbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                budgetbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(budgetbutton);
        budgetbutton.setBounds(0, 340, 260, 60);

        aprbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/aprdefault.png"))); // NOI18N
        aprbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aprbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aprbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aprbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aprbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aprbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aprbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(aprbutton);
        aprbutton.setBounds(0, 280, 260, 60);

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

        glPanel.setLayout(null);

        jLabel5.setText("General Ledger Panel");
        glPanel.add(jLabel5);
        jLabel5.setBounds(60, 40, 160, 30);

        mainpanel.add(glPanel);
        glPanel.setBounds(20, 20, 970, 570);

        disbursementPanel.setLayout(null);

        jLabel4.setText("Disbursement PAnel");
        disbursementPanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(disbursementPanel);
        disbursementPanel.setBounds(20, 20, 970, 570);

        collectionPanel.setLayout(null);

        jLabel3.setText("Collection Management Panel");
        collectionPanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(collectionPanel);
        collectionPanel.setBounds(20, 20, 970, 570);

        budgetPanel.setLayout(null);

        jLabel2.setText("Budget Management Panel");
        budgetPanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(budgetPanel);
        budgetPanel.setBounds(20, 20, 970, 570);

        aprPanel.setLayout(null);

        jLabel1.setText("Accounts Payable/Receivable Panel");
        aprPanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 210, 40);

        mainpanel.add(aprPanel);
        aprPanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aprbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprbuttonMouseEntered
       aprbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/aprhover.png")));
    }//GEN-LAST:event_aprbuttonMouseEntered

    private void aprbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprbuttonMouseExited
      aprbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/aprdefault.png")));  
    }//GEN-LAST:event_aprbuttonMouseExited

    private void aprbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprbuttonMousePressed
      aprbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/aprclicked.png")));  
    }//GEN-LAST:event_aprbuttonMousePressed

    private void aprbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprbuttonMouseReleased
      aprbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/aprhover.png")));  
    }//GEN-LAST:event_aprbuttonMouseReleased

    private void budgetbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetbuttonMouseEntered
      budgetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/budgethover.png")));  
    }//GEN-LAST:event_budgetbuttonMouseEntered

    private void budgetbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetbuttonMouseExited
      budgetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/budgetdefault.png"))); 
    }//GEN-LAST:event_budgetbuttonMouseExited

    private void budgetbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetbuttonMousePressed
      budgetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/budgetclicked.png"))); 
    }//GEN-LAST:event_budgetbuttonMousePressed

    private void budgetbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetbuttonMouseReleased
      budgetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/budgethover.png"))); 
    }//GEN-LAST:event_budgetbuttonMouseReleased

    private void colbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colbuttonMouseEntered
      colbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/colhover.png")));
    }//GEN-LAST:event_colbuttonMouseEntered

    private void colbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colbuttonMouseExited
      colbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/coldefault.png")));
    }//GEN-LAST:event_colbuttonMouseExited

    private void colbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colbuttonMousePressed
       colbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/colclicked.png")));
    }//GEN-LAST:event_colbuttonMousePressed

    private void colbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colbuttonMouseReleased
       colbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/colhover.png")));
    }//GEN-LAST:event_colbuttonMouseReleased

    private void disbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbuttonMouseEntered
        disbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/dishover.png")));
    }//GEN-LAST:event_disbuttonMouseEntered

    private void disbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbuttonMouseExited
        disbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/disdefault.png")));
    }//GEN-LAST:event_disbuttonMouseExited

    private void disbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbuttonMousePressed
        disbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/disclicked.png")));
    }//GEN-LAST:event_disbuttonMousePressed

    private void disbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbuttonMouseReleased
        disbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/dishover.png")));
    }//GEN-LAST:event_disbuttonMouseReleased

    private void glbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glbuttonMouseEntered
        glbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/glhover.png")));
    }//GEN-LAST:event_glbuttonMouseEntered

    private void glbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glbuttonMouseExited
        glbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/gldefault.png")));
    }//GEN-LAST:event_glbuttonMouseExited

    private void glbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glbuttonMousePressed
        glbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/glclicked.png")));
    }//GEN-LAST:event_glbuttonMousePressed

    private void glbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glbuttonMouseReleased
        glbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceModuleButton/glhover.png")));
    }//GEN-LAST:event_glbuttonMouseReleased

    private void aprbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprbuttonMouseClicked
        aprPanel.setVisible(true);
        budgetPanel.setVisible(false);
        collectionPanel.setVisible(false);
        disbursementPanel.setVisible(false);
        glPanel.setVisible(false);
    }//GEN-LAST:event_aprbuttonMouseClicked

    private void budgetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetbuttonMouseClicked
        aprPanel.setVisible(false);
        budgetPanel.setVisible(true);
        collectionPanel.setVisible(false);
        disbursementPanel.setVisible(false);
        glPanel.setVisible(false);
    }//GEN-LAST:event_budgetbuttonMouseClicked

    private void colbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colbuttonMouseClicked
        aprPanel.setVisible(false);
        budgetPanel.setVisible(false);
        collectionPanel.setVisible(true);
        disbursementPanel.setVisible(false);
        glPanel.setVisible(false);
    }//GEN-LAST:event_colbuttonMouseClicked

    private void disbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbuttonMouseClicked
       aprPanel.setVisible(false);
       budgetPanel.setVisible(false);
       collectionPanel.setVisible(false);
       disbursementPanel.setVisible(true);
       glPanel.setVisible(false);
    }//GEN-LAST:event_disbuttonMouseClicked

    private void glbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glbuttonMouseClicked
        aprPanel.setVisible(false);
        budgetPanel.setVisible(false);
        collectionPanel.setVisible(false);
        disbursementPanel.setVisible(false);
        glPanel.setVisible(true);
    }//GEN-LAST:event_glbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aprPanel;
    private javax.swing.JLabel aprbutton;
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JPanel budgetPanel;
    private javax.swing.JLabel budgetbutton;
    private javax.swing.JLabel colbutton;
    private javax.swing.JPanel collectionPanel;
    private javax.swing.JLabel core1logo;
    private javax.swing.JLabel deptname;
    private javax.swing.JPanel disbursementPanel;
    private javax.swing.JLabel disbutton;
    private javax.swing.JLabel employeeimage;
    private javax.swing.JLabel employeename;
    private javax.swing.JPanel glPanel;
    private javax.swing.JLabel glbutton;
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
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
