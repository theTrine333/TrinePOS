/*     */ package trinecode.tools;
/*     */ import com.google.zxing.BarcodeFormat;
/*     */ import com.google.zxing.common.BitMatrix;
/*     */ import com.google.zxing.oned.Code128Writer;
/*     */ import java.awt.AWTException;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Robot;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ 
/*     */ public class BarcodeScan {
/*     */   private String path;
/*     */   private String barcode;
/*     */   private JLabel imageLabel;
/*     */   private JFrame frame;
/*     */   
/*     */   public void displayImage(String imagePath) {
/*     */     try {
/*  37 */       this.file = new File(imagePath);
/*  38 */       BufferedImage image = ImageIO.read(this.file);
/*  39 */       Image scaledImage = image.getScaledInstance(412, 119, 4);
/*  40 */       this.imageLabel.setIcon(new ImageIcon(scaledImage));
/*  41 */     } catch (Exception exception) {}
/*     */   }
/*     */   private JTextField barcodeField; private JTextField textField; private File file; private File outputFile;
/*     */   
/*     */   public void barcodeMaker(String barcode) {
/*     */     try {
/*  47 */       String textToBarcode = barcode;
/*     */       
/*  49 */       String text = textToBarcode;
/*  50 */       Code128Writer writer = new Code128Writer();
/*  51 */       BitMatrix matrix = writer.encode(text, BarcodeFormat.CODE_128, 500, 300);
/*     */ 
/*     */       
/*  54 */       File outputFolder = new File("C:/BCRSC");
/*  55 */       if (!outputFolder.exists()) {
/*  56 */         outputFolder.mkdirs();
/*     */       }
/*  58 */       this.path = String.valueOf(outputFolder.getPath()) + "/" + textToBarcode + ".jpg";
/*  59 */       this.outputFile = new File(this.path);
/*     */       
/*  61 */       MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(this.path, new String[0]));
/*  62 */     } catch (Exception exception) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BarcodeScan() throws InterruptedException {
/*  81 */     this.frame = new JFrame();
/*  82 */     this.frame.addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosed(WindowEvent e) {
/*  85 */             if (BarcodeScan.this.outputFile.exists()) {
/*  86 */               BarcodeScan.this.outputFile.delete();
/*     */             }
/*     */           }
/*     */         });
/*  90 */     this.frame.setResizable(false);
/*  91 */     this.frame.setIconImage(Toolkit.getDefaultToolkit().getImage(BarcodeScan.class.getResource("/tray/resources/arrow.png")));
/*  92 */     this.frame.setTitle("Barcode Scanner and Generator");
/*  93 */     this.frame.setSize(450, 376);
/*  94 */     this.frame.setLocationRelativeTo(null);
/*  95 */     this.frame.setDefaultCloseOperation(2);
/*  96 */     this.frame.getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  98 */     JPanel panel = new JPanel();
/*  99 */     panel.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 100 */     panel.setBounds(-6, -16, 446, 80);
/* 101 */     this.frame.getContentPane().add(panel);
/* 102 */     panel.setLayout((LayoutManager)null);
/* 103 */     JLabel lblNewLabel = new JLabel("Barcode Scanner");
/* 104 */     lblNewLabel.setBounds(6, 16, 434, 58);
/* 105 */     panel.add(lblNewLabel);
/* 106 */     lblNewLabel.setHorizontalAlignment(0);
/* 107 */     lblNewLabel.setFont(new Font("SimSun", 1, 35));
/*     */     
/* 109 */     JPanel panel_2 = new JPanel();
/* 110 */     panel_2.setBorder(new EtchedBorder(1, null, null));
/* 111 */     panel_2.setBounds(87, 49, 341, 73);
/* 112 */     this.frame.getContentPane().add(panel_2);
/* 113 */     panel_2.setLayout((LayoutManager)null);
/* 114 */     this.barcodeField = new JTextField();
/* 115 */     this.barcodeField.addKeyListener(new KeyAdapter()
/*     */         {
/*     */           public void keyReleased(KeyEvent e) {
/* 118 */             BarcodeScan.this.barcode = BarcodeScan.this.barcodeField.getText();
/*     */             
/*     */             try {
/* 121 */               Robot robot = new Robot();
/* 122 */               robot.keyPress(10);
/* 123 */               robot.keyRelease(10);
/* 124 */               BarcodeScan.this.barcodeMaker(BarcodeScan.this.barcode);
/* 125 */               BarcodeScan.this.barcodeField.setText(BarcodeScan.this.barcode);
/* 126 */               BarcodeScan.this.displayImage(BarcodeScan.this.path);
/* 127 */             } catch (AWTException aWTException) {}
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 132 */     this.barcodeField.setFont(new Font("Tahoma", 1, 15));
/* 133 */     this.barcodeField.setBounds(6, 16, 329, 25);
/* 134 */     panel_2.add(this.barcodeField);
/* 135 */     this.barcodeField.setColumns(10);
/*     */     
/* 137 */     this.textField = new JTextField();
/* 138 */     this.textField.setFont(new Font("Tahoma", 1, 15));
/* 139 */     this.textField.setColumns(10);
/* 140 */     this.textField.setBounds(6, 42, 329, 25);
/* 141 */     panel_2.add(this.textField);
/*     */     
/* 143 */     JPanel panel_3 = new JPanel();
/* 144 */     panel_3.setBorder(new EtchedBorder(1, null, null));
/* 145 */     panel_3.setBounds(4, 129, 424, 164);
/* 146 */     this.frame.getContentPane().add(panel_3);
/* 147 */     panel_3.setLayout((LayoutManager)null);
/*     */     
/* 149 */     JLabel lblNewLabel_2 = new JLabel("Barcode Image");
/* 150 */     lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 151 */     lblNewLabel_2.setFont(new Font("SimSun", 1, 25));
/* 152 */     lblNewLabel_2.setHorizontalAlignment(0);
/* 153 */     lblNewLabel_2.setBounds(6, 6, 412, 29);
/* 154 */     panel_3.add(lblNewLabel_2);
/*     */     
/* 156 */     this.imageLabel = new JLabel("Image goes here");
/* 157 */     this.imageLabel.setBorder(new EtchedBorder(1, null, null));
/* 158 */     this.imageLabel.setBounds(6, 39, 412, 119);
/* 159 */     panel_3.add(this.imageLabel);
/*     */     
/* 161 */     JPanel panel_4 = new JPanel();
/* 162 */     panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 163 */     panel_4.setBounds(4, 294, 424, 37);
/* 164 */     this.frame.getContentPane().add(panel_4);
/* 165 */     panel_4.setLayout((LayoutManager)null);
/*     */     
/* 167 */     JButton btnNewButton = new JButton("Generate");
/* 168 */     btnNewButton.setCursor(Cursor.getPredefinedCursor(12));
/* 169 */     btnNewButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 171 */             if (BarcodeScan.this.textField.getText().isEmpty()) {
/* 172 */               JOptionPane.showMessageDialog(null, "Please fill in the Text-Field", "TrineTechs", 0);
/*     */             } else {
/* 174 */               BarcodeScan.this.barcode = BarcodeScan.this.textField.getText();
/* 175 */               BarcodeScan.this.textField.setText("");
/* 176 */               BarcodeScan.this.barcodeMaker(BarcodeScan.this.barcode);
/* 177 */               BarcodeScan.this.barcodeField.setText(BarcodeScan.this.barcode);
/* 178 */               BarcodeScan.this.displayImage(BarcodeScan.this.path);
/*     */             } 
/*     */           }
/*     */         });
/* 182 */     btnNewButton.setBounds(328, 6, 90, 28);
/* 183 */     panel_4.add(btnNewButton);
/*     */     
/* 185 */     JButton btnNewButton_1 = new JButton("Reset");
/* 186 */     btnNewButton_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 188 */             BarcodeScan.this.barcodeField.setText("");
/* 189 */             BarcodeScan.this.textField.setText("");
/* 190 */             BarcodeScan.this.imageLabel.setIcon((Icon)null);
/*     */           }
/*     */         });
/* 193 */     btnNewButton_1.setBounds(226, 6, 90, 28);
/* 194 */     panel_4.add(btnNewButton_1);
/*     */     
/* 196 */     JPanel panel_5 = new JPanel();
/* 197 */     panel_5.setLayout((LayoutManager)null);
/* 198 */     panel_5.setBorder(new EtchedBorder(1, null, null));
/* 199 */     panel_5.setBounds(-6, 97, 95, 20);
/* 200 */     this.frame.getContentPane().add(panel_5);
/*     */     
/* 202 */     JLabel lblNewLabel_1_1 = new JLabel("Text");
/* 203 */     lblNewLabel_1_1.setHorizontalAlignment(0);
/* 204 */     lblNewLabel_1_1.setFont(new Font("SimSun", 1, 22));
/* 205 */     lblNewLabel_1_1.setBounds(6, 0, 83, 20);
/* 206 */     panel_5.add(lblNewLabel_1_1);
/*     */     
/* 208 */     JPanel panel_5_1 = new JPanel();
/* 209 */     panel_5_1.setLayout((LayoutManager)null);
/* 210 */     panel_5_1.setBorder(new EtchedBorder(1, null, null));
/* 211 */     panel_5_1.setBounds(-6, 71, 95, 20);
/* 212 */     this.frame.getContentPane().add(panel_5_1);
/*     */     
/* 214 */     JLabel lblNewLabel_1_1_1 = new JLabel("Barcode");
/* 215 */     lblNewLabel_1_1_1.setHorizontalAlignment(0);
/* 216 */     lblNewLabel_1_1_1.setFont(new Font("SimSun", 1, 22));
/* 217 */     lblNewLabel_1_1_1.setBounds(6, 0, 83, 20);
/* 218 */     panel_5_1.add(lblNewLabel_1_1_1);
/*     */     
/* 220 */     this.frame.setVisible(true);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/BarcodeScan.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */