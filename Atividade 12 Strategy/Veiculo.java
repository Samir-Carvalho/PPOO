
//package javaapplication12;

public class Veiculo {
    private NotaVeiculo nota;
    
    public Veiculo(NotaVeiculo nota){
        this.nota = nota;
    }
    
    public double calcularNotaFiscal(){
         return nota.calcularValor();
    }
    
    public void gerarNotaFiscal(){
        System.out.println(nota);
    }
    
}
