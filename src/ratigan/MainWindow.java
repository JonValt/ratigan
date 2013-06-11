package ratigan;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
//code suggestied for the ProcessBuilder attempt
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;


/**
 *
 * @author jharper
 */

public class MainWindow extends javax.swing.JFrame {
	static final String DEFAULT_WORKDIR = "/tmp/ratproxy/";
	static final String DEFAULT_LOG = DEFAULT_WORKDIR + "ratproxy.log";
	static final String RATPROXY_BIN = "/usr/bin/ratproxy";
        String logfile = new String ();
        File filename = new File(logfile);
        String command="";
	RatproxyProcess _process;
    private Component frame;
       /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);
        joptionspanel.setVisible(false); 
     }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        joptionspanel = new javax.swing.JPanel();
        jhideoptionsbutton = new javax.swing.JButton();
        jcheckboxc = new javax.swing.JCheckBox();
        jcheckboxe = new javax.swing.JCheckBox();
        jcheckboxf = new javax.swing.JCheckBox();
        jcheckboxg = new javax.swing.JCheckBox();
        jcheckboxi = new javax.swing.JCheckBox();
        jcheckboxj = new javax.swing.JCheckBox();
        jcheckboxl = new javax.swing.JCheckBox();
        jcheckboxm = new javax.swing.JCheckBox();
        jcheckboxs = new javax.swing.JCheckBox();
        jcheckboxt = new javax.swing.JCheckBox();
        jcheckboxx = new javax.swing.JCheckBox();
        jlogfilefield = new javax.swing.JTextField();
        jworkingdirfield1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jportfield = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jgobutton = new javax.swing.JButton();
        jstopbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jscopefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcommandlabel = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputbox = new javax.swing.JTextArea();
        jexitbutton = new javax.swing.JButton();
        jreportbutton = new javax.swing.JButton();
        jshowoptionsbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jhideoptionsbutton.setText("[Hide Me]");
        jhideoptionsbutton.setMaximumSize(new java.awt.Dimension(100, 29));
        jhideoptionsbutton.setMinimumSize(new java.awt.Dimension(100, 29));
        jhideoptionsbutton.setPreferredSize(new java.awt.Dimension(100, 29));
        jhideoptionsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhideoptionsbuttonActionPerformed(evt);
            }
        });

        jcheckboxc.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxc.setSelected(true);
        jcheckboxc.setText("log urls that set (c)ookies");
        jcheckboxc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxcActionPerformed(evt);
            }
        });

        jcheckboxe.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxe.setSelected(true);
        jcheckboxe.setText("(e)nable pedantic caching header validation");
        jcheckboxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxeActionPerformed(evt);
            }
        });

        jcheckboxf.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxf.setSelected(true);
        jcheckboxf.setText("log (f)lash applications");

        jcheckboxg.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxg.setSelected(true);
        jcheckboxg.setText("include (g)et requests in CSRF token validation");

        jcheckboxi.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxi.setSelected(true);
        jcheckboxi.setText("log all PNG (i)mages");

        jcheckboxj.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxj.setSelected(true);
        jcheckboxj.setText("detect discouraged (j)avascript syntax");

        jcheckboxl.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxl.setSelected(true);
        jcheckboxl.setText("re(l)axed page hashing");
        jcheckboxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxlActionPerformed(evt);
            }
        });

        jcheckboxm.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxm.setSelected(true);
        jcheckboxm.setText("log re(m)ote active content");

        jcheckboxs.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxs.setSelected(true);
        jcheckboxs.setText("log all PO(S)T requests");

        jcheckboxt.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxt.setSelected(true);
        jcheckboxt.setText("look for less-likely directory (t)raversal vectors");

        jcheckboxx.setForeground(new java.awt.Color(102, 102, 102));
        jcheckboxx.setSelected(true);
        jcheckboxx.setText("log all possible (X)SS candidate URLs");

        jlogfilefield.setText("/tmp/ratproxy/ratproxy.log");
        jlogfilefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogfilefieldActionPerformed(evt);
            }
        });

        jworkingdirfield1.setText("/tmp/ratproxy/");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Common Options");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Program Options (DON'T!)");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Logfile");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Working Directory");

        jportfield.setModel(new javax.swing.SpinnerNumberModel(8081, 1, 65535, 1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Port");

        org.jdesktop.layout.GroupLayout joptionspanelLayout = new org.jdesktop.layout.GroupLayout(joptionspanel);
        joptionspanel.setLayout(joptionspanelLayout);
        joptionspanelLayout.setHorizontalGroup(
            joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(joptionspanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(joptionspanelLayout.createSequentialGroup()
                        .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jcheckboxe)
                            .add(jcheckboxc)
                            .add(jcheckboxg)
                            .add(jcheckboxi)
                            .add(jcheckboxf)
                            .add(jcheckboxj)
                            .add(jcheckboxl)
                            .add(jcheckboxx)
                            .add(jcheckboxt)
                            .add(jcheckboxm)
                            .add(jcheckboxs))
                        .add(41, 41, 41)
                        .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel5)
                            .add(jLabel9)
                            .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlogfilefield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jworkingdirfield1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4)
                            .add(jportfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 42, Short.MAX_VALUE))
                    .add(joptionspanelLayout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jhideoptionsbutton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        joptionspanelLayout.setVerticalGroup(
            joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(joptionspanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(jhideoptionsbutton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, joptionspanelLayout.createSequentialGroup()
                        .add(jcheckboxc)
                        .add(1, 1, 1)
                        .add(jcheckboxe)
                        .add(6, 6, 6)
                        .add(jcheckboxf)
                        .add(6, 6, 6)
                        .add(jcheckboxg)
                        .add(6, 6, 6)
                        .add(jcheckboxi)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jcheckboxj)
                        .add(6, 6, 6)
                        .add(jcheckboxl)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jcheckboxm)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jcheckboxs)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jcheckboxt)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jcheckboxx))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, joptionspanelLayout.createSequentialGroup()
                        .add(jLabel4)
                        .add(4, 4, 4)
                        .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(jlogfilefield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jworkingdirfield1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(joptionspanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jportfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(joptionspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 740, 390));

        jgobutton.setBackground(new java.awt.Color(102, 102, 102));
        jgobutton.setText("Start Proxy");
        jgobutton.setToolTipText("Start ratproxy process using generated command");
        jgobutton.setMaximumSize(new java.awt.Dimension(145, 29));
        jgobutton.setMinimumSize(new java.awt.Dimension(145, 29));
        jgobutton.setPreferredSize(new java.awt.Dimension(100, 29));
        jgobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgobuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jgobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        jstopbutton.setBackground(new java.awt.Color(102, 102, 102));
        jstopbutton.setText("Stop Proxy");
        jstopbutton.setToolTipText("Stop ratproxy process");
        jstopbutton.setMaximumSize(new java.awt.Dimension(145, 29));
        jstopbutton.setMinimumSize(new java.awt.Dimension(145, 29));
        jstopbutton.setPreferredSize(new java.awt.Dimension(100, 29));
        jstopbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstopbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jstopbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ratigan/ratiganwhite2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Command");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jscopefield.setBackground(new java.awt.Color(204, 204, 204));
        jscopefield.setForeground(new java.awt.Color(102, 102, 102));
        jscopefield.setText("example.com");
        jscopefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jscopefieldActionPerformed(evt);
            }
        });
        getContentPane().add(jscopefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 400, 30));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Scope Domain");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Build Cmd");
        jButton1.setToolTipText("Generate Command");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 29));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        jcommandlabel.setBackground(new java.awt.Color(204, 204, 204));
        jcommandlabel.setColumns(20);
        jcommandlabel.setForeground(new java.awt.Color(102, 102, 102));
        jcommandlabel.setLineWrap(true);
        jcommandlabel.setRows(5);
        jScrollPane1.setViewportView(jcommandlabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 400, 53));

        outputbox.setBackground(new java.awt.Color(204, 204, 204));
        outputbox.setColumns(20);
        outputbox.setForeground(new java.awt.Color(102, 102, 102));
        outputbox.setRows(5);
        outputbox.setText("ratigan v1.0b");
        outputbox.setToolTipText("Output will go here");
        jScrollPane2.setViewportView(outputbox);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 940, 317));

        jexitbutton.setBackground(new java.awt.Color(102, 102, 102));
        jexitbutton.setText("Exit");
        jexitbutton.setToolTipText("Bye!");
        jexitbutton.setMaximumSize(new java.awt.Dimension(145, 29));
        jexitbutton.setMinimumSize(new java.awt.Dimension(145, 29));
        jexitbutton.setPreferredSize(new java.awt.Dimension(100, 29));
        jexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jexitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, -1, -1));

        jreportbutton.setBackground(new java.awt.Color(102, 102, 102));
        jreportbutton.setText("Report");
        jreportbutton.setToolTipText("Run ratproxy-report.sh");
        jreportbutton.setMaximumSize(new java.awt.Dimension(145, 29));
        jreportbutton.setMinimumSize(new java.awt.Dimension(145, 29));
        jreportbutton.setPreferredSize(new java.awt.Dimension(100, 29));
        jreportbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreportbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jreportbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, -1));

        jshowoptionsbutton.setBackground(new java.awt.Color(102, 102, 102));
        jshowoptionsbutton.setText("Options");
        jshowoptionsbutton.setMaximumSize(new java.awt.Dimension(145, 29));
        jshowoptionsbutton.setMinimumSize(new java.awt.Dimension(145, 29));
        jshowoptionsbutton.setPreferredSize(new java.awt.Dimension(100, 29));
        jshowoptionsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowoptionsbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jshowoptionsbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ratigan/ISO_LOGO_OUTLINED.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 430, 35, 0));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 35, 35));
        getContentPane().add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 35, 0));
        getContentPane().add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 0, 35));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Help");
        jButton2.setToolTipText("About ratigan");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 29));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setText("About");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 29));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jgobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgobuttonActionPerformed
