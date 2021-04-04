//package javaapplication13decorator;

public class Queijo extends IngredientesAdicionais {
    
    public Queijo(Sanduiche sanduba) {
        super(sanduba);
    }
    
    @Override
    public double preco() {
        return 2.30 + getSanduiche().preco();
    }
}
