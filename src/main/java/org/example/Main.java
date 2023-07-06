package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc =  new Scanner(System.in);

        double a, b, c, pi, areaDoTrianguloRetangulo, areaDoCirculo,
                areaDoTrapezio, areaDoQuadrado, areaDoRetangulo;

        pi = 3.14159;

        a = sc.nextDouble();

        b = sc.nextDouble();

        c = sc.nextDouble();

        areaDoTrianguloRetangulo =  (a * c) / 2;

        areaDoCirculo =  pi * (Math.pow(c,2));

        areaDoTrapezio = ((a + b) * c )  / 2;

        areaDoQuadrado = Math.pow(b,2);

        areaDoRetangulo =  a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaDoTrianguloRetangulo);

        System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);

        System.out.printf("TRAPEZIO: %.3f%n", areaDoTrapezio);

        System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);

        System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);

        sc.close();
    }
}