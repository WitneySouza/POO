package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Status;

public class Projeto {
	
	private String nome;
	private Date dt_inicio;
	private Date dt_termino;
	
	private List<Contratacao> listarContratacao = new ArrayList<>();

	public Projeto(String nome, Date dt_inicio, Date dt_termino) {
	
		this.setNome(nome);
		this.setDt_inicio(dt_inicio);
		this.setDt_termino(dt_termino);
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Date getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	
	public Date getDt_termino() {
		return dt_termino;
	}

	public void setDt_termino(Date dt_termino) {
		this.dt_termino = dt_termino;
	}
	
	private boolean validarContratacao(Contratacao contratacao) {
		return contratacao != null && contratacao.getFuncionario() != null;
	}
	
	public  boolean adicionarContratacao(Contratacao contratacao) {
		if(this.validarContratacao(contratacao)) {
			this.listarContratacao.add(contratacao);
			
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removerContratacao(Contratacao contratacao) {
		if(this.validarContratacao(contratacao) && this.listarContratacao.contains(contratacao)) {
			
			this.listarContratacao.remove(contratacao);
			
			return true;
			
		}else {
			return false;
		}
	}
	
	public void listarContratacao() {
		System.out.println("***Contratações***");
		System.out.println("Projeto:");
		System.out.println("\t"+this.getNome());
		System.out.println("Funcionário(s):");
		
		 for( Contratacao cont : this.listarContratacao){
			 if(cont.getStatus() != Status.DEMITIDO)
             cont.print();  
     }
		 
		 System.out.println();
	}

}
