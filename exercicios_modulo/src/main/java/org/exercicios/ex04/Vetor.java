package org.exercicios.ex04;

public class Vetor {

    //--Método com parametro e sem retorno;
    public static void maiorNumero(int[] vetor){

        int maior = vetor[0];
        for(int elemento : vetor){
            if(elemento > maior){
                maior = elemento;
            }
        }

        System.out.println("O maior valor é: " + maior);
    }

    //--Método com parametro e sem retorno;
    public static void menorNumero(int[] vetor){

        int menor = vetor[0];
        for(int elemento : vetor){
            if(elemento < menor){
                menor = elemento;
            }
        }

        System.out.println("O menor valor é: " + menor);
    }

    public static void mediaValores(int[] vetor){

        double soma = 0;
        double media;
        for (int elemento : vetor){
            soma += elemento;
        }
        media = soma / vetor.length;

        System.out.println("A média dos valores é: " + media);
    }

    public static void main(String[] args){
        int[] vetor = {10, 5, 20, 15, 25};

        maiorNumero(vetor);
        menorNumero(vetor);
        mediaValores(vetor);
    }


}
