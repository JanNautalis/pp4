package homework1;
import java.util.LinkedList;
import java.util.Queue;


public class Kolejka {

    public static void main(String[] args) {
        Queue<String> kolejka = new LinkedList<>();

        kolejka.add("element 1");
        kolejka.add("element 2");
        kolejka.add("element 3");

        while (!kolejka.isEmpty()) {
            System.out.println(kolejka.poll());
        }
    }


}
