package br.com.rafacfrank.screenmatch.modelos;

import br.com.rafacfrank.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

}