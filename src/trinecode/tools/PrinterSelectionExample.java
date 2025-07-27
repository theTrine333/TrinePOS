/*     */ package trinecode.tools;
/*     */ 
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.print.PrintService;
/*     */ import javax.print.PrintServiceLookup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.UIManager;
/*     */ import jpos.JposException;
/*     */ import jpos.POSPrinter;
/*     */ 
/*     */ public class PrinterSelectionExample extends JFrame {
/*     */   private JComboBox<String> printerComboBox;
/*     */   private JButton printButton;
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/*  26 */       UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
/*  27 */     } catch (Throwable e) {
/*  28 */       e.printStackTrace();
/*     */     } 
/*  30 */     EventQueue.invokeLater(new Runnable()
/*     */         {
/*     */           public void run() {
/*  33 */             PrinterSelectionExample example = new PrinterSelectionExample();
/*  34 */             example.setLocationRelativeTo(null);
/*  35 */             example.setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public PrinterSelectionExample() {
/*  41 */     setSize(new Dimension(450, 150));
/*  42 */     setType(Window.Type.POPUP);
/*  43 */     setTitle("Printer Selection");
/*  44 */     setDefaultCloseOperation(3);
/*     */     
/*  46 */     this.printerComboBox = new JComboBox<>();
/*  47 */     this.printerComboBox.setBounds(164, 0, 177, 25);
/*  48 */     this.printButton = new JButton("Print Test Message");
/*  49 */     this.printButton.setBounds(135, 32, 144, 26);
/*  50 */     getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  52 */     JLabel label = new JLabel("Select Printer:");
/*  53 */     label.setBounds(82, 4, 81, 16);
/*  54 */     getContentPane().add(label);
/*  55 */     getContentPane().add(this.printerComboBox);
/*  56 */     getContentPane().add(this.printButton);
/*     */     
/*  58 */     this.printButton.setEnabled(false);
/*     */ 
/*     */     
/*  61 */     populatePrinters();
/*     */ 
/*     */     
/*  64 */     this.printButton.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*  67 */             String selectedPrinter = (String)PrinterSelectionExample.this.printerComboBox.getSelectedItem();
/*  68 */             if (selectedPrinter != null) {
/*  69 */               PrinterSelectionExample.this.testPrinter(selectedPrinter);
/*     */             }
/*     */           }
/*     */         });
/*  73 */     setVisible(true);
/*     */   }
/*     */   
/*     */   private void populatePrinters() {
/*  77 */     PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null); byte b; int i;
/*     */     PrintService[] arrayOfPrintService1;
/*  79 */     for (i = (arrayOfPrintService1 = printServices).length, b = 0; b < i; ) { PrintService printService = arrayOfPrintService1[b];
/*  80 */       this.printerComboBox.addItem(printService.getName());
/*     */       b++; }
/*     */   
/*     */   }
/*     */   private void testPrinter(String printerName) {
/*     */     try {
/*  86 */       POSPrinter printer = new POSPrinter();
/*  87 */       printer.open(printerName);
/*     */       
/*  89 */       printer.claim(1000);
/*  90 */       printer.setDeviceEnabled(true);
/*     */       
/*  92 */       printer.printNormal(2, "Test Message\n");
/*     */       
/*  94 */       printer.setDeviceEnabled(false);
/*  95 */       printer.release();
/*     */       
/*  97 */       printer.close();
/*     */       
/*  99 */       JOptionPane.showMessageDialog(this, "Test message printed successfully.");
/* 100 */     } catch (JposException e) {
/* 101 */       JOptionPane.showMessageDialog(this, "Error occurred while testing printer.");
/* 102 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/PrinterSelectionExample.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */