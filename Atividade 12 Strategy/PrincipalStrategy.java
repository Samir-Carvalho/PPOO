
//package javaapplication12;

import java.util.Scanner;

public class PrincipalStrategy {
    private static Scanner ent = new Scanner(System.in);
    static Veiculo veiculo;
    
    public static void main(String[] args) {
        int opcao = 0;
        while(opcao != 4){
            mostrarMenu();
            opcao = ent.nextInt();
            ent.nextLine();
            executarOpcao(opcao);
        }
        
    }
    
    private static void mostrarMenu(){
        System.out.println("########### #### LOCADORA DE VEICULOS ####\n" +
                            "1 - Gerar nota para veículo de passeio\n" +
                            "2 - Gerar nota para veículo de carga\n" +
                            "3 - Gerar nota para veículo de passageiros\n" +
                            "4 - Sair ###########");
        System.out.print("Escolha uma opção: ");
       
   }
    
    private static void executarOpcao(int opcao){
        switch(opcao){
            case 1:
                
                double valorDiariaPasseio;
                int qtdDiasPasseio;
                System.out.print("Entre com o valor da diaria: ");
                valorDiariaPasseio = ent.nextDouble();
                System.out.print("Entre com a quantidade de dias: ");
                qtdDiasPasseio = ent.nextInt();
                
                veiculo = new Veiculo(new Passeio(valorDiariaPasseio,qtdDiasPasseio));
                veiculo.calcularNotaFiscal();
                veiculo.gerarNotaFiscal();
                
                
                break;
            case 2:
                
                double valorDiariaCarga;
                int qtdDiasCarga;
                String cabine;
                System.out.print("Entre com o valor da diaria: ");
                valorDiariaCarga = ent.nextDouble();
                System.out.print("Entre com a quantidade de dias: ");
                qtdDiasCarga = ent.nextInt();
                System.out.print("Entre com a cabine // simples ou dupla: ");
                cabine = ent.next();
                
                veiculo = new Veiculo(new Carga(valorDiariaCarga,qtdDiasCarga,cabine));
                veiculo.calcularNotaFiscal();
                veiculo.gerarNotaFiscal();
                
                
                break;
            case 3:
                
                double valorDiariaPassageiro;
                int qtdDiasPassageiro,capacidadePassageiros;
                System.out.print("Entre com a capacidade do veículo : ");
                capacidadePassageiros = ent.nextInt();
                System.out.print("Entre com o valor da diaria: ");
                valorDiariaPassageiro = ent.nextDouble();
                System.out.print("Entre com a quantidade de dias: ");
                qtdDiasPassageiro = ent.nextInt();
                
                
                veiculo = new Veiculo(new Passageiros(valorDiariaPassageiro,qtdDiasPassageiro,capacidadePassageiros));
                veiculo.calcularNotaFiscal();
                veiculo.gerarNotaFiscal();
                
                
                break;
            case 4:
                
        }
    }
    
}
