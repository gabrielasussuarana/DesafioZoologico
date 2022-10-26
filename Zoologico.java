import java.util.ArrayList;

public class Zoologico {
    public ArrayList<Animal> jaula;
    public Animal animal;

    public Zoologico(){
        jaula =  new ArrayList<>(10);
    }


    public void jaula(Animal animal) {
            jaula.add(animal);
    }

    public void exibeJaula() {
        int x=1;
        for (Animal animal:jaula) {
            System.out.println("Jaula " + x + " " + animal.getClass().getCanonicalName() + " " + animal.getNome());
            x++;
        }
        /*
        for (int i = 0; i < 9; i++) {
            System.out.println("Jaula " + i + " " + jaula.get(i).getClass().getCanonicalName());
        }
        */

    }
}
