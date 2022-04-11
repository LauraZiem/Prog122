package ExComida;

public class Cardapio {
    
    private Comida comida1;
    private Comida comida2;
    private Comida comida3;

    public Cardapio() {
        this.comida1 = new Comida();
        this.comida2 = new Comida();
        this.comida3 = new Comida();
    }

    public Cardapio(Comida comida1, Comida comida2, Comida comida3) {
        this.comida1 = comida1;
        this.comida2 = comida2;
        this.comida3 = comida3;
    }

    public Comida getComida1() {
        return comida1;
    }

    public void setComida1(Comida comida1) {
        this.comida1 = comida1;
    }

    public Comida getComida2() {
        return comida2;
    }

    public void setComida2(Comida comida2) {
        this.comida2 = comida2;
    }

    public Comida getComida3() {
        return comida3;
    }

    public void setComida3(Comida comida3) {
        this.comida3 = comida3;
    }
    
}
