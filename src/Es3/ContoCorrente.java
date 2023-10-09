package Es3;

import exceptions.BancaException;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) {
        try {
            if (saldo < x) {
                nMovimenti++;
                System.out.println(nMovimenti);
                throw new BancaException("il conto è in rosso");
            } else if (nMovimenti < maxMovimenti) {
                saldo = saldo - x;
                nMovimenti++;
                System.out.println(nMovimenti);
            } else {
                saldo = saldo - x - 0.50;
                nMovimenti++;
                System.out.println(nMovimenti);
            }
        }
        catch (BancaException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println("errore generic");
        }
    }

    double restituisciSaldo() {
        return saldo;
    }
}
