package excecoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String line = "";
        
        try{
            FileReader fr = new FileReader("exemplo.txt");
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Erro: " + fnfe.getMessage());
            System.out.println("Exceção: " + fnfe.toString());
        }
        
    }
    
}
