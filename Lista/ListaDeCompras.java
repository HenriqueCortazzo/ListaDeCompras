package Lista;

import javax.swing.*;
import java.util.ArrayList;

public class ListaDeCompras {
    private final ArrayList<String> lista = new ArrayList<>();
    private final ArrayList<Integer> quant = new ArrayList<>();
    private final ArrayList<Double> prod = new ArrayList<>();
    private final ArrayList<Double> vTotal = new ArrayList<>();

    public ListaDeCompras() {
        paginaInicial();
    }

    private void paginaInicial() {
        String opcao = JOptionPane.showInputDialog(null, "LISTA DE COMPRAS\n\n 1 - Adicionar item á lista \n 2 - Editar item da lista \n 3 - Excluir item da lista \n 4 - Visualizar itens da lista \n 5 - Limpar itens da lista \n 6 - Recuperar itens da lista  \n 7 - Fechar Sistema\n\n");
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
        boolean tudoOk = false;
        do {
            double valorProd;
            int qtd;
            String nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome do produto: ");
            for (String s : lista) {
                if (nomeProduto.equalsIgnoreCase(s)) {
                    JOptionPane.showMessageDialog(null, "Esse produto já foi cadastrado.");
                    paginaInicial();
                }
            }
            String qtdItem = JOptionPane.showInputDialog(null, "Quantidade: ");
            String valorProduto = JOptionPane.showInputDialog(null, "Valor: ");
            double valorResultante;
            if (!nomeProduto.isEmpty() && !qtdItem.isEmpty() && !valorProduto.isEmpty()) {
                valorProd = Double.parseDouble(valorProduto);
                qtd = Integer.parseInt(qtdItem);
                valorResultante = qtd * valorProd;
                lista.add(nomeProduto);
                quant.add(Integer.valueOf(qtdItem));
                prod.add(Double.valueOf(valorProduto));
                vTotal.add(valorResultante);
                JOptionPane.showMessageDialog(null, "Produto listado com sucesso.");
                tudoOk = true;
            } else JOptionPane.showMessageDialog(null, "É necessário preencher todas as informações para prosseguir.");
        } while (!tudoOk);
        paginaInicial();
    }

    private void excluirItem() {
        boolean tudoOk = false;
        do {
            if (!lista.isEmpty()) {
                String nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome do produto que deseja excluir: ");
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).equalsIgnoreCase(nomeProduto)) {
                        lista.remove(i);
                        tudoOk = true;
                        JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                        break;
                    }
                }
                paginaInicial();
            } else {
                JOptionPane.showMessageDialog(null, "ERRO ! Não há produtos cadastrados");
                paginaInicial();
            }
        } while (!tudoOk);
    }

    private void visualizarlista() {
        if (!lista.isEmpty()) {
            String resultado = "PRODUTO   QNTD   VALOR UN   VALOR TOTAL\n";
            for (int i = 0; i < lista.size(); i++) {
                resultado += String.format("%-18s   %-9d   %-16.2f   %-15.2f\n", lista.get(i).toUpperCase(), quant.get(i), prod.get(i), vTotal.get(i));
            }
            JOptionPane.showMessageDialog(null, resultado);
            paginaInicial();
        } else {
            JOptionPane.showMessageDialog(null, "ERRO ! Não há produtos cadastrados");
            paginaInicial();
        }
    }

    private void editarItem() {
        if (!lista.isEmpty()) {
            String opcao = JOptionPane.showInputDialog(null, "Digite o valor referente ao que deseja editar: \n\n 1 - Nome do Produto \n 2 - Quantidade \n 3 - Valor");
            do {
                switch (opcao) {
                    case "1":
                        String nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome que deseja editar: ");
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).equalsIgnoreCase(nomeProduto)) {
                                String novoProduto = JOptionPane.showInputDialog(null, "Digite o novo nome do produto");
                                lista.set(i, novoProduto);
                                JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
                                break;
                            }
                        }
                        paginaInicial();
                        break;
                    case "2":
                        nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome que deseja editar: ");
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).equalsIgnoreCase(nomeProduto)) {
                                String novoProduto = JOptionPane.showInputDialog(null, "Digite o nova quantidade do produto");
                                int novoProd = Integer.parseInt(novoProduto);
                                quant.set(i, novoProd);
                                vTotal.set(i, quant.get(i) * prod.get(i));
                                JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
                                break;
                            }
                        }
                        paginaInicial();
                        break;
                    case "3":
                        nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome que deseja editar: ");
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).equalsIgnoreCase(nomeProduto)) {
                                String novoProduto = JOptionPane.showInputDialog(null, "Digite o novo valor do produto");
                                double novoProd = Double.parseDouble(novoProduto);
                                prod.set(i, novoProd);
                                vTotal.set(i, quant.get(i) * prod.get(i));
                                JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
                                break;
                            }
                        }
                        paginaInicial();
                        break;
                    default:
                        opcao = JOptionPane.showInputDialog(null, "Digite o valor referente ao que deseja editar: \n\n 1 - Nome do Produto \n 2 - Quantidade \n 3 - Valor");
                        break;
                }
            } while (!opcao.equalsIgnoreCase("0"));
        } else {
            JOptionPane.showMessageDialog(null, "ERRO ! Não há produtos cadastrados");
            paginaInicial();
        }
    }

    private void limparLista() {
        lista.clear();
        JOptionPane.showMessageDialog(null, "Todos os itens foram excluídos com sucesso");
    }

    private void recuperarLista() {

    }
}
