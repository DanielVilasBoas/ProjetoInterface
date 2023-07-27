package service;

import componentes.Componente;
import controller.ComponenteController;

import java.util.LinkedList;
import java.util.List;

public class ComponenteService {

    ComponenteController cc = new ComponenteController();
    int quantidadeComponentes;
    double resultado;
    public double calcularTotal(LinkedList<Integer> listaOrdenada){
        LinkedList<Componente> listaComponentes = cc.popularComponentes();
        quantidadeComponentes = 0;
        for (Integer quantidade: listaOrdenada) {
            quantidadeComponentes += quantidade;
        }

        for (int i = 0; i < listaComponentes.size(); i++) {
            this.resultado += listaComponentes.get(i).getPreco() * listaOrdenada.get(i);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "O valor total dos produtos é R$ " + String.format("%.2f", resultado) + "." + "\n A quantidade de produtos escolhidos foi de " + quantidadeComponentes + ".";
    }
}