jreportbutton.setBackground(new java.awt.Color(102, 102, 102)); //set Report button back to default color
        //Killing all other ratproxies!  THERE CAN ONLY BE ONE!
        String cmd = "killall ratproxy"; 
        Runtime rt=Runtime.getRuntime();
        try {
            rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //Attempting to brute-force create output dir
            
            rt.exec(new String[]{"/bin/sh", "-c", "mkdir /tmp/ratproxy/"});
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           /// THIS IS THE RATPROXY PROCESS
        cmd = jcommandlabel.getText().trim();
	if( cmd.equals( "" ) ) {
		return;
	}
	this._process = new RatproxyProcess( cmd, this.outputbox );
        Thread nt = new Thread( this._process );
        nt.start();
        
// LIST RATPROXIES?        
        try {
        String line;
        Process p = Runtime.getRuntime().exec("pgrep ratproxy");
        BufferedReader input =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = input.readLine()) != null) {
            System.out.println(line);
           outputbox.append("\nRatproxy Started with PID: "+line+"\n");//<-- Parse data here.
        }
        input.close();
    } catch (Exception err) {
    }
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jgobuttonActionPerformed

    private void jscopefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jscopefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jscopefieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
command ="-";

//build command flags from checkboxes
if (jcheckboxc.isSelected()) {
            command= command + "c";
        }
