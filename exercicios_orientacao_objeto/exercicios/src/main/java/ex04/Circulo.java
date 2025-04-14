package ex04;

public class Circulo {
    private double raio;
    private double receitaTtotal;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(double raio){

        return Math.PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "\n-- CIRCULO --" +
                "\nRaio: " + raio +
                "\nÁrea: " + calcularArea(raio);
    }
}
