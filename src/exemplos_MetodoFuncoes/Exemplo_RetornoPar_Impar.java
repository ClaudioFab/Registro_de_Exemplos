
package exemplos_MetodoFuncoes;

import javax.swing.JOptionPane;

public class Exemplo_RetornoPar_Impar {

    public static void main(String[] args) {
        
        String num = JOptionPane.showInputDialog(null,"Diga o número: ");
        int num00 = Integer.parseInt(num);
        
        //troca
        int resultado = parOuImpar(num00);
        
        if(resultado == 1){
            JOptionPane.showMessageDialog(null,"Número é Par");
        }else{
            JOptionPane.showMessageDialog(null,"Número é Impar");
        }

    }
    
    public static int parOuImpar(int nume){
        
        if(nume% 2 == 0){
            return 1;
            
        }else{
            return 2;
        }
        
    }
    
}

/*
//troca
String resultado = parOuImpar(num00);
        
        JOptionPane.showMessageDialog(null,resultado);

    }
    
    public static String parOuImpar(int nume){
        
        if(nume% 2 == 0){
            return "O número é Par";
            
        }else{
            return "O número é Impar";
        }
        
    }
    
}


//ou ternário  ? :
public static String parOuImpar(int nume){
    return (nume % 2 == 0) ? "Número é par" : "Número é impar";
}
*/