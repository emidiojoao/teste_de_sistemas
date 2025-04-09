package ex03;

public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int desconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
            return "\n --PRODUTO-- " +
                "\nNome: '" + nome + '\'' +
                "\nDescrição: '" + descricao + '\'' +
                "\nValor: R$ " + precoUnitario +
                "\nDesconto: " + desconto;
    }
}
