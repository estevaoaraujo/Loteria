package br.com.loteria.processo;

import br.com.loteria.modelo.Cadastro;
import br.com.loteria.modelo.Sorteia;

import java.util.ArrayList;
import java.util.HashSet;

public class Confere {
    Sorteia sorteia;
    Cadastro cadastro;
    public Confere(Sorteia sorteia,Cadastro cadastro){
        this.sorteia = sorteia;
        this.cadastro = cadastro;
    }

    public void confereNumeros() {
        ArrayList<Integer> numerosCadastrados = cadastro.getCadastrados();
        ArrayList<Integer> numerosSorteados = sorteia.getNumerosSorteados();

        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Seus números: " + numerosCadastrados);
        mostrarRepetidos(numerosSorteados, numerosCadastrados);
    }
    private void mostrarRepetidos(ArrayList<Integer> numerosSorteados, ArrayList<Integer> numerosCadastrados) {
        HashSet<Integer> repetidos = new HashSet<>(numerosSorteados);
        repetidos.retainAll(numerosCadastrados);

        if (!repetidos.isEmpty()) {
            System.out.println("Números Sorteados: " + repetidos);
        } else {
            System.out.println("Não há números sorteados.");
        }
    }

}
