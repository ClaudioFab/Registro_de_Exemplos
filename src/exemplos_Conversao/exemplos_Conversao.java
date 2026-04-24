package exemplos_Conversao;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class exemplos_Conversao {
    public static void main(String[] args) {
        //Instanciando formato decimal para valor em 0,00
        DecimalFormat df2 = new DecimalFormat("0.00");
        
        //Conversão simples de numero negativo para positivo com decimal.
        double numero = -50;
        
        JOptionPane.showMessageDialog(null,numero);
        
        numero = Math.abs(numero);
        
        JOptionPane.showMessageDialog(null,"Número positivo com decimal: \n"+df2.format(numero));
        
        //Conversão devolta para negativo com decimal.
        numero = -Math.abs(numero);
        
        JOptionPane.showMessageDialog(null,"Número negativo com decimal: \n"+df2.format(numero));

   
    }
    
}
