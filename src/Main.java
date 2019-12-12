import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Give me some information and I'll give you a funny remix!");
        System.out.println("Give me a noun:");
        String firstNoun = readString();
        System.out.println("Now give me an adjective:");
        String firstAdjective = readString();
        System.out.println("Now give me a plural noun:");
    }
    private static String readString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
