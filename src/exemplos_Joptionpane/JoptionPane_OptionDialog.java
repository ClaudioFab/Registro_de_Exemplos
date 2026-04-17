
package exemplos_Joptionpane;

import javax.swing.JOptionPane;

public class JoptionPane_OptionDialog {
    public static void main(String[] args) {
        
        //showOptionDialog em Vetor
        String[] varia = {"Ok_1","Ok_2","Ok_3"};
        int escolha = JOptionPane.showOptionDialog(null,"Escolha qual opção: ","Escolhendo",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,varia,varia[0]);
        
        //Ok_1
        if(escolha == 0){
            JOptionPane.showMessageDialog(null,"Você escolheu Ok_1.","Ok_1",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            
        //Ok_2    
        }else if(escolha == 1){
           JOptionPane.showMessageDialog(null,"Você escolheu Ok_2.","Ok_2",JOptionPane.WARNING_MESSAGE);
           System.exit(0); 
        
        //Ok_
        }else if(escolha == 2){
           JOptionPane.showMessageDialog(null,"Você escolheu Ok_3.","Ok_3",JOptionPane.WARNING_MESSAGE);
           System.exit(0); 
        }

        
    }

    
}
