package pessoas;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, Endereco local, String funcao){
        super(nome, cpf, local);
        this.cargo = funcao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }
}
