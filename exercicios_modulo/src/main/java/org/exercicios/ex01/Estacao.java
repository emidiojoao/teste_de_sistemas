package org.exercicios.ex01;

import java.util.Scanner;

//--Métodos sem parametros!
public class Estacao {

    public static void verao(){
        System.out.println("É verão!\nE está quente");
    }

    public static void inverno(){
        System.out.println("É inverno!\nE está frio");
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.print("Insira o número [1] ou [2]: ");
        opcao = entrada.nextInt();

        if(opcao == 1){
            verao();
        }
        else if(opcao == 2){
            inverno();
        } else {
            System.out.println("opção invalida!");
        }
    }
}
