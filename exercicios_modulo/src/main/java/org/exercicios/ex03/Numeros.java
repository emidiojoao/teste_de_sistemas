package org.exercicios.ex03;

import java.util.Scanner;

public class Numeros {

    //--Método com parametro e sem retorno;
    public static void imprimirNumeros(int numero){

        for(int i=0; i<=19; i++){
            System.out.println(numero += 1);
        }
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int opcao = entrada.nextInt();

        imprimirNumeros(opcao);
    }
}
