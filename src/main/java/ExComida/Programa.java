package ExComida;

import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa EXE Comida ***");
        System.out.println("*** Você tem direito a 3 pratos ***");
        
        Comida c1 = new Comida();
        Comida c2 = new Comida();
        Comida c3 = new Comida();
        
        Scanner sc = new Scanner(System.in);
        
        String descricao;
        Float peso;
        Integer quantidade;
        
        System.out.println("Informe o primeiro prato: ");
        descricao = sc.nextLine();
        c1.setDescricao(descricao);
        System.out.println("Informe o peso em gramas: ");
        peso = sc.nextFloat();
        c1.setPeso(peso);
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();               
        c1.setQtdPorcao(quantidade);
        
        System.out.println("Informe o segundo prato: ");
        descricao = sc.nextLine();
        descricao = sc.nextLine();
        c2.setDescricao(descricao);
        System.out.println("Informe o peso em gramas: ");
        peso = sc.nextFloat();
        c2.setPeso(peso);
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();               
        c2.setQtdPorcao(quantidade);
        
        System.out.println("Informe o terceiro prato: ");
        descricao = sc.nextLine();
        descricao = sc.nextLine();
        c3.setDescricao(descricao);
        System.out.println("Informe o peso em gramas: ");
        peso = sc.nextFloat();
        c3.setPeso(peso);
        System.out.println("Informe a quantidade: ");
        quantidade = sc.nextInt();               
        c3.setQtdPorcao(quantidade);
        
    }
}
