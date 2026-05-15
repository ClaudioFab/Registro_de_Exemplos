
package exemplos_Joptionpane;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JoptionPane_InputDialog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //showInputDialog tem variavel em String com converções INT
        String exemplo = JOptionPane.showInputDialog(null,"Escolhendo o que escrever em texto: ","Entrada de dados",JOptionPane.INFORMATION_MESSAGE);
        
        String exemplo02 = JOptionPane.showInputDialog(null,"Escolhendo o que escrever convertendo em INT: ","Entrada de dados",JOptionPane.INFORMATION_MESSAGE);
        int expInt = Integer.parseInt(exemplo02);
        //double expDouble = Double.parseDouble(exemplo02);
        //boolean expBoolean = Boolean.parseBoolean(exemplo02);
        //float expFloat = Float.parseFloat(exemplo02);
        //String expString = String.valueOf(exemplo02);
        
        int exemplo03 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolhendo o que escrever convertendo em INT: ","Entrada de dados",JOptionPane.INFORMATION_MESSAGE));
            
        //Exemplo de comparação para fazer Joptionpane:
        
        System.out.println("Mensagem comum");
        
        JOptionPane.showMessageDialog(null,"Mensagem comum");
        
        
        //Exemplo de mensagem com entrada:

        System.out.println("Digite seu nome:");
        String nomeAA = scan.next();
      
        String nomeA = JOptionPane.showInputDialog(null,"Mensagem comum");
        
        
        //Exemplo de pergunta sim ou não:

        System.out.println("Deseja continuar ?");
        int algoAA = scan.nextInt();
        
        int algoA = JOptionPane.showConfirmDialog(null,"Deseja continuar ?");
    
        
        //Exemplo
        
    
    
    
    
    }  
}
