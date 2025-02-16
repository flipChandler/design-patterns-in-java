package com.felipe.contatossemproxy;

public class ApplicationProxy {
    public static void main(String[] args) {
        Contatos contatos = new ContatosXML("contatos1.xml", "contatos2.xml");
        String nome = contatos.buscarPor("jose@email.com");

        System.out.println(nome);
    }
}
