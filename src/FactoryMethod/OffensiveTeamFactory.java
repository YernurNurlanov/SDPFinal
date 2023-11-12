package FactoryMethod;
import Strategy.FootballStrategy;
import Strategy.OffensiveStrategy;
public class OffensiveTeamFactory implements TeamFactory{
    public Team createTeam(String name, FootballStrategy strategy){
        return new OffensiveTeam(name, strategy);
    }
}
