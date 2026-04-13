// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Digite a nota: ");
        nota = sc.nextDouble();

        while (nota < 0 || nota > 100) {
            System.out.println("Nota inválida.");
            nota = sc.nextDouble();
        }

        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 75) {
            System.out.println("B");
        } else if (nota >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        sc.close();
    }
}
