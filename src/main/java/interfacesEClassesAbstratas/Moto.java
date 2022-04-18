package interfacesEClassesAbstratas;

public class Moto implements Veiculo{
    
    @Override
    public int getQuantidadeDePneus() {
        return 2;
    }

    @Override
    public boolean isVeiculoDePasseio() {
        return true;
    }

    @Override
    public int getPotencia() {
        return 30;
    }
    
}
