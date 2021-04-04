
package javaapplication7;


public abstract class Beneficiario {
    private String cpf;
    private String nome;
    
    public Beneficiario(String cpf, String nome){
	this.cpf = cpf;
	this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    
    public abstract double aposentadoria();
    
}
