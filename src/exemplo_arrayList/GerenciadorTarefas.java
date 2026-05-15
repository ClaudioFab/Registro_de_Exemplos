
package exemplo_arrayList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorTarefas {

    //Inicializando a lista.
    ArrayList<Tarefa> lista = new ArrayList<>();

    
    //Adicionando na lista.
    public void adicionarTarefa() {
        String titulo01 = "", descri01 = "";
        int prior = 0;
        titulo01 = JOptionPane.showInputDialog(null, "Digite a Tarefa a ser feita: ");

        descri01 = JOptionPane.showInputDialog(null, "Descreva a tarefa: ", "Descreva a Tarefa");

        String[] varia = {"Alta", "Média", "Baixa"};
        prior = JOptionPane.showOptionDialog(null, "Defina a prioridade dessa tarefa: ", "Prioridade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, varia, varia[0]);

        lista.add(new Tarefa(titulo01, descri01, false, prior));
    }

    //Listagem com impressão.
    public void listarTarefa() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).impressao((i + 1));
        }
    }

    //Editando lista boolean.
    public void concluirTarefa(int indice) {
        Tarefa t1 = lista.get(indice);
        t1.setConcluida(true);
    }

    //Editando lista.
    public void editarTarefa(int edita) {
        Tarefa t1 = lista.get(edita);
        
        String titulo01 = JOptionPane.showInputDialog(null, "Altere o título da Tarefa: ");

        String descri01 = JOptionPane.showInputDialog(null, "Altere a descrição da tarefa: ");

        t1.setTitulo(titulo01);
        t1.setDescricao(descri01);
    }

    //Listando algo especifico.
    public void listarConcluidas() {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isConcluida()) {
                lista.get(i).impressao(i + 1);
            }
        }

    }

}
