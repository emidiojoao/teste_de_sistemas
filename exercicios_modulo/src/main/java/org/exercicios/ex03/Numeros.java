package org.exercicios.ex03;

import java.util.Scanner;

//--Método com parametro
public class Numeros {

    public static int somarNumero(int numero){

        for(int i=0; i<=19; i++){

            System.out.println(numero += 1);
        }

        return numero;
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int opcao = entrada.nextInt();

        somarNumero(opcao);
    }
}
