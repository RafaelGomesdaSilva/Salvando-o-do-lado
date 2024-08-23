package br.ulbra.projetolista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Lista {

    public ArrayList lista;

    public Lista() {
        lista = new ArrayList();
    }

    public void salvar(String a) {
        if (a.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "não foi salvo nada");
        } else {
            lista.add(a);
            JOptionPane.showMessageDialog(null, a + " salvo com sucesso.");
        }
    }

    public String listar() {
        String elementos = "lista : \n";
        if (lista.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < this.lista.size(); i++) {
                elementos += i + " - " + lista.get(i) + "\n";
            }

            return elementos;
        }

    }

    public void alterar(int i, String novoElemento) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        } else if (i >= lista.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "Perfume inexistente");
        } else {
            lista.set(i, novoElemento);
            JOptionPane.showMessageDialog(null, lista.get(i) + " foi alterado para: " + novoElemento);
        }
    }

    public void remover(int i) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        } else if (i >= lista.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "Perfume inexistente");
        } else {
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Perfume removido");
        }
    }
}
