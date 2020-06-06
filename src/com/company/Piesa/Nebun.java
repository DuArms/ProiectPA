package com.company.Piesa;

import java.util.ArrayList;
import java.util.List;

public class Nebun extends Piesa {
    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        pozitiePeTabla = new Point(4, 3);
        tabla.table[pozitiePeTabla.getX()][pozitiePeTabla.getY()] = 7;
        List<Point> validMoves = new ArrayList<>();

        tabla.table[2][1] = 2;
        boolean allIsGood = true;
        for (int i = 1; i < Tabla.max_SIZE - pozitiePeTabla.getX() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() + i, pozitiePeTabla.getY() + i);
            allIsGood = copFor(tabla, p, validMoves);
        }
        // / stanga jos
        allIsGood = true;
        for (int i = 1; i < Tabla.max_SIZE - pozitiePeTabla.getX() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() + i, pozitiePeTabla.getY() - i);
            allIsGood = copFor(tabla, p, validMoves);
        }
        allIsGood = true;
        for (int i = 1; i <= pozitiePeTabla.getY() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() - i, pozitiePeTabla.getY() - i);
            allIsGood = copFor(tabla, p, validMoves);
        }
        allIsGood = true;
        for (int i = 1; i < Tabla.max_SIZE - pozitiePeTabla.getY() && allIsGood; i++) {
            Point p = new Point(pozitiePeTabla.getX() - i, pozitiePeTabla.getY() + i);
            allIsGood = copFor(tabla, p, validMoves);
        }

        System.out.println(validMoves);
        tabla.print();
        return validMoves;
    }

    public boolean copFor(Tabla tabla, Point p, List<Point> validMoves) {
        if (onBoard(p) && tabla.pozitionIsEmpty(p)) {
            tabla.table[p.getX()][p.getY()] = 1;
            validMoves.add(p);
            return true;
        }
        return false;
    }
}
