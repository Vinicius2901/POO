package dados;

public enum Qualidade {
    P240(240),
    P360(360),
    P720(720),
    P1080(1080);

    private final int valor;

    Qualidade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String toString() {
        return valor + "p";
    }
}
