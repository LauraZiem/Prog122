package interfacesEClassesAbstratas;

/*
    Classe Abstrata:
    Permite a definição de métodos que serão sobrescritos posteriormente, outros
    objetos que herdem da SUPER CLASSE poderão apresentar comportamentos distintos
*/
public abstract class Musico {
    /*
        Esse método não possui implementação
        Ele apensa é declarado ou especificado
    */
    public abstract String getNomeDoInstrumento();
    
    /*
        Esse métofo concreto possui implementaão
        Ele é declarado e IMPLEMEMTADO normalmente
    */
    public void afinarInstrumento(){
        System.out.println("Estou afinando a/o " + getNomeDoInstrumento());
    }
    
}
