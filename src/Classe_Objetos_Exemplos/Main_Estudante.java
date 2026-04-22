
package Classe_Objetos_Exemplos;

import Classe_Objetos_Exemplos.Exemplo_Estudante;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Classe
public class Main_Estudante {
    public static void main(String[] args) {
        
        //Instanciando(tudo abaixo)
        Scanner scan = new Scanner(System.in);
        
        Exemplo_Estudante est01 = new Exemplo_Estudante();
        Exemplo_Estudante est02 = new Exemplo_Estudante();
        Exemplo_Estudante est03 = new Exemplo_Estudante();
        
        //Opção Construtor
//        Exemplo_Estudante est04 = new Exemplo_Estudante("Cloud",35,004,"Rua Qualquer");
        
        //Registrando caracteristicas de cada instancia.
        est01.nome = "Fulano";
        est01.idade = 36;
        est01.matricula = 001;
        est01.endereco = "Rua perigosa";
        
        //Registrando dados com Joptionpane.
        est02.nome = JOptionPane.showInputDialog(null,"Nome: ","Estudante 02",JOptionPane.QUESTION_MESSAGE);
        est02.idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade: ","Estudante 02",JOptionPane.QUESTION_MESSAGE)) ;
        est02.matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Matricula: ","Estudante 02",JOptionPane.QUESTION_MESSAGE));
        est02.endereco = JOptionPane.showInputDialog(null,"Endereço: ","Estudante 02",JOptionPane.QUESTION_MESSAGE) ;
        
        //Registrando dados com System.out.print/Scann.
        est03.imprimirScan();
        est03.nome = scan.nextLine();
        est03.idade = scan.nextInt();
        est03.matricula = scan.nextInt();
        
        //Para resolver bug do java relacionado a nextInt(); seguido de nextLine();
        scan.nextLine();
        est03.endereco = scan.nextLine();

        //Função para imprimir.
        est01.imprimir();
        est02.imprimir();
        est03.imprimir();
//        est04.imprimir();
        
        //Fechando Scan.
        scan.close();
        
        //Fechando programa imediatamente.
        System.exit(0);
    }
}
