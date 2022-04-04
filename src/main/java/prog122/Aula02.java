package prog122;

import java.util.Scanner;

public class Aula02{
    
    //Método principal da classe(console)
    public static void main(String[] args){
        
        Scanner scanner; //Declaração da variável
        scanner = new Scanner(System.in); //Instanciando scanner
 
        String nome = "Olá Laura Ziem!";
        System.out.println(nome);
        
        System.out.println("Informe sua idade:");
        String age = scanner.nextLine();
        int idade = Integer.parseInt(age);
        
        String mensagem = "Informe C - casado ou S - solteiro:";
        System.out.println(mensagem);
        
        String estadoCivil = scanner.nextLine();
        
        String resumo = "Resumo: \n" + 
                        "Nome: " + nome + "\n" +
                        "Idade: " + idade + " anos. \n" +
                        "Estado Civil: " + estadoCivil;
        
        System.out.println(resumo);
        
        //Incrementar e Decrementar
        
        int a = 0;
        
        System.out.println(a);
        
        System.out.println(++a);
        System.out.println(++a);
        
        System.out.println(--a);
        System.out.println(--a);
    }
    
}