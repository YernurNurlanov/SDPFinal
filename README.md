# SDPFinal
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

### Subscriber

### Concrete Subscriber

## Adapter Strategy
## Factory Method
### Creator

### Concrete Creator

### Product

### Concrete Product
