import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
         * wrm  BovenloopException moet Exception excepenteren ?
         * 
         */
<<<<<<< HEAD

=======
>>>>>>> shadow
        System.out.println("Enter getal1:");
        int getal1 = scanner.nextInt();

        System.out.println("Enter getal2:");
        int getal2 = scanner.nextInt();
        som som = new som(getal1, getal2);
        try {
<<<<<<< HEAD

            System.out.println(som.berekenSom());

=======
            System.out.println(som.berekenSom());
>>>>>>> shadow
        } catch (BovenloopException e) {
            System.out.println(e.getMessage());
        } catch (OnderloopException e) {
            System.out.println(e.getMessage());
        }
<<<<<<< HEAD
        
        Volmachthouder houder1 = new Volmachthouder("Jelle", "De Vleminck");
        Volmachthouder houder2 = new Volmachthouder("Eddi", "Van Eeckhout");
        UniverseleRekening rekening = new UniverseleRekening();

        rekening.toevoegenVolmacht(houder1);

        try {
            boolean isHouder1Eigenaar = rekening.controleerVolmacht(houder1);

            if (isHouder1Eigenaar) {
                System.out.println(houder1.getVoornaam() + " is eigenaar van de rekening");
            }

=======
        Volmachthouder houder1 = new Volmachthouder("Jelle", "De Vleminck");
        Volmachthouder houder2 = new Volmachthouder("Eddi", "Van Eeckhout");
        UniverseleRekening rekening = new UniverseleRekening();       
        rekening.toevoegenVolmacht(houder1);
        try {
            boolean isHouder1Eigenaar = rekening.controleerVolmacht(houder1);
            if (isHouder1Eigenaar) {
                System.out.println(houder1.getVoornaam() + " is eigenaar van de rekening");
            }
>>>>>>> shadow
            boolean isHouder2Eigenaar = rekening.controleerVolmacht(houder2);
            if (isHouder2Eigenaar) {
                System.out.println(houder2.getVoornaam() + " is eigenaar van de rekening");
            }
<<<<<<< HEAD

        } catch (PersoonHeeftGeenVolmachtException e) {
            System.out.println(e.getMessage());
        }
       

=======
        } catch (PersoonHeeftGeenVolmachtException e) {
            System.out.println(e.getMessage());
        }
>>>>>>> shadow
    }


}
