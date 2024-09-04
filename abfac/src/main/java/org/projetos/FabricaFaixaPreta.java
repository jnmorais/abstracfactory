package org.projetos;

public class FabricaFaixaPreta  implements FabricaAbstrata{
    @Override
    public Faixa createFaixa() {
        return new FaixaPreta();
    }

    @Override
    public Graduacao createGraduacao() {
        return new GraduacaoAvancado();
    }
}
