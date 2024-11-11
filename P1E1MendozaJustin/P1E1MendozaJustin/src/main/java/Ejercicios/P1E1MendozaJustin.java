package Ejercicios;

import java.util.Scanner;

public class P1E1MendozaJustin {
    Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        CirculoMendoza circuloMendozaEstatico = new CirculoMendoza((float) 23.2);
        CirculoMendoza circuloMendozaDinamico = new CirculoMendoza((float) 0);
        TrianguloMendoza trianguloMendozaEstatico = new TrianguloMendoza((float) 10.2, (float) 5.3);
        TrianguloMendoza trianguloMendozaDinamico = new TrianguloMendoza((float) 0, (float) 0);
        RectanguloMendoza rectanguloMendozaEstatico = new RectanguloMendoza((float) 2.6, (float) 3);
        RectanguloMendoza rectanguloMendozaDinamico = new RectanguloMendoza((float) 0, (float) 0);
        System.out.println("DATOS ESTATICOS");
        circuloMendozaEstatico.datosMendoza();
        trianguloMendozaEstatico.datosMendoza();
        rectanguloMendozaEstatico.datosMendoza();
        System.out.println("DATOS DINAMICOS \n\n");
        circuloMendozaDinamico.insertarDatosMendoza();
        trianguloMendozaDinamico.insertarDatosMendoza();
        rectanguloMendozaDinamico.insertarDatosMendoza();
        circuloMendozaDinamico.datosMendoza();
        trianguloMendozaDinamico.datosMendoza();
        rectanguloMendozaDinamico.datosMendoza();
    }
}
