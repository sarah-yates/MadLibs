import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Give me some information and I'll give you a funny remix!");
        System.out.print("Give me a noun: ");
        String firstNoun = readString();
        System.out.print("Now give me an adjective: ");
        String firstAdjective = readString();
        System.out.print("Now give me another noun: ");
        String secondNoun = readString();
        System.out.print("Now give me another adjective: ");
        String secondAdjective = readString();
        System.out.print("Last one! Give me a verb: ");
        String verb = readString();
        System.out.println("Okay, get ready!");
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println();

    }
    private static String readString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
