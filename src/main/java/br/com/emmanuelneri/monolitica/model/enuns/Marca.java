package br.com.emmanuelneri.monolitica.model.enuns;

public enum Marca {

    AUDI("Audi"),
    BMW("BMW"),
    CHEVROLET("Chevrolet"),
    VOLKSWAGEN("Volkswagen"),
    FIAT("Fiat"),
    FORD("Ford"),
    LAND_ROVER("Land Rover"),
    MERCEDES("Mercedes"),
    KIA("KIA");

    private final String descricao;

    Marca(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
