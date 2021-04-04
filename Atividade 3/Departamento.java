package javaapplication3;

import java.util.ArrayList;

public class Departamento {

    private String sigla;
    private ArrayList<Disciplina> disciplina;

    public Departamento(String sigla) {
        this.sigla = sigla;
        disciplina = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplina.add(d);
    }

    private Disciplina buscarDisciplina(String codigo) {
        for (Disciplina d : disciplina) {
            String codDisciplina = d.getCodigo();
            if (codDisciplina.equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    public void removerDisciplina(String codigo) {
        Disciplina disciplinaBuscada;
        disciplinaBuscada = buscarDisciplina(codigo);
        disciplina.remove(disciplinaBuscada);
    }

    public void listarDisciplinas() {
        for (Disciplina disciplinas : disciplina) {
            System.out.println("Disciplina: " + disciplinas.getCodigo() + " / Carga Horaria Semanal: " + disciplinas.getCargaHorariaSemanal());
        }
    }
}
