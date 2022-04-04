package formatarNumeros;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatTest {
    
    public static void main(String[] args) {
        
        String valorFormatado = new DecimalFormat("#,##0.00").format(12005.11);
        
        System.out.println("Valor DecimalFormat: " + valorFormatado);
        
        //Aplicando Locale ao DecimalFormat: 
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.CHINESE);
        DecimalFormat df = (DecimalFormat)nf; //Aplico o CAST / CONVERSÃO DE TIPO
        df.applyPattern("#,##0.00");
        String output = df.format(12005.11);
        System.out.println("Valor DecimalFormat chinês: " + output);
        
        double valor = 2000.0;
        double vezes = 3.0;
        double prestacao = valor/vezes;
        
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String dx = decimalFormat.format(prestacao);
        System.out.println("Valor da prestação: " + dx);
        
    }
    
}
