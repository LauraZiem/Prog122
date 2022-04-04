package calendario;

import static java.lang.Integer.max;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm");
        System.out.println("Data personalizada: " + sdf.format(hoje));

        LocalDate localDate = LocalDate.now().withMonth(12).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println( "Valor máximo de ano: "+ localDate.format(DateTimeFormatter.ofPattern("yyyy")));
        
        localDate = LocalDate.now().withMonth(12).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println( "Valor máximo de mês: "+ localDate.format(DateTimeFormatter.ofPattern("MM")));
        
        localDate = LocalDate.now().withMonth(12).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println( "Valor máximo de dia: "+ localDate.format(DateTimeFormatter.ofPattern("dd")));
        
        localDate = LocalDate.now().withMonth(12).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println( "Valor máximo da data do ano corrente: "+ localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
    }
}
