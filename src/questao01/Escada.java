package questao01;

import java.util.Scanner;

public class Escada {

    public static void main(String args[]) {
        desenhaEscada();
    }

    // Esse método desenha uma escada de tamanho n utilizando o caractere *
    public static void desenhaEscada() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite o valor inteiro de n:");
        n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = n; i > j; i--) {
                System.out.print(' ');
            }
            for (int k = 0; k < j; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
