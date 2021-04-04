
package javaapplication3;

import java.util.ArrayList;


class Cafe {
    
    private String tipoCafe;
    private ArrayList <Integer> codCafe;
    
    public Cafe(String tipoCafe, ArrayList<Integer> codCafe) {
        this.tipoCafe = tipoCafe;
        //codCafe = new ArrayList<>();
        this.codCafe = codCafe;
    } 


    public ArrayList getCodComplementoCafe() {
        return codCafe;
    }
    
    
    //Retornar o tipo do café
    public String getTipoCafe() {
        return tipoCafe;
    }
    
    //Inserir no arraylist de complementos o código de um complemento escolhido para o café. 
    public void addCodCafe(ArrayList codCafe) {
        codCafe.add(codCafe);
    }
    
    //Retornar a quantidade de complementos escolhidos para o café.
    public int quantidadeComplementos(){
        return codCafe.size() - 1;
    }
    
    //Retornar o código de um complemento armazenado em uma posição específica do arraylist.
    public int codComplementoPosicao(int posicaoBuscada){
        int qtdComplementos = quantidadeComplementos();
        for (int i = 0; i < qtdComplementos; i++) {
            if (i == posicaoBuscada) {
                return (int) codCafe.get(i);
            }
        }
        return -2; // possicao n existe
    }
}
