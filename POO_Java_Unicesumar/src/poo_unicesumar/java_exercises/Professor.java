package poo_unicesumar.java_exercises;

public class Professor extends Pessoa {

	private String nomePro;
	private int idade;
	private String matricula;
	
	
   //=====================CONSTRUCTOR======================
	public Professor(String nomePro, int idade, String matricula) {
		super(nomePro,idade);
		this.matricula = matricula;
	}

	//=============SETTERS AND GETTERS=================
	public String getNomePro() {
		return nomePro;
	}

	public void setNomePro(String nomePro) {
		this.nomePro = nomePro;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
