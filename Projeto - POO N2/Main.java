import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Turma> turmas = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n===== SISTEMA DE CADASTRO ESCOLAR =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Criar Curso");
            System.out.println("4 - Criar Turma");
            System.out.println("5 - Vincular Aluno a Turma");
            System.out.println("6 - Listar Alunos da Turma");
            System.out.println("7 - Remover Turmas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    long mat = sc.nextLong(); sc.nextLine();
                    System.out.print("Nome: ");
                    String nomeA = sc.nextLine();
                    System.out.print("Data de Nascimento: ");
                    String nasc = sc.nextLine();
                    System.out.print("Curso: ");
                    String cursoA = sc.nextLine();

                    Aluno a = new Aluno(mat, nomeA, nasc, cursoA);
                    a.cadastrar();
                    alunos.add(a);
                    break;

                case 2:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpfP = sc.nextLine();
                    System.out.print("Área: ");
                    String area = sc.nextLine();

                    Professor p = new Professor(id, nomeP, cpfP, area);
                    p.cadastrar();
                    professores.add(p);
                    break;

                case 3:
                    System.out.print("Código do Curso: ");
                    int codC = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome do Curso: ");
                    String nomeC = sc.nextLine();
                    System.out.print("Carga horária: ");
                    String ch = sc.nextLine();

                    Curso c = new Curso(codC, nomeC, ch);
                    cursos.add(c);
                    System.out.println("Curso criado: " + nomeC);
                    break;

                case 4:
                    if (professores.isEmpty()) {
                        System.out.println("Cadastre um professor primeiro!");
                        break;
                    }
                    System.out.print("Código da Turma: ");
                    int codT = sc.nextInt(); sc.nextLine();
                    System.out.print("Ano de Entrada: ");
                    int ano = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome da Turma: ");
                    String nomeT = sc.nextLine();

                    System.out.println("Escolha um professor (digite o número):");
                    for (int i = 0; i < professores.size(); i++)
                        System.out.println((i + 1) + " - " + professores.get(i).getNome());
                    int profIndex = sc.nextInt() - 1;
                    Professor profSel = professores.get(profIndex);

                    Turma t = new Turma(codT, ano, nomeT, profSel);
                    turmas.add(t);
                    profSel.atribuirTurma(t);
                    break;

                case 5:
                    if (alunos.isEmpty() || turmas.isEmpty()) {
                        System.out.println("Cadastre alunos e turmas antes!");
                        break;
                    }
                    System.out.println("Escolha o aluno:");
                    for (int i = 0; i < alunos.size(); i++)
                        System.out.println((i + 1) + " - " + alunos.get(i).getNome());
                    int aIndex = sc.nextInt() - 1;

                    System.out.println("Escolha a turma:");
                    for (int i = 0; i < turmas.size(); i++)
                        System.out.println((i + 1) + " - " + turmas.get(i).getNome());
                    int tIndex = sc.nextInt() - 1;

                    turmas.get(tIndex).adicionarAluno(alunos.get(aIndex));
                    break;

                case 6:
                    if (turmas.isEmpty()) {
                        System.out.println("Nenhuma turma cadastrada.");
                        break;
                    }
                    System.out.println("Escolha a turma:");
                    for (int i = 0; i < turmas.size(); i++)
                        System.out.println((i + 1) + " - " + turmas.get(i).getNome());
                    int tt = sc.nextInt() - 1;
                    turmas.get(tt).listarAlunos();
                    break;
                
                case 7:
                    System.out.println("7- Excluir Turma");
                    if(turmas.isEmpty()) {
                        System.out.println("Nenhuma turma cadastrada");
                        break;
                    }

                    System.out.println("Escolha a turma que deseja excluir:");
                    for (int i = 0; i < turmas.size(); i++) {
                        System.out.println((i + 1) + " - " + turmas.get(i).getNome());
                    }

                    int turmaexcluir = sc.nextInt() - 1 ;
                    sc.nextLine();

                    if (turmaexcluir < 0 || turmaexcluir >= turmas.size()) {
                        System.out.println("Opção inválida");
                        break;
                    }
                    
                    Turma turmaRemovida = turmas.remove(turmaexcluir);
                    System.out.println("Turma \"" + turmaRemovida.getNome() + "\" foi excluída com sucesso.");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}