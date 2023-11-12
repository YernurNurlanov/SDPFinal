import Decorator.*;
import FactoryMethod.*;
import Singleton.*;
import Observer.*;
import Strategy.*;
import Adapter.*;

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        while(!Objects.equals(ans, "yes") && !ans.equals("no")){
            System.out.println("Welcome! Here you can create a football league. Ready to start?Yes/No");
            ans = sc.nextLine();
            ans = ans.toLowerCase();
        }
        if (ans.equals("no")){
            System.exit(0);
        }
        FootballLeague league = FootballLeague.getInstance();
        System.out.println("The league has been established.");
        while (true) {
            while (!Objects.equals(ans, "1") && !ans.equals("2") && !ans.equals("3") && !ans.equals("4") && !ans.equals("5")
                    && !ans.equals("6") && !ans.equals("7") && !ans.equals("8") && !ans.equals("9")) {
                System.out.println("""
                        Choose one of these actions:(enter the number)
                        1. Add a offensive team.
                        2. Add a defensive team.
                        3. Add a subscriber.
                        4. List of teams.
                        5. List of subscribers.
                        6. Delete team.
                        7. Delete subscriber.
                        8. Call trainer assistant for translating.
                        9. Exit.""");
                ans = sc.nextLine();
            }
            switch (ans) {
                case "1" -> {
                    String name;
                    boolean teamExists;
                    do {
                        System.out.println("Please enter the name of the team.");
                        name = sc.nextLine();
                        String finalName = name;
                        teamExists = FootballLeague.teams.stream()
                                .anyMatch(team -> team.name().equals(finalName));
                        if (teamExists) {
                            System.out.println("Team with the name '" + name + "' already exists. Please enter a unique name.");
                        }
                    } while (teamExists);
                    OffensiveTeamFactory teamFactory = new OffensiveTeamFactory();
                    ContextStrategy context = new ContextStrategy();
                    while (!Objects.equals(ans, "yes") && !ans.equals("no")) {
                        System.out.println("Do you want this team to play with pressing? Yes/No");
                        ans = sc.nextLine();
                        ans = ans.toLowerCase();
                    }
                    if (ans.equals("yes")) {
                        context.setStrategy(new PressingDecorator(new OffensiveStrategy()));
                    }
                    else {
                        context.setStrategy(new OffensiveStrategy());
                    }
                    Team team = teamFactory.createTeam(name, context.getStrategy());
                    league.addTeam(team);
                    System.out.println("Team " + name + " has been added");
                }
                case "2" -> {
                    String name;
                    boolean teamExists;
                    do {
                        System.out.println("Please enter the name of the team.");
                        name = sc.nextLine();
                        String finalName = name;
                        teamExists = FootballLeague.teams.stream()
                                .anyMatch(team -> team.name().equals(finalName));
                        if (teamExists) {
                            System.out.println("Team with the name '" + name + "' already exists. Please enter a unique name.");
                        }
                    } while (teamExists);
                    DefensiveTeamFactory teamFactory = new DefensiveTeamFactory();
                    ContextStrategy context = new ContextStrategy();
                    while (!Objects.equals(ans, "yes") && !ans.equals("no")) {
                        System.out.println("Do you want this team to play with pressing? Yes/No");
                        ans = sc.nextLine();
                        ans = ans.toLowerCase();
                    }
                    if (ans.equals("yes")) {
                        context.setStrategy(new PressingDecorator(new DefensiveStrategy()));
                    }
                    else {
                        context.setStrategy(new DefensiveStrategy());
                    }
                    Team team = teamFactory.createTeam(name, context.getStrategy());
                    league.addTeam(team);
                    System.out.println("Team " + name + " has been added");
                }
                case "3" -> {
                    System.out.println("Please enter the name of subscriber.");
                    ans = sc.nextLine();
                    Observer observer = new LeagueObserver(ans);
                    league.addObserver(observer);
                    System.out.println("Subscriber " + ans + " has been added.");
                    ans = "";
                }
                case "4" -> {
                    int i = 0;
                    System.out.println("List of teams.");
                    for (Team team : FootballLeague.teams){
                        i++;
                        System.out.println(i + ". " + team.name() + " " + team.strategy());
                    }
                    ans = "";
                }
                case "5" -> {
                    int i = 0;
                    System.out.println("List of subscribers.");
                    for (Observer observer : FootballLeague.observers){
                        i++;
                        System.out.println(i + ". "+ observer.name());
                    }
                    ans = "";
                }
                case "6" -> {
                    int i = 0;
                    System.out.println("List of teams.");
                    for (Team team : FootballLeague.teams){
                        i++;
                        System.out.println(i + ". " + team.name() + " " + team.strategy());
                    }
                    ans = "0";
                    while (Integer.parseInt(ans) < 1 || Integer.parseInt(ans) > FootballLeague.teams.size()){
                        System.out.println("Enter the number of team you want to delete.");
                        ans = sc.nextLine();
                    }
                    FootballLeague.teams.remove(Integer.parseInt(ans) - 1);
                    System.out.println("Team has been removed");
                    ans = "";
                }
                case "7" -> {
                    int i = 0;
                    System.out.println("List of subscribers.");
                    for (Observer observer : FootballLeague.observers) {
                        i++;
                        System.out.println(i + ". " + observer.name());
                    }
                    ans = "0";
                    while (Integer.parseInt(ans) < 1 || Integer.parseInt(ans) > FootballLeague.observers.size()) {
                        System.out.println("Enter the number of the subscriber you want to delete.");
                        ans = sc.nextLine();
                    }
                    FootballLeague.removeObserver(FootballLeague.observers.get(Integer.parseInt(ans) - 1));
                    System.out.println("Subscriber has been removed");
                    ans = "";
                }
                case "8" -> {
                    russianTeam team = new russianTeam();
                    Trainer trainer = new Trainer();

                    TrainerHelperAdapter trainerAdapter = new TrainerHelperAdapter(team);

                    trainer.offensiveEnglish();
                    trainerAdapter.offensiveEnglish();
                    System.out.println("---------------------------------");
                    trainer.defensiveEnglish();
                    trainerAdapter.defensiveEnglish();
                    ans = "";
                }
                case "9" -> System.exit(0);
            }
        }
    }
}
