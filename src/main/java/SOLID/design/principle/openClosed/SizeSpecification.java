package SOLID.design.principle.openClosed;

public class SizeSpecification implements Specification<Product>{
    Size size;
    public SizeSpecification(Size size){
        this.size = size;
    }

    @Override
    public boolean isStaisfied(Product item) {
        return item.size == this.size;
    }
}
