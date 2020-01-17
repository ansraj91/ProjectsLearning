package SOLID.design.principle.SingleResponsibility;


import java.util.ArrayList;
import java.util.List;

//Also known as SRP
public class Journal {

    List<String> entries = new ArrayList <>();
    int count = 0;


    public void addEntries(String value){
        entries.add(""+ ++count + ": "+value);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString(){
        return String.join(System.lineSeparator(),entries);
    }



    public static void main(String str[]){
        Journal j = new Journal();
        j.addEntries("Hello Everyone!!");
        j.addEntries("A very good morning!!");

        System.out.println(j);
    }
}
