package ex07;

public class Carro {
    private int velocidadeAtual;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelarar(int incremento) throws IllegalArgumentException {
        if (incremento > 0 && incremento < 20) {
            setVelocidadeAtual(getVelocidadeAtual() + incremento);
        } else {
            throw new IllegalArgumentException("O valor para acelerar deve ser maior ou igual a zero e menor que 20.");
        }
    }

    public void reduzir(int decremento) throws IllegalArgumentException {
        if(decremento >= 0 && decremento < 30){
            int novaVelocidade = getVelocidadeAtual() - decremento;
            setVelocidadeAtual(Math.max(0, novaVelocidade));
        } else {
            throw new IllegalArgumentException("O valor para reduzir deve ser maior ou igual a zero e menor que 30.");
        }
    }
}
