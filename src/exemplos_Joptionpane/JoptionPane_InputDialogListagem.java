
package exemplos_Joptionpane;

import javax.swing.JOptionPane;

public class JoptionPane_InputDialogListagem {
    
        public static void main(String[] args) {
            
            //showOptionDialog em Vetor variavel Object (INT)
            Object[] variavel = {"Antes","Agora","Depois"};
            Object escolher = JOptionPane.showInputDialog(null,"Escolha um dos itens: ","Caixa de itens",JOptionPane.QUESTION_MESSAGE,null,variavel,variavel[0]);
            
            if(escolher.equals("Antes")){
                JOptionPane.showMessageDialog(null,"Você escolheu Antes","Antes",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
                 
            }else if(escolher.equals("Agora")){ 
                JOptionPane.showMessageDialog(null,"Você escolheu Agora","Agora",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            
            }else if(escolher.equals("Depois")){ 
                JOptionPane.showMessageDialog(null,"Você escolheu Depois","Depois",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
  
            }

        }    
}
