import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int op;
        do {
            System.out.println("\tEscolha uma Opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n0 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do Personagem");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o Poder do Personagem");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nivel de Energia");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.poderMagico = poder;
                    personagem.nivelEnergia = energia;
                    break;
                case 2:
                    System.out.println();
            }

        }
    }
}
