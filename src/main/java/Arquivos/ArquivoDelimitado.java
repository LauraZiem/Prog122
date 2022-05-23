package Arquivos;

import java.io.File;
import java.io.FileOutputStream;

public class ArquivoDelimitado {
    public static void main(String[] args) {
        String texto = "1;seu;nome;25" + "\n" + "2;joao;carlos;32";
        System.out.println(texto);
        
        System.out.println("LOG: GERANDO ARQUIVO...");
        File arquivo = new File("arquivoDelimitado.txt");
        try{
            FileOutputStream fos = new FileOutputStream(arquivo);
            fos.write(texto.getBytes());
            fos.close();
        }catch(Exception ex){
            System.out.println("OCORREU UM ERRO...");
            System.out.println(ex.getMessage());
        }
    }
}
