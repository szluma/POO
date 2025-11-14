import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Turma> turmas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n===== SISTEMA ESCOLAR =====");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Criar Turma");
            System.out.println("3 - Vincular Aluno à Turma");
            System.out.println("4 - Listar Alunos da Turma");
            System.out.println("5 - Excluir Turma");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("É um (1) Aluno ou (2) Professor? ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Data de Nascimento: ");
                    String nasc = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Matrícula: ");
                        long mat = sc.nextLong(); sc.nextLine();

                        Aluno a = new Aluno(mat, nome, cpf, nasc);
                        a.cadastrar();
                        alunos.add(a);

                    } else if (tipo == 2) {
                        System.out.print("ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        System.out.print("Área de atuação: ");
                        String area = sc.nextLine();

                        Professor p = new Professor(id, nome, cpf, nasc, area);
                        p.cadastrar();
                        professores.add(p);

                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.print("Código da Turma: ");
                    int codT = sc.nextInt(); sc.nextLine();
                    System.out.print("Ano de Entrada: ");
                    int ano = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome da Turma: ");
                    String nomeT = sc.nextLine();

                    Turma t = new Turma(codT, ano, nomeT);
                    turmas.add(t);
                    System.out.println("Turma criada: " + nomeT);
                    break;

                case 3:
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

                case 4:
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

                case 5:
                    if (turmas.isEmpty()) {
                        System.out.println("Nenhuma turma cadastrada");
                        break;
                    }

                    System.out.println("Escolha a turma que deseja excluir:");
                    for (int i = 0; i < turmas.size(); i++) {
                        System.out.println((i + 1) + " - " + turmas.get(i).getNome());
                    }

                    int turmaexcluir = sc.nextInt() - 1;
                    if (turmaexcluir < 0 || turmaexcluir >= turmas.size()) {
                        System.out.println("Opção inválida");
                        break;
                    }

                    Turma removida = turmas.remove(turmaexcluir);
                    System.out.println("Turma \"" + removida.getNome() + "\" foi excluída.");
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);

        sc.close();
    }
}