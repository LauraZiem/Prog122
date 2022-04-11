package POO;

public class ExecutandoCarro {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Celta", 2005, false, "Branco");
        Carro carro2 = new Carro("Nissan", "March", 2019, true);
        
        System.out.println("Carro 1 = " + carro1.toString());
        System.out.println("Carro 2 = " + carro2.toString());
        
        System.out.println("****************************");
        
        // Parar não retorna nada, ele mesmo imprime a mensagem
        carro2.Parar();
        // Andar não imprime a mensagem, apenas retorna a mensagem, por isso precisamos imprimir o retorno de Andar()
        carro2.Andar();
        System.out.println(carro2.Andar());
        
        System.out.println("****************************");
        
        System.out.println("Qual o carro mais novo?");
        if(carro1.getAno() > carro2.getAno()){
            System.out.println("Carro 1 é mais novo");
        }else{
            System.out.println("Carro 2 é mais novo");
        }
        
    }
    
}
