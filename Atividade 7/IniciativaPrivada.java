
package javaapplication7;

public class IniciativaPrivada extends Beneficiario {

    private double percentualContri;
    
    public IniciativaPrivada(String cpf, String nome, double percentualContri){
	super(cpf,nome);
	this.percentualContri = percentualContri;
    }
    
    @Override
    public double aposentadoria(){
        double valorAposentadoria = (5645.80 * percentualContri) / 100; 
        return valorAposentadoria;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + 
                "Cpf: "+ getCpf() + "\n" + 
                "Aposntadoria: " + aposentadoria()
                + "\n ";
    }   
    
    
}
