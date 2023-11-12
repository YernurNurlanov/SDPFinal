package Adapter;

public class TrainerHelperAdapter implements TrainerInterface{
    private russianTeam team;

    public TrainerHelperAdapter(russianTeam team){
        this.team = team;
    }

    @Override
    public void defensiveEnglish() {
        team.defensiveRussian();
    }

    @Override
    public void offensiveEnglish() {
        team.offensiveRussian();
    }
}