if (jcheckboxe.isSelected()) {
            command= command + "e";
        }
if (jcheckboxf.isSelected()) {
            command= command + "f";
        }
if (jcheckboxg.isSelected()) {
            command= command + "g";
        }
if (jcheckboxi.isSelected()) {
            command= command + "i";
        }
if (jcheckboxj.isSelected()) {
            command= command + "j";
        }
if (jcheckboxl.isSelected()) {
            command= command + "l";
        }
if (jcheckboxm.isSelected()) {
            command= command + "m";
        }
if (jcheckboxs.isSelected()) {
            command= command + "s";
        }
if (jcheckboxt.isSelected()) {
            command= command + "t";
        }
if (jcheckboxx.isSelected()) {
            command= command + "x";
                   }
//add working directory
command = command + " -v ";
command = command + jworkingdirfield1.getText();


//add logfile
command = command + " -w ";
command = command + jlogfilefield.getText();

//add domain
command = command + " -d \"";
command = command + jscopefield.getText() + "\"";

//add port number
command = command + " -p ";
String port=jportfield.getValue() +"";
command = command + port;

//show command
jcommandlabel.setText(RATPROXY_BIN+" "+command);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jstopbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstopbuttonActionPerformed
    //Trying to killall first
        String cmd = "killall ratproxy"; 
        outputbox.append("\nKilling Ratproxy...\n");
    Runtime rt=Runtime.getRuntime();
        try {
            rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // KILL SWITCH CALL THING BACKLOCK     
        if( this._process != null ) {
            this._process.shutdown();
        }
        outputbox.append("Killt!\n");
    }//GEN-LAST:event_jstopbuttonActionPerformed

    private void jexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitbuttonActionPerformed
        // TODO add your handling code here:
        String cmd = "killall ratproxy"; 

    Runtime rt=Runtime.getRuntime();
        try {
            rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
         // KILL SWITCH CALL THING BACKLOCK
	if( this._process != null ) {
            this._process.shutdown();
        }
        System.exit(0);
    }//GEN-LAST:event_jexitbuttonActionPerformed

    private void jreportbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jreportbuttonActionPerformed

jreportbutton.setBackground(new java.awt.Color(102, 102, 102)); //set Report button back to default color
        //REPORT PROCESS
        if( this._process != null ) {
            this._process.shutdown();
        }
        logfile = DEFAULT_WORKDIR + "ratproxy-report.htm";
