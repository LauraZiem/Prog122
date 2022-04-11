package POO;

public class Carro {
    
    // *Atributos:
    private String Marca;
    private String Modelo;
    private int Ano;
    private boolean temAirBag;
    private String Cor;

    // *Construtores:
    // A regra básica é de que o método construtor deve possuir o mesmo nome que a classe
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
    
    // Geters e Seters:

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public boolean isTemAirBag() {
        return temAirBag;
    }

    public void setTemAirBag(boolean temAirBag) {
        this.temAirBag = temAirBag;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public void Parar(){
        System.out.println("O " + this.Modelo + " parou!");
    }
    
    public String Andar(){
        return "O carro " + this.Modelo + " voltou a andar!";
    }
    
    // *Métodos:
    // Alt + Insert -> toString()
    
    @Override
    public String toString() {
        return "Carro{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Ano=" + Ano + ", temAirBag=" + temAirBag + ", Cor=" + Cor + '}';
    }
    
}
