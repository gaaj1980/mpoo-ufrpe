package br.ufrpe.bsi.mpoo;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.bsi.mpoo.pessoa.Aluno;
import br.ufrpe.bsi.mpoo.pessoa.Pessoa;
import br.ufrpe.bsi.mpoo.pessoa.Professor;

public class Application {
	public static void main(String[] args) {
		Turma turma = criarTurma();
		turma.imprimir();
	}
	
	private static Turma criarTurma() {
		Turma turma = new Turma();
		turma.setPeriodo(criarPeriodo(2017, Semestre.PRIMEIRO));
		turma.setProfessor(criarProfessor());
		turma.addAllAlunos(criarAlunos());
		return turma;
	}

	private static Pessoa criarPessoa(String nome, String gitHubUser) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setGitHubUser(gitHubUser);
		return pessoa;
	}
	
	private static Professor criarProfessor() {
		Professor professor = new Professor();
		professor.setPessoa(criarPessoa("Gabriel Alves", "gaaj1980"));
		professor.setDepartamento("DEINFO");
		return professor;
	}

	private static Aluno criarAluno(String nome, String gitHubUser, int ano, Semestre semestre) {
		Aluno aluno = new Aluno();
		aluno.setPessoa(criarPessoa(nome, gitHubUser));
		aluno.setEntrada(criarPeriodo(ano, semestre));
		return aluno;
	}

	private static Periodo criarPeriodo(int ano, Semestre semestre) {
		Periodo entrada = new Periodo();
		entrada.setAno(ano);
		entrada.setSemestre(semestre);
		return entrada;
	}
	

	private static List<Aluno> criarAlunos() {
		List<Aluno> alunos = new ArrayList<Aluno>(40);
		alunos.add(criarAluno("Nome do Aluno 1", "alunoteste1", 2016, Semestre.PRIMEIRO));
		//gaaj1980: Inclua a partir da linha abaixo, o código para incluir 
		//um aluno com os seus dados, conforme exemplo da linha acima 
		alunos.add(criarAluno("Eric Moritsuka", "Ericthm", 2016, Semestre.PRIMEIRO));
		
		return alunos;
	}
}
