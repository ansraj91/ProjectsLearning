package DesignPattern.Specification.Model;

import DesignPattern.Specification.Attributes.Color;
import DesignPattern.Specification.Attributes.Specification;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color){
        this.color = color;
    }

    @Override
    public boolean isSpecified(Product item) {
        return item.getColor() == this.color;
    }
}
