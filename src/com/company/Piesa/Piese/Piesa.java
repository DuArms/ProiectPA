package com.company.Piesa.Piese;


import com.company.Piesa.Point;
import com.company.Piesa.Tabla;

import java.util.List;

public abstract class Piesa {

    protected Point pozitiePeTabla = null;
    protected int color ;
    protected int id;

    public Point getPozitiePeTabla() {
        return pozitiePeTabla;
    }

    public void setPozitiePeTabla(Point pozitiePeTabla) {
        this.pozitiePeTabla = pozitiePeTabla;
    }

    public int getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

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
