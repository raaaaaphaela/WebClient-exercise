package de.neuefische.webclientexample.elvedinsAPI;

public class Animal {

    private String animal;
    private String description;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
