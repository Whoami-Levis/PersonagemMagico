import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int op;
        //Menu do Jogo
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Atacar \n4-Aumentar energia \n5-Ativar Habilidade Especial \n6-Habilitar Habilidade Especial \n0-Sair");

                    op = sc.nextInt();

            switch (op) {

                case 1:
                    //solicitando para o usuario os dados do personagem
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem:");
                    String poder =  sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de energia:");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.nivelEnergia = energia
                    personagem.poderMagico = poder;
                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial:");
                    int nivelEnergia = sc.nextInt();
                    System.out.println("A habilidade está ativada? (True/False):");
                    boolean ativada = sc.nextBoolean();

                    //Criando o objeto que representa a habilidade especial com os valores informados pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);

                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;
                //Exibindo as informações do Personagem criado
                case 2:
                    System.out.println("Nome: " + personagem.nome + " \nPoder: " + personagem.poderMagico + " \nNível energia: " + personagem.nivelEnergia);
                    System.out.println("\nHabilidade: " + personagem.habilidadeEspecial.nome + " \nCusto energia: " + personagem.habilidadeEspecial.custoEnergia + " \nHabilitada: " + personagem.habilidadeEspecial.habilitada  +"\n");
                    break;
                //Criando a ação atacar com o Metodo Atacar
                case 3:
                    System.out.println("Digite o nome do Ataque:");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                //Criando a ação para recuperar e aumentar a energia
                case 4:
                    System.out.println("Digite a quantidade do Aumento de energia:");
                    int quantidade = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(quantidade);
                    System.out.println("Nivel Atual: " + nivelAtual);
                    break;
                //Chamando o metodo ativar habilidade
                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;
                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(op != 0);

        sc.close();

    }
}