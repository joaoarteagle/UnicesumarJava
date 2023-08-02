package poo_unicesumar.java_exercises;

public class Aluno extends Pessoa {
 
	private int ra;

//==================CONSTRUCTOR=====================

//=================CONSTRUCTOR WITH PARAMETER=========
	public Aluno(String Nome, int Idade, int ra) {
		super(Nome, Idade);
		this.ra = ra;
	}
	
//=================Setters and Getters=============	
	
	public int getRa() {
			return ra;
		}
		public void setRa(int ra) {
			this.ra = ra;
		}
	//====================Equals and HashCode================	

	//===========ToString================================

	
	
	
	
}
