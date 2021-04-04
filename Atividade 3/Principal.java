package javaapplication3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o codigo do Departamento : ");
        String sigla = in.nextLine();
        Departamento departamento = new Departamento(sigla);
        exibirMenu();
        int codLeitura;
        codLeitura = in.nextInt();

        while (codLeitura != 4) {
            if (codLeitura == 1) { //(Cadastrar nova disciplina)
                Disciplina novaDisciplina;
                System.out.println("Digite o codigo da disciplina : ");
                String novoCodDisciplina = in.next();
                System.out.println("Digite a carga horaria da disciplina : ");
                int novaCargaHoraria = in.nextInt();
                novaDisciplina = new Disciplina(novoCodDisciplina, novaCargaHoraria);
                departamento.adicionarDisciplina(novaDisciplina);
            }
            if (codLeitura == 2) { // (Removerdisciplina) 
                String codDisciplina;
                System.out.println("Digite o codigo da disciplina para remover: ");
                codDisciplina = in.next();
                departamento.removerDisciplina(codDisciplina);
            }
            if (codLeitura == 3) {  //(Listartodas as disciplinas)
                departamento.listarDisciplinas();
            }
            exibirMenu();
            codLeitura = in.nextInt();
        }
    }

    private static void exibirMenu() {
        System.out.println("########### SISTEMA DE CADASTRO ###########");
        System.out.println("1 - Cadastrar nova disciplina");
        System.out.println("2 - Remover disciplina");
        System.out.println("3 - Listar todas as disciplinas");
        System.out.println("4 - Sair");
        System.out.println("Escolha o número correspondente a uma das opções anteriores: ");
    }
}