package Lista;

import javax.swing.*;
import java.util.ArrayList;

public class ListaDeCompras {

    private ArrayList<String> lista = new ArrayList<>();


    public ListaDeCompras() {
        paginaInicial();
    }

    private void paginaInicial() {
        JOptionPane.showInputDialog(null, "1 - Adicionar item á lista \n 2 - Editar item da lista \n 3 - Excluir item da lista \n 4 - Visualizar itens da lista \n 5 - limpar itens da lista \n 6 - recuperar itens da lista\n 7 - Fechar Sistema\n");
    }

    private void adicionarItem() {

    }

    private void excluirItem() {

    }

    private void visualizarItem() {

    }

    private void editarItem() {

    }
}
