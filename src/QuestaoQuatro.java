//Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo.
//Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.

import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (primo(num)) {
            System.out.println("O número " + num + " é primo");
        } else {
            System.out.println("O número " + num + " não é primo");
        }
        scanner.close();
    }

    public static boolean primo(int num) {
        if (num <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}