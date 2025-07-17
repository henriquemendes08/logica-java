package desafioClasseAluno.test;

import desafioClasseAluno.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Henrique" , 17, 'M' , 10);
        aluno.imprimirDados();
    }
}
