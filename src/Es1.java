import java.util.Arrays;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            int casuale = (int) (Math.random() * 10);
            myArray[i] = casuale;
        }
        System.out.println(Arrays.toString(myArray));
        while (true) {
            try {
            Scanner input = new Scanner(System.in);
                System.out.println("Inserisci un numero non presente da 1 a 10 o SCRIVI 0 PER USCIRE");
                int primo = Integer.parseInt(input.nextLine());
                if (primo == 0) {
                    System.out.println("Sei uscito");
                    break;
                }
                System.out.println("inserisci la posizione da 0 a 4 in cui vuoi inserire il numero");
                int secondo = Integer.parseInt(input.nextLine());

                if (primo >= 1 && primo <= 10) {
                    myArray[secondo] = primo;
                    System.out.println(Arrays.toString(myArray));
                } else {
                    System.err.println("Input non valido");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Input non valido. Inserisci un numero.");
            } catch (Exception ex) {
                System.err.println("Problema generico");
            }
        } }
    }

