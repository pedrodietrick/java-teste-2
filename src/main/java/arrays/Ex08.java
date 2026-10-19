package arrays;

public class Ex08 {
	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno [3];
		
		alunos[0] = new Aluno("Alana", 80);
		alunos[1] = new Aluno("Ana", 50);
		alunos[2] = new Aluno("Bruno", 70);
		
		for (Aluno aluno : alunos) {
			aluno.mostrarDados();
		}
		
	}
}
