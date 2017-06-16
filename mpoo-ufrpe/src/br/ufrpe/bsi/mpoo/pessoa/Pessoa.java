package br.ufrpe.bsi.mpoo.pessoa;

public class Pessoa {

	private String nome;
	private String gitHubUser;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGitHubUser() {
		return gitHubUser;
	}
	
	public void setGitHubUser(String gitHubUser) {
		this.gitHubUser = gitHubUser;
	}
	
	public void imprimir() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return this.nome + "\t- " + this.gitHubUser;
	}
}
