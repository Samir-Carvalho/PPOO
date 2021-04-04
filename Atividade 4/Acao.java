package javaapplication4;

public class Acao extends Investimento {

    private double acaoInicial;
    private double acaoFinal;

    public Acao(double valorInvestido, int qtdMeses, double acaoInicial, double acaoFinal) {
        super(valorInvestido, qtdMeses);
        this.acaoInicial = acaoInicial;
        this.acaoFinal = acaoFinal;
    }

    public double getInvestimentoAcao() {
        double valorFinal = getValorInvestido();
        double rendimento = (((acaoFinal / acaoInicial) * 100) - 100) / 100;
        int meses = getQtdMeses();
        for (int i = 0; i < meses; i++) {
            valorFinal += (valorFinal * rendimento);
        }
        return valorFinal;
    }

}
