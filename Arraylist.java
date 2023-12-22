import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public  class Arraylist {
    public static void main(String[] args) {

        ArrayList namesList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        char userChoice;

        do {
            System.out.println("*** MENU ***");
            System.out.println("a. Ingeven van een bijkomende naam");
            System.out.println("b. Afdrukken van de huidige lijst");
            System.out.println("c. Bekijken van element van de lijst");
            System.out.println("q. Verlaat het programma");
            System.out.print("Voer uw keuze in: ");
            userChoice = scanner.next().charAt(0);

            switch (userChoice) {
                case 'a':
                    System.out.print("Voer de naam in: ");
                    namesList.add(scanner.next());
                    break;
                case 'b':
                    System.out.println(namesList.toString());
                    break;
                case 'c':
                    System.out.print("Voer het indexnummer in: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < namesList.size()) {
                        System.out.println(namesList.get(index).toString().toUpperCase());
                    } else {
                        System.out.println("Indexnummer buiten het bereik.");
                    }
                    break;
                case 'q':
                    System.out.println("Het programma wordt afgesloten.");
                    break;
                default:
                    System.out.println("Ongeldige keuze. Probeer het opnieuw.");
            }
        } while (userChoice != 'q');

        scanner.close();
    }
}