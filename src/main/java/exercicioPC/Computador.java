package exercicioPC;

public class Computador {
    private String Marca;
    private String Processador;
    private float CapacidadeMemoria;
    private float CapacidadeHD;
    private boolean BomPraJogo;

    public Computador() {
    }

    public Computador(String Marca, String Processador, float CapacidadeMemoria, float CapacidadeHD) {
        this.Marca = Marca;
        this.Processador = Processador;
        this.CapacidadeMemoria = CapacidadeMemoria;
        this.CapacidadeHD = CapacidadeHD;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String Processador) {
        this.Processador = Processador;
    }

    public float getCapacidadeMemoria() {
        return CapacidadeMemoria;
    }

    public void setCapacidadeMemoria(float CapacidadeMemoria) {
        this.CapacidadeMemoria = CapacidadeMemoria;
    }

    public float getCapacidadeHD() {
        return CapacidadeHD;
    }

    public void setCapacidadeHD(float CapacidadeHD) {
        this.CapacidadeHD = CapacidadeHD;
    }

    public boolean isBomPraJogo() {
        if(CapacidadeMemoria>8 && CapacidadeHD>500){
            return true;
        }
        else{
            return false;
        }
    }

    public void setBomPraJogo(boolean BomPraJogo) {
        if(CapacidadeMemoria>8 && CapacidadeHD>500){
            this.BomPraJogo = true;
        }
        else{
            this.BomPraJogo = false;
        }
    }
}