package formatarNumeros;

import java.text.NumberFormat;

public class FormataNumero {
    
    public static void main(String[] args) {
        
        String valorFormatado = NumberFormat.getCurrencyInstance().format(11111111.11);
        System.out.println(valorFormatado);
        
    }
    
}
