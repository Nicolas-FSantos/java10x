public class NinjaAvancado extends NinjaBasico {
    String especialidade;

    public NinjaAvancado(String name, int idade, String habilidade, TipoHabilidade tipoHabilidade, String especialidade) {
        super(name, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }


    @Override
    public void mostrarInformacoes() {
        super.executarHabilidade();
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
    }
}