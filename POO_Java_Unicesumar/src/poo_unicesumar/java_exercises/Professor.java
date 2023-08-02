package poo_unicesumar.java_exercises;

public class Professor extends Pessoa {

	private String matricula;
	
	
   //=====================CONSTRUCTOR======================
	public Professor(String nome, int idade, String matricula) {
		super(nome,idade);
		this.matricula = matricula;
	}

	//=============SETTERS AND GETTERS=================
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
