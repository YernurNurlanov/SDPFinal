package FactoryMethod;

public class DefensiveTeamFactory implements TeamFactory{
    public Team createTeam(String name, String strategy){
        return new DefensiveTeam(name, strategy);
    }
}
