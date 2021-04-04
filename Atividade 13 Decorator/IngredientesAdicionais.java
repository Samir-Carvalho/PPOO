//package javaapplication13decorator;

public class IngredientesAdicionais extends Sanduiche {

    private Sanduiche sanduba;
    
    public IngredientesAdicionais(Sanduiche sanduba){
        this.sanduba = sanduba;
        setNomeSanduba(sanduba.getNomeSanduba());
    }
    
    public Sanduiche getSanduiche(){
        return sanduba;
    }

    @Override
    public double preco() {
        return 0;
    }

    

    
    
    
    
}
