
package exemplos_Joptionpane;

import javax.swing.JOptionPane;

public class JoptionPane_InputDialog {
    public static void main(String[] args) {
        
        //showInputDialog tem variavel em String com converções INT
        String exemplo = JOptionPane.showInputDialog(null,"Escolhendo o que escrever em texto: ","Entrada de dados",JOptionPane.INFORMATION_MESSAGE);
        
        String exemplo02 = JOptionPane.showInputDialog(null,"Escolhendo o que escrever convertendo em INT: ","Entrada de dados",JOptionPane.INFORMATION_MESSAGE);
        int exp2 = Integer.parseInt(exemplo02);
        
        int exemplo03 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolhendo o que escrever convertendo em INT: ","Entrada de dados",JOptionPane.INFORMATION_MESSAGE));
    }  
}
