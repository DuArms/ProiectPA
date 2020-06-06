package com.company.Piesa;

import java.util.ArrayList;
import java.util.List;

public class Pion extends Piesa {

    public Pion(Point pozitiePeTabla, int color) {
        super(pozitiePeTabla, color);
        id = color;
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        List<Point> validMoves = new ArrayList<>();

        pozitiePeTabla = new Point(4, 4);
        tabla.table[pozitiePeTabla.getX()][pozitiePeTabla.getY()] = 4;
        Point p = new Point(pozitiePeTabla.getX() + color, pozitiePeTabla.getY());
        if (onBoard(p) && tabla.pozitionIsEmpty(p)) {
            validMoves.add(p);
        }

        tabla.print();
        return validMoves;
    }
}
