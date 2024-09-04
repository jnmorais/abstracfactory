package org.projetos;

public class Aluno {
    private Faixa faixa;
    private Graduacao graduacao;

    public Aluno(FabricaAbstrata fabrica) {
        this.faixa = fabrica.createFaixa();
        this.graduacao = fabrica.createGraduacao();
    }

    public String mostrarFaixa() {
        return this.faixa.exibir();
    }

    public String mostrarGraduacao() {
        return this.graduacao.exibir();
    }
}
