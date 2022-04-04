package calendario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CalendarioTeste {
    
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        
        //Informação original do calendário:
        
        /*
        System.out.println("Calendário original: " + c.toString());
        
        System.out.println("Dia da semana: " + Calendar.DAY_OF_WEEK);
        System.out.println("Dia do mês: " + Calendar.DAY_OF_MONTH);
        System.out.println("Dia da ano: " + Calendar.DAY_OF_YEAR);
        */
        
        //Setando as configurações:
        //Date d = new Date();
        Calendar cl = Calendar.getInstance();
        //cl.add(Calendar.DAY_OF_YEAR, 5); //adiciona dia
        cl.add(Calendar.DAY_OF_YEAR, -2); //Subtrai dias
        cl.add(Calendar.MONTH, 1); //Adiciona mês
        cl.add(Calendar.YEAR, 1); //Adiciona Ano
        
        System.out.println("Data Natural: " + cl.getTime());
        
        //Formatar data:
        
        //DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT); //Data dd/mm/aaaa
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL); //dia semana, dia de mes de ano
        //DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG); //dia de mês de ano
        System.out.println("Data formatada: " + dateFormat.format(cl.getTime())); 
        
        //Formatação personalizada en texto:
        Date hoje = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data personalizada: " + sdf.format(hoje));
        
        //Localixação(fuso):
        Locale brasil = new Locale("pt","br"); //Brasil
        
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", brasil);
        System.out.println("Hora Brasil:" + sdf.format(hoje));
        
        //Validando entrada de data
        boolean aux = true;
        
        do{
          Date dateEntry = new Date();
          SimpleDateFormat ssdf = new SimpleDateFormat("DD/MM/YYYY");
          System.out.println("Digite a data do seu nascimento:");
          Scanner sc = new Scanner(System.in);
          String texto = sc.nextLine();
          
          try{
              dateEntry = ssdf.parse(texto);
              aux = false;
              System.out.println("Data válida!");
          }catch(Exception ex){
              //throw ex;
              System.out.println("Data inválida!");
              aux =  true;
          }
        }while(aux);

    }
}
