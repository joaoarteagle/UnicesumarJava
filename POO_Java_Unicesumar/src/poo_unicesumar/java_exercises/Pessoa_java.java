package poo_unicesumar.java_exercises;

import java.util.Objects;

public class Pessoa_java {
 
	//attributes
	private String nome;
	private int idade;
	private String dataNasc;
	  
	
	
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
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
//====================Equals and HashCode================	
	@Override
	public int hashCode() {
		return Objects.hash(dataNasc, idade, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa_java other = (Pessoa_java) obj;
		return Objects.equals(dataNasc, other.dataNasc) && idade == other.idade && Objects.equals(nome, other.nome);
	}
	//===========ToString================================

	@Override
	public String toString() {
		return "Pessoa_java [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + "]";
	} 
	
	
	
}
