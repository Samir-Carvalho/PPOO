package javaapplication8;

public class CompraComCupom extends Compra{
    private double valorDoCupom;
    
    
    public CompraComCupom(String nomeProduto, int qtdComprada, double precoUnitario, double valorDoCupom) {
        super(nomeProduto,qtdComprada,precoUnitario);
        this.valorDoCupom = valorDoCupom;
    }

    @Override
    public double calcular() {
        double valorDaCompra = (getQtdComprada() * getPrecoUnitario()) - valorDoCupom ;
        if (valorDaCompra < 0) {
            return 0;
        }
        return valorDaCompra;
    }
}