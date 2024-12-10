//Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e definida pelo usuário,
// solicite o nome e a nota de cada um dos alunos.
//Seu programa deve imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os alunos.

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        String[] nome = new String[num];
        double[] nota = new double[num];

        double somaNotas = 0;
        for (int i = 0; i < num; i++){
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nome[i] = scanner.nextLine();

            System.out.print("Nota do aluno " + (i + 1) + ": ");
            nota[i] = scanner.nextDouble();
            scanner.nextLine();

            somaNotas += nota[i];
        }

        double media = somaNotas / num;

        System.out.printf("\nA média da turma é: %.2f%n", media);
        System.out.println("Alunos que estão com nota acima da média: ");

        for (int i = 0; i < num; i++){
            if (nota[i] > media) {
                System.out.println(nome[i] + " - Nota: " + nota[i]);
            }
        }
        scanner.close();
    }
}
