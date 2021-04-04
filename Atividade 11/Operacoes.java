package javaapplication11;

/**
 *
 * @author samir
 */
public class Operacoes {
    private float vali, valj;
    private int operacao;
 
 
    void Operacao(int op, String tela){
        valj = Float.parseFloat(tela);
        operacao = op;
    }
    float Saida(String tela){
        vali = Float.parseFloat(tela);
        switch(operacao){
            case 0: return valj+vali;
            case 1: return valj-vali;
            case 2: return valj*vali;
            case 3: return valj/vali;
        }
        return 0;
    }
    
}
