package Adapter;

public class TrainerHelperAdapter implements TrainerInterface{
    private Team team;
    @Override
    public void defensiveEnglish() {
        team.defensiveRussian();
    }

    @Override
    public void offensiveEnglish() {
        team.offensiveRussian();
    }
}
