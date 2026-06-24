package util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                return value;
            } else {
                System.out.println("Harus int");
            }
        }
    }

} 