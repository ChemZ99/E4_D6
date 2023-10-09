package Exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Km = 1;
        int Litres = 1;
        int Result = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("inserisci i Km percorsi");
            Km = Integer.parseInt(input.nextLine());
            if (Km < 1) throw new Custom_Exception();
            System.out.println("inserisci i litri consumati");
            Litres = Integer.parseInt(input.nextLine());
            if (Litres < 1) throw new Custom_Exception();
            Result = Km / Litres;
            System.out.println("i Km/L sono" + Result);
        }
        catch (Custom_Exception ex) {
            System.err.println("uno dei valori inseriti e' 0");
        }
        catch (ArithmeticException ex) {
            System.err.println("divisione per 0");
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
