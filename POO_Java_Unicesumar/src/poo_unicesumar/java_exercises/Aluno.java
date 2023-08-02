package poo_unicesumar.java_exercises;

import java.util.Objects;

public class Aluno extends Pessoa {
 
	//attributes
	private String nome;
	private int idade;
	private int ra;

//==================CONSTRUCTOR=====================

//=================CONSTRUCTOR WITH PARAMETER=========
	public Aluno(String Nome, int Idade, int ra) {
		super(Nome, Idade);
		this.ra = ra;
	}
	
//=================Setters and Getters=============	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getRa() {
			return ra;
		}
		public void setRa(int ra) {
			this.ra = ra;
		}
	//====================Equals and HashCode================	
		@Override
		public int hashCode() {
			return Objects.hash(idade, nome, ra);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return idade == other.idade && Objects.equals(nome, other.nome) && ra == other.ra;
		} 
		
	//===========ToString================================

	@Override
	public String toString() {
		return "Pessoa_java [nome=" + nome + ", idade=" + idade + ", ra=" + ra +"]";
	}

	
	
	
	
}
