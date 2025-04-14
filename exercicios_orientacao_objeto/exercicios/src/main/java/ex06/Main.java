package ex06;

public class Main {
    public static void main(String[] args){
        Contribuinte[] contribuintes = new Contribuinte[5];

        contribuintes[0] = new Contribuinte("João", "123.314.435-05", "SC", 40000.00);
        contribuintes[1] = new Contribuinte("Camila", "204.414.414-31", "PR", 8500.00);
        contribuintes[2] = new Contribuinte("Davi", "249-432-411-49", "RJ", 28000.00);
        contribuintes[3] = new Contribuinte("Marcos", "392.851.382-32", "MG", 15000.00);
        contribuintes[4] = new Contribuinte("Sara", "295.912.388-13", "SP", 3800.00);

        System.out.println(contribuintes[0]);
        System.out.println(contribuintes[1]);
        System.out.println(contribuintes[2]);
        System.out.println(contribuintes[3]);
        System.out.println(contribuintes[4]);

        //a) Quem paga mais impostos
        Contribuinte maiorPagador = null;
        double maiorImposto = 0;
        for (Contribuinte contribuinte : contribuintes){
            double imposto = contribuinte.calcularImposto();
            if(imposto > maiorImposto){
                maiorImposto = imposto;
                maiorPagador = contribuinte;
            }
        }
        System.out.println("\nContribuinte que mais paga imposto:");
        if(maiorPagador != null){
            System.out.println(maiorPagador.getNome() + " | R$ " + String.format("%.2f", maiorImposto));
        }

        //b) Quem menos paga imposto
        Contribuinte menorPagador = null;
        double menorImposto = Double.MAX_VALUE;
        for (Contribuinte contribuinte : contribuintes){
            double imposto = contribuinte.calcularImposto();
            if(imposto < menorImposto){
                menorImposto = imposto;
                menorPagador = contribuinte;
            }
        }
        System.out.println("\nContribuinte que menos paga imposto:");
        if(menorPagador != null) {
            System.out.println(menorPagador.getNome() + " | R$ " + String.format("%.2f", menorImposto));
        }

        //c) Qual o total de imposto pago entre os 5 contribuintes?
        double totalImpostos = 0;
        for(Contribuinte contribuinte : contribuintes){
            totalImpostos += contribuinte.calcularImposto();
        }
        System.out.println("\nTotal de impostos entre os 5 contribuintes R$ " + totalImpostos);
    }
}
