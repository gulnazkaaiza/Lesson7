import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Display.startMessage();
        Choice yourChoice = new Choice();
        Scanner scan = new Scanner(System.in);

        try {
            while (true) {
                int in = scan.nextInt();
                yourChoice.Choice(in);

            }
        } catch (Exception ex) {

        }
    }
}

