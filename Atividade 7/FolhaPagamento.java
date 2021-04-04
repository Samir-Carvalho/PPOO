
package javaapplication7;

import java.util.ArrayList;


public class FolhaPagamento {
    
    private ArrayList<Beneficiario> beneficiario;
    
    public FolhaPagamento(){
        beneficiario = new ArrayList<>();
    }
    
    void cadastrarBeneficiario(Beneficiario ben) {
        beneficiario.add(ben);
    }

    void gerarFolhaPagamento() {
        for (Beneficiario b : beneficiario) {
            System.out.println(b);
        }
    }
}
