package recursividade;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("Fatorial Recursivo");
        System.out.println("**********************");
        
        System.out.println("Informe o número para calcular o FATORIAL: ");
        
        int n = 0;
        n = sc.nextInt();
        long resultado = 0;
        Fatorial fatorial = new Fatorial();
        resultado = fatorial.Fatorial(n);
        
        System.out.println(n + "! = " + resultado);
        
        System.out.println("\n\n");
        System.out.println("**********************");
        System.out.println("Potenciação Recursiva:");
        System.out.println("**********************");
        
        int base, expo, pot, resulPot = 0;
        
        System.out.println("Informe o número base: ");
        base = sc.nextInt();
        System.out.println("Informe o expoente: ");
        expo = sc.nextInt();
        
        Potencia potencia = new Potencia();
        resulPot = potencia.Potencia(base, expo);
        
        System.out.println(base + "^" + expo + " = " + resulPot);
        
        System.out.println("\n\n");
        System.out.println("**********************");
        System.out.println("Número de Fibonacci:");
        System.out.println("**********************");
        
        int fib, resultFib = 0;
        
        System.out.println("Informe o número FIB:");
        fib = sc.nextInt();
        resultFib = Fibonacci.Fibonacci(fib);
        System.out.println("Fobonacci de " + fib + " = " + resultFib);
   
        System.out.println("\n\n");
        System.out.println("**********************");
        System.out.println("Contagem Regressiva:");
        System.out.println("**********************");
        
        int countDesc = 0;
        System.out.println("Digite um número: ");
        countDesc = sc.nextInt();
        ContagemRegressiva countReg = new ContagemRegressiva();
        countReg.Contagem(countDesc);
    }
}
