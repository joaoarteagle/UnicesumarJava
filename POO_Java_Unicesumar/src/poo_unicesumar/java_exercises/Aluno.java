package poo_unicesumar.java_exercises;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

	}
 
	private int ra;

//==================CONSTRUCTOR=====================

//=================CONSTRUCTOR WITH PARAMETER=========
	public Aluno(String nome, int Idade, int ra) {
		super(nome, Idade);
		this.ra = ra;
	}
	
//=================Setters and Getters=============	
	
	public int getRa() {
			return ra;
		}
		public void setRa(int ra) {
			this.ra = ra;
		}
		
		@Override
		public String getNome() {
			return "Aluno: " + super.getNome();
			}
	//====================Equals and HashCode================	

	//===========ToString================================

	
	
	
	
}
