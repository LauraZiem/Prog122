package calendario;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
       Calendar cal = Calendar.getInstance();
       cal.setTime(new Date());
        
        boolean i = true;
        
        do{
            SimpleDateFormat form = new SimpleDateFormat("yyy/MM/dd hh:mm");
            System.out.println("Informe a data e a hora do seu nacimento(ano/mês/dia horas:minutos): ");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            try{
                Date DataEntrada = new Date();
                DataEntrada = form.parse(data);
                System.out.println("A data e a hora do seu nascimento é: " + DataEntrada);
                i = false;
            }catch(Exception ex){
                System.out.println("Data Inválida");
                i = true;  
            }

        }while(i== true);
        
        System.out.println("o dia máximo é : " + cal.getActualMaximum(cal.DAY_OF_MONTH));
        System.out.println("o mês máximo é : " + cal.getActualMaximum(cal.MONTH));
        System.out.println("o ano máximo é : " + cal.getActualMaximum(cal.YEAR));
    }
}