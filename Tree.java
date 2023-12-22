import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {

      ArrayDeque<String> taken = new ArrayDeque<>();

        // Voeg taken toe
        taken.add("taak 3");
        taken.add("taak 5");
        taken.add("taak 1");
        taken.add("taak 2");
        taken.add("taak 3");

        // Print de taken naar de console
        System.out.println("Taken: " + taken);

        // Verwerk de eerste taak
        String eersteTaak = taken.poll(); // poll() haalt en verwijdert het eerste element
        System.out.println("Taak verwerken: " + eersteTaak);

        // Print de overgebleven taken naar de console
        System.out.println("Overgebleven taken: " + taken);
    }
}