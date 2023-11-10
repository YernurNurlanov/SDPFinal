package Decorator;
import Strategy.FootballStrategy;
abstract class StrategyDecorator implements FootballStrategy {
    public FootballStrategy decoratedStrategy;
    @Override
    public abstract String play();
}
