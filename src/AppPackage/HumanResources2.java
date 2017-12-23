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
public class HumanResources2 extends javax.swing.JFrame {

    int showmenu = 0,showsettings = 0;
    
    public HumanResources2() {
        initComponents();
        panels();
        jComboBox2.setVisible(false);
       jTextField2.setVisible(false);
       jPanel3.setVisible(false);
       jButton4.setVisible(false);
       
        
    }

    public void panels() {
        competencyPanel.setBackground(new Color(200,200,200,40));
        competencyPanel.setVisible(false);
        essPanel.setBackground(new Color(200,200,200,40));
        essPanel.setVisible(false);
        learningPanel.setBackground(new Color(200,200,200,40));
        learningPanel.setVisible(false);
        successionPanel.setBackground(new Color(200,200,200,40));
        successionPanel.setVisible(false);
        trainingPanel.setBackground(new Color(200,200,200,40));
        trainingPanel.setVisible(false);
        menupanel.setBackground(new Color(150,150,150,200));
        menupanel.setVisible(false);
        settingspanel.setBackground(new Color(150,150,150,200));
        settingspanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
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
        trainingbutton = new javax.swing.JLabel();
        successionbutton = new javax.swing.JLabel();
        learningbutton = new javax.swing.JLabel();
        essbutton = new javax.swing.JLabel();
        competencybutton = new javax.swing.JLabel();
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
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        trainingPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        successionPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        learningPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        essPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        competencyPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashboardPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        employeePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        Competency = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        mainbackground = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

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

        core1logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/hr2logo.png"))); // NOI18N
        sidebarpanel.add(core1logo);
        core1logo.setBounds(0, 220, 260, 60);

        trainingbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/trainingdefault.png"))); // NOI18N
        trainingbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trainingbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainingbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                trainingbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                trainingbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                trainingbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                trainingbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(trainingbutton);
        trainingbutton.setBounds(0, 520, 260, 60);

        successionbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/successiondefault.png"))); // NOI18N
        successionbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        successionbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                successionbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                successionbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                successionbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                successionbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                successionbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(successionbutton);
        successionbutton.setBounds(0, 460, 260, 60);

        learningbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/learningdefault.png"))); // NOI18N
        learningbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        learningbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                learningbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                learningbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                learningbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                learningbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                learningbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(learningbutton);
        learningbutton.setBounds(0, 400, 260, 60);

        essbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/essdefault.png"))); // NOI18N
        essbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        essbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                essbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                essbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                essbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                essbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                essbuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(essbutton);
        essbutton.setBounds(0, 340, 260, 60);

        competencybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/competencydefault.png"))); // NOI18N
        competencybutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        competencybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                competencybuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                competencybuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                competencybuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                competencybuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                competencybuttonMouseReleased(evt);
            }
        });
        sidebarpanel.add(competencybutton);
        competencybutton.setBounds(0, 280, 260, 60);

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

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("  View Profile");
        jLabel92.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel92MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel92MouseExited(evt);
            }
        });
        menupanel.add(jLabel92);
        jLabel92.setBounds(0, 255, 220, 20);

        jLabel93.setText("  Logout");
        jLabel93.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel93MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel93MouseExited(evt);
            }
        });
        menupanel.add(jLabel93);
        jLabel93.setBounds(0, 304, 220, 20);

        jLabel94.setText("  Change Password");
        jLabel94.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel94MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel94MouseExited(evt);
            }
        });
        menupanel.add(jLabel94);
        jLabel94.setBounds(0, 280, 220, 20);

        mainpanel.add(menupanel);
        menupanel.setBounds(780, 0, 220, 330);

        trainingPanel.setLayout(null);

        jLabel5.setText("Training Panel");
        trainingPanel.add(jLabel5);
        jLabel5.setBounds(60, 40, 160, 30);

        mainpanel.add(trainingPanel);
        trainingPanel.setBounds(20, 20, 970, 570);

        successionPanel.setLayout(null);

        jLabel4.setText("Succession Panel");
        successionPanel.add(jLabel4);
        jLabel4.setBounds(60, 30, 190, 40);

        mainpanel.add(successionPanel);
        successionPanel.setBounds(20, 20, 970, 570);

        learningPanel.setLayout(null);

        jLabel3.setText("Learning Panel");
        learningPanel.add(jLabel3);
        jLabel3.setBounds(40, 30, 220, 30);

        mainpanel.add(learningPanel);
        learningPanel.setBounds(20, 20, 970, 570);

        essPanel.setLayout(null);

        jLabel2.setText("ess Panel");
        essPanel.add(jLabel2);
        jLabel2.setBounds(30, 20, 170, 40);

        mainpanel.add(essPanel);
        essPanel.setBounds(20, 20, 970, 570);

        competencyPanel.setLayout(null);

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));

        dashboardPanel.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Pie Graph"));
        jPanel5.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageforcompetency/piegraph.png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 10, 450, 230);

        dashboardPanel.add(jPanel5);
        jPanel5.setBounds(10, 10, 470, 240);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Line Graph"));
        jPanel6.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageforcompetency/linegraph.png"))); // NOI18N
        jPanel6.add(jLabel8);
        jLabel8.setBounds(14, 8, 418, 360);

        dashboardPanel.add(jPanel6);
        jPanel6.setBounds(490, 10, 440, 370);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Sociodemographic Report"));
        jPanel7.setLayout(null);

        jLabel9.setText("Number of Employee:");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(20, 20, 120, 14);

        jLabel10.setText("Married:");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(160, 60, 50, 14);

        jLabel11.setText("Male:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(30, 40, 50, 14);

        jLabel12.setText("High School:");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(170, 200, 60, 14);

        jLabel13.setText("Single:");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(160, 40, 50, 14);

        jLabel14.setText("Widowed:");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(280, 60, 70, 14);

        jLabel15.setText("Divorced:");
        jPanel7.add(jLabel15);
        jLabel15.setBounds(280, 40, 70, 14);

        jLabel16.setText("Educational Attainment");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(140, 100, 140, 14);

        jLabel17.setText("Female:");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(30, 60, 50, 14);

        jLabel18.setText("Doctorate:");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(170, 120, 60, 14);

        jLabel19.setText("Masteral:");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(170, 140, 60, 14);

        jLabel20.setText("College:");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(170, 160, 60, 14);

        jLabel21.setText("Vocational:");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(170, 180, 60, 14);

        jLabel22.setText("32");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(90, 60, 40, 14);

        jLabel23.setText("52");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(90, 40, 40, 14);

        jLabel24.setText("48");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(220, 40, 40, 14);

        jLabel25.setText("32");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(220, 60, 40, 14);

        jLabel26.setText("2");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(360, 40, 50, 14);

        jLabel27.setText("2");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(360, 60, 50, 14);

        jLabel28.setText("2");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(240, 120, 60, 14);

        jLabel29.setText("4");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(240, 140, 60, 14);

        jLabel30.setText("67");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(240, 160, 60, 14);

        jLabel31.setText("8");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(240, 180, 60, 14);

        jLabel32.setText("3");
        jPanel7.add(jLabel32);
        jLabel32.setBounds(240, 200, 60, 14);

        dashboardPanel.add(jPanel7);
        jPanel7.setBounds(20, 260, 460, 250);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Updates"));
        dashboardPanel.add(jPanel8);
        jPanel8.setBounds(490, 380, 440, 130);

        jTabbedPane1.addTab("Dashboard", dashboardPanel);

        employeePanel.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ryan Santiago", "Branch Manager", "Core Transaction", "10", "0%"},
                {"Mark Atanacio", "Financial Manager", "Finance", "9", "25%"},
                {"Maricel Manipon", "Financial Manager", "Finance", "9", "23%"},
                {"Chricia Codilla", "Financial Manager", "Finance", "9", "20%"},
                {"Apriline Bautista", "Financial Manager", "Finance", "9", "16%"},
                {"Shandie Dimaymay", "HR Manager", "Human Resources", "8", "83%"},
                {"Irvin Oseo", "Logistics Manager", "Logistics", "8", "43%"},
                {"Aiko Orero", "Supervisor", "Human Resources", "8", "39%"},
                {"John Zipagan", "Supervisor", "Finance", "8", "27%"},
                {"Araselle Dumillon", "Supervisor", "Logistics", "8", "21%"},
                {"Ranie Abiera", "Budget Analyst", "Finance", "7", "12%"},
                {"Charles Andal", "Budget Analyst", "Finance", "7", "9%"},
                {"Hajimar Hole", "Budget Analyst", "Finance", "7", "6%"},
                {"Gerald Seguera", "Budget Analyst", "Finance", "7", "3%"},
                {"Hannah Henson", "Budget Analyst", "Finance", "7", "1%"},
                {"Ruben Roco", "Personal Financial Advisor", "Core Transaction", "6", "87%"},
                {"Doreen Estinoso", "Personal Financial Advisor", "Core Transaction", "6", "62%"},
                {"Jayterode Lee Dong Wook", "Personal Financial Advisor", "Core Transaction", "6", "53%"},
                {"Kaycee Balba", "Personal Financial Advisor", "Core Transaction", "6", "28%"},
                {"Meynard Capulong", "Personal Financial Adviser", "Core Transaction", "6", "23%"},
                {"Jimbyll Cuento", "Accountant", "Human Resources", "4", "95%"},
                {"Vergel Meneses", "Accountant", "Logistics", "4", "73%"},
                {"Karlo Capalaran", "Auditor", "Human Resources", "4", "57%"},
                {"Marjorie Naguita", "Auditor", "Logistics", "4", "37%"},
                {"Paul Guira", "Auditor", "Finance", "4", "11%"},
                {"Rozalino Lattao", "Bank Teller I", "Core Transaction", "3", "76%"},
                {"Lynden Laguitan", "Bank Teller II", "Core Transaction", "3", "75%"},
                {"Roland Solas", "Bank Teller III", "Core Transaction", "3", "53%"},
                {"Christian Tabaquero", "Loan Officer", "Core Transaction", "3", "51%"},
                {"Renz Diola", "Loan Officer", "Core Transaction", "3", "49%"},
                {"Nelson Sanchez", "Loan Officer", "Core Transaction", "3", "42%"},
                {"Emanuel Pablo", "Loan Officer", "Core Transaction", "3", "41%"},
                {"Glen Zabala", "Bank Teller II", "Core Transaction", "3", "32%"},
                {"Jeffrey Viador", "Bank Teller III", "Core Transaction", "3", "26%"},
                {"Dexter Divinegrace", "Bank Teller I", "Core Transaction", "3", "21%"},
                {"Jonathan Muega", "Staff", "Human Resources", "2", "99%"},
                {"Ronnel Reyes", "Staff", "Logistics", "2", "86%"},
                {"Manilyn Del Rosario", "Staff", "Admin", "2", "82%"},
                {"Jessica Yap", "Staff", "Logistics", "2", "79%"},
                {"Armel Navera", "Staff", "Human Resources", "2", "77%"},
                {"Mariel Ilao", "Staff", "Logistics", "2", "72%"},
                {"Pat Mendoza", "Staff", "Logistics", "2", "62%"},
                {"Michelle Naig", "Staff", "Human Resources", "2", "52%"},
                {"Paolline Sebastian", "Staff", "Logistics", "2", "51%"},
                {"Cedie Cruz", "Staff", "Admin", "2", "44%"},
                {"Princess Villafuerte", "Staff", "Logistics", "2", "39%"},
                {"Dimple Villanueva", "Staff", "Human Resources", "2", "36%"},
                {"Cimberly Manansala", "Staff", "Human Resources", "2", "27%"},
                {"Jane Lincuna", "Staff", "Logistics", "2", "11%"},
                {"Jayson Roxas", "Utility", "Admin", "1", "0%"},
                {"Jayson Chavez", "Guard", "Admin", "1", "0%"},
                {"Christian Pababaer", "Guard", "Admin", "1", "0%"},
                {"James Yangat", "Utility", "Admin", "1", "0%"},
                {"Mark Hustaya", "Utility", "Admin", "1", "0%"},
                {"Mark Ramos", "Utility", "Admin", "1", "0%"},
                {"Jayson Robredillo", "Guard", "Admin", "1", "0%"}
            },
            new String [] {
                "Full Name", "Job Position", "Department", "Salary Grade", "Competency Progress"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        employeePanel.add(jScrollPane1);
        jScrollPane1.setBounds(60, 140, 830, 350);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter Search"));
        jPanel1.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Name", "Job Position", "Department", "Salary Grade", "Competency Progress" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(16, 20, 90, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 20, 130, 30);

        jButton1.setText("Seach");
        jPanel1.add(jButton1);
        jButton1.setBounds(321, 90, 100, 23);

        jButton2.setText("Add Filter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(323, 60, 100, 23);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Name", "Job Position", "Department", "Salary Grade", "Competency Progress" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(16, 60, 90, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 60, 130, 30);

        employeePanel.add(jPanel1);
        jPanel1.setBounds(30, 10, 450, 130);

        jTabbedPane1.addTab("Employee List", employeePanel);

        Competency.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seach Employee"));
        jPanel2.setLayout(null);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(30, 40, 120, 30);

        jButton3.setText("Seach");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(170, 40, 90, 30);

        Competency.add(jPanel2);
        jPanel2.setBounds(10, 10, 350, 110);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Competency Needed"));
        jPanel3.setLayout(null);

        jPanel9.setLayout(null);

        jLabel33.setText("Learning needed:");
        jPanel9.add(jLabel33);
        jLabel33.setBounds(10, 160, 110, 20);

        jLabel34.setText("Training needed:");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(10, 10, 110, 20);

        jLabel43.setText("Training Type:");
        jPanel9.add(jLabel43);
        jLabel43.setBounds(40, 50, 90, 14);
        jPanel9.add(jTextField5);
        jTextField5.setBounds(40, 70, 90, 30);

        jLabel44.setText("Training Description:");
        jPanel9.add(jLabel44);
        jLabel44.setBounds(170, 50, 130, 14);
        jPanel9.add(jTextField6);
        jTextField6.setBounds(170, 70, 90, 30);

        jLabel45.setText("Assessment Date:");
        jPanel9.add(jLabel45);
        jLabel45.setBounds(310, 50, 100, 14);
        jPanel9.add(jTextField7);
        jTextField7.setBounds(310, 70, 90, 30);

        jLabel46.setText("Assisted by:");
        jPanel9.add(jLabel46);
        jLabel46.setBounds(430, 50, 90, 14);
        jPanel9.add(jTextField8);
        jTextField8.setBounds(430, 70, 90, 30);
        jPanel9.add(jTextField9);
        jTextField9.setBounds(560, 70, 90, 30);

        jLabel47.setText("Verified Date:");
        jPanel9.add(jLabel47);
        jLabel47.setBounds(560, 50, 90, 14);
        jPanel9.add(jTextField10);
        jTextField10.setBounds(690, 70, 90, 30);

        jLabel48.setText("Verified By:");
        jPanel9.add(jLabel48);
        jLabel48.setBounds(690, 50, 90, 14);
        jPanel9.add(jTextField11);
        jTextField11.setBounds(40, 220, 90, 30);

        jLabel49.setText("Learning Type:");
        jPanel9.add(jLabel49);
        jLabel49.setBounds(40, 200, 90, 14);
        jPanel9.add(jTextField12);
        jTextField12.setBounds(170, 220, 90, 30);

        jLabel50.setText("Learning Description:");
        jPanel9.add(jLabel50);
        jLabel50.setBounds(170, 200, 130, 14);

        jLabel51.setText("Assessment Date:");
        jPanel9.add(jLabel51);
        jLabel51.setBounds(310, 200, 90, 14);
        jPanel9.add(jTextField13);
        jTextField13.setBounds(310, 220, 90, 30);
        jPanel9.add(jTextField14);
        jTextField14.setBounds(430, 220, 90, 30);

        jLabel52.setText("Assisted by:");
        jPanel9.add(jLabel52);
        jLabel52.setBounds(430, 200, 90, 14);

        jLabel53.setText("Verified Date:");
        jPanel9.add(jLabel53);
        jLabel53.setBounds(560, 200, 90, 14);
        jPanel9.add(jTextField15);
        jTextField15.setBounds(560, 220, 90, 30);
        jPanel9.add(jTextField16);
        jTextField16.setBounds(690, 220, 90, 30);

        jLabel54.setText("Verified By:");
        jPanel9.add(jLabel54);
        jLabel54.setBounds(690, 200, 90, 14);

        jTabbedPane2.addTab("Core", jPanel9);

        jPanel10.setLayout(null);

        jLabel35.setText("Learning needed:");
        jPanel10.add(jLabel35);
        jLabel35.setBounds(10, 160, 110, 20);

        jLabel36.setText("Training needed:");
        jPanel10.add(jLabel36);
        jLabel36.setBounds(10, 10, 110, 20);
        jPanel10.add(jTextField17);
        jTextField17.setBounds(40, 70, 90, 30);

        jLabel55.setText("Training Type:");
        jPanel10.add(jLabel55);
        jLabel55.setBounds(40, 50, 90, 14);

        jLabel56.setText("Training Description:");
        jPanel10.add(jLabel56);
        jLabel56.setBounds(170, 50, 130, 14);
        jPanel10.add(jTextField18);
        jTextField18.setBounds(170, 70, 90, 30);
        jPanel10.add(jTextField19);
        jTextField19.setBounds(310, 70, 90, 30);

        jLabel57.setText("Assessment Date:");
        jPanel10.add(jLabel57);
        jLabel57.setBounds(310, 50, 90, 14);

        jLabel58.setText("Assisted by:");
        jPanel10.add(jLabel58);
        jLabel58.setBounds(430, 50, 90, 14);
        jPanel10.add(jTextField20);
        jTextField20.setBounds(430, 70, 90, 30);

        jLabel59.setText("Verified Date:");
        jPanel10.add(jLabel59);
        jLabel59.setBounds(560, 50, 90, 14);
        jPanel10.add(jTextField21);
        jTextField21.setBounds(560, 70, 90, 30);

        jLabel60.setText("Verified By:");
        jPanel10.add(jLabel60);
        jLabel60.setBounds(690, 50, 90, 14);
        jPanel10.add(jTextField22);
        jTextField22.setBounds(690, 70, 90, 30);
        jPanel10.add(jTextField23);
        jTextField23.setBounds(40, 220, 90, 30);

        jLabel61.setText("Learning Type:");
        jPanel10.add(jLabel61);
        jLabel61.setBounds(40, 200, 90, 14);

        jLabel62.setText("Learning Description:");
        jPanel10.add(jLabel62);
        jLabel62.setBounds(170, 200, 130, 14);
        jPanel10.add(jTextField24);
        jTextField24.setBounds(170, 220, 90, 30);
        jPanel10.add(jTextField25);
        jTextField25.setBounds(310, 220, 90, 30);

        jLabel63.setText("Assessment Date:");
        jPanel10.add(jLabel63);
        jLabel63.setBounds(310, 200, 90, 14);

        jLabel64.setText("Assisted by:");
        jPanel10.add(jLabel64);
        jLabel64.setBounds(430, 200, 90, 14);
        jPanel10.add(jTextField26);
        jTextField26.setBounds(430, 220, 90, 30);
        jPanel10.add(jTextField27);
        jTextField27.setBounds(560, 220, 90, 30);

        jLabel65.setText("Verified Date:");
        jPanel10.add(jLabel65);
        jLabel65.setBounds(560, 200, 90, 14);

        jLabel66.setText("Verified By:");
        jPanel10.add(jLabel66);
        jLabel66.setBounds(690, 200, 90, 14);
        jPanel10.add(jTextField28);
        jTextField28.setBounds(690, 220, 90, 30);

        jTabbedPane2.addTab("Support", jPanel10);

        jPanel11.setLayout(null);

        jLabel37.setText("Learning needed:");
        jPanel11.add(jLabel37);
        jLabel37.setBounds(10, 160, 110, 20);

        jLabel38.setText("Training needed:");
        jPanel11.add(jLabel38);
        jLabel38.setBounds(10, 10, 110, 20);
        jPanel11.add(jTextField29);
        jTextField29.setBounds(40, 70, 90, 30);

        jLabel67.setText("Training Type:");
        jPanel11.add(jLabel67);
        jLabel67.setBounds(40, 50, 90, 14);

        jLabel68.setText("Training Description:");
        jPanel11.add(jLabel68);
        jLabel68.setBounds(170, 50, 130, 14);
        jPanel11.add(jTextField30);
        jTextField30.setBounds(170, 70, 90, 30);
        jPanel11.add(jTextField31);
        jTextField31.setBounds(310, 70, 90, 30);

        jLabel69.setText("Assessment Date:");
        jPanel11.add(jLabel69);
        jLabel69.setBounds(310, 50, 90, 14);

        jLabel70.setText("Assisted by:");
        jPanel11.add(jLabel70);
        jLabel70.setBounds(430, 50, 90, 14);
        jPanel11.add(jTextField32);
        jTextField32.setBounds(430, 70, 90, 30);

        jLabel71.setText("Verified Date:");
        jPanel11.add(jLabel71);
        jLabel71.setBounds(560, 50, 90, 14);
        jPanel11.add(jTextField33);
        jTextField33.setBounds(560, 70, 90, 30);

        jLabel72.setText("Verified By:");
        jPanel11.add(jLabel72);
        jLabel72.setBounds(690, 50, 90, 14);
        jPanel11.add(jTextField34);
        jTextField34.setBounds(690, 70, 90, 30);
        jPanel11.add(jTextField35);
        jTextField35.setBounds(40, 220, 90, 30);

        jLabel73.setText("Learning Type:");
        jPanel11.add(jLabel73);
        jLabel73.setBounds(40, 200, 90, 14);

        jLabel74.setText("Learning Description:");
        jPanel11.add(jLabel74);
        jLabel74.setBounds(170, 200, 130, 14);
        jPanel11.add(jTextField36);
        jTextField36.setBounds(170, 220, 90, 30);
        jPanel11.add(jTextField37);
        jTextField37.setBounds(310, 220, 90, 30);

        jLabel75.setText("Assessment Date:");
        jPanel11.add(jLabel75);
        jLabel75.setBounds(310, 200, 90, 14);

        jLabel76.setText("Assisted by:");
        jPanel11.add(jLabel76);
        jLabel76.setBounds(430, 200, 90, 14);
        jPanel11.add(jTextField38);
        jTextField38.setBounds(430, 220, 90, 30);
        jPanel11.add(jTextField39);
        jTextField39.setBounds(560, 220, 90, 30);

        jLabel77.setText("Verified Date:");
        jPanel11.add(jLabel77);
        jLabel77.setBounds(560, 200, 90, 14);

        jLabel78.setText("Verified By:");
        jPanel11.add(jLabel78);
        jLabel78.setBounds(690, 200, 90, 14);
        jPanel11.add(jTextField40);
        jTextField40.setBounds(690, 220, 90, 30);

        jTabbedPane2.addTab("General", jPanel11);

        jPanel12.setLayout(null);

        jLabel39.setText("Learning needed:");
        jPanel12.add(jLabel39);
        jLabel39.setBounds(10, 160, 110, 20);

        jLabel40.setText("Training needed:");
        jPanel12.add(jLabel40);
        jLabel40.setBounds(10, 10, 110, 20);
        jPanel12.add(jTextField41);
        jTextField41.setBounds(40, 70, 90, 30);

        jLabel79.setText("Training Type:");
        jPanel12.add(jLabel79);
        jLabel79.setBounds(40, 50, 90, 14);

        jLabel80.setText("Training Description:");
        jPanel12.add(jLabel80);
        jLabel80.setBounds(170, 50, 130, 14);
        jPanel12.add(jTextField42);
        jTextField42.setBounds(170, 70, 90, 30);
        jPanel12.add(jTextField43);
        jTextField43.setBounds(310, 70, 90, 30);

        jLabel81.setText("Assessment Date:");
        jPanel12.add(jLabel81);
        jLabel81.setBounds(310, 50, 90, 14);

        jLabel82.setText("Assisted by:");
        jPanel12.add(jLabel82);
        jLabel82.setBounds(430, 50, 90, 14);
        jPanel12.add(jTextField44);
        jTextField44.setBounds(430, 70, 90, 30);

        jLabel83.setText("Verified Date:");
        jPanel12.add(jLabel83);
        jLabel83.setBounds(560, 50, 90, 14);
        jPanel12.add(jTextField45);
        jTextField45.setBounds(560, 70, 90, 30);

        jLabel84.setText("Verified By:");
        jPanel12.add(jLabel84);
        jLabel84.setBounds(690, 50, 90, 14);
        jPanel12.add(jTextField46);
        jTextField46.setBounds(690, 70, 90, 30);
        jPanel12.add(jTextField47);
        jTextField47.setBounds(40, 220, 90, 30);

        jLabel85.setText("Learning Type:");
        jPanel12.add(jLabel85);
        jLabel85.setBounds(40, 200, 90, 14);

        jLabel86.setText("Learning Description:");
        jPanel12.add(jLabel86);
        jLabel86.setBounds(170, 200, 130, 14);
        jPanel12.add(jTextField48);
        jTextField48.setBounds(170, 220, 90, 30);
        jPanel12.add(jTextField49);
        jTextField49.setBounds(310, 220, 90, 30);

        jLabel87.setText("Assessment Date:");
        jPanel12.add(jLabel87);
        jLabel87.setBounds(310, 200, 90, 14);

        jLabel88.setText("Assisted by:");
        jPanel12.add(jLabel88);
        jLabel88.setBounds(430, 200, 90, 14);
        jPanel12.add(jTextField50);
        jTextField50.setBounds(430, 220, 90, 30);
        jPanel12.add(jTextField51);
        jTextField51.setBounds(560, 220, 90, 30);

        jLabel89.setText("Verified Date:");
        jPanel12.add(jLabel89);
        jLabel89.setBounds(560, 200, 90, 14);

        jLabel90.setText("Verified By:");
        jPanel12.add(jLabel90);
        jLabel90.setBounds(690, 200, 90, 14);
        jPanel12.add(jTextField52);
        jTextField52.setBounds(690, 220, 90, 30);

        jTabbedPane2.addTab("Behavioral", jPanel12);

        jPanel3.add(jTabbedPane2);
        jTabbedPane2.setBounds(20, 20, 880, 340);

        Competency.add(jPanel3);
        jPanel3.setBounds(10, 130, 920, 370);

        jButton4.setText("Update Competency");
        Competency.add(jButton4);
        jButton4.setBounds(710, 70, 210, 50);

        jTabbedPane1.addTab("Competency Management System", Competency);

        jPanel4.setLayout(null);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Reports"));
        jPanel13.setLayout(null);

        jLabel41.setText("Backup Database:");
        jPanel13.add(jLabel41);
        jLabel41.setBounds(220, 220, 90, 20);

        jLabel42.setText("Weekly Reports:");
        jPanel13.add(jLabel42);
        jLabel42.setBounds(220, 60, 90, 20);

        jLabel91.setText("Annual Reports:");
        jPanel13.add(jLabel91);
        jLabel91.setBounds(220, 140, 90, 20);

        jButton5.setText("Save Reports");
        jPanel13.add(jButton5);
        jButton5.setBounds(360, 60, 120, 30);

        jButton6.setText("Print Report");
        jPanel13.add(jButton6);
        jButton6.setBounds(510, 60, 110, 30);

        jButton9.setText("Backup");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton9);
        jButton9.setBounds(570, 220, 73, 23);

        jButton7.setText("Save Reports");
        jPanel13.add(jButton7);
        jButton7.setBounds(360, 130, 120, 30);

        jButton8.setText("Print Report");
        jPanel13.add(jButton8);
        jButton8.setBounds(510, 130, 110, 30);
        jPanel13.add(jTextField4);
        jTextField4.setBounds(360, 220, 120, 30);

        jButton10.setText("Open");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton10);
        jButton10.setBounds(490, 220, 60, 23);

        jPanel4.add(jPanel13);
        jPanel13.setBounds(20, 10, 900, 500);

        jTabbedPane1.addTab("Competency Reports", jPanel4);

        competencyPanel.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 950, 550);

        mainpanel.add(competencyPanel);
        competencyPanel.setBounds(20, 20, 970, 570);

        mainbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundImage/backgroundfunction.png"))); // NOI18N
        mainpanel.add(mainbackground);
        mainbackground.setBounds(0, 0, 1020, 640);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(260, 80, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void competencybuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competencybuttonMouseEntered
       competencybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/competencyhover.png")));
    }//GEN-LAST:event_competencybuttonMouseEntered

    private void competencybuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competencybuttonMouseExited
      competencybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/competencydefault.png")));  
    }//GEN-LAST:event_competencybuttonMouseExited

    private void competencybuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competencybuttonMousePressed
      competencybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/competencyclicked.png")));  
    }//GEN-LAST:event_competencybuttonMousePressed

    private void competencybuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competencybuttonMouseReleased
      competencybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/competencyhover.png")));  
    }//GEN-LAST:event_competencybuttonMouseReleased

    private void essbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_essbuttonMouseEntered
      essbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/esshover.png")));  
    }//GEN-LAST:event_essbuttonMouseEntered

    private void essbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_essbuttonMouseExited
      essbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/essdefault.png"))); 
    }//GEN-LAST:event_essbuttonMouseExited

    private void essbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_essbuttonMousePressed
      essbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/essclicked.png"))); 
    }//GEN-LAST:event_essbuttonMousePressed

    private void essbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_essbuttonMouseReleased
      essbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/esshover.png"))); 
    }//GEN-LAST:event_essbuttonMouseReleased

    private void learningbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learningbuttonMouseEntered
      learningbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/learninghover.png")));
    }//GEN-LAST:event_learningbuttonMouseEntered

    private void learningbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learningbuttonMouseExited
      learningbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/learningdefault.png")));
    }//GEN-LAST:event_learningbuttonMouseExited

    private void learningbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learningbuttonMousePressed
       learningbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/learningclicked.png")));
    }//GEN-LAST:event_learningbuttonMousePressed

    private void learningbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learningbuttonMouseReleased
       learningbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/learninghover.png")));
    }//GEN-LAST:event_learningbuttonMouseReleased

    private void successionbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_successionbuttonMouseEntered
        successionbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/successionhover.png")));
    }//GEN-LAST:event_successionbuttonMouseEntered

    private void successionbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_successionbuttonMouseExited
        successionbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/successiondefault.png")));
    }//GEN-LAST:event_successionbuttonMouseExited

    private void successionbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_successionbuttonMousePressed
        successionbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/successionclicked.png")));
    }//GEN-LAST:event_successionbuttonMousePressed

    private void successionbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_successionbuttonMouseReleased
        successionbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/successionhover.png")));
    }//GEN-LAST:event_successionbuttonMouseReleased

    private void trainingbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainingbuttonMouseEntered
        trainingbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/traininghover.png")));
    }//GEN-LAST:event_trainingbuttonMouseEntered

    private void trainingbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainingbuttonMouseExited
        trainingbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/trainingdefault.png")));
    }//GEN-LAST:event_trainingbuttonMouseExited

    private void trainingbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainingbuttonMousePressed
        trainingbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HR2ModuleButton/trainingclicked.png")));
    }//GEN-LAST:event_trainingbuttonMousePressed

    private void trainingbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainingbuttonMouseReleased
        trainingbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Core1ModuleButton/traininghover.png")));
    }//GEN-LAST:event_trainingbuttonMouseReleased

    private void competencybuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_competencybuttonMouseClicked
        competencyPanel.setVisible(true);
        essPanel.setVisible(false);
        learningPanel.setVisible(false);
        successionPanel.setVisible(false);
        trainingPanel.setVisible(false);
    }//GEN-LAST:event_competencybuttonMouseClicked

    private void essbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_essbuttonMouseClicked
        competencyPanel.setVisible(false);
        essPanel.setVisible(true);
        learningPanel.setVisible(false);
        successionPanel.setVisible(false);
        trainingPanel.setVisible(false);
    }//GEN-LAST:event_essbuttonMouseClicked

    private void learningbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learningbuttonMouseClicked
        competencyPanel.setVisible(false);
        essPanel.setVisible(false);
        learningPanel.setVisible(true);
        successionPanel.setVisible(false);
        trainingPanel.setVisible(false);
    }//GEN-LAST:event_learningbuttonMouseClicked

    private void successionbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_successionbuttonMouseClicked
       competencyPanel.setVisible(false);
       essPanel.setVisible(false);
       learningPanel.setVisible(false);
       successionPanel.setVisible(true);
       trainingPanel.setVisible(false);
    }//GEN-LAST:event_successionbuttonMouseClicked

    private void trainingbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainingbuttonMouseClicked
        competencyPanel.setVisible(false);
        essPanel.setVisible(false);
        learningPanel.setVisible(false);
        successionPanel.setVisible(false);
        trainingPanel.setVisible(true);
    }//GEN-LAST:event_trainingbuttonMouseClicked

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jComboBox2.setVisible(true);
       jTextField2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel3.setVisible(true);
        jButton4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jLabel92MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseEntered
        jLabel92.setOpaque(true);
        jLabel92.setBackground(new Color(59, 89, 152));
        
    }//GEN-LAST:event_jLabel92MouseEntered

    private void jLabel92MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseExited
       jLabel92.repaint();
        jLabel92.setBackground(new Color(150,150,150,200)); 
    }//GEN-LAST:event_jLabel92MouseExited

    private void jLabel94MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseEntered
        jLabel94.setOpaque(true);
        jLabel94.setBackground(new Color(59, 89, 152));
    }//GEN-LAST:event_jLabel94MouseEntered

    private void jLabel94MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseExited
         jLabel94.repaint();
        jLabel94.setBackground(new Color(150,150,150,200));
    }//GEN-LAST:event_jLabel94MouseExited

    private void jLabel93MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseEntered
        jLabel93.setOpaque(true);
        jLabel93.setBackground(new Color(59, 89, 152));
    }//GEN-LAST:event_jLabel93MouseEntered

    private void jLabel93MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseExited
        jLabel93.repaint();
        jLabel93.setBackground(new Color(150,150,150,200));
    }//GEN-LAST:event_jLabel93MouseExited

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
            java.util.logging.Logger.getLogger(HumanResources2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HumanResources2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HumanResources2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HumanResources2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HumanResources2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Competency;
    private javax.swing.JLabel bankingsystemtext;
    private javax.swing.JPanel competencyPanel;
    private javax.swing.JLabel competencybutton;
    private javax.swing.JLabel core1logo;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel deptname;
    private javax.swing.JPanel employeePanel;
    private javax.swing.JLabel employeeimage;
    private javax.swing.JLabel employeename;
    private javax.swing.JPanel essPanel;
    private javax.swing.JLabel essbutton;
    private javax.swing.JLabel header;
    private javax.swing.JLabel headerbuttonbg;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel homebutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel learningPanel;
    private javax.swing.JLabel learningbutton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbackground;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel menubutton;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JPanel sidebarpanel;
    private javax.swing.JLabel sidepanel;
    private javax.swing.JPanel successionPanel;
    private javax.swing.JLabel successionbutton;
    private javax.swing.JPanel trainingPanel;
    private javax.swing.JLabel trainingbutton;
    private javax.swing.JLabel whitepart;
    // End of variables declaration//GEN-END:variables
}
