//package javaapplication13decorator;
/**
 *
 * @author samir
 */
public class Hamgurguer extends IngredientesAdicionais {
    
    public Hamgurguer(Sanduiche sanduba) {
        super(sanduba);
    }
    
    @Override
    public double preco() {
        return 4.0 + getSanduiche().preco();
    }
    
}
