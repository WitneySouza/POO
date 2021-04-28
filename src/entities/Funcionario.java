package entities;

import entities.enums.TipoDeDocumento;

public class Funcionario {
	
	private String nome;
	private String numeroDocumento;
	private TipoDeDocumento documento;
	
	
	public Funcionario( String nome, TipoDeDocumento documento, String numeroDocumento) {
		
		this.nome = nome;
		this.documento = documento;
		this.numeroDocumento = numeroDocumento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	
	public TipoDeDocumento getDocumento() {
		return documento;
	}
	public void setDocumento(TipoDeDocumento documento) {
		this.documento = documento;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (documento != other.documento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		return true;
	}


	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", numeroDocumento=" + numeroDocumento + ", documento=" + documento + "]";
	}
	
		
}
