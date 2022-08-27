package com.mycompany.curso_sabado;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, longitud, area;
        System.out.println("Ingrese radio de circunferencia: ");
        radio = entrada.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La circunferencia es: " + longitud);
        System.out.println("El Área es: " + area);

    }

}
