package com.ramon.exercicio1.teste;

import com.ramon.exercicio1.Contato;
import com.ramon.exercicio1.Lista;

public class Teste {
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<>();

        Contato cont1 = new Contato();
        cont1.setNome("Ramon");
        cont1.setEndereco("Rua 1");
        cont1.setTelefone("1111111");

        Contato cont2 = new Contato();
        cont2.setNome("Ramon2");
        cont2.setEndereco("Rua 2");
        cont2.setTelefone("22222222");

        Contato cont3 = new Contato();
        cont3.setNome("Ramon3");
        cont3.setEndereco("Rua 3");
        cont3.setTelefone("333333333");

        lista.adiciona(cont1);
        lista.adiciona(cont2);
        lista.adiciona(cont3);

        lista.imprimir();

        // lista.removerInicio();
        // lista.imprimir();

        // lista.removerPorPosicao(1);
        // lista.imprimir();

        lista.pesquisarPorNome("Ramon2");

    }
}
