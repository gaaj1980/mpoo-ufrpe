package br.ufrpe.bsi.mpoo.pessoa;

public class Professor {
	private Pessoa pessoa;
	private String departamento;
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public void imprimir() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return this.pessoa.toString() + "\t- " + this.departamento;
	}
}
