package com.company.Piesa;

import java.util.ArrayList;
import java.util.List;

public class Rege extends Piesa {


    public Rege(Point pozitiePeTabla, int color) {
        super(pozitiePeTabla, color);
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {

        List<Point> validMoves = new ArrayList<>();
        for (int i = -1; i <= 1; i ++ ) {
            for (int j = -1; j <= 1; j++) {
                Point p = new Point(pozitiePeTabla.getX() + i, pozitiePeTabla.getY() + j);
                if (onBoard(p) && tabla.pozitionIsEmpty(p)  &&  !( i == 0 && j == 0 )  ) {
                    validMoves.add(p);
                }
            }
        }

        System.out.println(validMoves.size());
        for (var p : validMoves) {
            tabla.table[p.getX()][p.getY()] += 1;
        }
        tabla.print();
        return validMoves;
    }
}