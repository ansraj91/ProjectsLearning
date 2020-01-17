package SOLID.design.principle.openClosed;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {

    Stream<T> doFilter(List<T> items, Specification<T> specification);
}
