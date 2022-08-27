package com.mycompany.curso_sabado;

import java.util.Scanner;

public class Numero_Double_Triple {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total;
        System.out.println("Ingrese Numero: ");
        int n1 = entrada.nextInt();
        total = (n1 * 2);
        System.out.println("Numero : " + n1);
        System.out.println("Doble: " + total);
        System.out.println("Triple: " + n1 * 3);
    }
}
