package javaapplication11;

import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame {

    private JButton[] botaoDigitos = new JButton[10];
    private JTextField tela;
    private JButton botaoSubtracao;
    private JButton botaoSoma;
    private JButton botaoMultiplicacao;
    private JButton botaoDivisao;
    private JButton botaoPonto;
    private JButton botaoResultado;
    private JButton botaoAC;
    Operacoes operacao = new Operacoes();

    public Calculadora() {
        iniciarBotoes();
        calcular();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }

    private void iniciarBotoes() {

        setTitle("Calculadora");
        setBounds(300, 100, 300, 400);

        botaoDigitos[0] = new JButton("0");
        botaoDigitos[1] = new JButton("1");
        botaoDigitos[2] = new JButton("2");
        botaoDigitos[3] = new JButton("3");
        botaoDigitos[4] = new JButton("4");
        botaoDigitos[5] = new JButton("5");
        botaoDigitos[6] = new JButton("6");
        botaoDigitos[7] = new JButton("7");
        botaoDigitos[8] = new JButton("8");
        botaoDigitos[9] = new JButton("9");

        botaoSoma = new JButton("+");
        botaoSubtracao = new JButton("-");
        botaoMultiplicacao = new JButton("*");
        botaoDivisao = new JButton("/");

        botaoResultado = new JButton("=");
        botaoPonto = new JButton(".");
        botaoAC = new JButton("AC");

        setarBotoesTela();
        adicionarBotoes();

        tela = new JTextField();
        tela.setBounds(50, 50, 200, 30);
        tela.setEditable(false);
        add(tela);
        setLayout(null);
    }

    private void setarBotoesTela() {
        botaoDigitos[0].setBounds(50, 250, 50, 25);
        botaoDigitos[7].setBounds(50, 100, 50, 25);
        botaoDigitos[8].setBounds(100, 100, 50, 25);
        botaoDigitos[9].setBounds(150, 100, 50, 25);
        botaoDigitos[4].setBounds(50, 150, 50, 25);
        botaoDigitos[5].setBounds(100, 150, 50, 25);
        botaoDigitos[6].setBounds(150, 150, 50, 25);
        botaoDigitos[1].setBounds(50, 200, 50, 25);
        botaoDigitos[2].setBounds(100, 200, 50, 25);
        botaoDigitos[3].setBounds(150, 200, 50, 25);

        botaoSoma.setBounds(200, 100, 50, 25);
        botaoSubtracao.setBounds(200, 150, 50, 25);
        botaoMultiplicacao.setBounds(200, 200, 50, 25);
        botaoDivisao.setBounds(200, 250, 50, 25);
        botaoPonto.setBounds(150, 250, 50, 25);
        botaoAC.setBounds(100, 250, 50, 25);
        botaoResultado.setBounds(50, 300, 200, 25);
    }

    private void adicionarBotoes() {
        add(botaoDigitos[0]);
        add(botaoDigitos[1]);
        add(botaoDigitos[2]);
        add(botaoDigitos[3]);
        add(botaoDigitos[4]);
        add(botaoDigitos[5]);
        add(botaoDigitos[6]);
        add(botaoDigitos[7]);
        add(botaoDigitos[8]);
        add(botaoDigitos[9]);

        add(botaoSoma);
        add(botaoMultiplicacao);
        add(botaoSubtracao);
        add(botaoDivisao);
        add(botaoPonto);
        add(botaoAC);
        add(botaoResultado);
    }

    private void calcular() {
        for (int i = 0; i < 10; i++) {
            final int auxiliar = i;
            botaoDigitos[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tela.setText(tela.getText() + auxiliar);
                    tela.setHorizontalAlignment(JTextField.RIGHT);
                }
            });
        }

        botaoSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao.Operacao(0, tela.getText());
                tela.setText("");
            }
        });
        botaoSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao.Operacao(1, tela.getText());
                tela.setText("");
            }
        });
        botaoMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao.Operacao(2, tela.getText());
                tela.setText("");
            }
        });
        botaoDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao.Operacao(3, tela.getText());
                tela.setText("");
            }
        });

        botaoPonto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tela.setText(tela.getText() + ".");
                tela.setHorizontalAlignment(JTextField.RIGHT);
            }
        });
        botaoResultado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tela.setText("" + operacao.Saida(tela.getText()));
            }
        });
        botaoAC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tela.setText("");
            }
        });

    }
}
