
//package javaapplication12;

public class Passageiros extends NotaVeiculo{
    private int capacidadePassageiros;
    
    public Passageiros(double valor, int qtdDias, int capacidadePassageiros) {
        super(valor, qtdDias);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public double calcularValor() {
        
        return  getQtdDias() * getValor() * (1 + (capacidadePassageiros * 0.01));
        
    }
    
    
}
