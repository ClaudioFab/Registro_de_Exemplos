
package Exerc_Estudante;


import javax.swing.JOptionPane;

public class Estudante {
    //Atributos
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String endereco;

    public Estudante(String nome, int idade, String cpf, String rg, String endereco) {
        this.nome=nome;
        setIdade(idade);
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        if (idade > 18) {
            this.idade = idade;
        } else {
            this.idade = idade;
            JOptionPane.showMessageDialog(null,getNome() + " não pode participar por ter " + getIdade() + " anos.");
            this.idade =0;
        }
 
    }
 
    public String getCpf() {
        return cpf;
    }
 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
    public String getRg() {
        return rg;
    }
 
    public void setRg(String rg) {
        this.rg = rg;
    }
 
    public String getEndereco() {
        return endereco;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void dados(){
        JOptionPane.showMessageDialog(null,"Nome: "+getNome()+"\nIdade: "+getIdade()+"\nEndereço: "+getEndereco()+"\nCPF: "+getCpf()+"\nIdentidade: "+getRg()+"\n");

    }

 
}