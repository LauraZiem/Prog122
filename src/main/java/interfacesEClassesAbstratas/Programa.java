package interfacesEClassesAbstratas;

public class Programa {
    
    public static void main(String[] args) {
        
        Musico musico = new Baixista();
        musico.afinarInstrumento();
        
        musico = new Baterista();
        musico.afinarInstrumento();
        
        musico = new Guitarrista();
        musico.afinarInstrumento();
        
        System.out.println("*******************************");
        
        System.out.println("TESTANDO INTERFACE VEICULO");
        
        Veiculo minhaMoto = new Moto();
        System.out.println("Qtd cavalos Moto: " + minhaMoto.getPotencia());
        
        Veiculo meuCarro = new Carro();
        System.out.println("Qtd cavalos Carro: " + meuCarro.getPotencia());
        
        Veiculo meuCaminhao = new Caminhao();
        System.out.println("Qtd cavalos Caminhão: " + meuCaminhao.getPotencia());
        
        System.out.println("O caminhão é um veículo de passeio? " + (meuCaminhao.isVeiculoDePasseio() ? "Sim" : "Não"));
        
    }
}
