package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Electric guitar";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        this.name = "Electric guitar";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void sound() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that Twangs");
    }
}
