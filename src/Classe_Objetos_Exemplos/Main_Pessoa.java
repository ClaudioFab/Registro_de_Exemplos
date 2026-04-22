
/*
Crie uma classe chamada Pessoa contendo:
Dois atributos: nome (texto) e idade (número inteiro).
Um construtor que receba nome e idade.
Um método chamado apresentar(), que imprima uma frase
apresentando a pessoa. Exemplo: "Olá, meu nome é Ana e tenho 25
anos.“
Na classe Main, crie dois objetos da classe Pessoa, preenchendo nome
e idade para cada um.
Chame o método apresentar() para cada objeto, exibindo as
informações no console.
*/

package Classe_Objetos_Exemplos;

//Classe Main
public class Main_Pessoa {
    public static void main(String[] args) {
        
        //Dois objetos da classe Pessoa.
        Exemplo_Pessoa pess01 = new Exemplo_Pessoa("Cláudio",36);
        Exemplo_Pessoa pess02 = new Exemplo_Pessoa("Gabriela",40);
        
        //Método apresentar() para cada objeto.
        pess01.apresentar();
        pess02.apresentar();
        
        
        pess01.setNome(Exemplo_Pessoa.alterar(""));
        pess01.apresentar();

        
        pess01.teste();
        System.exit(0);
    }
    
}
