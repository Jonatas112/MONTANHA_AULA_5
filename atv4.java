// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i = 1;

        System.out.print("Digite N: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Valor inválido.");
        } else {
            while (i <= n) {
                System.out.println(i);
                i++;
            }
            System.out.println("Contagem concluída.");
        }

        sc.close();
    }
}
