package DesignPattern.Specification.Model;

import DesignPattern.Specification.Attributes.Size;
import DesignPattern.Specification.Attributes.Specification;

public class SizeSpecification implements Specification<Product> {

    private Size size;
    public SizeSpecification(Size size){
        this.size = size;
    }

    @Override
    public boolean isSpecified(Product product) {
        return product.getSize()==this.size;
    }
}
