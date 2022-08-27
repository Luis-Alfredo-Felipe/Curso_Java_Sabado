package com.mycompany.curso_sabado;

import java.util.Scanner;

public class Lectura_Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese dos Numeros: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        System.out.println("Numeros Ingresado: " + n1);
        System.out.println("Numero Ingresado:" + n2);
    }
}
