package javaapplication4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    private static DecimalFormat df = new DecimalFormat("#.00"); // PARA ARREDONDAMENTO DAS CASAS DECIMAIS
    private static Scanner in = new Scanner(System.in);
    private static double valorInvestido;
    private static int aplicacaoMeses;
    private static Investimento investimento;

    public static void main(String[] args) {
        System.out.println("###### SIMULAÇÃO ######");
        System.out.print("Entre com o valor a ser investido: ");
        valorInvestido = in.nextInt();
        System.out.printf("Entre com a duração da aplicação em meses: ");
        aplicacaoMeses = in.nextInt();
        investimento = new Investimento(valorInvestido, aplicacaoMeses);
        //
        investimentoPoupanca();
    }

    private static void investimentoPoupanca() {
        System.out.println("1 - Investimento em poupança");
        System.out.print("Entre com o valor da taxa Selic em %: ");
        double taxaSelic = in.nextDouble();
        System.out.print("Entre com o valor da taxa referencial (TR) em %: ");
        double taxaTR = in.nextDouble();
        Poupanca poupanca = new Poupanca(valorInvestido, aplicacaoMeses, taxaSelic, taxaTR);
        //investimento = new Poupanca(valorInvestido, aplicacaoMeses, taxaSelic, taxaTR); o correto
        System.out.println("Valor final para investimento em poupança: " + df.format(poupanca.getInvestimentoPoupanca()));
        //
        investimentoCdb();
    }

    private static void investimentoCdb() {
        System.out.println("2 - Investimento em CDB");
        System.out.print("Entre com o valor da taxa CDI em %: ");
        double TaxaCDI = in.nextDouble();
        CDB cdb = new CDB(valorInvestido, aplicacaoMeses, TaxaCDI);
        System.out.println("Valor final para investimento em CDB: " + df.format(cdb.getInvestimentoCDB()));
        //
        investimentoAcao();
    }

    private static void investimentoAcao() {
        System.out.println("3 - Investimento em ação");
        System.out.print("Entre com o preço inicial da ação: ");
        double inicialAcao = in.nextDouble();
        System.out.print("Entre com o preço final da ação: ");
        double finalAcao = in.nextDouble();
        Acao acao = new Acao(valorInvestido, aplicacaoMeses, inicialAcao, finalAcao);
        System.out.println("VValor final para investimento em ação: " + df.format(acao.getInvestimentoAcao()));
    }
}
