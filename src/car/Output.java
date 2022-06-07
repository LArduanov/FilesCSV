package car;

import java.io.*;

public class Output {

    public static void output(String way) throws IOException {

        File file = new File(way);

        ObjectOutputStream carOutput = new ObjectOutputStream(new FileOutputStream(file));
        carOutput.writeObject(new  Car("Tesla", "model X", 2021, "red", 1020));
        carOutput.close();
    }
}

