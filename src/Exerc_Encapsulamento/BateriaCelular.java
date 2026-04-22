
package Exerc_Encapsulamento;
 
import javax.swing.JOptionPane;
 
//Criando nivel (int) → representa a bateria (0 a 100).
//Atributo deve ser privado.
public class BateriaCelular {    
    private int nivel;
 
    public BateriaCelular(int nivel0) {
        this.nivel = nivel0;
        setNivel(nivel0);  
    }
 
    public void dados(){
        System.out.println("Bateria está em: "+getNivel()+"%.\n");
        JOptionPane.showMessageDialog(null,"Bateria está em: "+getNivel()+"%.\n","Nível Inicial",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Criando carregar(int valor) → aumenta a bateria (máx 100).
    public int carregar(int valor){
 
        int yep01 =0;
        int yN = JOptionPane.showConfirmDialog(null,"Gostaria de carregar a bateria ?","Carga de bateria",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (yN==JOptionPane.NO_OPTION){           
            System.out.println("Bateria continua em: "+valor+"%.\n");
            JOptionPane.showMessageDialog(null,"Bateria continua em: "+valor+"%.\n","Carga Atual",JOptionPane.INFORMATION_MESSAGE);
            return valor;
        }
        if(yN==JOptionPane.YES_OPTION){                
            yep01 = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto deseja carregar?","Carregando",JOptionPane.QUESTION_MESSAGE));
            if(yep01 >=0 && yep01 <= 100){
                System.out.println("Bateria recebeu "+yep01+"% de carga.\n");
                JOptionPane.showMessageDialog(null,"Bateria recebeu "+yep01+"% de carga.","Carga",JOptionPane.INFORMATION_MESSAGE);
            }else if(yep01 < 0 || yep01 > 100){                
                System.out.println("Valor Inválido!\nBateria continua em: "+valor+"%.\n");
                JOptionPane.showMessageDialog(null,"Valor Inválido!\nBateria continua em: "+valor+"%.\n","Erro/Carga Atual",JOptionPane.ERROR_MESSAGE);
 
                return valor;
            }
 
        }
        valor = valor+yep01;
        if(valor >100){
            valor = 100;
        }
        System.out.println("Bateria está em: "+valor+"%.\n");
        JOptionPane.showMessageDialog(null,"Bateria está em: "+valor+"%.\n","Carga Atual",JOptionPane.INFORMATION_MESSAGE);
        return valor;
    }
    
    //Criando usar(int valor) → diminui a bateria (mín 0).
    public int usar(int valor){
        int yep02 =0;
        Object[] escolha = {"Usar","Desligar"};
        Object usaDesliga = JOptionPane.showInputDialog(null,"Usar Celular ou desligar ?","Uso de bateria",JOptionPane.QUESTION_MESSAGE,null,escolha,escolha[0]);
        if (usaDesliga == null) {
            System.exit(0);
        }
        if(usaDesliga.equals("Usar")){
            yep02 = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto usou?","Gasto de bateria",JOptionPane.QUESTION_MESSAGE));
            if(yep02 >=0 && yep02 <= 100){
                System.out.println("Bateria perdeu "+yep02+"% de carga.\n");
                JOptionPane.showMessageDialog(null,"Bateria perdeu "+yep02+"% de carga.","Gasto de bateria",JOptionPane.INFORMATION_MESSAGE);
            }else if(yep02 < 0 || yep02 > 100){                
                System.out.println("Valor Inválido!\nBateria continua em: "+valor+"%.\n");
                JOptionPane.showMessageDialog(null,"Valor Inválido!\nBateria continua em: "+valor+"%.\n","Erro/Carga Atual",JOptionPane.ERROR_MESSAGE);
 
                return valor;
            }
        }else if(usaDesliga.equals("Desligar")){
            System.out.println("Desligando o Celular.");
            System.out.println("Bateria está em: "+valor+"%.\n");
            JOptionPane.showMessageDialog(null,"Desligando o Celular.","Desligando",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Bateria está em: "+valor+"%.\n","Carga Atual",JOptionPane.INFORMATION_MESSAGE);
            return valor;
        }

        valor = valor - yep02;
        if(valor < 0){
            valor = 0;
        }
        System.out.println("Bateria está em: "+valor+"%.\n");
        JOptionPane.showMessageDialog(null,"Bateria está em: "+valor+"%.\n","Carga Atual",JOptionPane.INFORMATION_MESSAGE);
        return valor;
    }
 
    //Criando status() → mostra: Bateria (fraca/média/alta)
    public void status(){
        if(nivel >= 0 && nivel <= 20){
            System.out.println("Bateria fraca\n");
            JOptionPane.showMessageDialog(null,"Bateria fraca","Status",JOptionPane.INFORMATION_MESSAGE);
        }else if(nivel >= 21 && nivel <= 70){
            System.out.println("Bateria média\n");
            JOptionPane.showMessageDialog(null,"Bateria média","Status",JOptionPane.INFORMATION_MESSAGE);
        }else if(nivel >= 71 && nivel <= 100){
            System.out.println("Bateria alta\n");
            JOptionPane.showMessageDialog(null,"Bateria alta","Status",JOptionPane.INFORMATION_MESSAGE);
        } 
    }
 
    //Criando getNivel()/setNivel(int nivel)
    public int getNivel() {
        return nivel;
    }
 
    //No setNivel(): Permitir apenas valores entre 0 e 100.
    public void setNivel(int nivel) {
        if (nivel >=0 && nivel <= 100){
            this.nivel = nivel;
            
        //Caso inválido → mostrar mensagem.
        }else{
            this.nivel = 0;
            System.out.println("O nível "+nivel+" é inválido!\nO valor será adaptado para 0.\n");
            JOptionPane.showMessageDialog(null,"O nível "+nivel+" é inválido!\nO valor será adaptado para 0.","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
}
