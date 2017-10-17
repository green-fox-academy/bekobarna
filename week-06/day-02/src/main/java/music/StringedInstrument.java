package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public StringedInstrument() {
    }

    public abstract void sound();

    @Override
    public void play() {
        sound();
    }
}
