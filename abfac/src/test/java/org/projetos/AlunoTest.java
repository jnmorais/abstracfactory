package org.projetos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveMostrarFaixaBrancaEGraduacaoIniciante() {
        FabricaAbstrata fabrica = new FabricaFaixaBranca();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Faixa Branca", aluno.mostrarFaixa());
        assertEquals("Graduação Iniciante", aluno.mostrarGraduacao());
    }

    @Test
    void deveMostrarFaixaPretaEGraduacaoAvancada() {
        FabricaAbstrata fabrica = new FabricaFaixaPreta();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Faixa Preta", aluno.mostrarFaixa());
        assertEquals("Graduação Avançado", aluno.mostrarGraduacao());
    }
}
