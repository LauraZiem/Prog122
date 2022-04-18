package interfacesEClassesAbstratas;

public class Carro implements Veiculo{

    @Override
    public int getQuantidadeDePneus() {
        return 4;
    }

    @Override
    public boolean isVeiculoDePasseio() {
        return true;
    }

    @Override
    public int getPotencia() {
        return 80;
    }
    
}
