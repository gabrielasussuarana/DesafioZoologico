public class Veterinario {
    public Animal animal;

    public Veterinario(){
    }

    public void examinarAnimal(Animal animal){
        System.out.println("\n\n----------Consulta Clinica " + animal.getClass().getCanonicalName() + "----------");
        System.out.println("\n" + animal.getClass().getCanonicalName() + " sendo examinado");
        System.out.println(animal.getNome()+  " emite som:" + animal.emiteSom() + "\n");
    }
}
