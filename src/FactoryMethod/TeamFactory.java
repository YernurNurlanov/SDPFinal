package FactoryMethod;
public interface TeamFactory {
    Team createTeam(String name, Object strategy);
}
