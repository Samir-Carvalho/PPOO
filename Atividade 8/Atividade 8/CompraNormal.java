package javaapplication8;


public class CompraNormal extends Compra {
    private int percentualDesconto;

    public CompraNormal(String nomeProduto, int qtdComprada, double precoUnitario, int percentualDesconto) {
        super(nomeProduto,qtdComprada,precoUnitario);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcular() {
        double valorDaCompra = (getPrecoUnitario()* getQtdComprada()) - (((percentualDesconto * 0.01) * getPrecoUnitario())* getQtdComprada());
        if (valorDaCompra < 0) {
            return 0;
        }
        return valorDaCompra;
    }    
}
