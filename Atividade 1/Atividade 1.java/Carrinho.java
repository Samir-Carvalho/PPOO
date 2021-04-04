
public class Carrinho{
    private String cliente;
    private String[] carrinho;
    private int dia;
    private int mes;
    private int ano;
    private int contadorItens;

    public Carrinho(String cliente, int dia, int mes, int ano){
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[5];
        contadorItens = 0;
    }
    
    public Carrinho(String cliente, int dia, int mes, int ano, int quantidade){
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[quantidade];
        contadorItens = 0;
    }

    public String getCliente(){
        return cliente;
    }

    public void inserirItem(String produto){
        carrinho[contadorItens] = produto;
        contadorItens++;
    }

    void exibir(int quantidade, Carrinho compras) {
        
        System.out.print("Cliente: ");
        System.out.println(compras.cliente);
        System.out.print("Data da compra: ");
        System.out.print(compras.dia);
        System.out.print("/");
        System.out.print(compras.mes);
        System.out.print("/");
        System.out.println(compras.ano);
        System.out.print("Itens do carrinho: ");
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print(carrinho[i]);
            System.out.print(" ");
        }
    }
}

