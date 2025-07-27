 package raven.progressindicator;
 import java.awt.Color;
 import java.awt.Component;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.RenderingHints;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.AbstractListModel;
 import javax.swing.GroupLayout;
import javax.swing.JPanel;
 import javax.swing.LayoutStyle;
 
 public class Indicator extends JPanel {
   static Button button1;
   private Button button2;
   
   public Indicator() {
     initComponents();
     setBackground(Color.WHITE);
setOpaque(false);
     
Component[] components = { new WelcomeScreen(), new installModules(), new loginPage(), new ShopAccount(), new processInst(), new PanelTest(6) };
this.panelSlider.setSliderComponent(components);
     this.progressIndicator.initSlider(this.panelSlider);
   }
   private PanelSlider panelSlider; private ProgressIndicator progressIndicator;
   
   protected void paintComponent(Graphics grphcs) {
/*  29 */     Graphics2D g2 = (Graphics2D)grphcs.create();
/*  30 */     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*  31 */     g2.setColor(getBackground());
/*  32 */     g2.fill(new RoundRectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight(), 10.0D, 10.0D));
/*  33 */     g2.dispose();
/*  34 */     super.paintComponent(grphcs);
   }
 
   
   private void initComponents() {
/*  39 */     this.progressIndicator = new ProgressIndicator();
/*  40 */     this.panelSlider = new PanelSlider();
/*  41 */     button1 = new Button();
/*  42 */     this.button2 = new Button();
     
/*  44 */     setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
     
/*  46 */     this.progressIndicator.setBorder(BorderFactory.createEmptyBorder(5, 80, 5, 80));
/*  47 */     this.progressIndicator.setModel(new AbstractListModel() {
/*  48 */           String[] strings = new String[] { "StartUp", "Install Modules", "User Account", "Shop Account", "Process", "Done" };
/*  49 */           public int getSize() { return this.strings.length; }
/*  50 */           public Object getElementAt(int i) { return this.strings[i]; }
         });
/*  52 */     this.progressIndicator.setOpaque(false);
/*  53 */     this.progressIndicator.setProgress(0.0F);
/*  54 */     this.progressIndicator.setProgressColorGradient(new Color(255, 51, 51));
     
/*  56 */     this.panelSlider.setOpaque(false);
     
/*  58 */     button1.setText("Back");
/*  59 */     button1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
/*  61 */             Indicator.this.button1ActionPerformed(evt);
           }
         });
     
/*  65 */     this.button2.setText("Next");
/*  66 */     this.button2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
/*  68 */             Indicator.this.button2ActionPerformed(evt);
           }
         });
     
/*  72 */     GroupLayout layout = new GroupLayout(this);
/*  73 */     setLayout(layout);
/*  74 */     layout.setHorizontalGroup(
/*  75 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  76 */         .addGroup(layout.createSequentialGroup()
/*  77 */           .addContainerGap()
/*  78 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  79 */             .addComponent(this.progressIndicator, -1, 689, 32767)
/*  80 */             .addComponent(this.panelSlider, -1, -1, 32767)
/*  81 */             .addGroup(layout.createSequentialGroup()
/*  82 */               .addComponent(button1, -2, 80, -2)
/*  83 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  84 */               .addComponent(this.button2, -2, 80, -2)))
/*  85 */           .addContainerGap()));
     
/*  87 */     layout.setVerticalGroup(
/*  88 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  89 */         .addGroup(layout.createSequentialGroup()
/*  90 */           .addContainerGap()
/*  91 */           .addComponent(this.progressIndicator, -2, -1, -2)
/*  92 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  93 */           .addComponent(this.panelSlider, -2, 341, -2)
/*  94 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  95 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  96 */             .addComponent(button1, -2, -1, -2)
/*  97 */             .addComponent(this.button2, -2, -1, -2))
/*  98 */           .addContainerGap()));
   }
 
   
   private void button1ActionPerformed(ActionEvent evt) {
/* 103 */     this.progressIndicator.previous();
   }
   
   private void button2ActionPerformed(ActionEvent evt) {
/* 107 */     this.progressIndicator.next();
   }
 }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/Indicator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */