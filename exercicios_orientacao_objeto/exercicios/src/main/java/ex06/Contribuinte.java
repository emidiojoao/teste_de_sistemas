package ex06;

public class Contribuinte {

    private String nome;
    private String cpf;
    private String uf;
    double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto(){
        if(rendaAnual <= 4000){
            return 0;
        } else if(rendaAnual <= 9000){
            return rendaAnual * 0.058;
        } else if(rendaAnual <= 25000){
            return rendaAnual * 0.15;
        } else if(rendaAnual <= 35000){
            return rendaAnual * 0.275;
        } else {
            return rendaAnual * 0.30;
        }
    }
    @Override
    public String toString() {
        return "\n-- Contribuinte --" +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nUF: " + uf +
                "\nRenda Anual: R$ " + String.format("%.2f", rendaAnual) +
                "\nImposto a Pagar: R$ " + String.format("%.2f", calcularImposto());
    }
}
