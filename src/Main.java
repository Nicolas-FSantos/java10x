import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int submissions = 0;
        int option = 0;
        int maxNumberNinja = 5;
        String textLine;
        Uchiha[] ninjas = new Uchiha[maxNumberNinja];
        Scanner scanner = new Scanner(System.in);

        while(option != 4){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Alterar Habilidade Especial");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    if(submissions < ninjas.length){
                        ninjas[submissions] = submitNinja(scanner);
                        submissions++;
                    } else{
                        System.out.println("A lista de ninjas está cheia");
                    }
                    break;
                case 2:
                    if(submissions > 0){
                        for (int i = 0; i < submissions; i++) {
                            System.out.println("Nome do ninja: " + ninjas[i].nome);
                            System.out.println("Idade do ninja: " + ninjas[i].idade);
                            System.out.println("Missão atual do ninja: " + ninjas[i].missao);
                            System.out.println("Nível de dificuldade da missão: " + ninjas[i].nivelDificuldade);
                            System.out.println("Status da missão: " + ninjas[i].statusMissao);
                            System.out.println("Habilidade especial do ninja: " + ninjas[i].habilidadeEspecial);
                            System.out.println("--------------------------");
                        }
                    }else{
                        System.out.println("Nenhum ninja cadastrado");
                    }
                    break;
                case 3:
                    if (submissions > 0){
                        System.out.println("Escolha o ninja pelo número: ");
                        for (int i = 0; i < submissions; i++) {
                            System.out.println(i + ". " + ninjas[i].nome);
                        }
                        option = scanner.nextInt();
                        scanner.nextLine();

                        if(option < submissions){
                            System.out.println("Insira a nova habilidade especial");
                            ninjas[option].habilidadeEspecial = scanner.nextLine();
                            System.out.println("Nova habilidade registrada para "+ ninjas[option].nome + ": "  + ninjas[option].habilidadeEspecial);
                        } else{
                            System.out.println("Opção inválida");
                        }

                    }else{
                        System.out.println("Nenhum ninja cadastrado");
                    }
                    break;
                case 4:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }


    }

    public static Uchiha submitNinja(Scanner scanner){
        Uchiha ninja = new Uchiha();
        scanner.nextLine();
        System.out.println("Insira o nome do ninja: ");
        ninja.nome = scanner.nextLine();

        System.out.println("Insira a idade do ninja: ");
        ninja.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira a missão atual do ninja: ");
        ninja.missao = scanner.nextLine();

        System.out.println("Insira a dificuldade da missão: ");
        ninja.nivelDificuldade = scanner.nextLine();

        System.out.println("Insira o status da missão: ");
        ninja.statusMissao = scanner.nextLine();

        System.out.println("Insira a habilidade especial do ninja: ");
        ninja.habilidadeEspecial = scanner.nextLine();

        return ninja;
    }



}