package FactoryMethod;
import Strategy.DefensiveStrategy;
public class DefensiveTeamFactory {
    public Team createTeam(String name){
        return new OffensiveTeam(name, new DefensiveStrategy());
    }
}
