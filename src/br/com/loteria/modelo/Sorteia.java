package br.com.loteria.modelo;

import java.util.ArrayList;
import java.util.Random;

public class Sorteia  {
    private Random random = new Random();
    private ArrayList<Integer>numerosSorteados;

    public void inicializaSorteio(){
        setSorteia();
    }

    public void setSorteia() {
        numerosSorteados = new ArrayList<>();
        for(int i = 0;i<6;i++){
            numerosSorteados.add(random.nextInt(60));
        }
    }
    public ArrayList<Integer> getNumerosSorteados(){
        System.out.println(numerosSorteados);
        return numerosSorteados;
    }

}


