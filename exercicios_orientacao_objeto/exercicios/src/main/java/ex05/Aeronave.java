package ex05;

public class Aeronave {

    private String modelo;
    private Integer passageiros;
    private Integer velocidadeMaxima;
    private Double capacidadeCombustivel;
    private Double combustivelPorMinuto;

    public Aeronave(String modelo, Integer passageiros, Integer velocidadeMaxima, Double capacidadeCombustivel, Double combustivelPorMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.combustivelPorMinuto = combustivelPorMinuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Integer passageiros) {
        this.passageiros = passageiros;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(Double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public Double getCombustivelPorMinuto() {
        return combustivelPorMinuto;
    }

    public void setCombustivelPorMinuto(Double combustivelPorMinuto) {
        this.combustivelPorMinuto = combustivelPorMinuto;
    }

    //Método para tempo maximo de voo
    public double calcularTempoMaximoVoo(){
        if(combustivelPorMinuto > 0){
            return capacidadeCombustivel / combustivelPorMinuto;
        }
        return 0;
    }

    //Método para calcular ditancia maxima de voo
    public double calcularDistanciaMaxima(){
        double tempoMaximoEmHoras = calcularTempoMaximoVoo() / 60.0;
        return velocidadeMaxima * tempoMaximoEmHoras;
    }

    @Override
    public String toString() {
        return "\n--Aeronave--" +
                "\nModelo: '" + modelo + '\'' +
                "\nPassageiros: " + passageiros +
                "\nVelocidade Maxima: " + velocidadeMaxima + " km/h" +
                "\nCapacidade de combustivel: " + capacidadeCombustivel + " litros" +
                "\nCombustivel por minuto: " + combustivelPorMinuto + "litros/min";
    }
}
