/*     */ package raven.progressindicator;
/*     */ 
/*     */ import java.awt.AlphaComposite;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.GradientPaint;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.Area;
/*     */ import java.awt.geom.Ellipse2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.geom.RoundRectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import javax.accessibility.Accessible;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.ListModel;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ 
/*     */ public class ProgressIndicator<E>
/*     */   extends JComponent
/*     */   implements Accessible
/*     */ {
/*     */   private ListModel<E> model;
/*     */   private PanelSlider panelSlider;
/*     */   
/*     */   public ListModel<E> getModel() {
/*  35 */     return this.model;
/*     */   }
/*     */   
/*     */   public void setModel(ListModel<E> model) {
/*  39 */     this.model = model;
/*  40 */     repaint();
/*  41 */     revalidate();
/*     */   }
/*     */   
/*     */   public int getProgressIndex() {
/*  45 */     return (int)this.progress;
/*     */   }
/*     */   
/*     */   public float getProgress() {
/*  49 */     return this.progress;
/*     */   }
/*     */   
/*     */   public void setProgress(float progress) {
/*  53 */     this.progress = progress;
/*  54 */     repaint();
/*     */   }
/*     */   
/*     */   public Font getProgressFont() {
/*  58 */     return this.progressFont;
/*     */   }
/*     */   
/*     */   public void setProgressFont(Font progressFont) {
/*  62 */     this.progressFont = progressFont;
/*  63 */     repaint();
/*  64 */     revalidate();
/*     */   }
/*     */   
/*     */   public Color getProgressColor() {
/*  68 */     return this.progressColor;
/*     */   }
/*     */   
/*     */   public void setProgressColor(Color progressColor) {
/*  72 */     this.progressColor = progressColor;
/*  73 */     repaint();
/*     */   }
/*     */   
/*     */   public Color getProgressColorGradient() {
/*  77 */     return this.progressColorGradient;
/*     */   }
/*     */   
/*     */   public void setProgressColorGradient(Color progressColorGradient) {
/*  81 */     this.progressColorGradient = progressColorGradient;
/*  82 */     repaint();
/*     */   }
/*     */   
/*     */   public Color getProgressColorSelected() {
/*  86 */     return this.progressColorSelected;
/*     */   }
/*     */   
/*     */   public void setProgressColorSelected(Color progressColorSelected) {
/*  90 */     this.progressColorSelected = progressColorSelected;
/*  91 */     repaint();
/*     */   }
/*     */   
/*     */   public int getProgressLineSize() {
/*  95 */     return this.progressLineSize;
/*     */   }
/*     */   
/*     */   public void setProgressLineSize(int progressLineSize) {
/*  99 */     this.progressLineSize = progressLineSize;
/* 100 */     repaint();
/* 101 */     revalidate();
/*     */   }
/*     */   
/*     */   public int getProgressSize() {
/* 105 */     return this.progressSize;
/*     */   }
/*     */   
/*     */   public void setProgressSize(int progressSize) {
/* 109 */     this.progressSize = progressSize;
/* 110 */     repaint();
/* 111 */     revalidate();
/*     */   }
/*     */   
/*     */   public int getProgressSpaceLabel() {
/* 115 */     return this.progressSpaceLabel;
/*     */   }
/*     */   
/*     */   public void setProgressSpaceLabel(int progressSpaceLabel) {
/* 119 */     this.progressSpaceLabel = progressSpaceLabel;
/* 120 */     repaint();
/* 121 */     revalidate();
/*     */   }
/*     */   
/*     */   public boolean isProgressFill() {
/* 125 */     return this.progressFill;
/*     */   }
/*     */   
/*     */   public void setProgressFill(boolean progressFill) {
/* 129 */     this.progressFill = progressFill;
/* 130 */     repaint();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 135 */   private float progress = -1.0F;
/*     */   private Font progressFont;
/* 137 */   private Color progressColor = new Color(63, 171, 222);
/* 138 */   private Color progressColorGradient = null;
/* 139 */   private Color progressColorSelected = Color.WHITE;
/* 140 */   private int progressLineSize = 3;
/* 141 */   private int progressSize = 35;
/* 142 */   private int progressSpaceLabel = 5;
/*     */   private boolean progressFill = false;
/*     */   
/*     */   public ProgressIndicator() {
/* 146 */     setOpaque(true);
/* 147 */     setBackground(new Color(250, 250, 250));
/* 148 */     setForeground(new Color(200, 200, 200));
/* 149 */     setBorder(new EmptyBorder(5, 20, 5, 20));
/* 150 */     Font lbFont = (new JLabel()).getFont();
/* 151 */     this.progressFont = lbFont.deriveFont(1, lbFont.getSize() + 5.0F);
/* 152 */     setLayout(new LayoutManager()
/*     */         {
/*     */           public void addLayoutComponent(String name, Component comp) {}
/*     */ 
/*     */ 
/*     */           
/*     */           public void removeLayoutComponent(Component comp) {}
/*     */ 
/*     */ 
/*     */           
/*     */           public Dimension preferredLayoutSize(Container parent) {
/* 163 */             return ProgressIndicator.this.getSize(parent);
/*     */           }
/*     */ 
/*     */           
/*     */           public Dimension minimumLayoutSize(Container parent) {
/* 168 */             return ProgressIndicator.this.getSize(parent);
/*     */           }
/*     */ 
/*     */           
/*     */           public void layoutContainer(Container parent) {}
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private Dimension getSize(Container parent) {
/* 178 */     if (this.model != null) {
/* 179 */       int width = (getInsets()).left + (getInsets()).left + (this.progressSize + 5) * this.model.getSize();
/* 180 */       int fontheight = getFontMetrics(getFont()).getHeight();
/* 181 */       int height = (getInsets()).top + (getInsets()).bottom + this.progressSize + this.progressSpaceLabel + fontheight;
/* 182 */       return new Dimension(width, height);
/*     */     } 
/* 184 */     return new Dimension(100, 100);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintComponent(Graphics g) {
/* 190 */     if (isOpaque()) {
/* 191 */       g.setColor(getBackground());
/* 192 */       g.fillRect(0, 0, getWidth(), getHeight());
/*     */     } 
/* 194 */     if (this.model != null && this.model.getSize() > 0) {
/* 195 */       BufferedImage img = new BufferedImage(getWidth(), getHeight(), 2);
/* 196 */       Graphics2D g2 = img.createGraphics();
/* 197 */       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/* 198 */       int x = (this.model.getSize() == 1) ? (getWidth() / 2 - this.progressSize / 2) : (getInsets()).left;
/* 199 */       int y = (getInsets()).top;
/* 200 */       int width = getWidth() - x * 2 - this.progressSize;
/* 201 */       int size = (this.model.getSize() == 1) ? width : (width / (this.model.getSize() - 1));
/* 202 */       int ly = (this.progressSize - this.progressLineSize) / 2 + y;
/* 203 */       int lx = x + this.progressSize / 2;
/* 204 */       Area line = new Area(new RoundRectangle2D.Double(lx, ly, width, this.progressLineSize, this.progressLineSize, this.progressLineSize));
/*     */       
/* 206 */       for (int i = 0; i < this.model.getSize(); i++) {
/* 207 */         boolean paint = (i > (int)this.progress);
/* 208 */         int sx = x + i * size;
/* 209 */         Shape box = new Ellipse2D.Double(sx, y, this.progressSize, this.progressSize);
/* 210 */         Area area = new Area(box);
/* 211 */         line.subtract(area);
/* 212 */         area.subtract(new Area(new Ellipse2D.Double((sx + this.progressLineSize), (y + this.progressLineSize), (this.progressSize - this.progressLineSize * 2), (this.progressSize - this.progressLineSize * 2))));
/* 213 */         g2.setComposite(AlphaComposite.SrcOver);
/* 214 */         g2.setColor(getForeground());
/* 215 */         if (paint) {
/* 216 */           g2.fill(area);
/*     */         }
/*     */         
/* 219 */         g2.setFont(this.progressFont);
/* 220 */         FontMetrics m = g2.getFontMetrics();
/* 221 */         String text = (new StringBuilder(String.valueOf(i + 1))).toString();
/* 222 */         Rectangle2D r2 = m.getStringBounds(text, g2);
/* 223 */         double fx = (this.progressSize - r2.getWidth()) / 2.0D;
/* 224 */         double fy = (this.progressSize - r2.getHeight()) / 2.0D;
/* 225 */         if (paint) {
/* 226 */           g2.drawString(text, (int)(sx + fx), (int)(y + fy + m.getAscent()));
/*     */         }
/*     */         
/* 229 */         g2.setFont(getFont());
/* 230 */         FontMetrics m2 = g2.getFontMetrics();
/* 231 */         g2.setColor(getForeground());
/* 232 */         String label = this.model.getElementAt(i).toString();
/* 233 */         r2 = m2.getStringBounds(label, g2);
/* 234 */         double lfx = (this.progressSize - r2.getWidth()) / 2.0D;
/* 235 */         double lfy = (y + this.progressSize + this.progressSpaceLabel);
/* 236 */         if (paint) {
/* 237 */           g2.drawString(label, (int)(sx + lfx), (int)(lfy + m2.getAscent()));
/*     */         }
/* 239 */         if (i <= (int)this.progress) {
/* 240 */           setColor(g2);
/* 241 */           g2.fill(this.progressFill ? box : area);
/* 242 */           g2.setFont(getFont());
/* 243 */           g2.drawString(label, (int)(sx + lfx), (int)(lfy + m2.getAscent()));
/* 244 */           if (this.progressFill) {
/* 245 */             g2.setColor(this.progressColorSelected);
/*     */           }
/* 247 */           g2.setFont(this.progressFont);
/* 248 */           g2.drawString(text, (int)(sx + fx), (int)(y + fy + m.getAscent()));
/*     */         }
/* 250 */         else if (i == Math.ceil(this.progress)) {
/* 251 */           float c = this.progress + 1.0F - i;
/* 252 */           if (c > 0.0F) {
/* 253 */             g2.setComposite(AlphaComposite.SrcOver.derive(c));
/* 254 */             setColor(g2);
/* 255 */             g2.fill(this.progressFill ? box : area);
/* 256 */             g2.setFont(getFont());
/* 257 */             g2.drawString(label, (int)(sx + lfx), (int)(lfy + m2.getAscent()));
/* 258 */             if (this.progressFill) {
/* 259 */               g2.setColor(this.progressColorSelected);
/*     */             }
/* 261 */             g2.setFont(this.progressFont);
/* 262 */             g2.drawString(text, (int)(sx + fx), (int)(y + fy + m.getAscent()));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 267 */       if (this.model.getSize() > 1) {
/* 268 */         g2.setComposite(AlphaComposite.SrcOver);
/* 269 */         float s = (this.model.getSize() - 1);
/* 270 */         float p = this.progress / s;
/* 271 */         g2.setColor(getForeground());
/* 272 */         g2.fill(line);
/* 273 */         setColor(g2);
/* 274 */         line.intersect(new Area(new Rectangle2D.Double(lx, ly, (width * p), this.progressLineSize)));
/* 275 */         g2.fill(line);
/*     */       } 
/* 277 */       g2.dispose();
/* 278 */       g.drawImage(img, 0, 0, null);
/*     */     } 
/* 280 */     super.paintComponent(g);
/*     */   }
/*     */   
/*     */   private void setColor(Graphics2D g2) {
/* 284 */     if (this.progressColorGradient == null) {
/* 285 */       g2.setColor(this.progressColor);
/*     */     } else {
/* 287 */       g2.setPaint(new GradientPaint(0.0F, 0.0F, this.progressColor, getWidth(), 0.0F, this.progressColorGradient));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void initSlider(PanelSlider slider) {
/* 292 */     this.panelSlider = slider;
/* 293 */     slider.addEventSliderAnimatorChanged((type, f) -> {
/*     */           if (type == PanelSlider.SliderType.RIGHT_TO_LEFT) {
/*     */             int index = (int)getProgress();
/*     */             setProgress(index + f);
/*     */           } else {
/*     */             float index = (float)Math.ceil(getProgress());
/*     */             setProgress(index - f);
/*     */           } 
/*     */         });
/* 302 */     slider.showSlid(slider.getSliderComponent()[getProgressIndex()], PanelSlider.SliderType.NONE);
/*     */   }
/*     */   
/*     */   public void previous() {
/* 306 */     if (this.panelSlider != null && 
/* 307 */       this.panelSlider.isSlidAble() && 
/* 308 */       getProgress() > 0.0F) {
/* 309 */       this.panelSlider.showSlid(this.panelSlider.getSliderComponent()[getProgressIndex() - 1], PanelSlider.SliderType.LEFT_TO_RIGHT);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void next() {
/* 316 */     if (this.panelSlider != null && 
/* 317 */       this.panelSlider.isSlidAble() && 
/* 318 */       getProgress() < (getModel().getSize() - 1))
/* 319 */       this.panelSlider.showSlid(this.panelSlider.getSliderComponent()[getProgressIndex() + 1], PanelSlider.SliderType.RIGHT_TO_LEFT); 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/ProgressIndicator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */