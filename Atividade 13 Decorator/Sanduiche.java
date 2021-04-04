//package javaapplication13decorator;

public abstract class Sanduiche {
    private String nomeSanduiche;
    
    
    public void setNomeSanduba(String nomeSanduiche){
        this.nomeSanduiche = nomeSanduiche;
    }
    
    public String getNomeSanduba(){
        return nomeSanduiche;
    }
    
    public abstract double preco();
}
