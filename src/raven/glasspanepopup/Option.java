package raven.glasspanepopup;

import java.awt.Color;
import java.awt.Component;
import net.miginfocom.layout.LayoutCallback;

public interface Option {
  LayoutCallback getLayoutCallBack(Component paramComponent);
  
  String getLayout(Component paramComponent, float paramFloat);
  
  boolean closeWhenClickOutside();
  
  boolean blockBackground();
  
  Color background();
  
  float opacity();
  
  int duration();
  
  float getAnimate();
  
  void setAnimate(float paramFloat);
}


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/glasspanepopup/Option.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */