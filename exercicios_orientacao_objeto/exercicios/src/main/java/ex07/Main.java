package ex07;

public class Main {
    public static void main(String[] args){
        Carro meuCarro = new Carro();
        System.out.println("Velocidade inicial: " + meuCarro.getVelocidadeAtual());

        try {
            meuCarro.acelarar(10);
            System.out.println("Velocidade após acelerar: " + meuCarro.getVelocidadeAtual());

            meuCarro.acelarar(25);
        } catch (IllegalArgumentException e){
            System.err.println("Erro ao acelerar | " + e.getMessage());
        }

        try {
            meuCarro.reduzir(5);
            System.out.println("Velocidade após reduzir: " + meuCarro.getVelocidadeAtual());

            meuCarro.reduzir(35);
        } catch (IllegalArgumentException e){
            System.err.println("Erro ao reduzir | " + e.getMessage());
        }
    }
}
