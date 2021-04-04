
//package javaapplication12;

public abstract class NotaVeiculo {
    
    private double valor; 
    private int qtdDias;
    
    public NotaVeiculo(double valor, int qtdDias){
        this.valor = valor;
        this.qtdDias = qtdDias;
    }
    
    public double getValor(){
        return valor;
    }
    
    public int getQtdDias(){
        return qtdDias;
    }
    
    public abstract double calcularValor();
    
    public String toString() {
        return "===================== Nota Fiscal =============================" 
                + "\n= Valor a ser pago: R$ " + String.format("%.2f",calcularValor()) 
                + "\n=============================================================== ";
        
    
        
    }
    
    
    
    
}
