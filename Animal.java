public class Animal {
    public String nome;
    public int idade;
    public boolean emiteSom;
    public String som;

    public Animal(String nome, int idade, boolean emiteSom){
        this.nome=nome;
        this.idade=idade;
        this.emiteSom=emiteSom;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEmiteSom() {
        return emiteSom;
    }

    public void setEmiteSom(boolean emiteSom) {
        this.emiteSom = emiteSom;
    }

    public String emiteSom(){
        return som;
    }
}
