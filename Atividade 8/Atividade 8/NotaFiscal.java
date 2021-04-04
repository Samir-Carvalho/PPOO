package javaapplication8;

import java.util.ArrayList;
import java.util.Collections;

public class NotaFiscal {
    private int dia;
    private int mes;
    private int ano;
    private ArrayList<Compra> listaDeCompra;
    
    public NotaFiscal(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        listaDeCompra = new ArrayList<>();
    }
    

    void comprar(Compra c) {
        listaDeCompra.add(c);
    }

    void imprimirNotaFiscal() {
        System.out.println("Data: " + dia + "/" + mes+ "/" + ano);
        System.out.println("Produto " + "Qtd " + "Preço " + " Valor Pago" + "\n" );
        
        double total = 0;
        Collections.sort(listaDeCompra);
        for(Compra c: listaDeCompra){
            total += c.calcular(); 
            System.out.println(c);
        }
        System.out.println( "\n" + "Total R$ " + total);
    }
    
}
