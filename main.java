import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        String input = args[0];
        String output = args[1];
        FileInputStream fileInputStream = new FileInputStream(input);
        Scanner scanner = new Scanner(fileInputStream);
        int[] a = new int[100];
        int i = 0;
        while(scanner.hasNextInt()) {
            a[i] = scanner.nextInt();
            i++;
        }


    }
}
