import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    Integer codigo;
    String nome;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    List<Disciplina> disciplinas = new ArrayList<>();
    List<Frequencia> frequencias = new ArrayList<>();


    public void imprimirDadosAluno() {
        System.out.println("Código: " + codigo + " Nome: " + nome + " Data nascimento:" + dataNascimento);
    }

    public Integer calcularMediaGeral() {
        Integer somaMedias = 0;
        for (Disciplina disciplina: disciplinas) {
            somaMedias += disciplina.calcularMediaDisciplina();
        }
        return (somaMedias / disciplinas.size());
    }

    public void calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        System.out.println(periodo.getYears());
    }


    public void verificaAlunoAprovado() {
        Integer mediaGeral = calcularMediaGeral();

        if (mediaGeral >= 7) {
            System.out.println("APROVADO");
        } else if (mediaGeral >= 5) {
            System.out.println("RECUPERACAO");
        } else {
            System.out.println("REPROVADO");
        }
    }


}
