package Decorator;
import Strategy.FootballStrategy;
public class PressingDecorator extends StrategyDecorator {
    public PressingDecorator(FootballStrategy strategy) {
        this.decoratedStrategy = strategy;
    }
    @Override
    public String play() {
        return decoratedStrategy.play() + " with pressing";
    }
}
