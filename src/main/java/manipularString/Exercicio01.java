package manipularString;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner; 
        scanner = new Scanner(System.in);
        
        System.out.println("Digite uma String: ");
        String texto = scanner.nextLine();
        System.out.println("********************");
        
        System.out.println("O número de caracteries dessa String é: " + texto.length());
        System.out.println("********************");
        
        System.out.println("A string com todas as letras Maiúsculas: " + texto.toUpperCase());
        System.out.println("********************");
        
        int vogais = 0;
        for (int i = 0; i < texto.length(); i++){
            //charAt -> Retorna somente 1 caracter em determinada posição(posição i no caso)
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vogais++;
        }
        System.out.println("Quantidade de vogais na String: " + vogais);
        System.out.println("********************");
        
        String textoMaiuscula = texto.toUpperCase();
        System.out.println(
                "Começa com UNI? " + textoMaiuscula.startsWith("UNI")
        );
        System.out.println("********************");
        
        System.out.println(
                "Termina com RIO? " + textoMaiuscula.endsWith("RIO")
        );
        System.out.println("********************");
        
        int digitos = 0;
        for (int i = 0; i < texto.length(); i++){
            //charAt -> Retorna somente 1 caracter em determinada posição(posição i no caso)
            char c = texto.charAt(i);
            if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')
                digitos++;
        }
        System.out.println("Quantidade de digitos na String: " + digitos);
        System.out.println("********************");
        
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        
        boolean palindromo = texto.compareToIgnoreCase(textoInvertido) == 0 ? true : false;
        if(palindromo == true)
            System.out.println("A palavra é um palíndromo");
        else
            System.out.println("A palavra não é um palíndromo");
        
    }
}
