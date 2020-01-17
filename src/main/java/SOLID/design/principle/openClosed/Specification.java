package SOLID.design.principle.openClosed;

public interface Specification<T> {

    boolean isStaisfied(T item);
}
