package DesignPattern.Specification;

import DesignPattern.Specification.Attributes.Color;
import DesignPattern.Specification.Attributes.Size;
import DesignPattern.Specification.Model.*;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {


    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product banana = new Product("Banana", Color.YELLOW, Size.MEDIUM);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = new ArrayList <Product>();
        products.add(apple);
        products.add(tree);
        products.add(banana);
        products.add(house);

        ColorSpecification colorGreenSpecification = new ColorSpecification(Color.GREEN);
        ColorSpecification colorYellowSpecification = new ColorSpecification(Color.YELLOW);

        SizeSpecification sizeLargeSpecification = new SizeSpecification(Size.LARGE);
        SizeSpecification sizeSmallSpecification = new SizeSpecification(Size.SMALL);

        ColorAndSizeSpecification colorGreenAndSizeLargeSpecification = new ColorAndSizeSpecification(colorGreenSpecification, sizeLargeSpecification);
        ColorAndSizeSpecification colorGreenAndSizeSmallSpecification = new ColorAndSizeSpecification(colorGreenSpecification, sizeSmallSpecification);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green Products!!");
        productFilter.filter(products,colorGreenSpecification).forEach(p->System.out.println("-"+p.getName()));

        System.out.println("Yellow Products!!");
        productFilter.filter(products,colorYellowSpecification).forEach(p->System.out.println("-"+p.getName()));

        System.out.println("Large Products");
        productFilter.filter(products,sizeLargeSpecification).forEach(p->System.out.println("-"+p.getName()));

        System.out.println("Small and Green Products");
        productFilter.filter(products,colorGreenAndSizeSmallSpecification).forEach(p->System.out.println("-"+p.getName()));

    }

}
