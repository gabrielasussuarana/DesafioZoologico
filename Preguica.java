public class Preguica extends Animal{
    public boolean sobeEmArvore;
    public Preguica(String nome, int idade, boolean emiteSom, boolean sobeEmArvore) {
        super(nome, idade, emiteSom);
        this.sobeEmArvore= true;
        som = "Grunidos";
    }

    public boolean isSobeEmArvore() {
        return sobeEmArvore;
    }

    public void setSobeEmArvore(boolean sobeEmArvore) {
        this.sobeEmArvore = sobeEmArvore;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public String toString() {
        return "\nPreguica |" +
                " nome='" + nome + '\'' +
                ", idade=" + idade + " sobeEmArvore=" + sobeEmArvore +
                ", emiteSom=" + emiteSom + ", " + som;
    }
}
