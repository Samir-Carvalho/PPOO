
package javaapplication3;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        ArrayList<Integer> complementos = new ArrayList<>();
        
        int codCafe;
        System.out.print("Digite o código do tipo do café (0: Americano/ 1: Expresso/ 2: Sem Cafeína): ");
        codCafe = input.nextInt();
        String cafeEscolhido;
        if (codCafe == 0) {
            cafeEscolhido = "Americano";
        }else{
            if (codCafe == 1) {
                cafeEscolhido = "Expresso";
            }else{
                cafeEscolhido = "Sem Cafeina";
            }
        }
        
        
        Cafe cafe;
        cafe = new Cafe(cafeEscolhido, complementos);
        
        int complementoCafe;
        System.out.print("Deseja adicionar algum complemento? (0: não ou 1: sim): ");
        complementoCafe = input.nextInt();
        if (complementoCafe == 1) {
            int contador = 1;
            int codComplemento;
            while(complementoCafe == 1){    
                System.out.print("Insira o código do " + contador+ "º complemento desejado (0: leite, 1: chocolate, 2: canela): ");
                contador++;
                codComplemento = input.nextInt();
                complementos.add(codComplemento);
                
                System.out.print("Deseja adicionar outro complemento? (0: não ou 1: sim): ");
                complementoCafe = input.nextInt();
            }
        }

        cafe.addCodCafe(complementos);
        
        
        float[] precoCafe = new float[3];
        precoCafe[0]= (float) 7.50;
        precoCafe[1]= (float) 4.30;
        precoCafe[2]= (float) 10.00;
        
        float[] precoComplemento = new float[3];
        precoComplemento[0]= (float) 5.00;
        precoComplemento[1]= (float) 8.00;
        precoComplemento[2]= (float) 2.00;
        
        
        float precoCafeEscolhido = precoCafe[codCafe];
        float precoTotalComplemento = 0;
        
        
        int qtdComplemento = cafe.quantidadeComplementos();
        
        for (int i = 0; i < qtdComplemento ; i++) {
            int codComplemento = cafe.codComplementoPosicao(i);
            precoTotalComplemento += precoComplemento[codComplemento]; 
        }
        float precoTotalDoPedido = precoCafeEscolhido + precoTotalComplemento;
        
        System.out.println("############### NOTA FISCAL ###############");
        System.out.println("Café: " + cafe.getTipoCafe() ); //Expresso
        System.out.println("Preço do café = " + precoCafe[codCafe] ); //4,30"
        System.out.println("Preço dos Complementos = "+ precoTotalComplemento);//7,00
        System.out.println("Total = " + precoTotalDoPedido); //11,30
       
    }
}