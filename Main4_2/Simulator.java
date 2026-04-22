package Main4_2;

public class Simulator {
    public void playSound(Animal animal) {
        String name = animal.getAnimalName();
        System.out.print(name + "的叫声：");
        animal.cry();
    }
}
