/*     */ package trinecode.tools;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.TitledBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Calc
/*     */   implements ActionListener
/*     */ {
/*     */   JFrame frame;
/*     */   JTextField tf;
/*     */   JTextField tf1;
/*     */   JButton num1;
/*     */   JButton num2;
/*     */   JButton num3;
/*     */   JButton num4;
/*     */   JButton num5;
/*     */   JButton num6;
/*     */   JButton num7;
/*     */   JButton num8;
/*     */   JButton num9;
/*  40 */   double a = 0.0D; JButton num0; JButton sum; JButton div; JButton mult; JButton minus; JButton equ; JButton neg; JButton del; JButton dec; JButton clear; JPanel panel; JButton[] numButton; JButton[] operators; double b = 0.0D; double result = 0.0D; char operand;
/*  41 */   Font font = new Font("Comic Sans MS", 1, 14); private JPanel panel_1;
/*     */   
/*     */   public Calc() {
/*  44 */     this.frame = new JFrame("Calculator");
/*  45 */     this.frame.setResizable(false);
/*  46 */     this.frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Calc.class.getResource("/img/Photo1674297737671.png")));
/*  47 */     this.frame.setDefaultCloseOperation(2);
/*     */     
/*  49 */     this.frame.setSize(350, 500);
/*     */     
/*  51 */     this.frame.getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  53 */     this.panel = new JPanel();
/*  54 */     this.panel.setLayout(new GridLayout(4, 5));
/*  55 */     this.panel.setBounds(18, 85, 300, 300);
/*  56 */     this.panel.setBackground(new Color(45, 55, 75));
/*     */     
/*  58 */     this.num1 = new JButton("1");
/*  59 */     this.num2 = new JButton("2");
/*  60 */     this.num3 = new JButton("3");
/*  61 */     this.num4 = new JButton("4");
/*  62 */     this.num5 = new JButton("5");
/*  63 */     this.num6 = new JButton("6");
/*  64 */     this.num7 = new JButton("7");
/*  65 */     this.num7.setMnemonic(55);
/*  66 */     this.num8 = new JButton("8");
/*  67 */     this.num8.setMnemonic(56);
/*  68 */     this.num9 = new JButton("9");
/*  69 */     this.num9.addKeyListener(new KeyAdapter()
/*     */         {
/*     */           public void keyPressed(KeyEvent e)
/*     */           {
/*  73 */             System.out.print(e.getKeyChar());
/*     */           }
/*     */         });
/*     */     
/*  77 */     this.num9.setMnemonic(57);
/*  78 */     this.num0 = new JButton("0");
/*     */     
/*  80 */     this.numButton = new JButton[10];
/*  81 */     this.operators = new JButton[8];
/*     */     
/*  83 */     this.numButton[0] = this.num0;
/*  84 */     this.numButton[1] = this.num1;
/*  85 */     this.numButton[2] = this.num2;
/*  86 */     this.numButton[3] = this.num3;
/*  87 */     this.numButton[4] = this.num4;
/*  88 */     this.numButton[5] = this.num5;
/*  89 */     this.numButton[6] = this.num6;
/*  90 */     this.numButton[7] = this.num7;
/*  91 */     this.numButton[8] = this.num8;
/*  92 */     this.numButton[9] = this.num9;
/*     */     
/*  94 */     this.sum = new JButton("+");
/*  95 */     this.sum.addActionListener(this);
/*  96 */     this.minus = new JButton("-");
/*  97 */     this.minus.addActionListener(this);
/*  98 */     this.mult = new JButton("X");
/*  99 */     this.mult.addActionListener(this);
/* 100 */     this.div = new JButton(String.format("%c", new Object[] { Integer.valueOf(247) }));
/* 101 */     this.div.addActionListener(this);
/* 102 */     this.neg = new JButton(String.format("%c", new Object[] { Integer.valueOf(177) }));
/* 103 */     this.neg.addActionListener(this);
/* 104 */     this.del = new JButton("Delete");
/* 105 */     this.del.addActionListener(this);
/* 106 */     this.clear = new JButton("Clear");
/* 107 */     this.clear.addActionListener(this);
/* 108 */     this.dec = new JButton(".");
/* 109 */     this.dec.addActionListener(this);
/* 110 */     this.equ = new JButton("=");
/* 111 */     this.equ.addActionListener(this);
/*     */     
/* 113 */     this.operators = new JButton[9];
/* 114 */     this.operators[0] = this.sum;
/* 115 */     this.operators[1] = this.minus;
/* 116 */     this.operators[2] = this.div;
/* 117 */     this.operators[3] = this.mult;
/* 118 */     this.operators[4] = this.del;
/* 119 */     this.operators[5] = this.clear;
/* 120 */     this.operators[6] = this.neg;
/* 121 */     this.operators[7] = this.dec;
/* 122 */     this.operators[8] = this.equ;
/*     */     int a;
/* 124 */     for (a = 0; a < 10; a++) {
/* 125 */       this.numButton[a].setFont(this.font);
/* 126 */       this.numButton[a].setFocusable(false);
/* 127 */       this.numButton[a].setBackground(Color.cyan);
/* 128 */       this.numButton[a].addActionListener(this);
/*     */     } 
/*     */     
/* 131 */     for (a = 0; a < 9; a++) {
/* 132 */       this.operators[a].setFont(this.font);
/* 133 */       this.operators[a].setFocusable(false);
/* 134 */       this.operators[a].setForeground(new Color(255, 255, 255));
/* 135 */       this.operators[a].setBackground(new Color(45, 55, 75));
/*     */     } 
/*     */     
/* 138 */     this.panel.add(this.num9); this.panel.add(this.num8); this.panel.add(this.num7); this.panel.add(this.mult);
/* 139 */     this.panel.add(this.num4); this.panel.add(this.num5); this.panel.add(this.num6); this.panel.add(this.div);
/* 140 */     this.panel.add(this.num1); this.panel.add(this.num2); this.panel.add(this.num3); this.panel.add(this.minus);
/* 141 */     this.panel.add(this.dec); this.panel.add(this.num0); this.panel.add(this.sum); this.panel.add(this.equ);
/*     */ 
/*     */     
/* 144 */     this.neg.setBounds(18, 395, 100, 30);
/* 145 */     this.clear.setBounds(118, 395, 100, 30);
/* 146 */     this.del.setBounds(218, 395, 100, 30);
/*     */     
/* 148 */     this.frame.getContentPane().add(this.del);
/* 149 */     this.frame.getContentPane().add(this.neg);
/* 150 */     this.frame.getContentPane().add(this.clear);
/*     */     
/* 152 */     this.panel_1 = new JPanel();
/* 153 */     this.panel_1.setBorder(new TitledBorder(new EtchedBorder(1, new Color(255, 255, 255), new Color(160, 160, 160)), "theTrine Academy", 2, 2, null, new Color(0, 0, 0)));
/* 154 */     this.panel_1.setBounds(12, -1, 312, 82);
/* 155 */     this.frame.getContentPane().add(this.panel_1);
/* 156 */     this.panel_1.setLayout((LayoutManager)null);
/*     */     
/* 158 */     this.tf = new JTextField();
/* 159 */     this.tf.setBounds(6, 16, 300, 27);
/* 160 */     this.panel_1.add(this.tf);
/* 161 */     this.tf.setBackground(Color.CYAN);
/* 162 */     this.tf.setFont(this.font);
/* 163 */     this.tf.setEditable(false);
/*     */     
/* 165 */     this.tf1 = new JTextField();
/* 166 */     this.tf1.setBounds(6, 40, 300, 36);
/* 167 */     this.panel_1.add(this.tf1);
/* 168 */     this.tf1.setFont(this.font);
/* 169 */     this.frame.getContentPane().add(this.panel);
/* 170 */     this.frame.setLocationRelativeTo(null);
/* 171 */     this.frame.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent e) {
/* 177 */     for (int a = 0; a < 10; a++) {
/* 178 */       if (e.getSource() == this.numButton[a]) {
/* 179 */         this.tf1.setText(this.tf1.getText().concat(String.valueOf(a)));
/*     */       }
/*     */     } 
/* 182 */     if (e.getSource() == this.clear) {
/* 183 */       this.tf.setText("Cleared");
/* 184 */       this.tf1.setText("");
/*     */     } 
/* 186 */     if (e.getSource() == this.dec) {
/* 187 */       this.tf1.setText(this.tf1.getText().concat("."));
/*     */     }
/* 189 */     if (e.getSource() == this.del) {
/* 190 */       String string = this.tf1.getText();
/* 191 */       this.tf1.setText("");
/* 192 */       for (int i = 0; i < string.length() - 1; i++) {
/* 193 */         this.tf1.setText(String.valueOf(this.tf1.getText()) + string.charAt(i));
/*     */       }
/*     */     } 
/* 196 */     if (e.getSource() == this.sum) {
/* 197 */       this.operand = '+';
/* 198 */       this.a = Double.parseDouble(this.tf1.getText());
/* 199 */       this.tf.setText(String.valueOf(String.valueOf(this.a) + " +"));
/* 200 */       this.tf1.setText("");
/*     */     } 
/* 202 */     if (e.getSource() == this.div) {
/* 203 */       this.operand = '/';
/* 204 */       this.a = Double.parseDouble(this.tf1.getText());
/* 205 */       this.tf.setText(String.valueOf(String.valueOf(this.a) + " /"));
/* 206 */       this.tf1.setText("");
/*     */     } 
/* 208 */     if (e.getSource() == this.mult) {
/* 209 */       this.operand = '*';
/* 210 */       this.a = Double.parseDouble(this.tf1.getText());
/* 211 */       this.tf.setText(String.valueOf(String.valueOf(this.a) + " X "));
/* 212 */       this.tf1.setText("");
/*     */     } 
/* 214 */     if (e.getSource() == this.minus) {
/* 215 */       this.operand = '-';
/* 216 */       this.a = Double.parseDouble(this.tf1.getText());
/* 217 */       this.tf.setText(String.valueOf(String.valueOf(this.a) + " -"));
/* 218 */       this.tf1.setText("");
/*     */     } 
/* 220 */     if (e.getSource() == this.neg) {
/* 221 */       if (this.tf1.getText().isBlank()) {
/* 222 */         this.tf1.setText("-");
/*     */       } else {
/* 224 */         Double temp = Double.valueOf(Double.parseDouble(this.tf1.getText()));
/* 225 */         temp = Double.valueOf(temp.doubleValue() * -1.0D);
/* 226 */         this.tf1.setText(String.valueOf(temp));
/*     */       } 
/*     */     }
/* 229 */     if (e.getSource() == this.equ) {
/* 230 */       this.b = Double.parseDouble(this.tf1.getText());
/* 231 */       switch (this.operand) {
/*     */         case '+':
/* 233 */           this.result = this.a + this.b;
/* 234 */           this.tf1.setText(String.valueOf(this.result));
/* 235 */           this.tf.setText(String.valueOf(String.valueOf(this.a) + " " + this.operand + " " + this.b));
/* 236 */           this.a = this.result;
/*     */           break;
/*     */         case '-':
/* 239 */           this.result = this.a - this.b;
/* 240 */           this.tf1.setText(String.valueOf(this.result));
/* 241 */           this.tf.setText(String.valueOf(String.valueOf(this.a) + " " + this.operand + " " + this.b));
/* 242 */           this.a = this.result;
/*     */           break;
/*     */         case '/':
/* 245 */           this.result = this.a / this.b;
/* 246 */           this.tf1.setText(String.valueOf(this.result));
/* 247 */           this.tf.setText(String.valueOf(String.valueOf(this.a) + " " + this.operand + " " + this.b));
/* 248 */           this.a = this.result;
/*     */           break;
/*     */         case '*':
/* 251 */           this.result = this.a * this.b;
/* 252 */           this.tf1.setText(String.valueOf(this.result));
/* 253 */           this.tf.setText(String.valueOf(String.valueOf(this.a) + " X " + this.b));
/* 254 */           this.a = this.result;
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/Calc.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */