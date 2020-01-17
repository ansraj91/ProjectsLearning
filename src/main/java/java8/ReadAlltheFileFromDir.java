package java8;

import com.sun.org.apache.xpath.internal.SourceTree;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadAlltheFileFromDir {

    public static void main(String[] args) {
        Map<String, String> map1 ;
        Map<String,String> map2;
        List<String> l1 = new ArrayList <>();
        List<String> l2 = new ArrayList <>();
        try(Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\anshulkhandelwal\\Downloads\\PackageTesting\\LicensingTest1.5\\BlackDuckScanReport\\UpdatedWar\\ROOT\\WEB-INF\\lib"))){
             l1= paths.filter(Files::isRegularFile).map(s->s.getFileName().toString()).collect(Collectors.toList());
             //l1.parallelStream().forEach(System.out::println);

        }catch(Exception e){
            e.printStackTrace();

        }

        try(Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\anshulkhandelwal\\Downloads\\PackageTesting\\LicensingTest1.5\\BlackDuckScanReport\\ExcludeLib\\FDOLib\\lib"))){

            l2 = paths.filter(Files::isRegularFile).map(s->s.getFileName().toString()).collect(Collectors.toList());

        }catch(Exception e){
            e.printStackTrace();
        }

        Stream s1 = printIncommonJars(l1,l2);
        copyFile(s1,"C:\\Users\\anshulkhandelwal\\Downloads\\PackageTesting\\LicensingTest1.5\\BlackDuckScanReport\\ExcludeLib\\Alllib",
                "C:\\Users\\anshulkhandelwal\\Downloads\\PackageTesting\\LicensingTest1.5\\BlackDuckScanReport\\ExcludeLib");

    }

    public static Stream printIncommonJars(final List<String> l1, final List<String> l2){
        return l1.stream().filter(s->!l2.contains(s));
    }

    public static void copyFile(Stream s1, String from, String to)  {

        new File(to+"/"+"filteredLib").mkdir();

        s1.forEach(s->{
                    Path sourceDirectory = Paths.get(from +"/"+s);
                    Path targetDirectory = Paths.get(to + "/filteredLib/"+s);
                    try {
                        Files.copy(sourceDirectory, targetDirectory);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
