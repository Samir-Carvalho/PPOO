//package javaapplication13decorator;
/**
 *
 * @author samir
 */
public class Principal {

    public static void main(String[] args) {

        Sanduiche sanduba = new PaoHamburguer("X-Burguer");
        
        sanduba = new Hamgurguer(sanduba);
        sanduba = new Queijo(sanduba);
        sanduba = new Queijo(sanduba);
        
        System.out.println("Sanduiche: " + sanduba.getNomeSanduba() + " Preço:" + sanduba.preco());
    }
    
}
