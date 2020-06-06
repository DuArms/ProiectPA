package com.company.Piesa;

import com.company.Piesa.Piese.Piesa;

import java.util.ArrayList;
import java.util.List;

public class Tura extends Piesa {
    public Tura(Point pozitiePeTabla, int color) {
        super(pozitiePeTabla, color);
        id = 7 * color;
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        List<Point> validMoves = new ArrayList<>();
        Point s = new Point(pozitiePeTabla.getX(), pozitiePeTabla.getY());

        forCrescator(tabla, true, pozitiePeTabla.getY() + 1, Tabla.max_SIZE, validMoves);// ->
        forCrescator(tabla, false, pozitiePeTabla.getX() + 1, Tabla.max_SIZE, validMoves); //<-
        forDescrescator(tabla, true, pozitiePeTabla.getY() - 1, -1, validMoves); // ^
        forDescrescator(tabla, false, pozitiePeTabla.getX() - 1, -1, validMoves); // v

        return validMoves;
    }

    public void forCrescator(Tabla tabla, boolean setY, int start, int stop, List<Point> validMoves) {
        for (int i = start; i < stop; i++) {
            Point p = new Point(pozitiePeTabla.getX(), pozitiePeTabla.getY());
            if (setY) {
                p.setY(i);
            } else {
                p.setX(i);
            }
            if (corpFor(tabla, p, i, setY, validMoves)) {
                break;
            }
        }
    }

    public void forDescrescator(Tabla tabla, boolean setY, int start, int stop, List<Point> validMoves) {
        for (int i = start; i > stop; i--) {
            Point p = new Point(pozitiePeTabla.getX(), pozitiePeTabla.getY());
            if (setY) {
                p.setY(i);
            } else {
                p.setX(i);
            }
            if (corpFor(tabla, p, i, setY, validMoves)) {
                break;
            }
        }
    }

    public boolean corpFor(Tabla tabla, Point p, int i, boolean setY, List<Point> validMoves) {

        if (!onBoard(p)) {
            return false;
        }
        if (!tabla.pozitionIsEmpty(p)) {
            if (tabla.table[p.getX()][p.getY()].getColor() != getColor()) {
                validMoves.add(p);
            }
            return true;
        }
        validMoves.add(p);
        return false;
    }
}






