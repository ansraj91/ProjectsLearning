package DesignPattern.Specification.Attributes;

public interface Specification<T> {

    boolean isSpecified(T item);
}
