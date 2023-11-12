package Adapter;

public class Trainer implements TrainerInterface {
    @Override
    public void defensiveEnglish() {
        System.out.println("Go defensive!");
    }

    @Override
    public void offensiveEnglish() {
        System.out.println("Go offensive!");
    }
}
