package interfacesEClassesAbstratas;

// A palavra-chave extends aplica o conceito de herança
// O baixista teoricamente é um músico
// Tudo que estuver expecificado em Musico é automaticamente herdado por baixista
public class Baixista extends Musico{
    
    // A NOTAÇÃO @Override é aplicada de modo que o método abstrato definido na
    // classe base, ou classe pai(Musico) seja subescrita e tenha um comportamento
    // diferenciado na classe filha (Baixista)
    @Override
    public String getNomeDoInstrumento() {
        return "Baixo";
    }
    
}
