
//Escreva uma função que receba dois números inteiros
//retorne o maior.
package exemplos_MetodoFuncoes;

import javax.swing.JOptionPane;

public class Exemplo_Retorno_MaiorNum {
    public static void main(String[] args) {
        int num1 = chamarNumero(0);
        int num2 = chamarNumero(0);
        calculo(num1, num2);
        
    }
    
    public static int chamarNumero(int num){

        String numero1 = JOptionPane.showInputDialog(null,"Numero: ");
                
        return Integer.parseInt(numero1);
    }
    
    public static void calculo(int num1, int num2){
        
        JOptionPane.showMessageDialog(null,"O maior número é "+Math.max(num1, num2));
        
    }
}

/*
//Ou assim:
public static void main(String[] args) {
 
        chamarNumero();
   
    }
    
    public static void chamarNumero(){
        String numero1 = JOptionPane.showInputDialog(null,"Primeiro numero: ");
        int num1 = Integer.parseInt(numero1);

        String numero2 = JOptionPane.showInputDialog(null,"Segundo numero: ");
        int num2 = Integer.parseInt(numero2);
        
        JOptionPane.showMessageDialog(null,"O maior número é "+Math.max(num1, num2));
  
    }
*/
