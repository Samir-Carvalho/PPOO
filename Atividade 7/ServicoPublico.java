
package javaapplication7;


public class ServicoPublico extends Beneficiario implements CalcularContribuicao{
    private double mediaSalarial;   
            
    public ServicoPublico(String cpf, String nome, double mediaSalarial){
	super(cpf,nome);
	this.mediaSalarial = mediaSalarial;
    }
    
    @Override
    public double aposentadoria(){
        double valorAposentadoria = (80 * mediaSalarial) / 100; 
        return valorAposentadoria;
    }
    
    @Override
    public double calcularINSS() { // calculo contribuicao INSS
        double calcINSS = (14 * mediaSalarial)/100;
        return calcINSS;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + 
                "Cpf: "+ getCpf() + "\n" + 
                "Aposntadoria: " + aposentadoria() + "\n" + 
                "Contribuicao INSS: " + calcularINSS() 
                + "\n ";
    }   
    
}
