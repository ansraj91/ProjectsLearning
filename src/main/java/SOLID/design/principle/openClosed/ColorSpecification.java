package SOLID.design.principle.openClosed;

public class ColorSpecification implements Specification<Product> {

    Color color;
    public ColorSpecification(Color color){
        this.color = color;
    }

    @Override
    public boolean isStaisfied(Product item) {
        return item.color == color;
    }
}
