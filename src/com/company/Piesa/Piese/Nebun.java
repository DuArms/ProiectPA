package com.company.Piesa.Piese;

import com.company.Piesa.Point;
import com.company.Piesa.Tabla;

import java.util.ArrayList;
import java.util.List;

public class Nebun extends Piesa {

    public Nebun(Point pozitiePeTabla, int color) {
        super(pozitiePeTabla, color);
        id = 5 * color;
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        List<Point> validMoves = new ArrayList<>();
        mutareNebun(tabla, validMoves);
        return validMoves;
    }

    private void mutareNebun(Tabla tabla, List<Point> validMoves) {
        boolean allIsGood = true;
        for (int i = 1; i < Tabla.max_SIZE - pozitiePeTabla.getX() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() + i, pozitiePeTabla.getY() + i);
            allIsGood = corpFor(tabla, p, validMoves);
        }
        // stanga jos
        allIsGood = true;
        for (int i = 1; i < Tabla.max_SIZE - pozitiePeTabla.getX() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() + i, pozitiePeTabla.getY() - i);
            allIsGood = corpFor(tabla, p, validMoves);
        }
        allIsGood = true;
        for (int i = 1; i <= pozitiePeTabla.getY() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() - i, pozitiePeTabla.getY() - i);
            allIsGood = corpFor(tabla, p, validMoves);
        }
        allIsGood = true;
        for (int i = 1; i < Tabla.max_SIZE - pozitiePeTabla.getY() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() - i, pozitiePeTabla.getY() + i);
            allIsGood = corpFor(tabla, p, validMoves);
        }
    }

    public boolean corpFor(Tabla tabla, Point p, List<Point> validMoves) {
        if (onBoard(p))
            if (tabla.pozitionIsEmpty(p)) {
                validMoves.add(p);
                return true;
            } else {
                if (tabla.table[p.getX()][p.getY()].getColor() != getColor()){
                    validMoves.add(p);
                    return false;
                }
            }
        return false;
    }
}
