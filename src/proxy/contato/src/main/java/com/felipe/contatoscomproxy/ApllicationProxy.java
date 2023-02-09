package com.felipe.contatoscomproxy;

public class ApllicationProxy {
    public static void main(String[] args) {
        Contatos contatos = new ContatosXMLProxy("contatos1.xml", "contatos2.xml");
        String nomeEncontrado = contatos.buscarPor("jose@email.com");
        System.out.println(nomeEncontrado);
    }
}
