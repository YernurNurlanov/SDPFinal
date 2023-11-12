package FactoryMethod;
import Strategy.DefensiveStrategy;
import Strategy.FootballStrategy;

public class DefensiveTeamFactory implements TeamFactory{
    public Team createTeam(String name, FootballStrategy strategy){
        return new DefensiveTeam(name, strategy);
    }
}
