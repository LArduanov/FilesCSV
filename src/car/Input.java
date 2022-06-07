package car;

import java.io.*;

public class Input {

    public static void input(String way) throws IOException, ClassNotFoundException {

        File file = new File(way);

        ObjectInputStream carInput = new ObjectInputStream(new FileInputStream(file));
        Car car = (Car) carInput.readObject();
        System.out.println(car);
        carInput.close();

    }
}

