package ex03;

public class Main {
    public static void main(String[] args){
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        //--Produto 01
        produto1.setNome("Caderno");
        produto1.setDescricao("Caderno em espiral tamanho médio");
        produto1.setPrecoUnitario(4.50);
        produto1.setDesconto(15);
        System.out.println(produto1);

        //--Produto 02
        produto2.setNome("Caneta ESF");
        produto2.setDescricao("Caneta esferográfica 5mm");
        produto2.setPrecoUnitario(2.35);
        produto2.setDesconto(10);
        System.out.println(produto2);

        //--Produto 03
        produto3.setNome("Esquadro");
        produto3.setDescricao("Esquadro de acrílico 20 cm");
        produto3.setPrecoUnitario(2.35);
        produto3.setDesconto(10);
        System.out.println(produto3);
    }
}
