package org.exercicios.ex02;

import java.util.Scanner;

//--Métodos sem parametros!
public class Amigos {

    public static void camila(){

        System.out.println("O nome da minha melhor amiga é Camila.");
        System.out.println("A camila tem 36 anos.");
        System.out.println("E ela é estudante do SENAI");
    }

    public static void davi(){

        System.out.println("O nome do meu melhor amigo é Davi");
        System.out.println("O davi tem 24 anos");
        System.out.println("E ele é estudante do SENAI");
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.print("Informe o nome: ");
        nome = entrada.nextLine();

        if(nome.equalsIgnoreCase("camila")){
            camila();
        }
        if(nome.equalsIgnoreCase("davi")){
            davi();
        }
    }
}
