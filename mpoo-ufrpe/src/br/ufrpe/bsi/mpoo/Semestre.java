package br.ufrpe.bsi.mpoo;

public enum Semestre {
	PRIMEIRO(1,"Primeiro"), SEGUNDO(2,"Segundo");
	
	private int numero;
	private String nome;
	Semestre(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
}
