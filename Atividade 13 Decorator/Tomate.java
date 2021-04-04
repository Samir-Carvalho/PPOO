//package javaapplication13decorator;

public class Tomate extends IngredientesAdicionais{
    
    public Tomate(Sanduiche sanduba) {
        super(sanduba);
    }
    
     @Override
    public double preco() {
        return 0.50 + getSanduiche().preco();
    }
    
    
    
}
