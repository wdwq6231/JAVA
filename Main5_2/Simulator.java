package Main5_2;

public class Simulator {
    public void playSound(Animal animal) {
        System.out.print(animal.getAnimalName() + "的叫声：");
        animal.cry();
    }
}
