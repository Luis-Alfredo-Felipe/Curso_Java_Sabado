
package com.mycompany.curso_sabado;

import java.util.Scanner;


public class Lectura_Nombre {
    public static void main(String[] args){
                Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su Nombre: ");
        String texto = entrada.nextLine();


        System.out.println("Buenos dias: " + texto);
    }
}
