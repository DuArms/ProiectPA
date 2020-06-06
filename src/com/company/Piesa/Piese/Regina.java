package com.company.Piesa.Piese;

import com.company.Piesa.Point;
import com.company.Piesa.Tabla;
import com.company.Piesa.Tura;

import java.util.ArrayList;
import java.util.List;

public class Regina extends Piesa {

    public Regina(Point pozitiePeTabla, int color) {
        super(pozitiePeTabla, color);
        id = 8 * color;
    }

    @Override
    public List<Point> getValidMovmentPozition(Tabla tabla) {
        List<Point> validMoves = new ArrayList<>();

        Nebun nebun = new Nebun(pozitiePeTabla,color);
        Tura tura = new Tura(pozitiePeTabla,color);

        validMoves.addAll(nebun.getValidMovmentPozition(tabla));
        validMoves.addAll(tura.getValidMovmentPozition(tabla));

        return validMoves;
    }
}
