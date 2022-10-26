public class AppAnimal {
    public static void main(String[] args) {

    Cachorro cachorro = new Cachorro("Mustela",13,true,true);
    Cavalo cavalo = new Cavalo("Judite",2,true,true);
    Preguica preguica = new Preguica("Afonso",5,true,true);

    System.out.println(cachorro.toString());
    System.out.println(cavalo.toString());
    System.out.println(preguica.toString());

    Veterinario veterinario = new Veterinario();

    veterinario.examinarAnimal(cachorro);
    veterinario.examinarAnimal(cavalo);
    veterinario.examinarAnimal(preguica);

    Zoologico zoologico = new Zoologico();

    zoologico.jaula(cachorro);
    zoologico.jaula(preguica);
    zoologico.jaula(cavalo);
    zoologico.jaula(preguica);

    zoologico.exibeJaula();
    }
}
