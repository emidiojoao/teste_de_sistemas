package ex08;

public class OnibusEscolar {
    private int quantidadeEstudantes;
    private int quantidadeProfessores;

    public OnibusEscolar(int quantidadeEstudantes, int quantidadeProfessores) {
        setProfessores(quantidadeProfessores);
        setAlunos(quantidadeEstudantes);
    }

    public void setAlunos(int quantidade){
        if(quantidadeProfessores == 0){
            this.quantidadeEstudantes = 0;
        } else {
            this.quantidadeEstudantes = Math.min(quantidade, 40);
        }
    }

    public void setProfessores(int quantidade){
        this.quantidadeProfessores = quantidade;
        if(quantidade == 0) {
            this.quantidadeEstudantes = 0;
        }
    }

    public void removerAlunos(int quantidade){
        if (quantidade <= 0) return;

        this.quantidadeEstudantes = Math.max(0, this.quantidadeEstudantes - quantidade);
    }

    public int getQuantidadeEstudantes() {
        return quantidadeEstudantes;
    }

    public int getQuantidadeProfessores() {
        return quantidadeProfessores;
    }
}
