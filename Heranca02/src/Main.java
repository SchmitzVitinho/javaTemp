import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Aluno aluno = new Aluno("delax",1,"1234","Desenvolvimento de Sistemas");
        aluno.fazerMatricula("Mecânica");
        pessoas.add(aluno);
        System.out.println(pessoas.get(0).getSenha());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCurso());

        Professor professor = new Professor("Likas",2, "1357", "sistemas");
        pessoas.add(professor);

        aluno = new Aluno("flash",3, "2468", "React");
        pessoas.add(aluno);

        professor = new Professor("Jack", pessoas.size()+1, "0000", "Spring");
        pessoas.add(professor);

        Funcionario funcionario = new Funcionario("kider", pessoas.size()+1, "7777", "Diretor");
        pessoas.add(funcionario);

        Estagiario estagiario = new Estagiario("Cleides", pessoas.size()+1,"7676","Den. Sistemas","coordenação");
        pessoas.add(estagiario);

//        Aluno a = (Aluno) pessoas.getFirst();
//        System.out.println(a.getCurso());

        System.out.println("---------------------------");
        for (Pessoa p : pessoas){
            System.out.println(p.getNome());
            System.out.println(p.getId());
            System.out.println(p.getSenha());

            if (p instanceof Aluno){
                Aluno a = (Aluno) p;
                System.out.println(a.getCurso());
            }else if(p instanceof Professor){
                Professor profe = (Professor) p;
                System.out.println(profe.getArea());
            }
        }
    }
}