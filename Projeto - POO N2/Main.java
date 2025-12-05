import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA ESCOLAR =====");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Criar Curso");
            System.out.println("3 - Criar Turma em Curso");
            System.out.println("4 - Vincular Pessoas à Turma");
            System.out.println("5 - Listar Pessoas da Turma");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
            
                case 1:
                    System.out.print("1 - Aluno | 2 - Professor: ");
                    int tipo = sc.nextInt(); sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Data Nasc: ");
                    String nasc = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Matrícula: ");
                        long mat = sc.nextLong(); sc.nextLine();

                        Aluno a = new Aluno(mat, nome, cpf, nasc);
                        a.cadastrar();
                        alunos.add(a);

                    } else if (tipo == 2) {
                        System.out.print("RG: ");
                        long rg = sc.nextLong();

                        System.out.print("Área: ");
                        String area = sc.nextLine();

                        Professor p = new Professor(rg, nome, cpf, nasc, area);
                        p.cadastrar();
                        professores.add(p);

                    }
                    break;


                case 2:
                    System.out.print("ID do Curso: ");
                    int id = sc.nextInt(); sc.nextLine();

                    System.out.print("Nome do Curso: ");
                    String nCurso = sc.nextLine();

                    System.out.print("Carga Horária: ");
                    String carga = sc.nextLine();

                    Curso c = new Curso(id, nCurso, carga);
                    cursos.add(c);

                    System.out.println("Curso criado!");
                    break;


                case 3:
                    if (cursos.isEmpty()) {
                        System.out.println("Cadastre cursos primeiro.");
                        break;
                    }

                    System.out.println("Escolha o curso:");
                    for (int i = 0; i < cursos.size(); i++)
                        System.out.println((i + 1) + " - " + cursos.get(i).getNome());

                    int cIndex = sc.nextInt() - 1; sc.nextLine();

                    System.out.print("Código da Turma: ");
                    int cod = sc.nextInt(); sc.nextLine();

                    System.out.print("Ano de Entrada: ");
                    int ano = sc.nextInt(); sc.nextLine();

                    System.out.print("Nome da Turma: ");
                    String nt = sc.nextLine();

                    Turma t = new Turma(cod, ano, nt);
                    cursos.get(cIndex).getTurmas().add(t);

                    System.out.println("Turma criada no curso!");
                    break;


                case 4:
                    if ((alunos.isEmpty() && professores.isEmpty()) || cursos.isEmpty()) {
                        System.out.println("Cadastre pessoas e cursos antes.");
                        break;
                    }

                    System.out.print("Vincular: 1-Aluno | 2-Professor: ");
                    int tipoV = sc.nextInt();
                    sc.nextLine();

                    if (tipoV == 1) {
                        if (alunos.isEmpty()) { System.out.println("Nenhum aluno cadastrado."); break; }

                        System.out.println("Escolha o aluno:");
                        for (int i = 0; i < alunos.size(); i++)
                            System.out.println((i + 1) + " - " + alunos.get(i).getNome());

                    } else {
       
                        if (professores.isEmpty()) { System.out.println("Nenhum professor cadastrado."); break; }

                        System.out.println("Escolha o professor:");
                        for (int i = 0; i < professores.size(); i++)
                            System.out.println((i + 1) + " - " + professores.get(i).getNome());
                    }

                    int pessoaIndex = sc.nextInt() - 1;

                    System.out.println("Escolha o curso:");
                    for (int i = 0; i < cursos.size(); i++)
                        System.out.println((i + 1) + " - " + cursos.get(i).getNome());
                    int cursoIndex = sc.nextInt() - 1;

                    List<Turma> turmasV = cursos.get(cursoIndex).getTurmas();

                    if (turmasV.isEmpty()) {
                        System.out.println("Curso sem turmas.");
                        break;
                    }

                    System.out.println("Escolha a turma:");
                    for (int i = 0; i < turmasV.size(); i++)
                        System.out.println((i + 1) + " - " + turmasV.get(i).getNome());
                    int turmaIndex = sc.nextInt() - 1;

                    Turma turmaSelecionada = turmasV.get(turmaIndex);

                    if (tipoV == 1)
                        turmaSelecionada.adicionarAluno(alunos.get(pessoaIndex));
                    else
                        turmaSelecionada.adicionarProfessor(professores.get(pessoaIndex));

                    break;


                case 5:
                    if (cursos.isEmpty()) {
                        System.out.println("Nenhum curso.");
                        break;
                    }

                    System.out.println("Escolha o curso:");
                    for (int i = 0; i < cursos.size(); i++)
                        System.out.println((i + 1) + " - " + cursos.get(i).getNome());
                    int cID = sc.nextInt() - 1;

                    List<Turma> ts = cursos.get(cID).getTurmas();

                    if (ts.isEmpty()) {
                        System.out.println("Sem turmas.");
                        break;
                    }

                    System.out.println("Escolha a turma:");
                    for (int i = 0; i < ts.size(); i++)
                        System.out.println((i + 1) + " - " + ts.get(i).getNome());
                    int x = sc.nextInt() - 1;

                    ts.get(x).listarPessoas();
                    break;


                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Inválido!");
            }

        } while (opcao != 0);

        sc.close();
    }
}