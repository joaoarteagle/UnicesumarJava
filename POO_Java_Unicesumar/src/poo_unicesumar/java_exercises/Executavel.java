package poo_unicesumar.java_exercises;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Executavel {

    public static void main(String[] args) {
     
    	List<Aluno> alunos =  new ArrayList<Aluno>();
//===========================ALUNOS=========================================================    	
  
    	
   int Qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos Alunos ?"));
   
  for(int x = 1; x <= Qnt; x++) { 
  
    String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a Idade do Aluno?"));
    int ra = Integer.parseInt(JOptionPane.showInputDialog("Qual o RA do Aluno?"));
    
    Aluno aluno1 = new Aluno(nome, idade, ra);
    
    alunos.add(aluno1);
  }
//========================================PROFESSOR=============================================
	  String nome = JOptionPane.showInputDialog("Qual o nome do Professor?");
	  int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a Idade do Professor?"));
	  String matricula = JOptionPane.showInputDialog("Qual a Matricula do Professor?");
	  
    Professor prof = new Professor(nome, idade, matricula);
 //================================IMPRESSÃO NO CONSOLE=========================================   
    System.out.println("============================PROFESSOR==============================");
    System.out.println("Nome do Professor: " + prof.getNome() + ", Idade Professor:" + prof.getIdade() + ", Matricula: " + prof.getMatricula());
    System.out.println("============================ALUNOS=================================");
    
    for (Aluno aluno : alunos) {
    	System.out.println("Nome do " + aluno.getNome() + ", Idade aluno:" +aluno.getIdade() + ", RA: " + aluno.getRa());
        System.out.println("-------------------------------------------------------------------");
	}
     
    
      
     
    }
}