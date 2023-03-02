package br.com.dio.model;

import java.util.Objects;

public class Livros {
	private String nome;
	private String autor;
	private Integer numpag;
	
	public Livros() {
		
	}
	
	public Livros(String nome, String autor, Integer numpag) {
		this.nome = nome;
		this.autor = autor;
		this.numpag = numpag;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Integer getNumpag() {
		return numpag;
	}
	
	public void setNumpag(Integer numpag) {
		this.numpag = numpag;
	}
	
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", autor=" + autor + ", numpag=" + numpag + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, nome, numpag);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(nome, other.nome)
				&& Objects.equals(numpag, other.numpag);
	}
	
}
