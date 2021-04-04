
package javaapplication8;

public abstract class Compra implements Comparable<Compra>{
    private String nomeProduto;
    private int quantidadeComprada;
    private double precoUnitario;
    
    public Compra(String nomeProduto, int quantidadeComprada, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }
    
    public String getNomeProduto(){
        return nomeProduto;
    }
    
    public int getQtdComprada(){
        return quantidadeComprada;
    }
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    
    public abstract double calcular();
    
    public int compareTo ( Compra c ){
        if (this.precoUnitario > c.precoUnitario ) {
            return 1;
        }else if(this.precoUnitario < c.precoUnitario){
            return -1;
        }
        return 0;
    }
    
    @Override
    public String toString(){
    return  getNomeProduto() + " " + getQtdComprada()+ " " + getPrecoUnitario()+ " " + calcular() ;
    }
}
