package matrizMultidimensional;

public class Programa {
    
    public static void main(String[] args) {
        
        String[][] names = {
            {"Senhor", "Senhora", "Senhorita"},
            {"Smith", "Jones", "Pietra"}
        };
        
        //Senhor Smith:
        System.out.println(names[0][0] + " " + names[1][0]);
        //Senhora Jones:
        System.out.println(names[0][1] + " " + names[1][1]);
        //Senhorita Pietra:
        System.out.println(names[0][2] + " " + names[1][2]);
        
        
        System.out.println("*********************");
        
        //Acessando todos os indices da matriz bidimensional dinamicamente:
        for(int i = 0; i < names[0].length; i++){
            //System.out.println(names[0][i]);
            String pronome = names[0][i];
            for(int y = 0; y < names[1].length; y++){
                String nome = names[1][y];
                //System.out.println(names[0][i] + " " + names[1][y]);
                System.out.println(pronome + " " + nome);
            }
        }
        
    }
    
}
