package FactoryMethod;

import Strategy.OffensiveStrategy;

public class OffensiveTeamFactory {
    public Team createTeam(String name){
        return new OffensiveTeam(name, new OffensiveStrategy());
    }
}
