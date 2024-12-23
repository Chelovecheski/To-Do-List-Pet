package org.chelobyte.todolist.engine;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    protected static String getString() {
        return scanner.nextLine();
    }

    protected static void close() {
        scanner.close();
    }
}
