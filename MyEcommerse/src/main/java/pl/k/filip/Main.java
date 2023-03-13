package pl.k.filip;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Filip","Michał","Kasia","Maria");

        Greeter greeter = new Greeter();
        greeter.greet("Filip");

        //Greet all ladies
        List<String> ladies = new ArrayList<>();
        for (String name : names){
            if(name.endsWith("a")){
                ladies.add(name);
            }
        }

        for (String ladyName : ladies){
            greeter.greet(ladyName);
        }

        names.stream()
                .filter(name -> name.endsWith("a"))
                .filter(name -> name.startsWith("K"))
                .map(String::toUpperCase)
                .forEach(greeter::greet);


    }
}