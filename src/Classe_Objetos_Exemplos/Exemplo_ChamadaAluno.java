
package Classe_Objetos_Exemplos;

//Objeto
public class Exemplo_ChamadaAluno {
    
    //Atributos
    public String nome;
    public int matricula;
    public boolean presenca;
    
    //Construtor.
    public Exemplo_ChamadaAluno(String nome, int matricula, boolean presenca){
        this.nome = nome;
        this.matricula = matricula;
        this.presenca = presenca;
    }
    
    //Funções/Métodos.
    public void avisoAluno(){
        System.out.println("\nChamada de alunos: ");
    }
    public void registrarPresenca(){
        presenca = true;
    }
    public void informaAluno(){
        System.out.println("\nNome do aluno: "+nome);
        System.out.println("Matrícula: "+matricula);
        //Metodo de trocar palavra false e true para outro nome.
        System.out.println("Chamada: " + (presenca ? "Presente" : "Falta"));
    }
}
