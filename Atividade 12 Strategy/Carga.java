
//package javaapplication12;

public class Carga extends NotaVeiculo{
    private String cabine;
    
    public Carga(double valor, int qtdDias, String cabine) {
        
        super(valor, qtdDias);
        this.cabine = cabine;
    }

    @Override
    public double calcularValor() {
        
        if (cabine.equals("simples")) {
            return getValor() * getQtdDias();
        }else{ // cabine dupla
            return 1.5 * getValor() * getQtdDias();
        }
    }
    
    
    
}
