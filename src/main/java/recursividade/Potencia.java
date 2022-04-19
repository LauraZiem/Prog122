package recursividade;

public class Potencia {
    public int Potencia(int x, int n){
        if(n == 0)
            return 1;
        else
            return x * Potencia(x, n - 1);
    }
}
