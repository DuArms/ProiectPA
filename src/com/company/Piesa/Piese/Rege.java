package com.company.Piesa.Piese;

import com.company.Piesa.Point;
import com.company.Piesa.Tabla;

import java.util.ArrayList;
import java.util.List;

public class Rege extends Piesa {
    public Rege(Point pozitiePeTabla, int color) {
        super(pozitiePeTabla, color);
        id = 9 * color;
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        List<Point> validMoves = new ArrayList<>();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                Point p = new Point(pozitiePeTabla.getX() + i, pozitiePeTabla.getY() + j);
                if (onBoard(p) && !(i == 0 && j == 0)) {
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
        return validMoves;
    }

}
