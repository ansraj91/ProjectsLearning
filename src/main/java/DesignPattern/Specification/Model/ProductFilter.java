package DesignPattern.Specification.Model;

import DesignPattern.Specification.Attributes.Specification;
import DesignPattern.Specification.Filter.Filter;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

   /* private Specification<Product> productSpecification;

    public ProductFilter(Specification<Product> productSpecification){
        this.productSpecification = productSpecification;
    }*/

    @Override
    public Stream<Product> filter(List<Product> products, Specification<Product> spec) {
        return products.stream().filter(product -> spec.isSpecified(product));
    }
}
