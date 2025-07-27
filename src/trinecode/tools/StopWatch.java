/*     */ package trinecode.tools;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.Timer;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StopWatch
/*     */   implements ActionListener
/*     */ {
/*     */   JFrame frmTrineclocks;
/*     */   private JTextField hrsField;
/*     */   SimpleDateFormat timeFormat;
/*     */   private JTextField minsField;
/*     */   private JTextField secsField;
/*     */   JButton hrsUp;
/*     */   JButton minsUp;
/*     */   JButton btnReset;
/*     */   JButton secsUp;
/*     */   JButton secsDown;
/*     */   JButton hrsDown;
/*     */   
/*     */   public void setTime() {
/*     */     while (true) {
/*  38 */       this.timeFormat = new SimpleDateFormat("hh:mm:ss a");
/*  39 */       this.time = this.timeFormat.format(Calendar.getInstance().getTime());
/*  40 */       this.currentTimeDisplay.setText(this.time);
/*     */       try {
/*  42 */         Thread.sleep(1000L);
/*  43 */       } catch (InterruptedException e) {
/*     */         
/*  45 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   } JButton minsDown; JButton btnStart; Timer timer; String time; int inHrs; int inMins; int inSecs; int hrs; int mins; int secs; private JLabel currentTimeDisplay;
/*     */   public StopWatch() {
/*  50 */     this.frmTrineclocks = new JFrame();
/*  51 */     this.frmTrineclocks.setIconImage(Toolkit.getDefaultToolkit().getImage(StopWatch.class.getResource("/com/trine/attempt2/update.png")));
/*  52 */     this.frmTrineclocks.setTitle("TrineClocks");
/*  53 */     this.frmTrineclocks.setResizable(false);
/*  54 */     this.frmTrineclocks.setDefaultCloseOperation(3);
/*  55 */     this.frmTrineclocks.setSize(341, 250);
/*  56 */     this.frmTrineclocks.setLocationRelativeTo(null);
/*  57 */     this.frmTrineclocks.getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  59 */     JLabel StopwatchLabel = new JLabel("Moyale Stop Watch");
/*  60 */     StopwatchLabel.setBounds(0, 0, 325, 23);
/*  61 */     StopwatchLabel.setHorizontalAlignment(0);
/*  62 */     StopwatchLabel.setFont(new Font("Calisto MT", 1, 16));
/*  63 */     this.frmTrineclocks.getContentPane().add(StopwatchLabel);
/*     */     
/*  65 */     JPanel panel = new JPanel();
/*  66 */     panel.setBounds(0, 61, 334, 119);
/*  67 */     this.frmTrineclocks.getContentPane().add(panel);
/*  68 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  70 */     JLabel hrsLabel = new JLabel("HOURS");
/*  71 */     hrsLabel.setHorizontalAlignment(0);
/*  72 */     hrsLabel.setBounds(0, 0, 108, 26);
/*  73 */     panel.add(hrsLabel);
/*     */     
/*  75 */     JLabel minslabel = new JLabel("MINS");
/*  76 */     minslabel.setHorizontalAlignment(0);
/*  77 */     minslabel.setBounds(108, 0, 108, 26);
/*  78 */     panel.add(minslabel);
/*     */     
/*  80 */     JLabel secsLabel = new JLabel("SECS");
/*  81 */     secsLabel.setHorizontalAlignment(0);
/*  82 */     secsLabel.setBounds(226, 0, 108, 26);
/*  83 */     panel.add(secsLabel);
/*     */     
/*  85 */     this.hrsUp = new JButton("UP");
/*  86 */     this.hrsUp.setFocusable(false);
/*  87 */     this.hrsUp.addActionListener(this);
/*  88 */     this.hrsUp.setBounds(10, 22, 89, 23);
/*  89 */     panel.add(this.hrsUp);
/*     */     
/*  91 */     this.minsUp = new JButton("UP");
/*  92 */     this.minsUp.setFocusable(false);
/*  93 */     this.minsUp.addActionListener(this);
/*  94 */     this.minsUp.setBounds(128, 22, 89, 23);
/*  95 */     panel.add(this.minsUp);
/*     */     
/*  97 */     this.secsUp = new JButton("UP");
/*  98 */     this.secsUp.setBounds(236, 22, 89, 23);
/*  99 */     this.secsUp.addActionListener(this);
/* 100 */     this.secsUp.setFocusable(false);
/* 101 */     panel.add(this.secsUp);
/*     */     
/* 103 */     this.secsDown = new JButton("DOWN");
/* 104 */     this.secsDown.addActionListener(this);
/* 105 */     this.secsDown.setBounds(236, 96, 89, 23);
/* 106 */     this.secsDown.setFocusable(false);
/* 107 */     panel.add(this.secsDown);
/*     */     
/* 109 */     this.minsDown = new JButton("DOWN");
/* 110 */     this.minsDown.addActionListener(this);
/* 111 */     this.minsDown.setBounds(128, 96, 89, 23);
/* 112 */     this.minsDown.setFocusable(false);
/* 113 */     panel.add(this.minsDown);
/*     */     
/* 115 */     this.hrsDown = new JButton("DOWN");
/* 116 */     this.hrsDown.addActionListener(this);
/* 117 */     this.hrsDown.setBounds(10, 96, 89, 23);
/* 118 */     this.hrsDown.setFocusable(false);
/* 119 */     panel.add(this.hrsDown);
/*     */     
/* 121 */     this.hrsField = new JTextField();
/* 122 */     this.hrsField.setEnabled(false);
/* 123 */     this.hrsField.setHorizontalAlignment(0);
/* 124 */     this.hrsField.setText("00");
/* 125 */     this.hrsField.setFont(new Font("DialogInput", 1, 30));
/* 126 */     this.hrsField.setBounds(10, 47, 89, 48);
/* 127 */     panel.add(this.hrsField);
/* 128 */     this.hrsField.setColumns(10);
/*     */     
/* 130 */     this.minsField = new JTextField();
/* 131 */     this.minsField.setHorizontalAlignment(0);
/* 132 */     this.minsField.setText("00");
/* 133 */     this.minsField.setFont(new Font("DialogInput", 1, 30));
/* 134 */     this.minsField.setColumns(10);
/* 135 */     this.minsField.setBounds(128, 47, 89, 48);
/* 136 */     panel.add(this.minsField);
/*     */     
/* 138 */     this.secsField = new JTextField();
/* 139 */     this.secsField.setHorizontalAlignment(0);
/* 140 */     this.secsField.setText("00");
/* 141 */     this.secsField.setFont(new Font("DialogInput", 1, 30));
/* 142 */     this.secsField.setColumns(10);
/* 143 */     this.secsField.setBounds(236, 47, 89, 48);
/* 144 */     panel.add(this.secsField);
/*     */     
/* 146 */     this.btnStart = new JButton("START");
/* 147 */     this.btnStart.setBounds(235, 188, 89, 23);
/* 148 */     this.btnStart.addActionListener(this);
/* 149 */     this.frmTrineclocks.getContentPane().add(this.btnStart);
/*     */     
/* 151 */     this.btnReset = new JButton("RESET");
/* 152 */     this.btnReset.setBounds(136, 188, 89, 23);
/* 153 */     this.btnReset.addActionListener(this);
/* 154 */     this.frmTrineclocks.getContentPane().add(this.btnReset);
/* 155 */     this.timer = new Timer(1000, new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e)
/*     */           {
/* 159 */             int sec1 = Integer.parseInt(StopWatch.this.secsField.getText());
/* 160 */             int min1 = Integer.parseInt(StopWatch.this.minsField.getText());
/* 161 */             int hrs1 = Integer.parseInt(StopWatch.this.hrsField.getText());
/*     */             
/* 163 */             StopWatch.this.hrsUp.setEnabled(false);
/* 164 */             StopWatch.this.secsUp.setEnabled(false);
/* 165 */             StopWatch.this.minsUp.setEnabled(false);
/* 166 */             StopWatch.this.minsDown.setEnabled(false);
/* 167 */             StopWatch.this.secsDown.setEnabled(false);
/* 168 */             StopWatch.this.hrsDown.setEnabled(false);
/*     */             
/* 170 */             StopWatch.this.hrs = hrs1; StopWatch.this.secs = sec1; StopWatch.this.hrs = hrs1;
/* 171 */             if (StopWatch.this.hrs == 0 && StopWatch.this.mins == 0 && StopWatch.this.secs > 0) {
/* 172 */               StopWatch.this.secs--;
/*     */             }
/* 174 */             else if (StopWatch.this.hrs == 0 && StopWatch.this.secs == 0 && StopWatch.this.mins > 0) {
/* 175 */               StopWatch.this.mins--;
/* 176 */               StopWatch.this.secs = 59;
/*     */             }
/* 178 */             else if (StopWatch.this.mins == 0 && StopWatch.this.secs == 0 && StopWatch.this.hrs > 0) {
/* 179 */               StopWatch.this.hrs--;
/* 180 */               StopWatch.this.mins = 59;
/* 181 */               StopWatch.this.secs = 59;
/*     */             }
/* 183 */             else if (StopWatch.this.mins > 0 && StopWatch.this.secs > 0 && StopWatch.this.hrs > 0) {
/* 184 */               StopWatch.this.secs--;
/*     */             }
/* 186 */             else if (StopWatch.this.hrs == 0 && StopWatch.this.mins > 0 && StopWatch.this.secs > 0) {
/* 187 */               StopWatch.this.secs--;
/*     */             }
/* 189 */             else if (StopWatch.this.mins == 0 && StopWatch.this.hrs > 0 && StopWatch.this.secs == 0) {
/* 190 */               StopWatch.this.hrs--;
/* 191 */               StopWatch.this.mins = 59;
/*     */             }
/* 193 */             else if (StopWatch.this.mins == 0 && StopWatch.this.hrs > 0 && StopWatch.this.secs > 0) {
/* 194 */               StopWatch.this.secs--;
/*     */             }
/* 196 */             else if (StopWatch.this.mins > 0 && StopWatch.this.hrs > 0 && StopWatch.this.secs == 0) {
/* 197 */               StopWatch.this.mins--;
/* 198 */               StopWatch.this.secs = 59;
/*     */             }
/* 200 */             else if (StopWatch.this.mins == 0 && StopWatch.this.hrs == 0 && StopWatch.this.secs == 0) {
/* 201 */               StopWatch.this.btnStart.setText("START");
/* 202 */               StopWatch.this.timer.stop();
/* 203 */               StopWatch.this.hrsUp.setEnabled(true);
/* 204 */               StopWatch.this.secsUp.setEnabled(true);
/* 205 */               StopWatch.this.minsUp.setEnabled(true);
/* 206 */               StopWatch.this.minsDown.setEnabled(true);
/* 207 */               StopWatch.this.secsDown.setEnabled(true);
/* 208 */               StopWatch.this.hrsDown.setEnabled(true);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 216 */             StopWatch.this.secsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.this$0.secs) }));
/* 217 */             StopWatch.this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.this$0.mins) }));
/* 218 */             StopWatch.this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.this$0.hrs) }));
/* 219 */             StopWatch.this.timeFormat = new SimpleDateFormat("hh:mm:ss: a");
/* 220 */             StopWatch.this.time = StopWatch.this.timeFormat.format(Calendar.getInstance().getTime());
/* 221 */             StopWatch.this.currentTimeDisplay.setText(StopWatch.this.time);
/*     */           }
/*     */         });
/* 224 */     this.btnReset.setFocusable(false);
/* 225 */     this.btnStart.setFocusable(false);
/*     */     
/* 227 */     this.currentTimeDisplay = new JLabel();
/* 228 */     this.currentTimeDisplay.setBounds(0, 22, 319, 38);
/* 229 */     this.currentTimeDisplay.setHorizontalAlignment(0);
/* 230 */     this.currentTimeDisplay.setFont(new Font("Castellar", 1, 25));
/* 231 */     this.frmTrineclocks.getContentPane().add(this.currentTimeDisplay);
/* 232 */     this.frmTrineclocks.setVisible(true);
/* 233 */     theTime();
/*     */   }
/*     */   public void theTime() {
/* 236 */     this.timeFormat = new SimpleDateFormat("hh:mm:ss: a");
/* 237 */     this.time = this.timeFormat.format(Calendar.getInstance().getTime());
/* 238 */     this.currentTimeDisplay.setText(this.time);
/* 239 */     setTime();
/*     */   }
/*     */   public static void main(String[] args) {
/*     */     try {
/* 243 */       UIManager.setLookAndFeel("com.formdev.flatlaf.themes.FlatMacLightLaf");
/* 244 */     } catch (Throwable e) {
/* 245 */       e.printStackTrace();
/*     */     } 
/* 247 */     StopWatch stopWatch = new StopWatch();
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent e) {
/* 252 */     if (e.getSource() == this.secsUp) {
/* 253 */       this.secs = Integer.parseInt(this.secsField.getText());
/* 254 */       if (this.secs == 59) {
/* 255 */         this.mins = Integer.parseInt(this.minsField.getText());
/* 256 */         this.mins++;
/* 257 */         this.secs = 0;
/* 258 */         this.secsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.secs) }));
/* 259 */         if (this.mins == 60) {
/* 260 */           this.hrs++;
/* 261 */           this.mins = 0;
/* 262 */           this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/* 263 */           this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.hrs) }));
/*     */         } 
/*     */       } else {
/*     */         
/* 267 */         this.secs++;
/* 268 */         this.secsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.secs) }));
/* 269 */         this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/*     */       } 
/*     */     } 
/* 272 */     if (e.getSource() == this.minsUp) {
/* 273 */       this.mins++;
/* 274 */       if (this.mins == 60) {
/* 275 */         this.hrs++;
/* 276 */         this.mins = 0;
/* 277 */         this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/* 278 */         this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.hrs) }));
/*     */       } else {
/*     */         
/* 281 */         this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/*     */       } 
/* 283 */     } else if (e.getSource() == this.hrsUp) {
/* 284 */       this.hrs = Integer.parseInt(this.hrsField.getText());
/* 285 */       if (this.hrs >= 0 && this.hrs < 24) {
/* 286 */         this.hrs++;
/* 287 */         this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.hrs) }));
/*     */       }
/*     */     
/* 290 */     } else if (e.getSource() == this.hrsDown) {
/* 291 */       this.hrs = Integer.parseInt(this.hrsField.getText());
/* 292 */       if (this.hrs > 0) {
/* 293 */         this.hrs--;
/* 294 */         this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.hrs) }));
/*     */       } 
/*     */     } 
/* 297 */     if (e.getSource() == this.btnStart) {
/* 298 */       this.inSecs = Integer.parseInt(this.secsField.getText());
/* 299 */       this.inHrs = Integer.parseInt(this.hrsField.getText());
/* 300 */       this.inMins = Integer.parseInt(this.minsField.getText());
/*     */       
/* 302 */       if (this.btnStart.getText() == "START") {
/* 303 */         if (this.mins != 0 || this.secs != 0 || this.hrs != 0)
/*     */         {
/* 305 */           this.hrsUp.setEnabled(false);
/* 306 */           this.secsUp.setEnabled(false);
/* 307 */           this.minsUp.setEnabled(false);
/* 308 */           this.minsDown.setEnabled(false);
/* 309 */           this.secsDown.setEnabled(false);
/* 310 */           this.hrsDown.setEnabled(false);
/* 311 */           this.btnStart.setText("PAUSE");
/* 312 */           this.timer.start();
/*     */         }
/*     */       
/* 315 */       } else if (this.btnStart.getText() == "PAUSE") {
/* 316 */         this.btnStart.setText("START");
/* 317 */         this.hrsUp.setEnabled(true);
/* 318 */         this.secsUp.setEnabled(true);
/* 319 */         this.minsUp.setEnabled(true);
/* 320 */         this.minsDown.setEnabled(true);
/* 321 */         this.secsDown.setEnabled(true);
/* 322 */         this.hrsDown.setEnabled(true);
/* 323 */         this.timer.stop();
/*     */       } 
/*     */     } 
/* 326 */     if (e.getSource() == this.btnReset) {
/* 327 */       this.secsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.inSecs) }));
/* 328 */       this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.inMins) }));
/* 329 */       this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.inHrs) }));
/* 330 */       this.timer.stop();
/* 331 */       this.btnStart.setText("START");
/*     */     } 
/* 333 */     if (e.getSource() == this.secsDown) {
/* 334 */       this.secs = Integer.parseInt(this.secsField.getText());
/* 335 */       if (this.secs == 0) {
/* 336 */         if (this.mins > 0) {
/* 337 */           this.mins = Integer.parseInt(this.minsField.getText());
/* 338 */           this.mins--;
/* 339 */           this.secs = 59;
/* 340 */           this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/* 341 */           this.secsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.secs) }));
/* 342 */         } else if (this.mins == 0 && this.hrs > 0) {
/* 343 */           this.hrs--;
/* 344 */           this.mins = 59;
/* 345 */           this.secs = 59;
/* 346 */           this.secsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.secs) }));
/* 347 */           this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/* 348 */           this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.hrs) }));
/*     */         } 
/*     */       } else {
/*     */         
/* 352 */         this.secs--;
/* 353 */         this.secsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.secs) }));
/* 354 */         this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/*     */       } 
/*     */     } 
/* 357 */     if (e.getSource() == this.minsDown) {
/* 358 */       this.mins = Integer.parseInt(this.minsField.getText());
/* 359 */       if (this.mins > 0) {
/* 360 */         this.mins--;
/* 361 */         this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/*     */       }
/* 363 */       else if (this.mins == 0 && this.hrs > 0) {
/* 364 */         this.hrs--;
/* 365 */         this.mins = 59;
/* 366 */         this.minsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.mins) }));
/* 367 */         this.hrsField.setText(String.format("%02d", new Object[] { Integer.valueOf(this.hrs) }));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/StopWatch.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */