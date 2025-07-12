package learning.designPatterns.observer.interfaces;

@FunctionalInterface
public interface Observer {
    void update(Subject subject, Object arg);
}
