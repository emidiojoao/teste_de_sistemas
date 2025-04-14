package ex08;

public class Main {
    public static void main(String[] args){
        OnibusEscolar bus1 = new OnibusEscolar(35,1);
        System.out.println("Alunos: " + bus1.getQuantidadeEstudantes());

        bus1.setAlunos(50);
        System.out.println("Tentando colocar 50 alunos: " + bus1.getQuantidadeEstudantes());

        bus1.setProfessores(0);
        System.out.println("Professores removidos. Alunos: " + bus1.getQuantidadeEstudantes());

        bus1.setProfessores(1);
        bus1.setAlunos(30);
        bus1.removerAlunos(10);
        System.out.println("Adicionando 30 alunos e removendo 10: " + bus1.getQuantidadeEstudantes());
    }
}
