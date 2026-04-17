
package exemplos_Joptionpane;

import javax.swing.JOptionPane;

public class Main_Joptionpane {
    public static void main(String[] args) {

        //showConfirmDialog tem variavel em INT
        int exemplo = JOptionPane.showConfirmDialog(null,"Escolhendo opções","Opções",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(exemplo == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Você escolheu SIM.","Sim",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            
        }else if(exemplo == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Você escolheu NÃO.","Não",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            
        }else if(exemplo == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"Você escolheu CANCELAR.","Cancelar",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        
        
        
        
        
    }
    
}
