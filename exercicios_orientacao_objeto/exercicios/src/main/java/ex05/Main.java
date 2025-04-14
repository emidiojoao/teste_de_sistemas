package ex05;

public class Main {
    public static void main(String[] args){

        Aeronave boeing747 = new Aeronave("Boeing 747", 416, 988, 216840.0, 180.0);
        Aeronave airbusA380 = new Aeronave("Airbus A380", 525, 1020, 320000.0, 265.0);
        Aeronave cessna172 = new Aeronave("Cessna 172", 4, 226, 212.0, 1.8);
        Aeronave embraerE195 = new Aeronave("Embraer E195", 124, 871, 26000.0, 45.0);

        System.out.println(boeing747);
        System.out.println(airbusA380);
        System.out.println(cessna172);
        System.out.println(embraerE195);

        Aeronave[] aeronaves = {boeing747, airbusA380, cessna172, embraerE195};

        //a) Qual das aeronaves pode ficar no ar por mais tempo?
        Aeronave aeronaveMaisTempoNoAr = null;
        double maiorTempo = 0;
        for (Aeronave aeronave : aeronaves){
            double tempoVoo = aeronave.calcularTempoMaximoVoo();
            if(tempoVoo > maiorTempo) {
                maiorTempo = tempoVoo;
                aeronaveMaisTempoNoAr = aeronave;
            }
        }
        System.out.println("\nAeronave com mais tempo no ar:");
        if(aeronaveMaisTempoNoAr != null){
            System.out.println(aeronaveMaisTempoNoAr.getModelo() + " | " + String.format("%.2f", maiorTempo /60) + " horas");
        }

        //b) Qual aeronave leva o maior número de passageiros?
        Aeronave aeronaveMaisPassageiros = null;
        int maiorNumeroPassageiros = 0;
        for(Aeronave aeronave : aeronaves){
            if(aeronave.getPassageiros() > maiorNumeroPassageiros){
                maiorNumeroPassageiros = aeronave.getPassageiros();
                aeronaveMaisPassageiros = aeronave;
            }
        }
        System.out.println("\nAeronave com maior número de passageiros:");
        if(aeronaveMaisPassageiros != null){
            System.out.println(aeronaveMaisPassageiros.getModelo() + " | " + maiorNumeroPassageiros + " passageiros");
        }

        //c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais
        //longe?

        Aeronave aeronaveMaiorDistancia = null;
        double maiorDistancia = 0;
        for(Aeronave aeronave : aeronaves){
            double distancia = aeronave.calcularDistanciaMaxima();
            if(distancia > maiorDistancia){
                maiorDistancia = distancia;
                aeronaveMaiorDistancia = aeronave;
            }
        }
        System.out.println("\nAeronave que voa mais longe em velocidade maxima:");
        if(aeronaveMaiorDistancia != null){
            System.out.println(aeronaveMaiorDistancia.getModelo() + " | " + String.format("%.2f", maiorDistancia) + " km");
        }




    }
}
