package poo_unicesumar.java_exercises;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Executavel {

    public static void main(String[] args) {
     
    	List<Aluno> alunos =  new ArrayList<Aluno>();
    	
    Aluno joao = new Aluno("Joao", 18, 123456789);
    Aluno henrique = new Aluno("Henrique", 25, 987654321);
    Aluno emanuel = new Aluno("Emanuel", 17, 456123789);
    Aluno pedro = new Aluno("Pedro", 19,123789456);
    Aluno joao1 = new  Aluno("Joao P", 19, 456897132);
   
    
    String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a Idade do Aluno?"));
    int ra = Integer.parseInt(JOptionPane.showInputDialog("Qual o RA do Aluno?"));
    
    Aluno teste = new Aluno(nome, idade, ra);
    
    alunos.add(teste);
    alunos.add(joao);
    alunos.add(henrique);
    alunos.add(emanuel);
    alunos.add(pedro);
    alunos.add(joao1);
    
    Professor prof = new Professor("Renato", 40, "123abc");
    
    System.out.println("============================PROFESSOR==============================");
    System.out.println("Nome do Professor: " + prof.getNome() + ", Idade Professor:" + prof.getIdade() + ", Matricula: " + prof.getMatricula());
    System.out.println("============================ALUNOS=================================");
    
    for (Aluno aluno : alunos) {
    	System.out.println("Nome do " + aluno.getNome() + ", Idade aluno:" +aluno.getIdade() + ", RA: " + aluno.getRa());
        System.out.println("-------------------------------------------------------------------");
	}
     
    
      
     
    }
}