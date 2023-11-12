# Name of final project: Football League
# Group: SE-2216
# Team members: Yernur Nurlanov, Angsat Ydrys.
# Project Overview:
# Main body:
## Strategy Pattern
### Context

### Strategy

### Concrete Strategy

## Singleton Strategy
### Singleton
The Singleton is the FootballLeague class. Class has instance:
```
private static FootballLeague instance;
```
And has Singleton(), getInstance() method:
```
private FootballLeague() {
        teams = new ArrayList<>();
    }
    public static FootballLeague getInstance(){
        if (instance == null) {
            instance = new FootballLeague();
        }
        return instance;
    }
```
## Decorator Strategy
### Component

### Concrete Component

### Base Decorator

### Concrete Decorator

## Observer Strategy
### Publisher
The Publisher is the FootballLeague class. Class has list of subscribers:
```
public static List<Observer> observers = new ArrayList<>();
```
And has subscribe()-"addObserver",unsubscribe()-"removeObserver",notifySubscribers()-"notifyObservers" methods:
```
public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public static void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
```
And has mainBusinessLogic():
```
public void addTeam(Team team){
        teams.add(team);
        notifyObservers(team.name() + " has been added to the league.");
    }
```
### Subscriber
The Subscriber is the Observer interface. Interface has update() method:
```
void update(String message);
```
### Concrete Subscriber
The Concrete Subscriber is the LeagueObserver class. Class has realization of update() method:
```
public void update(String message) {
        System.out.println(name + " received an update: " + message);
    }
```
## Adapter Strategy
## Factory Method
### Creator
The Creator is the TeamFactory interface. Interface has createProduct() method:
```

```
### Concrete Creator

### Product

### Concrete Product

# Conclusion:
