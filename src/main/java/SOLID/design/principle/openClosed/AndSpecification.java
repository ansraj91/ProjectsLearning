package SOLID.design.principle.openClosed;

public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public AndSpecification(Specification <T> first, Specification <T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isStaisfied(T item) {
        return first.isStaisfied(item) && second.isStaisfied(item);
    }
}
