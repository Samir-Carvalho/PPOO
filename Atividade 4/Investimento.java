
package javaapplication4;

public class Investimento {
    
    private double valorInvestido;
    private int qtdMeses;
    

    public Investimento(double valorInvestido, int qtdMeses) {
        this.valorInvestido = valorInvestido;
        this.qtdMeses = qtdMeses;
        
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public int getQtdMeses() {
        return qtdMeses;
    }
}
