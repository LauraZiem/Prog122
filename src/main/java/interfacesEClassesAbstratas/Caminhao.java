package interfacesEClassesAbstratas;

public class Caminhao implements Veiculo{
    
    @Override
    public int getQuantidadeDePneus() {
        return 6;
    }

    @Override
    public boolean isVeiculoDePasseio() {
        return false;
    }

    @Override
    public int getPotencia() {
        return 130;
    }
    
}
