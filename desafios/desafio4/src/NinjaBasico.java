public class NinjaBasico implements Ninja{
    String name;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String name, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.name = name;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public NinjaBasico(String habilidade, int idade, String name) {
        this.habilidade = habilidade;
        this.idade = idade;
        this.name = name;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo da Habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Executando habilidade: " + habilidade);
    }
}