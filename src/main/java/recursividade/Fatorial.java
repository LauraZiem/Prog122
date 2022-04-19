package recursividade;

public class Fatorial {
    public long Fatorial(int n){
        // Caso base:
        if(n == 0)
            return 1;
        else // Passo Fatorial
            return n * Fatorial(n - 1);
    }
}
