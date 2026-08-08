
package exemplos_Joptionpane;

import javax.swing.JOptionPane;

public class JoptionPane_AparenciaTexto {

    public static void main(String[] args) {
        //Negrito
        //<br> substitui \n
        //"<html><b> Texto em negrito! <br> Go! </b></html>"
        
        JOptionPane.showMessageDialog(null,"<html><b> Texto em negrito! <br> Go! </b></html>");
        
        //Itálico
        //<br> substitui \n
        //"<html><i> Texto em negrito! <br> Go! </i></html>"
        
        JOptionPane.showMessageDialog(null,"<html><i> Texto em itálico! <br> Go! </i></html>");
        
        //Negrito e Itálico
        //<br> substitui \n
        //"<html><b><i> Texto em negrito! <br> Go! </i></b></html>"
        
        JOptionPane.showMessageDialog(null,"<html><b><i> Texto em itálico! <br> Go! </i></b></html>");

    }

}
