package prog122;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner scanner; 
        scanner = new Scanner(System.in);
    
        //Primeiro:
        System.out.println("Primeiro Inteiro:");
        String um = scanner.nextLine();
        int one = Integer.parseInt(um);
        
        System.out.println("Segundo Inteiro:");
        String dois = scanner.nextLine();
        int two = Integer.parseInt(dois);
        
        System.out.println("Soma dos dois Inteiros:\n");
        System.out.println(one+two);
        
        //Segundo:
        System.out.println("Primeiro float:");
        String umF = scanner.nextLine();
        float oneF = Float.parseFloat(umF);
        
        System.out.println("Segundo float:");
        String doisF = scanner.nextLine();
        float twoF = Float.parseFloat(doisF);
        
        System.out.println("Subtração dos dois Floats:\n");
        System.out.println(oneF-twoF);
        
        //Terceiro:
        System.out.println("Multiplicação dos dois Inteiros:\n");
        System.out.println(one*two);
        
        //Quarto:
        System.out.println("Divisão dos dois Inteiros:\n");
        System.out.println(one/two);
        
        //Quinto: 
        System.out.println("Incremento dos númeors Inteiros:\n");
        System.out.println(++one);
        System.out.println(++two);
        
        System.out.println("Decremento dos númeors Inteiros:\n");
        System.out.println(--one);
        System.out.println(--two);
    }
}
