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
		//gaaj1980: Inclua a partir da linha abaixo, o c�digo para incluir 
		//um aluno com os seus dados, conforme exemplo da linha acima 
		alunos.add(criarAluno("Eric Moritsuka", "Ericthm", 2016, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Ebony Marques Rodrigues", "EbonyMarques", 2016, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Joao Jose Antonio Souza D'Amorim", "joao-damorim", 2015, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Eliana Maria Silva de Franca","elianamsf", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Edson Cristovam", "Crissky", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Luiz Carlos Brito de Andrade Lima Filho", "xRuisux", 2016, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Nicollas Bastos", "nicoedu", 2016, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Rafael Antonio Martins", "rumala1", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Nicolas Moura", "nicolas-sss", 2016, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Francisco Queiroga","chicoqueiroga",2015, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Luciano Trigueiro", "nanotrigueiro", 2016, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Jose Augusto de Paiva Neto", "AugustoPaiva", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Adailson Jose Tavares da Silva","Adailson-Jose", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Antonio Henrique do Nascimento Soares","AntonioHNS", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Evele Kelle Lemos Silva","lemosevele", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Everton do Nascimento Veloso","everton-nv", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Manoel Antonio de Freitas Neto", "manoelbet", 2015, Semestre.PRIMEIRO));
		alunos.add(criarAluno("Jadiel Eudes","Eudess", 2015, Semestre.SEGUNDO));
		alunos.add(criarAluno("Gabriel Lourenco de Morais", "GabrielLourenco", 2016, Semestre.PRIMEIRO));
		
		return alunos;
		
	}
}
