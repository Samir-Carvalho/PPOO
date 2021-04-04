
//package javaapplication12;

public class Passeio extends NotaVeiculo{

    public Passeio(double valor, int qtdDias) {
        super(valor, qtdDias);
    }
    
    @Override
    public double calcularValor() {
        return getValor() * getQtdDias();
    }
    
}
