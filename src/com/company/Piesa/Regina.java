package com.company.Piesa;

import java.util.ArrayList;
import java.util.List;

public class Regina extends Piesa {


    public Regina(Point pozitiePeTabla, int color) {
        super(pozitiePeTabla, color);
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        List<Point> validMoves = new ArrayList<>();

        pozitiePeTabla = new Point(3, 3);
        Nebun nebun = new Nebun(pozitiePeTabla,color);
        Tura tura = new Tura(pozitiePeTabla,color);

        validMoves.addAll(nebun.getValidMovmentPozition(tabla));
        validMoves.addAll(tura.getValidMovmentPozition(tabla));

        System.out.println(validMoves);
        tabla.print();

        return validMoves;
    }
}
