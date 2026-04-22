
/*
Crie uma classe chamada Carro.

Atributos:
modelo (String)
ano (int)

Regras:
Os atributos devem ser privados;

Criar:
Construtor para receber modelo e ano
Métodos get e set
No setAno(), não permitir ano menor que 1900

O programa deve:
Criar um objeto já com valores (usando construtor)
Alterar um valor usando set
Mostrar os dados usando get
*/

package Exerc_Automovel;

public class Main_Carro {
    public static void main(String[] args) {
        Carro car01 = new Carro("Chevrolet Onix",2024);
        car01.dados();
        Carro car02 = new Carro("Volkswagen Nivus",1899);       
        car02.dados();
        
        System.exit(0);
    }
}