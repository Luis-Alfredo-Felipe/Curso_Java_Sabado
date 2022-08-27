package com.mycompany.curso_sabado;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese Grados Centigrados: ");
        int grados = entrada.nextInt();

        int fahrenheit = 32 + (9 * grados / 5);

        System.out.println("Grados Fahrenheit: " + fahrenheit);

    }
}
