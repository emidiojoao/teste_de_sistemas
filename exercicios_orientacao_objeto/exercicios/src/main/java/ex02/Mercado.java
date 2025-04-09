package ex02;

public class Mercado {
    private String nome;
    private int macasVendidas;
    private double precoMaca;
    private int laranjaVendidas;
    private double precoLaranja;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMacasVendidas() {
        return macasVendidas;
    }

    public void setMacasVendidas(int macasVendidas) {
        this.macasVendidas = macasVendidas;
    }

    public double getPrecoMaca() {
        return precoMaca;
    }

    public void setPrecoMaca(double precoMaca) {
        this.precoMaca = precoMaca;
    }

    public int getLaranjaVendidas() {
        return laranjaVendidas;
    }

    public void setLaranjaVendidas(int laranjaVendidas) {
        this.laranjaVendidas = laranjaVendidas;
    }

    public double getPrecoLaranja() {
        return precoLaranja;
    }

    public void setPrecoLaranja(double precoLaranja) {
        this.precoLaranja = precoLaranja;
    }

    public double receitaMaca(double macasVendidas, double precoMaca){
        return macasVendidas * precoMaca;
    }

    public double receitaLaranja(double laranjaVendidas, double precoLaranja){
        return laranjaVendidas * precoLaranja;
    }


    @Override
    public String toString() {
        return "\n-- Mercado --" +
                "\nNome: '" + nome + '\'' +
                "\nMaçãs vendidas: " + macasVendidas +
                "\nPreço maçã: R$ " + precoMaca +
                "\nLaranja vendidas: " + laranjaVendidas +
                "\nPreço laranja: R$ " + precoLaranja +
                "\nReceita Maçã: R$ " + receitaMaca(macasVendidas, precoMaca) +
                "\nReceita Laranja: R$ " + receitaLaranja(laranjaVendidas, precoLaranja);
    }
}
