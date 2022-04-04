package formatarNumeros;

import java.text.NumberFormat;

public class Formatadores {
    
    public static void main(String[] args) {
        
        double n[] = { 523.34, 54344.23, 95845.223, 18084.895 };
        
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        
        for(int i = 0; i < n.length; i++){
            if(i != 0){
                System.out.println(numberFormat.format(n[i]));
                System.out.println(", ");
            }
        }
        System.out.println();
        
    }
    
}
