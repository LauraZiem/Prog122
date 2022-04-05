package POO;

public class Carro {
    
    // *Atributos:
    public String Marca;
    public String Modelo;
    public int Ano;
    public boolean temAirBag;
    public String Cor;

    // *Construtores:
    // A regra básica é de que o método cnstrutor deve possuir o mesmo nome que a classe
    // Alt + Insert -> Constructor
    public Carro(String Marca, String Modelo, int Ano, boolean temAirBag, String Cor) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.temAirBag = temAirBag;
        this.Cor = Cor;
    }
    
    public Carro(String Marca, String Modelo, int Ano, boolean temAirBag) { 
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.temAirBag = temAirBag;
    }

    public Carro() {
    }
    
    // *Métodos:
    // Alt + Insert -> toString()
    @Override
    public String toString() {
        return "Carro{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Ano=" + Ano + ", temAirBag=" + temAirBag + ", Cor=" + Cor + '}';
    }
    
}
