/*    */ package raven.progressindicator;
/*    */ import javax.swing.GroupLayout;
/*    */ 
/*    */ public class PanelTest extends JPanel {
/*    */   public PanelTest(int form) {
/*  6 */     initComponents();
/*  7 */     this.lb.setText("Form " + form);
/*    */   }
/*    */ 
/*    */   
/*    */   private JLabel lb;
/*    */   
/*    */   private void initComponents() {
/* 14 */     this.lb = new JLabel();
/*    */     
/* 16 */     setBackground(new Color(250, 250, 250));
/*    */     
/* 18 */     this.lb.setFont(new Font("sansserif", 1, 18));
/* 19 */     this.lb.setForeground(new Color(90, 90, 90));
/* 20 */     this.lb.setHorizontalAlignment(0);
/* 21 */     this.lb.setText("Form");
/*    */     
/* 23 */     GroupLayout layout = new GroupLayout(this);
/* 24 */     setLayout(layout);
/* 25 */     layout.setHorizontalGroup(
/* 26 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 27 */         .addGroup(layout.createSequentialGroup()
/* 28 */           .addContainerGap()
/* 29 */           .addComponent(this.lb, -1, 401, 32767)
/* 30 */           .addContainerGap()));
/*    */     
/* 32 */     layout.setVerticalGroup(
/* 33 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 34 */         .addGroup(layout.createSequentialGroup()
/* 35 */           .addContainerGap()
/* 36 */           .addComponent(this.lb, -1, 302, 32767)
/* 37 */           .addContainerGap()));
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/PanelTest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */