package ExComida;

public class Comida {

    private Integer QtdPorcao;
    private Float Peso;
    private String Descricao;

    public Comida() {
    }

    public Comida(Integer QtdPorcao, Float Peso, String Descricao) {
        this.QtdPorcao = QtdPorcao;
        this.Peso = Peso;
        this.Descricao = Descricao;
    }

    public Integer getQtdPorcao() {
        return QtdPorcao;
    }

    public void setQtdPorcao(Integer QtdPorcao) {
        this.QtdPorcao = QtdPorcao;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float Peso) {
        this.Peso = Peso;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
