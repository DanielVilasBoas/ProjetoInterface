package pessoas;

public class Pessoa {
    private String nome;
    private String CPF;
    private Endereco localiza;

    public Pessoa(String nome, String cpf, Endereco local){
        this.nome = nome;
        CPF = cpf;
        localiza = local;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public Endereco getLocaliza() {
        return localiza;
    }

    public void setLocaliza(Endereco localiza) {
        this.localiza = localiza;
    }
}
