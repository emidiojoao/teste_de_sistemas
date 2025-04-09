package ex01;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        //--Pessoa 01
        pessoa1.setNome("Camila");
        pessoa1.setSexo('F');
        pessoa1.setDataNascimento("13/12/1987");
        pessoa1.setEstadoCivil("Solteiro(a)");

        //--Pessoa 02
        pessoa2.setNome("João");
        pessoa2.setSexo('M');
        pessoa2.setDataNascimento("17/04/2002");
        pessoa2.setEstadoCivil("Solteiro(a)");

        System.out.println("-- Pessoa 01 -- ");
        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Sexo: "+pessoa1.getSexo());
        System.out.println("Data de Nascimento: "+pessoa1.getDataNascimento());
        System.out.println("Estado cívil: "+pessoa1.getEstadoCivil());

        System.out.println("\n-- Pessoa 02 --");
        System.out.println("Nome: "+pessoa2.getNome());
        System.out.println("Sexo: "+pessoa2.getSexo());
        System.out.println("Data de Nascimento: "+pessoa2.getDataNascimento());
        System.out.println("Estado cívil: "+pessoa2.getEstadoCivil());
    }
}
