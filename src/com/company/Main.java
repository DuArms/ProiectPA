package com.company;

import com.company.Piesa.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//new Tura().getValidMovmentPozition(new Tabla());
	//new Nebun().getValidMovmentPozition(new Tabla());
   // new Cal().getValidMovmentPozition(new Tabla());
    //    new Regina().getValidMovmentPozition(new Tabla());
        new Pion(new Point(0,0),1).getValidMovmentPozition(new Tabla());
    }


}
