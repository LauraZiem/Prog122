package exercicioPC;

public class Notebook extends Computador{
    
    private float DurBateria;

    public Notebook() {
    }
    
    public Notebook( float durBateria, String Marca, String Processador, float CapacidadeMemoria, float CapacidadeHD) {
        super(Marca, Processador, CapacidadeMemoria, CapacidadeHD);
        this.DurBateria = durBateria;
    }

    
    public float getDurBateria() {
        return DurBateria;
    }

    public void setDurBateria(float DurBateria) {
        this.DurBateria = DurBateria;
    }
}
