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
public class Logistics1 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public Logistics1() {
        initComponents();
        panels();
        
    }

    public void panels() {
        assetPanel.setBackground(new Color(200,200,200,40));
        assetPanel.setVisible(false);
        procurementPanel.setBackground(new Color(200,200,200,40));
        procurementPanel.setVisible(false);
        projectPanel.setBackground(new Color(200,200,200,40));
        projectPanel.setVisible(false);
        warehousePanel.setBackground(new Color(200,200,200,40));
        warehousePanel.setVisible(false);
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
        warehousebutton = new javax.swing.JLabel();
        projectbutton = new javax.swing.JLabel();
        procurebutton = new javax.swing.JLabel();
        assetbutton = new javax.swing.JLabel();
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
        warehousePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        projectPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        procurementPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        assetPanel = new javax.swing.JPanel();
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/log1logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        warehousebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/warehousedefault.png"))); // NOI18N
        warehousebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        warehousebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                warehousebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                warehousebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                warehousebuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                warehousebuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                warehousebuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(warehousebutton);
        warehousebutton.setBounds(0, 460, 260, 60);

        projectbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/projectdefault.png"))); // NOI18N
        projectbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        projectbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                projectbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                projectbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                projectbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                projectbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(projectbutton);
        projectbutton.setBounds(0, 400, 260, 60);

        procurebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/procuredefault.png"))); // NOI18N
        procurebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        procurebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procurebuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                procurebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                procurebuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                procurebuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                procurebuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(procurebutton);
        procurebutton.setBounds(0, 340, 260, 60);

        assetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/assetdefault.png"))); // NOI18N
        assetbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assetbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assetbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                assetbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assetbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                assetbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(assetbutton);
        assetbutton.setBounds(0, 280, 260, 60);

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

        warehousePanel.setLayout(null);

        jLabel4.setText("warehouse Panel");
        warehousePanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(warehousePanel);
        warehousePanel.setBounds(20, 20, 970, 570);

        projectPanel.setLayout(null);

        jLabel3.setText("Project Management Panel");
        projectPanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(projectPanel);
        projectPanel.setBounds(20, 20, 970, 570);

        procurementPanel.setLayout(null);

        jLabel2.setText("Procurement Panel");
        procurementPanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(procurementPanel);
        procurementPanel.setBounds(20, 20, 970, 570);

        assetPanel.setLayout(null);

        jLabel1.setText("Asset Management Panel");
        assetPanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 160, 40);

        mainpanel.add(assetPanel);
        assetPanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assetbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetbuttonMouseEntered
       assetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/assethover.png")));
    }//GEN-LAST:event_assetbuttonMouseEntered

    private void assetbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetbuttonMouseExited
      assetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/assetdefault.png")));  
    }//GEN-LAST:event_assetbuttonMouseExited

    private void assetbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetbuttonMousePressed
      assetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/assetclicked.png")));  
    }//GEN-LAST:event_assetbuttonMousePressed

    private void assetbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetbuttonMouseReleased
      assetbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/assethover.png")));  
    }//GEN-LAST:event_assetbuttonMouseReleased

    private void procurebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurebuttonMouseEntered
      procurebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/procurehover.png")));  
    }//GEN-LAST:event_procurebuttonMouseEntered

    private void procurebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurebuttonMouseExited
      procurebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/procuredefault.png"))); 
    }//GEN-LAST:event_procurebuttonMouseExited

    private void procurebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurebuttonMousePressed
      procurebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/procureclicked.png"))); 
    }//GEN-LAST:event_procurebuttonMousePressed

    private void procurebuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurebuttonMouseReleased
      procurebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/procurehover.png"))); 
    }//GEN-LAST:event_procurebuttonMouseReleased

    private void projectbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectbuttonMouseEntered
      projectbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/projecthover.png")));
    }//GEN-LAST:event_projectbuttonMouseEntered

    private void projectbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectbuttonMouseExited
      projectbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/projectdefault.png")));
    }//GEN-LAST:event_projectbuttonMouseExited

    private void projectbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectbuttonMousePressed
       projectbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/projectclicked.png")));
    }//GEN-LAST:event_projectbuttonMousePressed

    private void projectbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectbuttonMouseReleased
       projectbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/projecthover.png")));
    }//GEN-LAST:event_projectbuttonMouseReleased

    private void warehousebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousebuttonMouseEntered
        warehousebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/warehousehover.png")));
    }//GEN-LAST:event_warehousebuttonMouseEntered

    private void warehousebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousebuttonMouseExited
        warehousebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/warehousedefault.png")));
    }//GEN-LAST:event_warehousebuttonMouseExited

    private void warehousebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousebuttonMousePressed
        warehousebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/warehouseclicked.png")));
    }//GEN-LAST:event_warehousebuttonMousePressed

    private void warehousebuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousebuttonMouseReleased
        warehousebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log1ModuleButton/warehousehover.png")));
    }//GEN-LAST:event_warehousebuttonMouseReleased

    private void assetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetbuttonMouseClicked
        assetPanel.setVisible(true);
        procurementPanel.setVisible(false);
        projectPanel.setVisible(false);
        warehousePanel.setVisible(false);

    }//GEN-LAST:event_assetbuttonMouseClicked

    private void procurebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurebuttonMouseClicked
        assetPanel.setVisible(false);
        procurementPanel.setVisible(true);
        projectPanel.setVisible(false);
        warehousePanel.setVisible(false);

    }//GEN-LAST:event_procurebuttonMouseClicked

    private void projectbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectbuttonMouseClicked
        assetPanel.setVisible(false);
        procurementPanel.setVisible(false);
        projectPanel.setVisible(true);
        warehousePanel.setVisible(false);

    }//GEN-LAST:event_projectbuttonMouseClicked

    private void warehousebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehousebuttonMouseClicked
       assetPanel.setVisible(false);
       procurementPanel.setVisible(false);
       projectPanel.setVisible(false);
       warehousePanel.setVisible(true);

    }//GEN-LAST:event_warehousebuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Logistics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logistics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logistics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logistics1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logistics1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assetPanel;
    private javax.swing.JLabel assetbutton;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel procurebutton;
    private javax.swing.JPanel procurementPanel;
    private javax.swing.JPanel projectPanel;
    private javax.swing.JLabel projectbutton;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JPanel warehousePanel;
    private javax.swing.JLabel warehousebutton;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
