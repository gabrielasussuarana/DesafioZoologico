import static java.lang.System.out;

public class Cachorro extends Animal{
    public boolean corre;
    public Cachorro(String nome, int idade, boolean emiteSom, boolean corre) {
        super(nome, idade, emiteSom);
        this.corre=corre;
        som = "AUAU";
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
        return "\nCachorro |"  +
                " nome='" + nome + '\'' +
                ", idade=" + idade  +
                " corre=" + corre +
                ", emiteSom=" + emiteSom + ", " + som;
    }
}
