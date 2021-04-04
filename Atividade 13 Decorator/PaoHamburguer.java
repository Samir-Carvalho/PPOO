//package javaapplication13decorator;

public class PaoHamburguer extends Sanduiche{
    
     public PaoHamburguer(String nome){
        setNomeSanduba(nome);
    }
    
    @Override
    public double preco() {
        return 2.5;
    }
    
}
