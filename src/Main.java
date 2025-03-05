public class Main {
    public static void main(String[] args) {
        //Criando um objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico();

        //Atribuindo Valores aos atributos do objeto
        mago.nome = "Gandalf";
        mago.nivelEnergia = 100;
        mago.Poder = "Magia";

        //Exibindo valores dos atributos do objeto
        System.out.println(mago.nome + " Energia:" + mago.nivelEnergia + " Poder:" + mago.Poder);

        //Criado novo personagem magico (elfo)
        PersonagemMagico elfo = new PersonagemMagico();
        //Definidno os valores do atributos do objeto, pegando o molde da classe Persongem Magico
        elfo.nome = "Legolas";
        elfo.nivelEnergia = 50;
        elfo.Poder = "Arqueiro";
        //Imprimindo os valores do persdnagem elfo
        System.out.println(elfo.nome + "Energia:" + elfo.nivelEnergia + " Poder:" + elfo.Poder);
    }
}
