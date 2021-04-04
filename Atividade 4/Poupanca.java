package javaapplication4;

public class Poupanca extends Investimento {

    private double taxaSelic;
    private double taxaReferencial;

    public Poupanca(double valorInvestido, int qtdMeses, double taxaSelic, double taxaReferencial) {
        super(valorInvestido, qtdMeses);
        this.taxaSelic = taxaSelic;
        this.taxaReferencial = taxaReferencial;
    }
    
    
    public double getInvestimentoPoupanca() {
        double valorFinal = getValorInvestido();
        double rendimento = ((0.7 * taxaSelic) + taxaReferencial) / 100;
        int meses = getQtdMeses();
        for (int i = 0; i < meses; i++) {
            valorFinal += (valorFinal * rendimento);
        }
        return valorFinal;
    }

}
