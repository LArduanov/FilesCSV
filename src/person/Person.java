package person;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Person {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        File file = new File("./src/person/person.csv");
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(file);
        String[] header = new String[]{"Имя", "Фамилия", "Возраст", "Номер телефона"};

        //Создаем таблицу в csv файле
        for (int i = 0; i < header.length; i++) {
            writer.print(header[i] + ";");
        }
        String answer;
        String message = "Для ввода новых данных нажмите Enter." + '\n' + "Для отмены введите: " +
                "стоп";
        System.out.println(message);
        while ((answer = scanner.nextLine()) == answer) {
            if (answer.equals("стоп")) {
                System.out.println("Ввод данных завершен!");
                writer.close();
                arrayOutput ("./src/person/person.csv");
                return;
            } else {
                writer.print('\n');
                for (int i = 0; i < header.length; i++) {
                    System.out.println("Введите " + header[i]);
                    writer.print(scanner.nextLine() + ";");
                }
                System.out.println(message);
                writer.print(answer);
            }
        }
    }
    public static void arrayOutput (String file) throws IOException {

        //Считаем количество слов в строке таблицы
        BufferedReader readerWords = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        int words = 0;
        String[] arrays = readerWords.readLine().split(";");
        words = words + arrays.length;
        System.out.println("Количество слов в строке: " + words);
        readerWords.close();

        //Считаем количество строк в таблице
        BufferedReader readerLines = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        int lines = 0;
        while (readerLines.readLine() != null) {
            lines++;
        }
        readerLines.close();
        System.out.println("Количество строк в таблице: " + lines);

        //Записываем элементы в двумерный массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String[][] massive = new String[lines][words];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = reader.readLine().split(";");
        }
        System.out.println(Arrays.deepToString(massive));
        reader.close();
    }
}
