package com.company.Piesa;

import java.util.List;

public class Cal extends Piesa {
    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        pozitiePeTabla = new Point(4,4);
        tabla.table[pozitiePeTabla.getX()][pozitiePeTabla.getY()] = 7;




        tabla.print();
        return null;
    }
}
