package FactoryMethod;
import Strategy.FootballStrategy;
public class DefensiveTeam implements Team {
    private final String name;
    FootballStrategy strategy;
    public DefensiveTeam(String name, FootballStrategy strategy){
        this.name = name;
        this.strategy = strategy;
    }
    public String name(){
        return name;
    }
    public String strategy() {
        return strategy.play();
    }
}
