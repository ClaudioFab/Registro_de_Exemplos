
//Exemplos para exceções.

package exemplos_Excecoes;
import javax.swing.JOptionPane;
public class Regras_de_Excecoes {
    public static void main(String[] args) {
        
        String entradaString = JOptionPane.showInputDialog(null,"Caixa de Dialogo");
      
        //Escolha Cancel.
        //Usado para o "cancelar" da caixa de dialogo comum.
        if (entradaString == null) {
            JOptionPane.showMessageDialog(null,"Cancel");
            System.exit(0);

        //Escolha deixar vazio.
        //.isEmpty() usado para espaços vazios da caixa de dialogo comum.
        }else if(entradaString.isEmpty()){
            JOptionPane.showMessageDialog(null,"Espaço Vazio");
            System.exit(0);  
            
        }

        
        
        //Conversão de String para Int impedindo letras e simbolos.
        
        //1. Exemplo usando try-catch (tratando erro)
        //Try catch exige verificação simples.
        try {                    
            int numeroConvertido = Integer.parseInt(entradaString);
            JOptionPane.showMessageDialog(null,numeroConvertido);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada inválida!Apenas Números!");
            
        }
        
        //2. Exemplo usando .matches("\\d+") (validação antes)
        //.matches("\\d+") permite regras específicas dentro dele (if/try Catch por exemplo)
        if (entradaString.matches("\\d+")) {
            int numeroConvertido = Integer.parseInt(entradaString);
            JOptionPane.showMessageDialog(null,numeroConvertido);
        } else {
            JOptionPane.showMessageDialog(null,"Entrada inválida!Apenas Números!");
            
        }
        
        
        /*
        int valor = "999999999999999999999999"
        
        .matches("\\d+")
        vai dar true (porque são só dígitos)

        try-catch
        vai dar erro (número grande demais → NumberFormatException)
        
        */


    }
}
