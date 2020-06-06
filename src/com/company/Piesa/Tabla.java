package com.company.Piesa;

import com.company.Piesa.Point;

public class Tabla {
    public  static int  max_SIZE = 8;
    public int[][] table;


    public Tabla() {
        this.table = new int[max_SIZE][max_SIZE];
    }

    public boolean  pozitionIsEmpty(Point p){
        return table[p.getX()][p.getY()] == 0;
    }

    public void  print (){
        for (int i = 0; i < Tabla.max_SIZE; i++) {
            for (int j = 0; j < Tabla.max_SIZE; j++) {
                System.out.print(this.table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
