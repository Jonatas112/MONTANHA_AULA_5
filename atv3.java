// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, resultado;
        int opcao;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
        System.out.print("Escolha: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
