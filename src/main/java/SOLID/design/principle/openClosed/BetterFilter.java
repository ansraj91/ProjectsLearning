package SOLID.design.principle.openClosed;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {
    @Override
    public Stream<Product> doFilter(List items, Specification specification) {
        return items.stream().filter(s->specification.isStaisfied(s));
    }
}
