
package Classe_Objetos_Exemplos;

import javax.swing.JOptionPane;

//Objeto
public class Exemplo_Estudante {
    
    //Atributos
    public String nome;
    public int idade;
    public int matricula;
    public String endereco;    
    
    //Funções/Métodos.
    //Construtor
//    public Exemplo_Estudante(String nome4,int idade4, int matricula4, String endereco4){
//        this.nome = nome4;
//        this.idade = idade4;
//        this.matricula = matricula4;
//        this.endereco = endereco4;
//    }

    //Funções/Métodos.
    public void estudar(){
    }
    public void realizaAtividades(){
    }    
    public void sofre(){
    }    
    public void realizaProvas(){
    }    
    public void imprimir(){
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nMatrícula: "+matricula+"\nEndereço: "+endereco+"\n");
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nEndereço: "+endereco+"\n","Matrícula: "+matricula,JOptionPane.INFORMATION_MESSAGE);       
    }
    public void imprimirScan(){
        JOptionPane.showMessageDialog(null,"Agora escreva nome, idade, matricula e endereço em Scann","Aviso",JOptionPane.WARNING_MESSAGE);
    }
}

