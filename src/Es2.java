import exceptions.MoreThanZeroException;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Inserisci il numero dei km eseguiti");
            int primo = Integer.parseInt(input.nextLine());
            System.out.println("Inserisci il numero dei litri consumati");
            int secondo = Integer.parseInt(input.nextLine());
            if (secondo == 0) {
                throw new MoreThanZeroException(secondo);
            }
            double consumo = (double) primo / secondo;
            System.out.println("Hai percorso km: " + primo + "  consumando: " + secondo + " MEDIA:  " + consumo + "km/l");
        } catch (MoreThanZeroException x) {
            System.err.println(x.getMessage());
        } catch (Exception ex) {
            System.err.println("errore generico");
        }
    }
}
