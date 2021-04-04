//package javaapplication13decorator;

public class PaoFrances extends Sanduiche{

    public PaoFrances(String nome){
        setNomeSanduba(nome);
    }
        
    @Override
    public double preco() {
        return 1.5;
    }
    
}
