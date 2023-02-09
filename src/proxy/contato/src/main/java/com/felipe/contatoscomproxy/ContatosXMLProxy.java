package com.felipe.contatoscomproxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ContatosXMLProxy implements Contatos {

    private ContatosXML contatosXML;
    private List<String> nomesArquivos;

    public ContatosXMLProxy(String... nomesArquivos) {
        this.nomesArquivos = new ArrayList<>(Arrays.asList(nomesArquivos));
    }

    @Override
    public String buscarPor(String email) {
        String nomeEncontrado = null;
        Random random = new Random();

        int quantidadeArquivos = nomesArquivos.size();
        for(int i = 0; i < quantidadeArquivos; i++) {
            int indiceParaPesquisa = random.nextInt(nomesArquivos.size());
            String nomeArquivo = nomesArquivos.remove(indiceParaPesquisa);
            this.contatosXML = new ContatosXML(nomeArquivo);
            nomeEncontrado = this.contatosXML.buscarPor(email);
            if (nomeEncontrado != null) {
                break;
            }
        }
        return nomeEncontrado;
    }
}
