package com.felipe.contatoscomproxy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContatosXMLTest {

    @Test
    public void buscarPor_deveRetornarContato_seSolicitado() {
        Contatos contatos = new ContatosXMLProxy("contatos1.xml", "contatos2.xml");
        String nome = contatos.buscarPor("jose@email.com");
        assertThat("José Santos").isEqualTo(nome);
    }
}