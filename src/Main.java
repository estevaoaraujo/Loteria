import br.com.loteria.modelo.Cadastro;
import br.com.loteria.modelo.Sorteia;
import br.com.loteria.processo.Confere;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var cadastro = new Cadastro();
        var sorteia = new Sorteia();
        var confere = new Confere(sorteia, cadastro);
        var menu = new Menu();
        menu.Texto();
        int decisao;
        do {
            System.out.println("Opção: ");
            decisao = scanner.nextInt();

            if(decisao == 1 ){//cadastro
                cadastro.cadastra();
            }else if(decisao == 2){//sorteio
                sorteia.inicializaSorteio();
                sorteia.setSorteia();
                sorteia.getNumerosSorteados();
            }else if(decisao == 3){//Consulta
                confere.confereNumeros();
            }else if(decisao == 0){//sair
                System.out.println("Saindo");
            }else {
                System.out.println("Comando errado");
            }

        }while(decisao != 0);
    }
}



