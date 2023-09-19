import java.time.LocalDate;

public class AlunoMain {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "André Fernando";
        Disciplina matematica = new Disciplina();
        matematica.adicionaNota(9);
        matematica.adicionaNota(7);
        Disciplina portugues = new Disciplina();
        portugues.adicionaNota(8);
        portugues.adicionaNota(8);
        aluno.disciplinas.add(matematica);
        aluno.disciplinas.add(portugues);
        Frequencia aula1  = new Frequencia();
        aula1.dataAula = LocalDate.of(2023,9,12);
        aula1.presenca = true;
        aluno.frequencias.add(aula1);
        Integer notaGeral = aluno.calcularMediaGeral();
        System.out.println("O aluno "+aluno.nome+" tem media geral "+notaGeral);
    }
}