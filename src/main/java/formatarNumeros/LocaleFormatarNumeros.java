package formatarNumeros;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleFormatarNumeros {
    
    public static void main(String[] args) {
        
        Locale localeBR = new Locale("pt", "BR");
        Locale localeUS = new Locale("en", "US");
        
        double valorReal = 291933.1233;
        float valorPercentual = 0.11f;
        int valorInteiro = 82819912;
        
        NumberFormat inteiro = NumberFormat.getInstance();
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
        
        System.out.println("********* PT BR *********");
        System.out.println("Inteiro: " + inteiro.format(valorInteiro));
        System.out.println("Dinheiro: " + dinheiro.format(valorReal));
        System.out.println("Percentual: " + percentual.format(valorPercentual));
        System.out.println("Número formatado: " + numberFormat.format(valorReal));
        
        NumberFormat inteiroUS = NumberFormat.getInstance();
        NumberFormat dinheiroUS = NumberFormat.getCurrencyInstance(localeUS);
        NumberFormat percentualUS = NumberFormat.getPercentInstance(localeUS);
        NumberFormat numberFormatUS = NumberFormat.getNumberInstance(localeUS);
        
        System.out.println("********* EN US *********");
        System.out.println("Inteiro: " + inteiroUS.format(valorInteiro));
        System.out.println("Dinheiro: " + dinheiroUS.format(valorReal));
        System.out.println("Percentual: " + percentualUS.format(valorPercentual));
        System.out.println("Número formatado: " + numberFormatUS.format(valorReal));
        
    }
    
}
