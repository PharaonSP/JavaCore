package javase02.t01;

import java.awt.*;

/**
 * Разработайте спецификацию и создайте класс Ручка (Pen).
 * Определите в этом классе методы equals(), hashCode() и toString().
 */
public class Pen {
    private Color penColor;
    private int penRange = 100;

    public Pen(){
        penColor = Color.black;
    }

    public Pen(Color penColor){
            this.penColor = penColor;
    }

    public boolean write(){
      if (penRange>0){
          penRange--;
          return true;
      }else return false;
    }

    public Color getPenColor() {
        return penColor;
    }

    public int getPenRange() {
        return penRange;
    }

    @Override
    public int hashCode() {
        return penRange + penColor.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (getClass() != obj.getClass()) return false;
        Pen pen = (Pen) obj;
        if (hashCode() == pen.hashCode()) return true;
        return penColor == pen.getPenColor() && penRange == pen.getPenRange();
    }

    @Override
    public String toString() {
        return "Pen color is " + penColor + " and current range is " + penRange;
    }
}
