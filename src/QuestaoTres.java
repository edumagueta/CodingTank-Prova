//Uma família está dividindo uma pizza entre seus membros.
//Crie um programa que solicite o número de membros da família e o número de fatias da pizza.
//O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias sobrarão.
//Se a pizza não puder ser igualmente dividida, o programa deve sugerir quantas fatias adicionais são necessárias para que todos recebam a mesma quantidade.

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de membros família: ");
        int membros = scanner.nextInt();

        System.out.print("Número de pedaços fatiados: ");
        int fatias = scanner.nextInt();

        if (fatias < membros) {
            int fatiasNecessarias = membros - fatias;
            System.out.println("\nAs fatias não são suficientes para todos.");
            System.out.println("Faltará " + fatiasNecessarias + " fatias para que todos recebam");
            System.out.println("Será necessário " + fatiasNecessarias + " fatias a mais");
        } else {
            int fatiaPorPessoa = fatias / membros;
            int sobras = fatias % membros;


            System.out.println("\nCada pessoa irá receber " + fatiaPorPessoa + " fatias.");

            if (sobras == 0) {
                System.out.println("Sem fatias sobrando.");
            } else {
                System.out.println("Sobrará " + sobras + " fatias");

                int maisFatias = membros - sobras;
                System.out.println("Para que não sobre, precisará de " + maisFatias + " fatias a mais");
            }
        }
        scanner.close();
    }
}
