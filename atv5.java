// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1, soma = 0;

        while (num != 0) {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            soma += num;
        }

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
