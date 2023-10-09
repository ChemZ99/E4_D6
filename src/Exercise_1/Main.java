package Exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nArr = {2,3,4,5,6,};
        int n1 = 1;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< nArr.length; i++) {
            System.out.println(nArr[i]);
        }
        try {
            while (n1 != 0) {
                System.out.println("inserisci il numero da aggiungere in posizione 1");
                n1 = Integer.parseInt(input.nextLine());
                if (n1 <0 || n1 > 10) throw new Custom_Exception();
                nArr[0] = n1;
                for (int i = 0; i< nArr.length; i++) {
                    System.out.println(nArr[i]);
                }
            }
        }
        catch (Custom_Exception ex) {
            System.err.println("numero fuori dal range predefinito");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("index dell array errato");
        }
        catch (Exception ex) {
            System.err.println("problema generico");
        }
        finally {
            input.close();
        }
    }
}