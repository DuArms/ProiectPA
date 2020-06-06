package com.company.Piesa;

import java.util.ArrayList;
import java.util.List;

public class Cal extends Piesa {

    static final int L = 2;
    static final int l = 1;

    public Cal(Point pozitiePeTabla, int color) {

        super(pozitiePeTabla, color);
        id = 4 * color;
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {

        List<Point> validMoves = new ArrayList<>();

        Point s = new Point(pozitiePeTabla.getX(), pozitiePeTabla.getY());
        for (int i = -1; i <= 1; i += 2) {
            Point p1 = new Point(pozitiePeTabla.getX() + i * L, pozitiePeTabla.getY() - l);
            Point p2 = new Point(pozitiePeTabla.getX() + i * L, pozitiePeTabla.getY() + l);
            move(tabla, validMoves, p1, p2);
            p1 = new Point(pozitiePeTabla.getX() - l, pozitiePeTabla.getY() + i * L);
            p2 = new Point(pozitiePeTabla.getX() + l, pozitiePeTabla.getY() + i * L);
            move(tabla, validMoves, p1, p2);
        }

//        System.out.println(validMoves);
//        tabla.print();
        return validMoves;
    }

    private void move(Tabla tabla, List<Point> validMoves, Point p1, Point p2) {
        if (onBoard(p1) && tabla.pozitionIsEmpty(p1)) {
            validMoves.add(p1);
            tabla.table[p1.getX()][p1.getY()] = 1;
        }
        if (onBoard(p2) && tabla.pozitionIsEmpty(p2)) {
            validMoves.add(p2);
            tabla.table[p2.getX()][p2.getY()] = 1;
        }
    }
}
