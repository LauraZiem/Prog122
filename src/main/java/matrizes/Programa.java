package matrizes;

public class Programa {
    
    public static void main(String[] args) {
        
        int [] vetorInteiros = new int[10];
        
        vetorInteiros[0] = 1;
        vetorInteiros[1] = 2;
        vetorInteiros[2] = 3;
        vetorInteiros[3] = 4;
        vetorInteiros[4] = 5;
        vetorInteiros[5] = 6;
        vetorInteiros[6] = 7;
        vetorInteiros[7] = 8;
        vetorInteiros[8] = 9;
        vetorInteiros[9] = 10;
        
        System.out.println("\n");
        System.out.println("*******Lendo Matriz com For *******");
        System.out.println("\n");
        
        for(int i = 0; i < vetorInteiros.length; i++){
            System.out.println("VetorInteiros[" + i + "] = " + vetorInteiros[i]);
        }
        
        //Inicializando uma matriz/vetor já com valores expecíficos:
        int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        
        System.out.println("\n");
        System.out.println("*******Lendo Matriz com While *******");
        System.out.println("\n");
        
        int y = 0;
        while(y < anArray.length){
            System.out.println("anArray[" + y + "] = " + anArray[y]);
            y++;
        }
        
    }
    
}
