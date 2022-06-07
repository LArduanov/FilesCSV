package car;

import java.io.IOException;

public class Run {
    public static void main(String[] args) {
//Указываем путь
        String way = "./src/car/car.txt";

//Запись
        try {
            Output.output(way);
        } catch (IOException e) {
            e.printStackTrace();
        }

 //Вывод
        try {
            Input.input(way);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
