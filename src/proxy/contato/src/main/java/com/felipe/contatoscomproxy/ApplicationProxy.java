package com.felipe.contatoscomproxy;

public class ApplicationProxy {

    /*
        O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto
    ou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original,
    permitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.
     */

    public static void main(String[] args) {
        ContatoRepository contatoRepository = new ContatoRepositoryXMLProxy("contatos1.xml", "contatos2.xml");
        String nomeEncontrado = contatoRepository.buscarPorEmail("jose@email.com");
        System.out.println(nomeEncontrado);
    }
}
