package questao02;

import java.util.Scanner;

public class Senha {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha a ser verificada: ");
        String senha = sc.next();
        int quantoFalta = eValidaTamanho(senha);
        System.out.println(quantoFalta);
        sc.close();

    }

    /* Esse método define a regras para uma senha forte conforme o enunciando. No entanto apenas é retornado
    quantos caracteres faltam para atingir o tamanho mínimo.
     */
    public static int eValidaTamanho(String senha)
    {
        int falta = 0;
        String letraMaiscula = "(.*[A-Z].*)";
        if (!senha.matches(letraMaiscula))
        {
            falta = falta + 1;
        }
        String letraMinuscula = "(.*[a-z].*)";
        if (!senha.matches(letraMinuscula))
        {
            falta = falta + 1;
        }
        String digito = "(.*[0-9].*)";
        if (!senha.matches(digito))
        {
           falta = falta +1;
        }
        String caractereEspecial = "(.*[-#$%^&*()+!@].*$)";
        if (!senha.matches(caractereEspecial))
        {
            falta = falta +1;
        }
        if (senha.length() < 6)
        {
            falta = 6 - senha.length();
            return falta;
        }
        else
        return 0;
    }
}