URI reportpath=null;
        try {
            reportpath = new URI("file://"+logfile);
      
 
        } catch (URISyntaxException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        String cmd;
File outputfile = new File("/tmp/ratproxy/ratproxy-report.htm");      
if(outputfile.exists()){
            try {
                Desktop.getDesktop().browse(reportpath);
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
    }else{jreportbutton.setText("WAIT");jreportbutton.setBackground(Color.RED);jreportbutton.setForeground(Color.WHITE);JOptionPane.showMessageDialog(frame, "Generating new report - Wait for View button to appear.");
                    
                       try {
  Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", "ratproxy-report /tmp/ratproxy/ratproxy.log > /tmp/ratproxy/ratproxy-report.htm"});         
            try {
                process.waitFor();
                /*     Runtime rt=Runtime.getRuntime();
                      rt.exec(new String[]{"/bin/sh", "-c", "ratproxy-report /tmp/ratproxy/ratproxy.log > /tmp/ratproxy/ratproxy-report.htm"});  */
            } catch (InterruptedException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
      
            } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } 
      jreportbutton.setForeground(Color.BLACK);
      jreportbutton.setBackground(Color.GREEN);
      jreportbutton.setText("View");                             
               
                
            
 

}

    }//GEN-LAST:event_jreportbuttonActionPerformed

    private void jlogfilefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogfilefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlogfilefieldActionPerformed

    private void jcheckboxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckboxlActionPerformed

    private void jcheckboxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckboxeActionPerformed

    private void jcheckboxcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxcActionPerformed
        if (jcheckboxc.isSelected()== true)
        {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckboxcActionPerformed

    private void jshowoptionsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowoptionsbuttonActionPerformed
joptionspanel.setVisible(true);
jshowoptionsbutton.setVisible(false);
    }//GEN-LAST:event_jshowoptionsbuttonActionPerformed

    private void jhideoptionsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhideoptionsbuttonActionPerformed
joptionspanel.setVisible(false); 
jshowoptionsbutton.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jhideoptionsbuttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
JOptionPane.showMessageDialog(frame, "ratigan - RATproxy Integrated Graphical Application 'Nspector v1.1b\n"
        + "\n"
        + "Copyright 2013 - The University of Texas at Austin\n"
        + "\n"
        + "<html>Distributed under GPL 2.1: Free <i>(as in beer)</i> for non-commercial use.  All others please contact security@utexas.edu for licensing.</html>\n"
        + "\n"
        + "CREDITS:\n\n"
        + "<html><b>Joshua Harper GCFE GCFA GSEC PI</b> - Code, Layout, and all other bits of goodness</html>\n"
        + "<html><b>Sean Reid OMG LOL BBQ GOOD NOODLE I SPAT ON MY FOOT</b> - Ratproxy execution class</html>\n"
        + "\n"
        + "<html><b>WARNING:</b> This is <b>beta software</b>! Expect errors.  No warranties expressed or implied.</html>\n"
        + "Use at your own risk. ISO reserves the right to mock anyone who needs help using this program.");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JOptionPane.showMessageDialog(frame, "1. Enter desired target URL in Scope Domain box (IP addresses Okay)\n"
        + "2. Click Start Proxy\n"
        + "3. Set Browser to proxy through localhost:8081\n"
        + "4. When finished, click Report\n"
        + "5. Click View\n"
        + "6. Click Exit to exit!\n"
        + "7. Buy a beer to reward yourself for making the excellent decision to use ratigan!");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcheckboxc;
    private javax.swing.JCheckBox jcheckboxe;
    private javax.swing.JCheckBox jcheckboxf;
    private javax.swing.JCheckBox jcheckboxg;
    private javax.swing.JCheckBox jcheckboxi;
    private javax.swing.JCheckBox jcheckboxj;
    private javax.swing.JCheckBox jcheckboxl;
    private javax.swing.JCheckBox jcheckboxm;
    private javax.swing.JCheckBox jcheckboxs;
    private javax.swing.JCheckBox jcheckboxt;
    private javax.swing.JCheckBox jcheckboxx;
    private javax.swing.JTextArea jcommandlabel;
    private javax.swing.JButton jexitbutton;
    private javax.swing.JButton jgobutton;
    private javax.swing.JButton jhideoptionsbutton;
    private javax.swing.JTextField jlogfilefield;
    private javax.swing.JPanel joptionspanel;
    private javax.swing.JSpinner jportfield;
    private javax.swing.JButton jreportbutton;
    private javax.swing.JTextField jscopefield;
    private javax.swing.JButton jshowoptionsbutton;
    private javax.swing.JButton jstopbutton;
    private javax.swing.JTextField jworkingdirfield1;
    private javax.swing.JTextArea outputbox;
    // End of variables declaration//GEN-END:variables
}
