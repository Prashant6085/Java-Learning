package class_and_object;

public class Animal {
    int animalNumber;
    int animalWeight;
    String animalType;


    public Animal() {
    }

    public Animal(int animalNumber, int animalWeight, String animalType) {
        this.animalNumber = animalNumber;
        this.animalWeight = animalWeight;
        this.animalType = animalType;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalNumber=" + animalNumber +
                ", animalWeight=" + animalWeight +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
