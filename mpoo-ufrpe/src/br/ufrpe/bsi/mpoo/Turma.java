package br.ufrpe.bsi.mpoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.ufrpe.bsi.mpoo.pessoa.Aluno;
import br.ufrpe.bsi.mpoo.pessoa.Professor;

public class Turma {
	private Periodo periodo;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<Aluno>(40);
	
	public Periodo getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public boolean addAluno(Aluno aluno) {
		return this.alunos.add(aluno);
	}
	public boolean addAllAlunos(List<Aluno> alunos) {
		return this.alunos.addAll(alunos);
	}
	public boolean removeAluno(Aluno aluno) {
		return this.alunos.remove(aluno);
	}
	public boolean removeAllAlunos(List<Aluno> alunos) {
		return this.alunos.remove(alunos);
	}
	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(this.alunos);
	}
	public void imprimir() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Turma: ");
		sb.append(this.periodo.toString());
		sb.append("\n");
		sb.append("Professor (Nome - GitHub User - Departamento):\n");
		sb.append(this.professor.toString());
		sb.append("\n");
		sb.append("Lista de Alunos ");
		sb.append("(Nome - GitHub User - Entrada)\n");
		Comparator<Aluno> comparatorAluno = new Comparator<Aluno>() {
			@Override
			public int compare(Aluno o1, Aluno o2) {
				return o1.toString().compareTo(o2.toString());
			}
		};
		List<Aluno> alunos = new ArrayList<Aluno>(this.alunos);
		Collections.sort(alunos, comparatorAluno);
		for (Aluno aluno : alunos) {
			sb.append(aluno.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
