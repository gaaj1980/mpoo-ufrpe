package br.ufrpe.bsi.mpoo;

public class Periodo {
	private int ano;
	private Semestre semestre;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Semestre getSemestre() {
		return semestre;
	}
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	public void imprimir() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return this.ano + "." + this.semestre.getNumero();
	}
}
