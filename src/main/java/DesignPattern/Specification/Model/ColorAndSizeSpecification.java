package DesignPattern.Specification.Model;

import DesignPattern.Specification.Attributes.Specification;

public class ColorAndSizeSpecification implements Specification<Product> {


    Specification specification1;
    Specification specification2;

    public ColorAndSizeSpecification(ColorSpecification color, SizeSpecification size){
        this.specification1 = color;
        this.specification2 = size;
    }

    @Override
    public boolean isSpecified(Product item) {
        return specification1.isSpecified(item) && specification2.isSpecified(item);
    }
}
