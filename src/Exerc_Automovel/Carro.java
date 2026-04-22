
package Exerc_Automovel;

import javax.swing.JOptionPane;
 
//Os atributos devem ser privados.
public class Carro {
        private String modelo;
        private int ano;
 
    //Construtor para receber modelo e ano.    
    public Carro(String modelo00, int ano00) {
        this.modelo = modelo00;
        //this.ano = ano00; substituido pelo setAno(não podem juntos)
        setAno(ano00);
    }
    
    //Mostrar os dados usando get
    public void dados(){
        System.out.println("Modelo: "+getModelo()+"\nAno: "+getAno()+"\n");
        JOptionPane.showMessageDialog(null,"Modelo: "+getModelo()+"\nAno: "+getAno(),"Informação",JOptionPane.INFORMATION_MESSAGE);
    }
 
    //Métodos get e set.
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAno() {
        return ano;
    }
 
    //No setAno(), não permitir ano menor que 1900.
    public void setAno(int ano) {
        if(ano >=1900){
           this.ano = ano;
           
        //Alterar um valor usando set.   
        }else{
            System.out.println("Ano "+ano+" não é permitido!\n");
            int sn = JOptionPane.showConfirmDialog(null,"Ano "+ano+" não é permitido!\nGostaria de Alterar ano?","Erro",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
  
            if (sn == JOptionPane.NO_OPTION) {
                System.out.println("O valor será anulado.\n");
                JOptionPane.showMessageDialog(null,"O valor será anulado.","Nulo",JOptionPane.INFORMATION_MESSAGE);
                this.ano = 0000;
                
            }else if(sn == JOptionPane.YES_OPTION){
                System.out.println("Ano redefinido.");
                
                int novoAno = Integer.parseInt(JOptionPane.showInputDialog(null,"Defina o ano correto.\n(apenas entre 1900 e 2026)","Correção",JOptionPane.WARNING_MESSAGE));

                if(novoAno >=1900 && novoAno <= 2026){
                    this.ano = novoAno;
                }else{
                    System.out.println("O número selecionado é inválido!.\nO valor será anulado.\n");
                    JOptionPane.showMessageDialog(null,"O número selecionado é inválido!.\nO valor será anulado.\n","Erro",JOptionPane.ERROR_MESSAGE);
                    this.ano = 0000;
                }

            }

        }
    }
}