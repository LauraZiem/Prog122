package excecoes;

public class Comum {
    
    public static void main(String[] args) {
        
        int i = 5571;
        
        try{
            i = i/0;
            System.out.println("O resultado é: " + i);
        }
        catch(ArithmeticException ae){
            System.out.println("O resultado é: " + ae.getMessage());
        }
    }
    
}
