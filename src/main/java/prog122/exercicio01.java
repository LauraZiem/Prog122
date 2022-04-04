package prog122;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        Scanner scanner; 
        scanner = new Scanner(System.in);
        
        String nome = "Informe seu nome:";
        System.out.println(nome);
        String nomeF = scanner.nextLine();
        
        String sobrenome = "Informe seu sobrenome:";
        System.out.println(sobrenome);
        String sobrenomeF = scanner.nextLine();
        
        String completo = "Seu nome completo é: \n" + nomeF + " " + sobrenomeF;
        
        System.out.println(completo);
    }
}