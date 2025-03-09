public class PersonagemMagico {

    //Atributo4
    String nome;
    //Atributo3
    String poderMagico;
    //Atributo2
    int nivelEnergia;
    //Atributo1
    HabilidadeEspecial habilidadeEspecial;

    //Construtor1
    PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    //Construtor2
    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    //Construtor3 (Padrão
    public PersonagemMagico() {
    }
    //Metodo para atacar retorno
    public void atacar(String ataque) {
        if (nivelEnergia >= 10) {
            System.out.println(nome + " Realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " Esta sem energia para atacar! ");
        }
    }
    //Metodo para aumentar a energia
    public int aumentarEnergia(int energia) {
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }
    //Metodo para ativar a habilidade Especial
    public void ativarHabilidadeEspecial(){
        if(!habilidadeEspecial.habilitada){
            System.out.println("Habilidade Especial não está ativada!");
        }else if (nivelEnergia >= habilidadeEspecial.custoEnergia){
            System.out.println("Ativando Habilidade Especial:" + habilidadeEspecial.nome);
            nivelEnergia -= habilidadeEspecial.custoEnergia;
        }else{
            System.out.println(nome + ": Esta sem energia para habilidade Especial!");
        }
    }

}


