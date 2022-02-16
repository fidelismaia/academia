package questao01;

public class Escada {

    public static void main(String args[]) {
        desenhaEscada();
    }

    // Esse método desenha uma escada de tamanho n utilizando o caractere *
    public static void desenhaEscada() {
        int n = 6;
        for (int j = 0; j <= n; j++) {
            for (int i = n; i > j; i--) {
                System.out.print(' ');
            }
            for (int k = 0; k < j; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
