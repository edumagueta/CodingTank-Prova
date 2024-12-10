//Um motorista precisa abastecer seu carro para uma viagem.
// O carro tem um consumo médio de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360 km.
// Crie um programa que solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem.
// Além disso, informe quantos litros de combustível serão necessários para completar a viagem.

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumo = 12.0;
        double distancia = 360.0;

        System.out.print("Digite o preço do combustível por litro: R$ ");
        double preco = scanner.nextDouble();
        double litroNecessario = distancia / consumo;
        double custo = litroNecessario * preco;

        System.out.printf("\nSerá necessário %.2f litros de combustível%n", litroNecessario);
        System.out.printf("A viagem terá um custo total de R$ %.2f%n", custo);

        scanner.close();
    }
}