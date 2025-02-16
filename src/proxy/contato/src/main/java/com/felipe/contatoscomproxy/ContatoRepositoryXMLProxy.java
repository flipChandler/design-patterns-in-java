package com.felipe.contatoscomproxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ContatoRepositoryXMLProxy implements ContatoRepository {

    private ContatoRepositoryXML contatoRepositoryXML;
    private List<String> nomesArquivos;

    public ContatoRepositoryXMLProxy(String... nomesArquivos) {
        this.nomesArquivos = new ArrayList<>(Arrays.asList(nomesArquivos));
    }

    @Override
    public String buscarPorEmail(String email) {
        String nomeEncontrado = null;
        Random random = new Random();

        int quantidadeArquivos = nomesArquivos.size();
        for(int i = 0; i < quantidadeArquivos; i++) {
            int indiceParaPesquisa = random.nextInt(quantidadeArquivos);
            String nomeArquivo = nomesArquivos.remove(indiceParaPesquisa);
            this.contatoRepositoryXML = new ContatoRepositoryXML(nomeArquivo);
            nomeEncontrado = this.contatoRepositoryXML.buscarPorEmail(email);
            if (nomeEncontrado != null) {
                break;
            }
        }
        return nomeEncontrado;
    }
}
