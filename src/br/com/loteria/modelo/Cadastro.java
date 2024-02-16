package br.com.loteria.modelo;


import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    private int n1 ;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int n6;

    public void cadastra(){
       this.n1 = scanner.nextInt();
       this.n2 = scanner.nextInt();
       this.n3 = scanner.nextInt();
       this.n4 = scanner.nextInt();
       this.n5 = scanner.nextInt();
       this.n6 = scanner.nextInt();
    }

    public ArrayList<Integer> getCadastrados(){
        ArrayList<Integer> escolha = new ArrayList<>();
        escolha.add(n1);
        escolha.add(n2);
        escolha.add(n3);
        escolha.add(n4);
        escolha.add(n5);
        return escolha;
    }

}


