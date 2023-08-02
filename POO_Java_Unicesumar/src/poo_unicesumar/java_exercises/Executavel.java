package poo_unicesumar.java_exercises;

import java.util.ArrayList;
import java.util.List;

public class Executavel {

    public static void main(String[] args) {
     
    	List<Aluno> alunos =  new ArrayList<Aluno>();
    	
    Aluno Joao = new Aluno("Joao", 18, 123456789);
    Aluno Henrique = new Aluno("Henrique", 25, 987654321);
    Aluno Emanuel = new Aluno("Emanuel", 17, 456123789);
    Aluno Pedro = new Aluno("Pedro", 19,123789456);
    alunos.add(Joao);
    alunos.add(Henrique);
    alunos.add(Emanuel);
    alunos.add(Pedro);
    
    Professor prof = new Professor("Renato", 40, "123abc");
    
    System.out.println("============================PROFESSOR==============================");
    System.out.println("Nome do Professor: " + prof.getNome() + ", Idade Professor:" + prof.getIdade() + ", Matricula: " + prof.getMatricula());
    System.out.println("============================ALUNOS=================================");
    
    for (Aluno aluno : alunos) {
    	System.out.println("Nome do aluno: " + aluno.getNome() + ", Idade aluno:" +aluno.getIdade() + ", RA: " + aluno.getRa());
        System.out.println("===================================================================");
	}
     
      
     
    }
}