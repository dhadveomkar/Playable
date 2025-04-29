package Playable;
interface Playable {
    void play();
}

// Abstract Class
abstract class Instrument implements Playable {
    public void tune() {
        System.out.println("Instrument is being tuned.");
    }

    public abstract void repair();
}

// Final Class
final class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing music.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the Guitar.");
    }
}


public class Main {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.tune();   
        myGuitar.play();   
        myGuitar.repair(); 
    }
}