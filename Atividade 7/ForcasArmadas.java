
package javaapplication7;


public class ForcasArmadas extends Beneficiario implements CalcularContribuicao{
    
    private double ultimoSalario;
    
    public ForcasArmadas(String cpf, String nome, double ultimoSalario){
	super(cpf,nome);
	this.ultimoSalario = ultimoSalario;
    }
    
    @Override
    public double aposentadoria(){
        double valorAposentadoria = (90 * ultimoSalario) / 100; 
        return valorAposentadoria;
    }
    
    @Override
    public double calcularINSS() {
        double calcularINSS = (11 * ultimoSalario )/ 100; 
        return calcularINSS;
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
