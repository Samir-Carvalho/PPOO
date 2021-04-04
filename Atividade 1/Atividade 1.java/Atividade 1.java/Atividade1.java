
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
    
        System.out.println("Digite o nome, dia, mes e ano: ");
        
        String nome;
        int dia;
        int mes;
        int ano;
        
        Scanner ler = new Scanner(System.in);
        nome = ler.nextLine();
        dia = ler.nextInt();
        mes = ler.nextInt();
        ano = ler.nextInt();
        
        Carrinho compras = new Carrinho(nome,dia,mes,ano);
        System.out.println("Digite a quantidade de itens que deseja (ate 5 itens): ");
        int quantidade;
        quantidade = ler.nextInt();
        System.out.println("Agora digite os produtos ");
        String itens;
        for (int i = 0; i < quantidade; i++) {
            itens = ler.next();
            compras.inserirItem(itens);
        }
        compras.exibir(quantidade, compras);
        
        //letra c
        System.out.println(" ");
        System.out.println("Digite a quantidade de itens do novo carrinho: ");
        int novaQuantidade;
        novaQuantidade = ler.nextInt();
        Carrinho novaCompra = new Carrinho(nome,dia,mes,ano, novaQuantidade);
        
        System.out.println("Agora digite os produtos ");
        String novosItens;
        for (int i = 0; i < novaQuantidade; i++) {
            novosItens = ler.next();
            novaCompra.inserirItem(novosItens);
        }
        novaCompra.exibir(novaQuantidade, compras);
        
    }
    
    
    
}
