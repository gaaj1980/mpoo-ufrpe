package br.ufrpe.bsi.mpoo.pessoa;

import br.ufrpe.bsi.mpoo.Periodo;

public class Aluno {
	private Pessoa pessoa;
	private Periodo entrada;
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Periodo getEntrada() {
		return entrada;
	}
	public void setEntrada(Periodo entrada) {
		this.entrada = entrada;
	}
	public void imprimir() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return this.pessoa.toString() + "\t- entrada: " + this.entrada + ")";
	}
}
