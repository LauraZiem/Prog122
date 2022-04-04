package formatarNumeros;

import java.util.Scanner;

public class ValidarNumeros {
    
    public static void main(String[] args) {
        
        try{
            System.out.println("Informe um número: ");
            Scanner sc = new Scanner(System.in);
            String valor = sc.nextLine();
            
            Integer i = Integer.valueOf(valor);
            int i2 = Integer.parseInt(valor);
            
            Float f = Float.valueOf(valor);
            float f2 = Float.parseFloat(valor);
            
            Double d = Double.valueOf(valor);
            double d2 = Double.parseDouble(valor);
            
            System.out.println("O valor informado é um número válido!");
        }
        catch(NumberFormatException ex){
            System.out.println("O valor informado não é um número válido!");
            System.out.println(ex.toString());
        }
        
    }
    
}
