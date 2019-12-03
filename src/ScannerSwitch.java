import java.util.Scanner;

public class ScannerSwitch {
    public static void dayScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day is today?");
        String day = scanner.nextLine();
        System.out.println("You entered " + day + ". Confirm? (yes/no)");
        String res = scanner.nextLine();

        switch (res) {
            case "yes":
                System.out.println("Perfect. Today is " + day);
                break;
            case "no":
                dayScanner();
                break;
            default:
                System.out.println("Invalid answer. Please try again");
        }
        return;
    };

    public static void main(String[] args){
        dayScanner();
    }
}
