package Arquivos;

import java.io.File;
import java.io.FileOutputStream;

public class ArquiviFixo {
    public static void main(String[] args) {
        int numero = 7;
        float valor = 100.00f;
        String nome, linha;
        int idade = 45;
        
        nome = "Laura Ziem Teles França";
        
        String numerof = String.format("%10.2f\n", valor);
        numerof = numerof.replace(",", "");
        String str = String.format("%010d", Integer.parseInt(numerof.trim()));
        linha = String.format("%05d", numero) + String.format("%45.45s", nome) + String.format("%05d", idade) + str + "\n";
        
        System.out.println("LOG: TRABALHANDO COM ESTRUTURAS DE DADOS FIXO PARA ARQUIVOS");
        System.out.println(linha);
        
        System.out.println("LOG: GERANDO ARQUIVO...");
        File arquivo = new File("arquivoFixo.txt");
        
        try{
            FileOutputStream fos = new FileOutputStream(arquivo);
            fos.write(linha.getBytes());
            fos.close();
        }catch(Exception ex){
            System.out.println("OCORREU UM ERRO...");
            System.out.println(ex.getMessage());
        }
    }
}
