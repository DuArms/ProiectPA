package com.company;

import com.company.Piesa.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //new Tura().getValidMovmentPozition(new Tabla());
        //new Nebun().getValidMovmentPozition(new Tabla());
        //new Cal().getValidMovmentPozition(new Tabla());
        //new Regina().getValidMovmentPozition(new Tabla());
      //  new Rege(new Point(4, 4), 1).getValidMovmentPozition(new Tabla());

      Tabla t =  new Tabla();

      t.initGame();

      t.movePiesa(2,5);
    }


}
