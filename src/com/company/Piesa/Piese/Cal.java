package com.company.Piesa.Piese;

import com.company.Piesa.Point;
import com.company.Piesa.Tabla;

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
        return validMoves;
    }

    private void move(Tabla tabla, List<Point> validMoves, Point p1, Point p2) {
        mutareCal(tabla, validMoves, p1);
        mutareCal(tabla, validMoves, p2);
    }

    private void mutareCal(Tabla tabla, List<Point> validMoves, Point p1) {
        if (onBoard(p1)) {
            if (tabla.pozitionIsEmpty(p1)) {
                validMoves.add(p1);
            } else {
                if (tabla.table[p1.getX()][p1.getY()].getColor() != getColor()) {
                    validMoves.add(p1);
                }
            }
        }
    }
}
