
package AppPackage;

import java.awt.Color;

/**
 *
 * @author lynden ryanpogigago
 */
public class Administrative extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public Administrative() {
        initComponents();
        panels();
        
    }

    public void panels() {
        documanagementpanel.setBackground(new Color(200,200,200,40));
        documanagementpanel.setVisible(false);
        facilitypanel.setBackground(new Color(200,200,200,40));
        facilitypanel.setVisible(false);
        legalpanel.setBackground(new Color(200,200,200,40));
        legalpanel.setVisible(false);
        visitorpanel.setBackground(new Color(200,200,200,40));
        visitorpanel.setVisible(false);
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
        visitorbutton = new javax.swing.JLabel();
        legalbutton = new javax.swing.JLabel();
        facilitybutton = new javax.swing.JLabel();
        documanagementbutton = new javax.swing.JLabel();
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
        visitorpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        legalpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        facilitypanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        documanagementpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/adminlogo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        visitorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/visdefault.png"))); // NOI18N
        visitorbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitorbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visitorbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visitorbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visitorbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                visitorbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                visitorbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(visitorbutton);
        visitorbutton.setBounds(0, 460, 260, 60);

        legalbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/legaldefault.png"))); // NOI18N
        legalbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        legalbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                legalbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                legalbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                legalbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                legalbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                legalbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(legalbutton);
        legalbutton.setBounds(0, 400, 260, 60);

        facilitybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/facdefault.png"))); // NOI18N
        facilitybutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facilitybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facilitybuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facilitybuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facilitybuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                facilitybuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                facilitybuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(facilitybutton);
        facilitybutton.setBounds(0, 340, 260, 60);

        documanagementbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/docmgmtdefault.png"))); // NOI18N
        documanagementbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        documanagementbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                documanagementbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                documanagementbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                documanagementbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                documanagementbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                documanagementbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(documanagementbutton);
        documanagementbutton.setBounds(0, 280, 260, 60);

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

        visitorpanel.setLayout(null);

        jLabel4.setText("Visitor Management Panel");
        visitorpanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(visitorpanel);
        visitorpanel.setBounds(20, 20, 970, 570);

        legalpanel.setLayout(null);

        jLabel3.setText("Legal Management Panel");
        legalpanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(legalpanel);
        legalpanel.setBounds(20, 20, 970, 570);

        facilitypanel.setLayout(null);

        jLabel2.setText("Facility Reservation Panel");
        facilitypanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(facilitypanel);
        facilitypanel.setBounds(20, 20, 970, 570);

        documanagementpanel.setLayout(null);

        jLabel1.setText("Document Management Panel");
        documanagementpanel.add(jLabel1);
        jLabel1.setBounds(30, 20, 160, 40);

        mainpanel.add(documanagementpanel);
        documanagementpanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documanagementbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documanagementbuttonMouseEntered
       documanagementbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/docmgmthover.png")));
    }//GEN-LAST:event_documanagementbuttonMouseEntered

    private void documanagementbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documanagementbuttonMouseExited
      documanagementbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/docmgmtdefault.png")));  
    }//GEN-LAST:event_documanagementbuttonMouseExited

    private void documanagementbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documanagementbuttonMousePressed
      documanagementbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/docmgmtclicked.png")));  
    }//GEN-LAST:event_documanagementbuttonMousePressed

    private void documanagementbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documanagementbuttonMouseReleased
      documanagementbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/docmgmthover.png")));  
    }//GEN-LAST:event_documanagementbuttonMouseReleased

    private void facilitybuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitybuttonMouseEntered
      facilitybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/fachover.png")));  
    }//GEN-LAST:event_facilitybuttonMouseEntered

    private void facilitybuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitybuttonMouseExited
      facilitybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/facdefault.png"))); 
    }//GEN-LAST:event_facilitybuttonMouseExited

    private void facilitybuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitybuttonMousePressed
      facilitybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/facclicked.png"))); 
    }//GEN-LAST:event_facilitybuttonMousePressed

    private void facilitybuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitybuttonMouseReleased
      facilitybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/fachover.png"))); 
    }//GEN-LAST:event_facilitybuttonMouseReleased

    private void legalbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalbuttonMouseEntered
      legalbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/legalhover.png")));
    }//GEN-LAST:event_legalbuttonMouseEntered

    private void legalbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalbuttonMouseExited
      legalbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/legaldefault.png")));
    }//GEN-LAST:event_legalbuttonMouseExited

    private void legalbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalbuttonMousePressed
       legalbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/legalclicked.png")));
    }//GEN-LAST:event_legalbuttonMousePressed

    private void legalbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalbuttonMouseReleased
       legalbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/legalhover.png")));
    }//GEN-LAST:event_legalbuttonMouseReleased

    private void visitorbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitorbuttonMouseEntered
        visitorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/vishover.png")));
    }//GEN-LAST:event_visitorbuttonMouseEntered

    private void visitorbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitorbuttonMouseExited
        visitorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/visdefault.png")));
    }//GEN-LAST:event_visitorbuttonMouseExited

    private void visitorbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitorbuttonMousePressed
        visitorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/visclicked.png")));
    }//GEN-LAST:event_visitorbuttonMousePressed

    private void visitorbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitorbuttonMouseReleased
        visitorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zAdminModuleButton/vishover.png")));
    }//GEN-LAST:event_visitorbuttonMouseReleased

    private void documanagementbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documanagementbuttonMouseClicked
        documanagementpanel.setVisible(true);
        facilitypanel.setVisible(false);
        legalpanel.setVisible(false);
        visitorpanel.setVisible(false);
    
    }//GEN-LAST:event_documanagementbuttonMouseClicked

    private void facilitybuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facilitybuttonMouseClicked
        documanagementpanel.setVisible(false);
        facilitypanel.setVisible(true);
        legalpanel.setVisible(false);
        visitorpanel.setVisible(false);
       
    }//GEN-LAST:event_facilitybuttonMouseClicked

    private void legalbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legalbuttonMouseClicked
        documanagementpanel.setVisible(false);
        facilitypanel.setVisible(false);
        legalpanel.setVisible(true);
        visitorpanel.setVisible(false);
    
    }//GEN-LAST:event_legalbuttonMouseClicked

    private void visitorbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitorbuttonMouseClicked
       documanagementpanel.setVisible(false);
       facilitypanel.setVisible(false);
       legalpanel.setVisible(false);
       visitorpanel.setVisible(true);
      
    }//GEN-LAST:event_visitorbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Administrative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JLabel core1logo;
    private javax.swing.JLabel deptname;
    private javax.swing.JLabel documanagementbutton;
    private javax.swing.JPanel documanagementpanel;
    private javax.swing.JLabel employeeimage;
    private javax.swing.JLabel employeename;
    private javax.swing.JLabel facilitybutton;
    private javax.swing.JPanel facilitypanel;
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
    private javax.swing.JLabel legalbutton;
    private javax.swing.JPanel legalpanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JLabel visitorbutton;
    private javax.swing.JPanel visitorpanel;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
