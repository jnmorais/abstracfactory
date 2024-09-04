package org.projetos;

public class FabricaFaixaBranca implements FabricaAbstrata{
    @Override
    public Faixa createFaixa() {
        return new FaixaBranca();
    }
    @Override
    public Graduacao createGraduacao() {
        return new GraduacaoIniciante();
    }
}
