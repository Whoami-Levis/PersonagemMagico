public class Main {
    public static void main(String[] args) {
        //Criando um objeto do tipo Personagem Mágico (Mago)
        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");

        //Exibindo valores dos atributos do objeto (Mago)
        System.out.println(mago.nome + " - Energia:" + mago.nivelEnergia + " - Poder:" + mago.Poder);

        //Criado novo personagem magico (Elfo)
        PersonagemMagico elfo = new PersonagemMagico("Elfo", 100, "Arqueiro");


        //Imprimindo os valores do persdnagem (Elfo)
        System.out.println(elfo.nome + " - Energia:" + elfo.nivelEnergia + " - Poder:" + elfo.Poder);
    }
}
