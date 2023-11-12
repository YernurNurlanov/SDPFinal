package FactoryMethod;
import Strategy.FootballStrategy;
public interface TeamFactory {
    Team createTeam(String name, FootballStrategy strategy);
}
