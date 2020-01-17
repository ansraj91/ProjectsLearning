package SOLID.design.principle.SingleResponsibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Persistence {


    public void saveTofile(Journal j, String fileName, boolean overwrite) throws IOException {
        if(overwrite || new File(fileName).exists()) {
            try (PrintStream pr = new PrintStream(fileName)) {
                pr.println(j.toString());
            }
        }
        Runtime.getRuntime().exec("notepad.exe"+fileName);
    }


    public static  void main(String str[]) throws IOException {
        Journal j = new Journal();
        j.addEntries("Hello, Anshul");
        j.addEntries("Very good morning to you Anshul!!");
        System.out.println(j);
        Persistence persistence = new Persistence();
        persistence.saveTofile(j,"C:\\Users\\anshulkhandelwal\\Documents\\MyLearnings\\ProjectsLearning\\src\\SOLID\\design\\principle\\resources.txt",true);

    }
}
