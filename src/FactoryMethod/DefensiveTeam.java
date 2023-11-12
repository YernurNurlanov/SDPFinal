package FactoryMethod;
public class DefensiveTeam implements Team {
    private final String name;
    String strategy;
    public DefensiveTeam(String name, String strategy){
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
