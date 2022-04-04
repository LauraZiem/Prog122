package matrizMultidimensional;

public class execicio01 {
    
    public static void main(String[] args) {
        
        int[][] i = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {6, 7, 8, 9, 10}
        };

        for(int x = 0; x < i.length; x++){
            for(int y = 0; y < i[x].length; y++){
                int mult = (x + y);
                int result = i[x][y] * mult;
                System.out.println("i[" + y + "] * " + mult + " = " + result);
            }
        }
    }
    
}
