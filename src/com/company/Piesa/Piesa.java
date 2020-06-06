package com.company.Piesa;


import java.util.List;

public abstract class Piesa {

    protected Point pozitiePeTabla = null;
    protected int color ;

    public abstract List<Point> getValidMovmentPozition(Tabla tabla);

    public boolean onBoard(Point p) {
        if (p.getX() >= Tabla.max_SIZE || p.getY() >= Tabla.max_SIZE) {
            return false;
        }
        if (p.getX() < 0 || p.getY() < 0) {
            return false;
        }
        return true;
    }

   public Piesa(Point pozitiePeTabla, int color) {
      this.pozitiePeTabla = pozitiePeTabla;
      this.color = color;
   }

   @Override
    public String toString() {
        return "Piesa{" +
                "pozitiePeTabla=" + pozitiePeTabla +
                ", color=" + color +
                '}';
    }
}
