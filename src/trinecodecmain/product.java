/*     */ package trinecodecmain;
/*     */ 
/*     */ import doryan.windowsnotificationapi.fr.Notification;
/*     */ import java.awt.AWTException;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Font;
/*     */ import java.awt.HeadlessException;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.TrayIcon;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.net.MalformedURLException;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.border.BevelBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ import org.jdatepicker.DateModel;
/*     */ import org.jdatepicker.JDatePicker;
/*     */ import org.jdatepicker.UtilDateModel;
/*     */ import trinecodec.mini.views.productReports;
/*     */ import trinecodec.mini.views.salesReports;
/*     */ import trinecodec.mini.views.supplierReports;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class product
/*     */   extends JPanel
/*     */ {
/*     */   JpanelLoader loader;
/*     */   JRadioButton stockviewBtn;
/*     */   BufferedImage image;
/*     */   UtilDateModel model;
/*     */   JDatePicker datePicker;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   public static JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel2;
/*     */   private JPanel panel;
/*     */   private JPanel jPanel3;
/*     */   public static JTextField p_bcode;
/*     */   public static JTextField p_name;
/*     */   public static JTextField p_price;
/*     */   public static JTextField p_qty;
/*     */   public static JTextField p_sid;
/*     */   public static JTextField p_src;
/*     */   private JTextField expDate;
/*     */   private JTextField p_sprice;
/*     */   
/*     */   public product() {
/* 553 */     this.loader = new JpanelLoader();
/*     */ 
/*     */     
/* 556 */     this.model = new UtilDateModel();
/* 557 */     this.datePicker = new JDatePicker((DateModel)this.model);
/*     */     initComponents();
/*     */     this.stockviewBtn.doClick();
/*     */   }
/*     */   
/*     */   private void initComponents() {
/*     */     this.jPanel1 = new JPanel();
/*     */     this.jPanel1.setBounds(0, 0, 1100, 590);
/*     */     this.jPanel1.setBorder(new LineBorder(new Color(0, 0, 0)));
/*     */     this.jPanel2 = new JPanel();
/*     */     this.jPanel2.setBounds(11, 127, 477, 451);
/*     */     this.jLabel1 = new JLabel();
/*     */     this.jLabel1.setHorizontalAlignment(2);
/*     */     this.jLabel1.setBounds(10, 16, 93, 17);
/*     */     this.jLabel2 = new JLabel();
/*     */     this.jLabel2.setBounds(10, 45, 93, 17);
/*     */     p_name = new JTextField();
/*     */     p_name.setBounds(113, 13, 222, 23);
/*     */     p_bcode = new JTextField();
/*     */     p_bcode.setBounds(113, 42, 222, 23);
/*     */     this.jLabel5 = new JLabel();
/*     */     this.jLabel5.setBounds(10, 73, 92, 17);
/*     */     this.jLabel6 = new JLabel();
/*     */     this.jLabel6.setHorizontalAlignment(2);
/*     */     this.jLabel6.setBounds(10, 191, 97, 17);
/*     */     p_sid = new JTextField();
/*     */     p_sid.addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent e) {}
/*     */         });
/*     */     p_sid.setBounds(114, 191, 222, 23);
/*     */     p_price = new JTextField();
/*     */     p_price.setBounds(114, 70, 221, 23);
/*     */     this.jLabel7 = new JLabel();
/*     */     this.jLabel7.setHorizontalAlignment(2);
/*     */     this.jLabel7.setBounds(10, 130, 97, 17);
/*     */     p_qty = new JTextField();
/*     */     p_qty.setBounds(114, 130, 222, 23);
/*     */     this.jPanel3 = new JPanel();
/*     */     this.jPanel3.setBounds(11, 12, 477, 109);
/*     */     this.jLabel3 = new JLabel();
/*     */     p_src = new JTextField();
/*     */     this.jLabel4 = new JLabel();
/*     */     this.jPanel2.setBorder(BorderFactory.createEtchedBorder());
/*     */     this.jLabel1.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel1.setText("Prod Name :");
/*     */     this.jLabel2.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel2.setText("Bar Code :");
/*     */     p_name.setFont(new Font("Tahoma", 1, 14));
/*     */     p_bcode.setFont(new Font("Tahoma", 1, 14));
/*     */     p_bcode.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             product.this.p_bcodeActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.jLabel5.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel5.setText("Buying Price:");
/*     */     this.jLabel6.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel6.setText("Supplier ID :");
/*     */     p_sid.setFont(new Font("Tahoma", 1, 14));
/*     */     p_price.setFont(new Font("Tahoma", 1, 14));
/*     */     p_price.setText("0");
/*     */     this.jLabel7.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel7.setText("Quantity :");
/*     */     p_qty.setFont(new Font("Tahoma", 1, 14));
/*     */     p_qty.setText("0");
/*     */     this.jPanel3.setBorder(BorderFactory.createEtchedBorder());
/*     */     this.jLabel3.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel3.setText("Search ID :");
/*     */     p_src.setFont(new Font("Tahoma", 1, 14));
/*     */     p_src.setText("0");
/*     */     this.jLabel4.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel4.setText("Product Info :");
/*     */     jButton3 = new JButton();
/*     */     jButton3.setFont(new Font("Tahoma", 1, 12));
/*     */     jButton3.setIcon(new ImageIcon(getClass().getResource("/img/search x30.png")));
/*     */     jButton3.setText("Search");
/*     */     jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             product.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/*     */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(p_src, -2, 222, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3))).addContainerGap(-1, 32767)));
/*     */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup().addComponent(this.jLabel4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(p_src, -2, -1, -2).addComponent(jButton3)).addContainerGap()));
/*     */     this.jPanel3.setLayout(jPanel3Layout);
/*     */     this.jPanel2.setLayout((LayoutManager)null);
/*     */     this.jPanel2.add(this.jLabel6);
/*     */     this.jPanel2.add(p_sid);
/*     */     this.jPanel2.add(this.jLabel7);
/*     */     this.jPanel2.add(p_qty);
/*     */     this.jPanel2.add(this.jLabel5);
/*     */     this.jPanel2.add(p_price);
/*     */     this.jPanel2.add(this.jLabel1);
/*     */     this.jPanel2.add(this.jLabel2);
/*     */     this.jPanel2.add(p_bcode);
/*     */     this.jPanel2.add(p_name);
/*     */     this.expDate = new JTextField();
/*     */     this.expDate.setBounds(114, 160, 222, 23);
/*     */     this.expDate.setFont(new Font("Tahoma", 1, 14));
/*     */     this.datePicker.setBounds(114, 160, 226, 25);
/*     */     this.datePicker.setButtonFocusable(false);
/*     */     this.datePicker.getDateFormat();
/*     */     this.jPanel2.add((Component)this.datePicker);
/*     */     JLabel lblExpireryDate = new JLabel();
/*     */     lblExpireryDate.setHorizontalAlignment(2);
/*     */     lblExpireryDate.setBounds(10, 160, 97, 17);
/*     */     lblExpireryDate.setText("Best Before :");
/*     */     lblExpireryDate.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jPanel2.add(lblExpireryDate);
/*     */     try {
/*     */       this.image = ImageIO.read(product.class.getResource("/img/calendar.png"));
/*     */       Image image = this.image.getScaledInstance(30, 25, 4);
/*     */     } catch (IOException e) {
/*     */       e.printStackTrace();
/*     */     } 
/*     */     setLayout((LayoutManager)null);
/*     */     add(this.jPanel1);
/*     */     this.jPanel1.setLayout((LayoutManager)null);
/*     */     this.jPanel1.add(this.jPanel2);
/*     */     JPanel panel_1 = new JPanel();
/*     */     panel_1.setBorder(new BevelBorder(1, null, null, null, null));
/*     */     panel_1.setBounds(122, 240, 347, 140);
/*     */     this.jPanel2.add(panel_1);
/*     */     panel_1.setLayout((LayoutManager)null);
/*     */     this.jButton4 = new JButton();
/*     */     this.jButton4.setBounds(7, 11, 110, 33);
/*     */     panel_1.add(this.jButton4);
/*     */     this.jButton4.setFont(new Font("Tahoma", 1, 12));
/*     */     this.jButton4.setIcon(new ImageIcon(getClass().getResource("/img/save.png")));
/*     */     this.jButton4.setText("Save");
/*     */     this.jButton1 = new JButton();
/*     */     this.jButton1.setBounds(230, 11, 110, 33);
/*     */     panel_1.add(this.jButton1);
/*     */     this.jButton1.setFont(new Font("Tahoma", 1, 12));
/*     */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/img/delete.png")));
/*     */     this.jButton1.setText("Delete");
/*     */     this.jButton2 = new JButton();
/*     */     this.jButton2.setBounds(118, 11, 110, 33);
/*     */     panel_1.add(this.jButton2);
/*     */     this.jButton2.setFont(new Font("Tahoma", 1, 12));
/*     */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/img/update.png")));
/*     */     this.jButton2.setText("Update");
/*     */     final JButton btnLoad = new JButton();
/*     */     btnLoad.setText("Load");
/*     */     btnLoad.setFont(new Font("Tahoma", 1, 12));
/*     */     btnLoad.setBounds(7, 55, 110, 33);
/*     */     panel_1.add(btnLoad);
/*     */     final JButton btnLoad_1 = new JButton();
/*     */     btnLoad_1.setText("Load");
/*     */     btnLoad_1.setFont(new Font("Tahoma", 1, 12));
/*     */     btnLoad_1.setBounds(7, 99, 110, 33);
/*     */     panel_1.add(btnLoad_1);
/*     */     final JButton btnPreview = new JButton();
/*     */     btnPreview.setText("Preview");
/*     */     btnPreview.setFont(new Font("Tahoma", 1, 12));
/*     */     btnPreview.setBounds(118, 55, 110, 33);
/*     */     panel_1.add(btnPreview);
/*     */     final JButton btnPreview_1 = new JButton();
/*     */     btnPreview_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {}
/*     */         });
/*     */     btnPreview_1.setText("Preview");
/*     */     btnPreview_1.setFont(new Font("Tahoma", 1, 12));
/*     */     btnPreview_1.setBounds(118, 99, 110, 33);
/*     */     panel_1.add(btnPreview_1);
/*     */     final JButton btnPrint = new JButton();
/*     */     btnPrint.setText("Print");
/*     */     btnPrint.setFont(new Font("Tahoma", 1, 12));
/*     */     btnPrint.setBounds(230, 55, 110, 33);
/*     */     panel_1.add(btnPrint);
/*     */     final JButton btnPrint_1 = new JButton();
/*     */     btnPrint_1.setText("Print");
/*     */     btnPrint_1.setFont(new Font("Tahoma", 1, 12));
/*     */     btnPrint_1.setBounds(230, 99, 110, 33);
/*     */     panel_1.add(btnPrint_1);
/*     */     JLabel lblSellingPrice = new JLabel();
/*     */     lblSellingPrice.setText("Selling Price:");
/*     */     lblSellingPrice.setFont(new Font("Tahoma", 1, 14));
/*     */     lblSellingPrice.setBounds(11, 103, 92, 17);
/*     */     this.jPanel2.add(lblSellingPrice);
/*     */     this.p_sprice = new JTextField();
/*     */     this.p_sprice.setText("0");
/*     */     this.p_sprice.setFont(new Font("Tahoma", 1, 14));
/*     */     this.p_sprice.setBounds(115, 100, 221, 23);
/*     */     this.jPanel2.add(this.p_sprice);
/*     */     ButtonGroup radioBtns = new ButtonGroup();
/*     */     this.stockviewBtn = new JRadioButton("Stock View");
/*     */     this.stockviewBtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             productReports rviewer = new productReports();
/*     */             JpanelLoader.jPanelLoader(product.this.panel, (JPanel)rviewer);
/*     */             btnLoad.setEnabled(false);
/*     */             btnPreview.setEnabled(false);
/*     */             btnLoad_1.setEnabled(false);
/*     */             btnPreview_1.setEnabled(false);
/*     */             btnPrint.setEnabled(false);
/*     */             btnPrint_1.setEnabled(false);
/*     */             product.this.jButton4.setEnabled(true);
/*     */             product.this.jButton2.setEnabled(true);
/*     */             product.this.jButton1.setEnabled(true);
/*     */           }
/*     */         });
/*     */     this.stockviewBtn.setBounds(7, 265, 109, 23);
/*     */     this.jPanel2.add(this.stockviewBtn);
/*     */     JRadioButton supplierreportsBtn = new JRadioButton("Supply Reports");
/*     */     supplierreportsBtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             supplierReports rviewer = new supplierReports();
/*     */             JpanelLoader.jPanelLoader(product.this.panel, (JPanel)rviewer);
/*     */             product.this.jButton4.setEnabled(false);
/*     */             product.this.jButton2.setEnabled(false);
/*     */             product.this.jButton1.setEnabled(false);
/*     */             btnLoad_1.setEnabled(false);
/*     */             btnPrint_1.setEnabled(false);
/*     */             btnPreview_1.setEnabled(false);
/*     */             btnLoad.setEnabled(true);
/*     */             btnPrint.setEnabled(true);
/*     */             btnPreview.setEnabled(true);
/*     */           }
/*     */         });
/*     */     supplierreportsBtn.setBounds(7, 305, 109, 23);
/*     */     this.jPanel2.add(supplierreportsBtn);
/*     */     JRadioButton salesreportBtn = new JRadioButton("Sales Reports");
/*     */     salesreportBtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             salesReports rviewer = new salesReports();
/*     */             JpanelLoader.jPanelLoader(product.this.panel, (JPanel)rviewer);
/*     */             product.this.jButton4.setEnabled(false);
/*     */             product.this.jButton2.setEnabled(false);
/*     */             product.this.jButton1.setEnabled(false);
/*     */             btnLoad.setEnabled(false);
/*     */             btnPreview.setEnabled(false);
/*     */             btnPrint.setEnabled(false);
/*     */             btnLoad_1.setEnabled(true);
/*     */             btnPreview_1.setEnabled(true);
/*     */             btnPrint_1.setEnabled(true);
/*     */           }
/*     */         });
/*     */     salesreportBtn.setBounds(10, 346, 109, 23);
/*     */     this.jPanel2.add(salesreportBtn);
/*     */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             product.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     radioBtns.add(salesreportBtn);
/*     */     radioBtns.add(this.stockviewBtn);
/*     */     radioBtns.add(supplierreportsBtn);
/*     */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             product.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             product.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.jPanel1.add(this.jPanel3);
/*     */     this.panel = new JPanel();
/*     */     this.panel.setBounds(500, 12, 558, 566);
/*     */     this.jPanel1.add(this.panel);
/*     */     this.panel.setLayout((LayoutManager)null);
/*     */   }
/*     */   
/*     */   private void p_bcodeActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/*     */     if (p_name.getText().isBlank()) {
/*     */       JOptionPane.showMessageDialog(null, "The Product Name is Required", "Aborted", 2);
/*     */     } else if (this.p_sprice.getText().isBlank()) {
/*     */       JOptionPane.showMessageDialog(null, "The Selling Price is Required", "Aborted", 2);
/*     */     } else if (p_qty.getText().isBlank()) {
/*     */       JOptionPane.showMessageDialog(null, "The Quantity is Required", "Aborted", 2);
/*     */     } else if (p_sid.getText().isBlank()) {
/*     */       JOptionPane.showMessageDialog(null, "The Supplier ID is Required", "Aborted", 2);
/*     */     } else {
/*     */       String name = p_name.getText();
/*     */       String bcode = p_bcode.getText();
/*     */       String price = p_price.getText();
/*     */       String qty = p_qty.getText();
/*     */       Integer sid = Integer.valueOf(Integer.parseInt(p_sid.getText()));
/*     */       int year = this.datePicker.getModel().getYear();
/*     */       int month = this.datePicker.getModel().getMonth();
/*     */       int day = this.datePicker.getModel().getDay();
/*     */       String exp = String.valueOf(year) + "-" + month + "-" + day;
/*     */       String sprice = this.p_sprice.getText();
/*     */       try {
/*     */         Statement s = db.mycon().createStatement();
/*     */         s.executeUpdate("INSERT INTO product (Sid,Product_Name,Bar_code,BPrice,Exp_Date,Qty,SPrice) VALUES ('" + sid + "','" + name + "','" + bcode + "','" + price + "','" + exp + "','" + qty + "','" + sprice + "')");
/*     */         Notification.sendNotification("TrineTechs : Moyale Supermarket", "Data for:\"" + name + "\" Saved to Database", TrayIcon.MessageType.INFO);
/*     */       } catch (SQLException e) {
/*     */         System.out.println(e);
/*     */       } catch (MalformedURLException e) {
/*     */         e.printStackTrace();
/*     */       } catch (AWTException e) {
/*     */         System.out.println("Error : " + e);
/*     */       } 
/*     */       productReports.tb_load();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/*     */     String search = p_src.getText();
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       ResultSet rs = s.executeQuery(" SELECT * FROM product WHERE pid ='" + search + "'  ");
/*     */       if (rs.next()) {
/*     */         p_name.setText(rs.getString("Product_Name"));
/*     */         p_bcode.setText(rs.getString("Bar_code"));
/*     */         p_price.setText(rs.getString("BPrice"));
/*     */         this.p_sprice.setText(rs.getString("SPrice"));
/*     */         p_qty.setText(rs.getString("Qty"));
/*     */         p_sid.setText(rs.getString("Sid"));
/*     */       } 
/*     */     } catch (SQLException e) {
/*     */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/*     */     String id = p_src.getText();
/*     */     String name = p_name.getText();
/*     */     String bcode = p_bcode.getText();
/*     */     String price = p_price.getText();
/*     */     String qty = p_qty.getText();
/*     */     String sid = p_sid.getText();
/*     */     int year = this.datePicker.getModel().getYear();
/*     */     int month = this.datePicker.getModel().getMonth();
/*     */     int day = this.datePicker.getModel().getDay();
/*     */     String exp = String.valueOf(year) + "-" + month + "-" + day;
/*     */     String sprice = this.p_sprice.getText();
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       s.executeUpdate("UPDATE product SET Product_Name='" + name + "',Bar_code='" + bcode + "' ,BPrice='" + price + "',Exp_Date='" + exp + "',SPrice='" + sprice + "', Qty='" + qty + "',Sid='" + sid + "' WHERE pid ='" + id + "' ;");
/*     */       Notification.sendNotification("TrineTechs: Moyale Supermarket", "Data for : \"" + name + "\" Updated Successfully", TrayIcon.MessageType.INFO);
/*     */     } catch (Exception e) {
/*     */       JOptionPane.showMessageDialog(null, "Error :" + e, "Unknown Error", 0);
/*     */     } 
/*     */     productReports.tb_load();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*     */     String id = p_src.getText();
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       s.executeUpdate("DELETE FROM product WHERE pid = '" + id + "' ");
/*     */       JOptionPane.showMessageDialog(null, "Data Deleted");
/*     */       Notification.sendNotification("TrineTechs : Moyale Supermarket", "Data id: " + id + " deleted successfully", TrayIcon.MessageType.INFO);
/*     */     } catch (HeadlessException|SQLException e) {
/*     */       System.out.println(e);
/*     */     } catch (MalformedURLException e) {
/*     */       e.printStackTrace();
/*     */     } catch (AWTException e) {
/*     */       e.printStackTrace();
/*     */     } 
/*     */     productReports.tb_load();
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/product.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */