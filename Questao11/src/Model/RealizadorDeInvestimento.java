package Model;

public class RealizadorDeInvestimento {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        TiposDeInvestimento tiposDeInvestimento = new TiposDeInvestimento();

        contaBancaria.deposita(10000.00);
        System.out.println("realizando investimento Conservador:");
        double conservador = tiposDeInvestimento.conservador(contaBancaria.getSaldo());
        double lucro = conservador * 0.75;
        contaBancaria.investimento(lucro);
        System.out.printf("valor : %.2f %n", lucro);


        System.out.println("realizando investimento Moderado:");
        double moderado = tiposDeInvestimento.moderado(contaBancaria.getSaldo());
        double lucro2 = moderado * 0.75;
        contaBancaria.investimento(lucro2);
        System.out.printf("valor : %.2f %n", lucro2);

        System.out.println("realizando investimento Arrojado:");
        double arrojado = tiposDeInvestimento.arrojado(contaBancaria.getSaldo());
        double lucro3 = arrojado * 0.75;
        contaBancaria.investimento(lucro3);
        System.out.printf("valor : %.2f", lucro3);

    }
}
