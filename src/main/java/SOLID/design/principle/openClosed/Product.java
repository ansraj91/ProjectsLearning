package SOLID.design.principle.openClosed;

import java.util.List;
import java.util.stream.Stream;

public class Product {

    String name;
    Color color;
    Size size;

    public Product(String name, Color color, Size size){
        this.name  = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString(){
        return "-"+this.name +"," + this.color + "," + this.size;
    }

}

//Wihtout openClose, here need to define filter for both color and size
class ProductFilter{

    public Stream<Product> filterByColor(List<Product> products, Color color){

        return products.stream().filter(p->p.color == color);
    }
    public Stream<Product> filterBySize(List<Product> products, Size size){

        return products.stream().filter(p->p.size == size);
    }

    public Stream<Product> filterBySize(List<Product> products, Color color, Size size){

        return products.stream().filter(p->p.size == size
                && p.color == color);
    }

//With open close principle


}
