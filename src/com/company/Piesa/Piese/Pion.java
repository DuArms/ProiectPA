package com.company.Piesa.Piese;

import com.company.Piesa.Point;
import com.company.Piesa.Tabla;

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

        Point p = new Point(pozitiePeTabla.getX() + -1 * color, pozitiePeTabla.getY());
        Point a1 = new Point(pozitiePeTabla.getX() + -1 * color, pozitiePeTabla.getY() + 1);
        Point a2 = new Point(pozitiePeTabla.getX() + -1 * color, pozitiePeTabla.getY() - 1);
        if (onBoard(p)) {
            if (tabla.pozitionIsEmpty(p)) {
                validMoves.add(p);
            }
        }
        pionMove(tabla, validMoves, a1);
        pionMove(tabla, validMoves, a2);
        return validMoves;
    }

    private void pionMove(Tabla tabla, List<Point> validMoves, Point p) {
        if (onBoard(p)) {
            if (tabla.pozitionIsEmpty(p)) {
                validMoves.add(p);
            } else {
                if (tabla.table[p.getX()][p.getY()].getColor() != getColor()) {
                    validMoves.add(p);
                }
            }
        }

    }
}