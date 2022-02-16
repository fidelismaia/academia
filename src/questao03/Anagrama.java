package questao03;

import java.util.*;

public class Anagrama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();
        System.out.println(qtdAnagramas(str));
        sc.close();
    }

    public static int qtdAnagramas(String str) {
        int total = 0;
        for (int i = 1; i < str.length(); ++i) {
            int[] stringCache = new int[26];

            for (int j = i; j >= 0; --j) {
                stringCache[str.charAt(j) - 'a']++;

                for (int k = 0; k < j; ++k) {
                    int[] letras = new int[26];
                    int x = k;
                    int contador = 0;
                    while (contador <= i - j) {
                        ++letras[str.charAt(x) - 'a'];
                        ++x;
                        ++contador;
                    }
                    boolean marcador = true;
                    for (x = 0; x < 26; ++x) {
                        if (stringCache[x] != letras[x]) {
                            marcador = false;
                            break;
                        }
                    }
                    if (marcador) ++total;
                }

            }
        }
        return total;
    }
}