package pessoas;

public class Endereco {
     int numero;
     String rua;
     String bairro;
     String cidade;
     String estado;

    public Endereco(int num, String aRua, String oBairro, String aCidade, String oEstado){
        this.numero = num;
        this.rua = aRua;
        this.bairro = oBairro;
        this.cidade = aCidade;
        this.estado = oEstado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
