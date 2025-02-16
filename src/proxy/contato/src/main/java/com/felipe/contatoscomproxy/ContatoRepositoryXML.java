package com.felipe.contatoscomproxy;

import com.thoughtworks.xstream.XStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContatoRepositoryXML implements ContatoRepository {

    private Map<String, String> contatosEmCache = new HashMap<>();

    @SuppressWarnings("unchecked")
    public ContatoRepositoryXML(String... nomesArquivos) {
        XStream xstream = new XStream();

        // Set security permissions
        XStream.setupDefaultSecurity(xstream);

        // Allow only specific classes (Highly Recommended)
        xstream.allowTypes(new Class[]{Contato.class, ContatoRepository.class});

        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);

        for (String nomeArquivo : nomesArquivos) {
            System.out.println("Carregando arquivo: " + nomeArquivo);
            List<Contato> contatosCarregados =
                    (List<Contato>) xstream.fromXML(this.getClass().getResource("/" + nomeArquivo));
            for (Contato contato : contatosCarregados) {
                contatosEmCache.put(contato.getEmail(), contato.getNome());
            }
        }
    }

    @Override
    public String buscarPorEmail(String email) {
        return contatosEmCache.get(email);
    }
}