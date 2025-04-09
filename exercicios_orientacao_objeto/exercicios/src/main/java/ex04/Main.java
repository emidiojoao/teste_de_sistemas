package ex04;

public class Main {
    public static void main(String[] args){
        Circulo raio1 = new Circulo();
        Circulo raio2 = new Circulo();
        Circulo raio3 = new Circulo();
        Circulo raio4 = new Circulo();
        Circulo raio5 = new Circulo();

        raio1.setRaio(5.34);
        raio1.calcularArea(raio1.getRaio());

        raio2.setRaio(10.23);
        raio2.calcularArea(raio2.getRaio());

        raio3.setRaio(8.00);
        raio3.calcularArea(raio3.getRaio());

        raio4.setRaio(15.54);
        raio4.calcularArea(raio4.getRaio());

        raio5.setRaio(1.37);
        raio5.calcularArea(raio5.getRaio());

        System.out.println(raio1);
        System.out.println(raio2);
        System.out.println(raio3);
        System.out.println(raio4);
        System.out.println(raio5);
    }
}
