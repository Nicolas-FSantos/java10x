public enum TipoHabilidade {
    TAIJUTSU("TAIJUTSU"),
    NINJUTSU("NINJUTSU"),
    GENJUTSU("GENJUTSU"),
    KATON("KATON"),
    RINNENGAN("RINNENGAN");

    final String tipoHabilidade;

    TipoHabilidade(String tipoHabilidade){
        this.tipoHabilidade = tipoHabilidade;
    }

    public String gettipoHabilidade() {
        return this.tipoHabilidade;
    }
}