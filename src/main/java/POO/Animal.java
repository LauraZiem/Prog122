package POO;

import java.util.Scanner;

public class Animal {
    public String Nome;
    public String Habitat;
    public double peso;
    public String Origem;
    public boolean Perigoso;

    public Animal() {
    }

    public Animal(String Nome, String Habitat, double peso, String Origem, boolean Perigoso) {
        this.Nome = Nome;
        this.Habitat = Habitat;
        this.peso = peso;
        this.Origem = Origem;
        this.Perigoso = Perigoso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    public boolean isPerigoso() {
        return Perigoso;
    }

    public void setPerigoso(boolean Perigoso) {
        this.Perigoso = Perigoso;
    }
    
    public void Alimentar(){
        System.out.println("Qual alimento?");
        Scanner sc = new Scanner(System.in);
        String Alimento = sc.nextLine();
        System.out.println("O animal foi alimentado com " + Alimento);
    }
    
    public void Pesar(){
        System.out.println("O peso do animal é: " + peso);
    }
    
    public void MostrarAnimal(){
        System.out.println("Caracteísticas do animal: \n Nome -> " + Nome + 
                                                     "\n Habitat -> " + Habitat +
                                                     "\n Peso -> "+ peso + 
                                                     "\n Origem -> " + Origem + 
                                                     "\n É perigoso? -> " + Perigoso);
    }
    
    public String Correr(){
        return Nome + " Corra!";
    }

    @Override
    public String toString() {
        return "Animal{" + "Nome=" + Nome + ", Habitat=" + Habitat + ", peso=" + peso + ", Origem=" + Origem + ", Perigoso=" + Perigoso + '}';
    }
}
