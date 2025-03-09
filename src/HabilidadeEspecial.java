public class HabilidadeEspecial {
    //Atributos
    String nome;
    int custoEnergia;
    boolean habilitada;

    //Construtor
    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada) {
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }
    //Metodo para ativar a haabilidade
    public void ativarHabilidade() {
        habilitada = true;
    }

}