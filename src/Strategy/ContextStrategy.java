package Strategy;
public class ContextStrategy {
    FootballStrategy strategy;
    public void setStrategy(FootballStrategy strategy) {
        this.strategy = strategy;
    }
    public String getStrategy() {
        return strategy.play();
    }
}
