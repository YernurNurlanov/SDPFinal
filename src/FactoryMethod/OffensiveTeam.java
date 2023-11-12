package FactoryMethod;
import Strategy.FootballStrategy;
public class OffensiveTeam implements Team {
    private final String name;
    String strategy;
    public OffensiveTeam(String name, String strategy){
        this.name = name;
        this.strategy = strategy;
    }
    public String name(){
        return name;
    }
    public String strategy() {
        return strategy;
    }
}
