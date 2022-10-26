public class Cavalo extends Animal{
    public boolean corre;
    public Cavalo(String nome, int idade, boolean emiteSom, boolean corre) {
        super(nome, idade, emiteSom);
        this.corre=corre;
        som="Relincha";
    }

    public boolean isCorre() {
        return corre;
    }

    public void setCorre(boolean corre) {
        this.corre = corre;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public String toString() {
        return "\nCavalo |" +
                " nome='" + nome + '\'' +
                ", idade=" + idade +
                ", emiteSom=" + emiteSom + ", " + som;
    }
}
