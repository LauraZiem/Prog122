package formatarNumeros;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatSymbolsTest {
    
    public static void main(String[] args) {
        
        DecimalFormatSymbols unusualSymbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        
        unusualSymbols.setDecimalSeparator('|');
        unusualSymbols.setGroupingSeparator('^');
        
        String strange = "#,##0.###";
        DecimalFormat weirdFormatter = new DecimalFormat(strange, unusualSymbols);
        weirdFormatter.setGroupingSize(4);
        
        String bizarro = weirdFormatter.format(12345.678);
        System.out.println("Formatador bizarro: " + bizarro);
        
    }
}
