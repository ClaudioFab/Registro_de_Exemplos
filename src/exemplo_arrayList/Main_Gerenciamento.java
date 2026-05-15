package exemplo_arrayList;

import javax.swing.JOptionPane;

public class Main_Gerenciamento {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        int adicionar = 0, indice = 0, edita = 0;

        String mensag="";
        while (true) {
            //Menu
            mensag += "Escolha a opção desejada\n\n";
            mensag += "1- Adicionar tarefas\n";
            mensag += "2- Listar tarefas\n";
            mensag += "3- Concluir tarefa\n";
            mensag += "4- Editar tarefa\n";
            mensag += "5- Listar tarefas concluidas\n";
            mensag += "6- Sair";
            adicionar = Integer.parseInt(JOptionPane.showInputDialog(null,mensag));
            switch (adicionar) {
                case 1:
                    gerenciador.adicionarTarefa();
                    break;
                case 2:
                    gerenciador.listarTarefa();
                    break;
                case 3:
                    indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da tarefa que foi concluida."));
                    gerenciador.concluirTarefa(indice - 1);
                    break;
                case 4:
                    edita = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da tarefa que deseja editar."));
                    gerenciador.editarTarefa(edita - 1);
                    break;
                case 5:
                    gerenciador.listarConcluidas();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    erro();
            }
        }
    }
    public static void erro() {
        JOptionPane.showMessageDialog(null, "Opção inválida!");
    }
}
