package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoLeituraDelimitada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o nome do arquivo a ser lido:");
        String nome = ler.nextLine();
        
        System.out.println("Conteúdo do arquivo: ");
        try{
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while(linha != null){
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine();
            }
            arq.close();
        }catch(IOException ex){
            System.out.println("Erro ao tentar ler o arquivo.");
            System.out.println(ex.getMessage());
        }
    }
}