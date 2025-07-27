/*     */ package raven.glasspanepopup;
/*     */ 
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ 
/*     */ public class GlassPanePopup
/*     */ {
/*     */   private static GlassPanePopup instance;
/*     */   private JLayeredPane layerPane;
/*     */   
/*     */   protected JLayeredPane getLayerPane() {
/*  19 */     return this.layerPane;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private GlassPanePopup() {
/*  26 */     init();
/*     */   }
/*     */   
/*     */   private void init() {
/*  30 */     this.layerPane = new JLayeredPane();
/*  31 */     this.layerPane.setLayout(new CardLayout());
/*     */   }
/*     */   
/*     */   public void addAndShowPopup(Component component, Option option, String name) {
/*  35 */     Popup popup = new Popup(this, component, option);
/*  36 */     if (name != null) {
/*  37 */       popup.setName(name);
/*     */     }
/*  39 */     this.layerPane.add(popup, 0);
/*  40 */     popup.setVisible(true);
/*  41 */     popup.setShowPopup(true);
/*  42 */     if (!this.layerPane.isVisible()) {
/*  43 */       this.layerPane.setVisible(true);
/*     */     }
/*  45 */     this.layerPane.grabFocus(); } private void updateLayout() {
/*     */     byte b;
/*     */     int i;
/*     */     Component[] arrayOfComponent;
/*  49 */     for (i = (arrayOfComponent = this.layerPane.getComponents()).length, b = 0; b < i; ) { Component com = arrayOfComponent[b];
/*  50 */       com.revalidate();
/*     */       b++; }
/*     */   
/*     */   }
/*     */   public static void install(JFrame fram) {
/*  55 */     instance = new GlassPanePopup();
/*  56 */     fram.setGlassPane(instance.layerPane);
/*  57 */     fram.addWindowStateListener(new WindowAdapter()
/*     */         {
/*     */           public void windowStateChanged(WindowEvent e) {
/*  60 */             SwingUtilities.invokeLater(new Runnable()
/*     */                 {
/*     */                   public void run() {
/*  63 */                     GlassPanePopup.instance.updateLayout();
/*     */                   }
/*     */                 });
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static void showPopup(Component component, Option option, String name) {
/*  71 */     if ((component.getMouseListeners()).length == 0)
/*  72 */       component.addMouseListener(new MouseAdapter() {
/*     */           
/*     */           }); 
/*  75 */     instance.addAndShowPopup(component, option, name);
/*     */   }
/*     */   
/*     */   public static void showPopup(Component component, Option option) {
/*  79 */     showPopup(component, option, null);
/*     */   }
/*     */   
/*     */   public static void showPopup(Component component, String name) {
/*  83 */     showPopup(component, new DefaultOption(), name);
/*     */   }
/*     */   
/*     */   public static void showPopup(Component component) {
/*  87 */     showPopup(component, new DefaultOption(), null);
/*     */   }
/*     */   
/*     */   public static void closePopup(int index) {
/*  91 */     index = instance.getLayerPane().getComponentCount() - 1 - index;
/*  92 */     if (index >= 0 && index < instance.getLayerPane().getComponentCount() && 
/*  93 */       instance.getLayerPane().getComponent(index) instanceof Popup) {
/*  94 */       Popup popup = (Popup)instance.getLayerPane().getComponent(index);
/*  95 */       popup.setShowPopup(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void closePopupLast() {
/* 101 */     closePopup(getPopupCount() - 1); }
/*     */   public static void closePopup(String name) { byte b;
/*     */     int i;
/*     */     Component[] arrayOfComponent;
/* 105 */     for (i = (arrayOfComponent = instance.layerPane.getComponents()).length, b = 0; b < i; ) { Component com = arrayOfComponent[b];
/* 106 */       if (com.getName() != null && com.getName().equals(name) && 
/* 107 */         com instanceof Popup) {
/* 108 */         Popup popup = (Popup)com;
/* 109 */         popup.setShowPopup(false);
/*     */       } 
/*     */       b++; }
/*     */      } public static void closePopupAll() {
/*     */     byte b;
/*     */     int i;
/*     */     Component[] arrayOfComponent;
/* 116 */     for (i = (arrayOfComponent = instance.layerPane.getComponents()).length, b = 0; b < i; ) { Component com = arrayOfComponent[b];
/* 117 */       if (com instanceof Popup) {
/* 118 */         Popup popup = (Popup)com;
/* 119 */         popup.setShowPopup(false);
/*     */       } 
/*     */       b++; }
/*     */   
/*     */   }
/*     */   public static int getPopupCount() {
/* 125 */     return instance.layerPane.getComponentCount();
/*     */   }
/*     */   
/*     */   protected synchronized void removePopup(Component popup) {
/* 129 */     this.layerPane.remove(popup);
/* 130 */     if (this.layerPane.getComponentCount() == 0)
/* 131 */       this.layerPane.setVisible(false); 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/glasspanepopup/GlassPanePopup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */