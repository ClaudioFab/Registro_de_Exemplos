
/*
Descrição:
Crie uma classe chamada BateriaCelular
que simula o nível de bateria de um celular.
 
Atributo:
nivel (int) → representa a bateria (0 a 100)  
Regras:
 
O atributo deve ser privado  
Criar métodos:  
getNivel()  
setNivel(int nivel)
 
No setNivel():  
Permitir apenas valores entre 0 e 100  
Caso inválido → mostrar mensagem  
Métodos extras:
 
Criar:
 
carregar(int valor) → aumenta a bateria (máx 100)  
usar(int valor) → diminui a bateria (mín 0)  
status() → mostra:  
0–20 → "Bateria fraca"  
21–70 → "Bateria média"  
71–100 → "Bateria alta"  
 
O programa deve:
 
Definir um nível inicial  
Permitir carregar e usar bateria  
Mostrar:  
Nível atual (get)  
Status da bateria 
*/
 
package Exerc_Encapsulamento;
 
public class Main_Bateria {
    public static void main(String[] args) {
        //O programa deve definir um nível inicial.
        BateriaCelular cell01 = new BateriaCelular(50);
        cell01.dados();
        
        //Checagem inicial do status da bateria.
        cell01.status();
        
        //Obs:Precisei desmontar em variaveis pois tenho dificuldade usando retorno.
        //Permitir carregar bateria e mostrar Nível atual(get).
        int atualNivel = cell01.getNivel();
        int novoNivel = cell01.carregar(atualNivel);
        cell01.setNivel(novoNivel);
 
        //Checagem pós Carga da bateria.
        cell01.status();
        
        //Permitir usar bateria.
        int ultNivel = cell01.usar(novoNivel);
        cell01.setNivel(ultNivel);
        
        //Checagem final do status da bateria.
        cell01.status();
 
        System.exit(0);
    }  
}
