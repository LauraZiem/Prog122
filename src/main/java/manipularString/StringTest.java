package manipularString;

public class StringTest {
    
    public static void main(String[] args) {
        
        //CHAR SEMPRE EM ASPAS SIMPLES '' 
        char c1 = 'A'; //char do tipo primitivo
        Character c2 = 'B'; //char tipo Abstrato
        
        //VETOR:
        char vogais[] = {'a','e','i','o','u'};
        System.out.println(vogais);
        System.out.println("\n");
        
        System.out.println("Posição 0: " + vogais[0]);
        System.out.println("Posição 2: " + vogais[2]);
        System.out.println("Última posição: " + vogais[4]);
        System.out.println("\n");
        
        //Obter tamanho do vetor:
        System.out.println("O tamanho do vetor vogais: " + vogais.length);
        
        //Então para obter o último valor armazenado, independente de sei tamanho:
        System.out.println("Última posição: " + vogais[vogais.length - 1]);
        
        System.out.println("\n");
        
        /*
            Como compara Strings:
            A comparação entre conjuntos de caracteries é diferente da comparação
            entre números ou tipos mais simples. Utilizamos a função compareTo();
        */
        String valor = "Programando em Java";
        System.out.println(
                (valor.compareTo(valor.toUpperCase()) == 0 ? true : false) //? -> SE; : -> SENÃO
        );
        
        System.out.println("\n");
        
        //Obter o UNICODE do caracter
        System.out.println("UNICODE de a: " + valor.codePointAt(0));
        System.out.println("UNICODE de e: " + valor.codePointAt(1));
        System.out.println("UNICODE de i: " + valor.codePointAt(2));
        System.out.println("UNICODE de o: " + valor.codePointAt(3));
        System.out.println("UNICODE de u: " + valor.codePointAt(4));
        System.out.println("\n");
        
        //Checar se a String começa com ou termina com um determinado texto:
        String texto = "DEVELOPER JAVA";
        //Começa:
        System.out.println(
                "Coemça com DEV? " + texto.startsWith("DEV")
        );
        //Termina:
        System.out.println(
                "Termina com JAVA? " + texto.endsWith("JAVA")
        );
        
    }
    
}
