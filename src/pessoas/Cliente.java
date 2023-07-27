package pessoas;

public class Cliente extends Pessoa {
    private String pedido;

    public Cliente(String nome, String cpf, Endereco local, String pediu){
        super(nome, cpf, local);
        pedido = pediu;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getPedido() {
        return pedido;
    }
}
