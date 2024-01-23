package Lista;

import javax.swing.*;
import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<String> lista = new ArrayList<>();
    private ArrayList<String> listaBackup = new ArrayList<>();

    public ListaDeCompras() {
        paginaInicial();
    }

    private void paginaInicial() {
        String opcao = JOptionPane.showInputDialog(null, "LISTA DE COMPRAS\n\n 1 - Adicionar item á lista \n 2 - Editar item da lista \n 3 - Excluir item da lista \n 4 - Visualizar itens da lista \n 5 - limpar itens da lista \n 6 - recuperar itens da lista  \n 7 - Fechar Sistema\n\n");
        boolean opcaoEscolhida = true;
        do {
            switch (opcao) {
                case "1":
                    adicionarItem();
                    break;
                case "2":
                    editarItem();
                    break;
                case "3":
                    excluirItem();
                    break;
                case "4":
                    visualizarlista();
                    break;
                case "5":
                    limparLista();
                    break;
                case "6":
                    recuperarLista();
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    opcaoEscolhida = false;
                    JOptionPane.showMessageDialog(null, "Nenhuma opção foi selecionada, tente novamente");
                    opcao = JOptionPane.showInputDialog(null, "LISTA DE COMPRAS\n\n 1 - Adicionar item á lista \n 2 - Editar item da lista \n 3 - Excluir item da lista \n 4 - Visualizar itens da lista \n 5 - Limpar itens da lista \n 6 - Recuperar itens da lista  \n 7 - Fechar Sistema\n\n");
                    break;
            }
        } while (!opcaoEscolhida);
    }
    private void adicionarItem() {

    }

    private void excluirItem() {

    }

    private void visualizarlista() {

    }

    private void editarItem() {

    }

    private void limparLista() {

    }

    private void recuperarLista() {

    }
}
