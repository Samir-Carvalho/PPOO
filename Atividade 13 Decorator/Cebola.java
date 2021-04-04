//package javaapplication13decorator;

public class Cebola extends IngredientesAdicionais{
    
    public Cebola(Sanduiche sanduba) {
        super(sanduba);
    }
    
    @Override
    public double preco() {
        return 1.30 + getSanduiche().preco();
    }
    
}
