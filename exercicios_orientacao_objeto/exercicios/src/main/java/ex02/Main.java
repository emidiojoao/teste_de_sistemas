package ex02;

public class Main {
    public static void main(String[] args){
        Mercado unidadeDeBlumenau = new Mercado();
        Mercado unidadeDeJoinville = new Mercado();
        Mercado unidadeDeFlorianopolis = new Mercado();

        //--Blumenau
        unidadeDeBlumenau.setNome("Giassi");
        unidadeDeBlumenau.setMacasVendidas(1000);
        unidadeDeBlumenau.setPrecoMaca(5.99);
        unidadeDeBlumenau.setLaranjaVendidas(1000);
        unidadeDeBlumenau.setPrecoLaranja(7.99);
        System.out.println(unidadeDeBlumenau);

        //Joinville
        unidadeDeJoinville.setNome("Komprão");
        unidadeDeJoinville.setMacasVendidas(500);
        unidadeDeJoinville.setPrecoMaca(4.99);
        unidadeDeJoinville.setLaranjaVendidas(510);
        unidadeDeJoinville.setPrecoLaranja(6.99);
        System.out.println(unidadeDeJoinville);

        //Florianopolis
        unidadeDeFlorianopolis.setNome("Zézinho");
        unidadeDeFlorianopolis.setMacasVendidas(10000);
        unidadeDeFlorianopolis.setPrecoMaca(3.99);
        unidadeDeFlorianopolis.setLaranjaVendidas(9948);
        unidadeDeFlorianopolis.setPrecoLaranja(5.99);
        System.out.println(unidadeDeFlorianopolis);


    }
}
