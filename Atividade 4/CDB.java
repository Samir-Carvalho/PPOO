package javaapplication4;

public class CDB extends Investimento {

    private double taxaCDI;

    public CDB(double valorInvestido, int qtdMeses, double taxaCDI) {
        super(valorInvestido, qtdMeses);
        this.taxaCDI = taxaCDI;
    }

    public double getInvestimentoCDB() {
        double valorFinal = getValorInvestido();
        double rendimento = (1.2 * taxaCDI) / 100;
        int meses = getQtdMeses();
        for (int i = 0; i < meses; i++) {
            valorFinal += (valorFinal * rendimento);
        }
        return valorFinal;
    }

}
