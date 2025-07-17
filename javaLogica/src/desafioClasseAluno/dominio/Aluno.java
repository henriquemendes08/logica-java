package desafioClasseAluno.dominio;

public class Aluno {
    public String nome;
    public int idade;
    public char sexo;
    public double notaFinal;

    public Aluno(String nome, int idade, char sexo, double notaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.notaFinal = notaFinal;
    }

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.notaFinal);
    }

}
