import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Linklist {
    public static void main(String[] args) {
        

        LinkedList<Integer> lijst1  = new LinkedList<>();
        //voeg volgende getallen toe: 1,2,3,4,5.
        lijst1.add(1);
        lijst1.add(2);
        lijst1.add(3);
        lijst1.add(4);
        lijst1.add(5);
        System.out.println(lijst1);


        ArrayList<Integer> lijst2 = new ArrayList<>();
         //voeg volgende getallen toe: 1,2,9,8,7
         lijst2.add(1);
         lijst2.add(2);
         lijst2.add(9);
         lijst2.add(8);
         lijst2.add(7);
         System.out.println(lijst2);

         TreeSet<Integer> lijst3 = new TreeSet<>();
         //voeg volgende getallen toe: 1,2,6,7,9.
         lijst3.add(1);
         lijst3.add(2);
         lijst3.add(6);
         lijst3.add(7);
         lijst3.add(9);
         lijst3.addAll(lijst2);
         lijst3.addAll(lijst1);
         System.out.println(lijst3);

         lijst1.removeAll(lijst2);
        /// Voer de removeAll-operatie uit om 
        //elementen uit lijst2 te verwijderen die aanwezig zijn in lijst1
         System.out.println("list 1"+lijst1);

        // Print de LinkedList na update
        System.out.println("LinkedList na update: " + lijst1);

        // Print de verwijderde elementen
        System.out.println("Verwijderde elementen: " + lijst2);
        
        lijst2.retainAll(lijst1);

        System.out.println("Aantal overgebleven elementen in de ArrayList: " + lijst2.size());

        // Print de ArrayList naar de console
        System.out.println("ArrayList na update: " + lijst2);




    }
    
}
