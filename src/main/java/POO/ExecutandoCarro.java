package POO;

public class ExecutandoCarro {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Celta", 2005, false, "Branco");
        Carro carro2 = new Carro("Nissan", "March", 2019, true);
        
        System.out.println("Carro 1 = " + carro1.toString());
        System.out.println("Carro 2 = " + carro2.toString());
        
        System.out.println("Qual o carro mais novo?");
        if(carro1.Ano > carro2.Ano){
            System.out.println("Carro 1 é mais novo");
        }else{
            System.out.println("Carro 2 é mais novo");
        }
    }
    
}
