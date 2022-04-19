package recursividade;

import java.util.Scanner;

public class ContagemRegressiva {
    public void Contagem(int n){
        Scanner sc = new Scanner(System.in);
        
        if(n == 0)
            System.out.println("FOGO!");
        else{
            System.out.println(n);
            Contagem(n - 1);
        }
    }
}
