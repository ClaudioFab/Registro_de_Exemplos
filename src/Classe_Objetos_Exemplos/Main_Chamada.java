
package Classe_Objetos_Exemplos;


//Classe
public class Main_Chamada {
    public static void main(String[] args) {
        
        //Substituição com o "this." para não usar Dados prontos ou Input.
        Exemplo_ChamadaAluno aluno01 = new Exemplo_ChamadaAluno("Yusuke",777,false);
        Exemplo_ChamadaAluno aluno02 = new Exemplo_ChamadaAluno("Kuwabara",222,false);
        Exemplo_ChamadaAluno aluno03 = new Exemplo_ChamadaAluno("Kurama",666,false);
        
        aluno01.avisoAluno();
        
        aluno02.registrarPresenca();
        aluno03.registrarPresenca();
        
        
        aluno02.informaAluno();
        aluno01.informaAluno();
        aluno03.informaAluno();
        
        //Fechando programa imediatamente.
        System.exit(0);
    }
}
