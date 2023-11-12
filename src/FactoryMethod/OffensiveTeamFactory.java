package FactoryMethod;
public class OffensiveTeamFactory implements TeamFactory{
    public Team createTeam(String name, String strategy){
        return new OffensiveTeam(name, strategy);
    }
}
