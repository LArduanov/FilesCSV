package terminal;

import java.io.*;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("./src/terminal/terminal.CSV");
        PrintWriter writer = new PrintWriter(file);
        String text;
        System.out.println("Введите данные:");
        while ((text = scanner.next()) == text) {
            if (text.equals("!q")) {
                System.out.println("Ввод данных завершен!");
                writer.close();
                break;
            } else {
                System.out.println("Для завершения введите: !q");
                writer.println(text);
            }
        }
    }
}


