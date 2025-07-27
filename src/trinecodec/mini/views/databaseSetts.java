/*     */ package trinecodec.mini.views;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ import javax.swing.border.TitledBorder;
/*     */ 
/*     */ 
/*     */ public class databaseSetts
/*     */   extends JPanel
/*     */ {
/*     */   private JTable table;
/*     */   private JTextField textField;
/*     */   private JTextField textField_1;
/*     */   private JTextField textField_2;
/*     */   private JTextField textField_3;
/*     */   private JTextField textField_4;
/*     */   private JTextField textField_5;
/*     */   private JTextField textField_6;
/*     */   
/*     */   public databaseSetts() {
/*  33 */     setLayout((LayoutManager)null);
/*  34 */     setSize(1080, 580);
/*     */     
/*  36 */     JLabel lblNewLabel = new JLabel("ADVANCED DATABASE SETTINGS");
/*  37 */     lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
/*  38 */     lblNewLabel.setFont(new Font("Calisto MT", 0, 17));
/*  39 */     lblNewLabel.setHorizontalAlignment(0);
/*  40 */     lblNewLabel.setBounds(0, 0, 1080, 53);
/*  41 */     add(lblNewLabel);
/*     */     
/*  43 */     JPanel panel = new JPanel();
/*  44 */     panel.setBorder(new EtchedBorder(0, null, null));
/*  45 */     panel.setBounds(0, 55, 200, 525);
/*  46 */     add(panel);
/*  47 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  49 */     JScrollPane scrollPane_3 = new JScrollPane();
/*  50 */     scrollPane_3.setBounds(5, 5, 190, 249);
/*  51 */     panel.add(scrollPane_3);
/*     */     
/*  53 */     JPanel panel_8 = new JPanel();
/*  54 */     panel_8.setBorder(new TitledBorder(null, "Server Info", 4, 2, null, null));
/*  55 */     scrollPane_3.setViewportView(panel_8);
/*  56 */     panel_8.setLayout((LayoutManager)null);
/*     */     
/*  58 */     JLabel lblNewLabel_2 = new JLabel("Database : ");
/*  59 */     lblNewLabel_2.setBounds(3, 21, 61, 20);
/*  60 */     panel_8.add(lblNewLabel_2);
/*     */     
/*  62 */     this.textField = new JTextField();
/*  63 */     this.textField.setBackground(new Color(240, 240, 240));
/*  64 */     this.textField.setBorder((Border)null);
/*  65 */     this.textField.setBounds(53, 21, 125, 20);
/*  66 */     panel_8.add(this.textField);
/*  67 */     this.textField.setColumns(10);
/*     */     
/*  69 */     JLabel lblNewLabel_2_1 = new JLabel("Version : ");
/*  70 */     lblNewLabel_2_1.setBounds(3, 52, 61, 20);
/*  71 */     panel_8.add(lblNewLabel_2_1);
/*     */     
/*  73 */     this.textField_1 = new JTextField();
/*  74 */     this.textField_1.setColumns(10);
/*  75 */     this.textField_1.setBorder((Border)null);
/*  76 */     this.textField_1.setBackground(UIManager.getColor("Button.background"));
/*  77 */     this.textField_1.setBounds(53, 52, 125, 20);
/*  78 */     panel_8.add(this.textField_1);
/*     */     
/*  80 */     this.textField_2 = new JTextField();
/*  81 */     this.textField_2.setColumns(10);
/*  82 */     this.textField_2.setBorder((Border)null);
/*  83 */     this.textField_2.setBackground(UIManager.getColor("Button.background"));
/*  84 */     this.textField_2.setBounds(83, 83, 95, 20);
/*  85 */     panel_8.add(this.textField_2);
/*     */     
/*  87 */     JLabel lblNewLabel_2_1_1 = new JLabel("Server Version : ");
/*  88 */     lblNewLabel_2_1_1.setBounds(3, 83, 95, 20);
/*  89 */     panel_8.add(lblNewLabel_2_1_1);
/*     */     
/*  91 */     JLabel lblNewLabel_2_1_1_2 = new JLabel("Server Version : ");
/*  92 */     lblNewLabel_2_1_1_2.setBounds(3, 114, 95, 20);
/*  93 */     panel_8.add(lblNewLabel_2_1_1_2);
/*     */     
/*  95 */     this.textField_6 = new JTextField();
/*  96 */     this.textField_6.setColumns(10);
/*  97 */     this.textField_6.setBorder((Border)null);
/*  98 */     this.textField_6.setBackground(UIManager.getColor("Button.background"));
/*  99 */     this.textField_6.setBounds(83, 114, 95, 20);
/* 100 */     panel_8.add(this.textField_6);
/*     */     
/* 102 */     JScrollPane scrollPane_3_1 = new JScrollPane();
/* 103 */     scrollPane_3_1.setBounds(5, 265, 190, 249);
/* 104 */     panel.add(scrollPane_3_1);
/*     */     
/* 106 */     JPanel panel_8_1 = new JPanel();
/* 107 */     panel_8_1.setLayout((LayoutManager)null);
/* 108 */     panel_8_1.setBorder(new TitledBorder(null, "Server Info", 4, 2, null, null));
/* 109 */     scrollPane_3_1.setViewportView(panel_8_1);
/*     */     
/* 111 */     JLabel lblNewLabel_2_2 = new JLabel("Database : ");
/* 112 */     lblNewLabel_2_2.setBounds(3, 21, 61, 20);
/* 113 */     panel_8_1.add(lblNewLabel_2_2);
/*     */     
/* 115 */     this.textField_3 = new JTextField();
/* 116 */     this.textField_3.setColumns(10);
/* 117 */     this.textField_3.setBorder((Border)null);
/* 118 */     this.textField_3.setBackground(UIManager.getColor("Button.background"));
/* 119 */     this.textField_3.setBounds(53, 21, 125, 20);
/* 120 */     panel_8_1.add(this.textField_3);
/*     */     
/* 122 */     JLabel lblNewLabel_2_1_2 = new JLabel("Version : ");
/* 123 */     lblNewLabel_2_1_2.setBounds(3, 52, 61, 20);
/* 124 */     panel_8_1.add(lblNewLabel_2_1_2);
/*     */     
/* 126 */     this.textField_4 = new JTextField();
/* 127 */     this.textField_4.setColumns(10);
/* 128 */     this.textField_4.setBorder((Border)null);
/* 129 */     this.textField_4.setBackground(UIManager.getColor("Button.background"));
/* 130 */     this.textField_4.setBounds(53, 52, 125, 20);
/* 131 */     panel_8_1.add(this.textField_4);
/*     */     
/* 133 */     this.textField_5 = new JTextField();
/* 134 */     this.textField_5.setColumns(10);
/* 135 */     this.textField_5.setBorder((Border)null);
/* 136 */     this.textField_5.setBackground(UIManager.getColor("Button.background"));
/* 137 */     this.textField_5.setBounds(83, 83, 95, 20);
/* 138 */     panel_8_1.add(this.textField_5);
/*     */     
/* 140 */     JLabel lblNewLabel_2_1_1_1 = new JLabel("Server Version : ");
/* 141 */     lblNewLabel_2_1_1_1.setBounds(3, 83, 95, 20);
/* 142 */     panel_8_1.add(lblNewLabel_2_1_1_1);
/*     */     
/* 144 */     JPanel panel_1 = new JPanel();
/* 145 */     panel_1.setBorder(new EtchedBorder(0, null, null));
/* 146 */     panel_1.setBounds(210, 55, 663, 525);
/* 147 */     add(panel_1);
/* 148 */     panel_1.setLayout((LayoutManager)null);
/*     */     
/* 150 */     JPanel panel_3 = new JPanel();
/* 151 */     panel_3.setBorder(new TitledBorder(null, "Codespace", 2, 2, null, null));
/* 152 */     panel_3.setBounds(2, 11, 660, 280);
/* 153 */     panel_1.add(panel_3);
/* 154 */     panel_3.setLayout((LayoutManager)null);
/*     */     
/* 156 */     JPanel panel_4 = new JPanel();
/* 157 */     panel_4.setBounds(10, 15, 640, 25);
/* 158 */     panel_3.add(panel_4);
/*     */     
/* 160 */     JPanel panel_5 = new JPanel();
/* 161 */     panel_5.setBounds(10, 40, 640, 146);
/* 162 */     panel_3.add(panel_5);
/* 163 */     panel_5.setLayout((LayoutManager)null);
/*     */     
/* 165 */     JScrollPane scrollPane = new JScrollPane();
/* 166 */     scrollPane.setBounds(0, 0, 640, 146);
/* 167 */     panel_5.add(scrollPane);
/*     */     
/* 169 */     JEditorPane editorPane = new JEditorPane();
/* 170 */     scrollPane.setViewportView(editorPane);
/*     */     
/* 172 */     JPanel panel_6 = new JPanel();
/* 173 */     panel_6.setBounds(10, 189, 640, 53);
/* 174 */     panel_3.add(panel_6);
/* 175 */     panel_6.setLayout((LayoutManager)null);
/*     */     
/* 177 */     JScrollPane scrollPane_1 = new JScrollPane();
/* 178 */     scrollPane_1.setBounds(2, 2, 635, 51);
/* 179 */     panel_6.add(scrollPane_1);
/*     */     
/* 181 */     JEditorPane editorPane_1 = new JEditorPane();
/* 182 */     scrollPane_1.setViewportView(editorPane_1);
/*     */     
/* 184 */     JLabel lblNewLabel_1 = new JLabel("New label");
/* 185 */     lblNewLabel_1.setBounds(10, 250, 240, 20);
/* 186 */     panel_3.add(lblNewLabel_1);
/*     */     
/* 188 */     JPanel panel_7 = new JPanel();
/* 189 */     panel_7.setBounds(2, 302, 660, 220);
/* 190 */     panel_1.add(panel_7);
/* 191 */     panel_7.setLayout((LayoutManager)null);
/*     */     
/* 193 */     JScrollPane scrollPane_2 = new JScrollPane();
/* 194 */     scrollPane_2.setBounds(2, 5, 658, 210);
/* 195 */     panel_7.add(scrollPane_2);
/*     */     
/* 197 */     this.table = new JTable();
/* 198 */     scrollPane_2.setViewportView(this.table);
/*     */     
/* 200 */     JPanel panel_2 = new JPanel();
/* 201 */     panel_2.setBorder(new EtchedBorder(0, null, null));
/* 202 */     panel_2.setBounds(883, 55, 193, 525);
/* 203 */     add(panel_2);
/* 204 */     panel_2.setLayout((LayoutManager)null);
/*     */     
/* 206 */     JButton btnNewButton = new JButton("Back");
/* 207 */     btnNewButton.setBounds(10, 491, 173, 23);
/* 208 */     panel_2.add(btnNewButton);
/*     */     
/* 210 */     JButton btnReload = new JButton("Reload");
/* 211 */     btnReload.setBounds(10, 449, 173, 23);
/* 212 */     panel_2.add(btnReload);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/databaseSetts.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */