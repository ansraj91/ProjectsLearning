package SOLID.design.principle.openClosed;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String str[]){
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> list = new ArrayList <>();
        list.add(apple);
        list.add(tree);
        list.add(house);

        //Old way of doing
        System.out.println("Old way of doing!!");
        ProductFilter pf = new ProductFilter();
        pf.filterByColor(list,Color.GREEN).forEach(p->System.out.println(p));

        //New way of doing
        System.out.println("New way of doing!!");
        BetterFilter bf = new BetterFilter();
        bf.doFilter(list,new ColorSpecification(Color.RED)).forEach(s->System.out.println(s));
        //two filter on items
        bf.doFilter(list,new AndSpecification(new ColorSpecification(Color.BLUE),new SizeSpecification(Size.LARGE))).forEach(p->System.out.println(p));
    }
}
