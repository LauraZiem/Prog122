package variaveisTipadas;

public class Variables { //Começo do escopo Variables
    /*
    Variáveis globais: 
    Pertencem a ESCOPO da classe, todos os membros 
    da classe conseguem acessá-la
    */
    static long x;
    static int y;
    /*
    Por precisar acessar essas var globais no método principal, 
    em ele sendo STATIC(imutável, não precisa ser instanciado para invocar) 
    as variáveis também devem ser estáticas.
    */
    
    //Atalho psvm + Tab 
    public static void main(String[] args) { //Começo do escopo Main
        
        x = 214783647;
        x++; // mesma coisa que x = x + 1
        
        //Atalho sout + Tab
        System.out.println("O valor de x é: "+x);
        
        /*
        Na programação a precedência das operações em expressões aritméticas são
        definidas com o uso dos parênteses. Primeiro é executado o mais de dentro e por ai vai
        */
        System.out.println( ("Conta: " + ( (x + y) * 30)) );
        System.out.println("****************************");
        
        float fNumber = 5.5f;
        double dNumber = 5.5;
        
        System.out.println("Dividindo Float por Double:");
        System.out.println((fNumber / dNumber));    
        
        System.out.println("****************************");
        
        //Podemos também realizar a conversão de tipos ela pode ser feita de duas formas:
        String castNumber = "0123";
        //Implícita:
        fNumber = (float)5/6;
        //Explícita:
        int numberCasted = Integer.parseInt(castNumber);
        float fNumberCasted = Float.parseFloat(castNumber);
        
        System.out.println("CastNumber em inteiro = " + numberCasted);
        System.out.println("CastNumber em Float = " + fNumberCasted);
        System.out.println("CastNumber em Float = " + fNumber);
        System.out.println("****************************");
        
        /*
        Operações com String:
        Podemos manipular os conjuntos de caracteries de diversas formas. Algumas
        das principais:
        */
        
        //Concatenação:
        String s1 = "\t Eu \n";
        String s2 = "\t vou \n";
        String s3 = "\t apender \n";
        /*
        Colocar "" em uma palavra da String(não pode por ser a delimitadora): 
        Colocar \ antes delas(\")[PARA QUAQUEL CARACTER DIFERENTE]
        */
        String s4 = "\t \"java\"!";
        // ^ \t da um TAB e \n passa para a próxima linha
        String resultado = s1 + s2 + s3 + s4;
        
        //v Tudo com letras Maiúsculas:
        System.out.println(resultado.toUpperCase());
        
        System.out.println("****************************");
        
        //v Trocar uma coisa por outra e deixar tudo em minúsculo:
        System.out.println(resultado.replace("Eu vou", "Nós vamos").toLowerCase());
        
        
        
    } //Fim do escopo do método Main
    
} //Fim do escopo da classe Variables
