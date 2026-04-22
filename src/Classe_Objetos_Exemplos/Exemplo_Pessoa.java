
package Classe_Objetos_Exemplos;

import javax.swing.JOptionPane;

//Classe chamada Pessoa
public class Exemplo_Pessoa {
    
    //Dois atributos: nome (texto) e idade (número inteiro).
    public String nome;
    public int idade;
    
    //Um construtor que receba nome e idade.
    public Exemplo_Pessoa(String nome00, int idade00){
        setNome(nome00); 
        setIdade(idade00);
    }

    //getters
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    //Um método chamado apresentar(), que imprima uma frase apresentando a pessoa.
    public void apresentar(){
        System.out.println("Olá, meu nome é "+getNome()+" e tenho "+getIdade()+" anos.");
        JOptionPane.showMessageDialog(null,"Olá, meu nome é "+getNome()+" e tenho "+getIdade()+" anos.","",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void teste(){
        int valor = 50+2;
        System.out.println("O "+getNome()+" tem "+valor+"$ reais");
    }
    
    public static String alterar(String nome00){
        String nome = JOptionPane.showInputDialog(null,"Qual o novo nome?");
        return nome;
    }
    
    
}
