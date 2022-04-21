package POO;

public class Zoologico {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cobra", "Terra", 5, "Austrália", true);
        Animal animal2 = new Animal("Abelha", "Ar", 0.2, "EUA", false);
        Animal animal3 = new Animal("Leão", "Terra", 250, "África", true);
        Animal animal4 = new Animal("Cachorro", "Terra", 10, "Rússia", false);
        Animal animal5 = new Animal("Tubarão", "Mar", 20, "Brasil", true);
        
        animal1.Alimentar();
        
        if (animal3.getPeso() > 200)
            System.out.println("Fazer regime!");
        else
            System.out.println("Peso ideal!");
        
        System.out.println("O nome do animal é: " + animal1.getNome());
        System.out.println("O nome do animal é: " + animal2.getNome());
        System.out.println("O nome do animal é: " + animal3.getNome());
        System.out.println("O nome do animal é: " + animal4.getNome());
        System.out.println("O nome do animal é: " + animal5.getNome());
    }
}
