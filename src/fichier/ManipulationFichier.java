package fichier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        String line = "";
        Path path = Paths.get("recensement.csv");
        Path cible = Paths.get("C:/Users/FUJITSU User/Downloads/recensementcible.csv");
        BufferedReader buff = new BufferedReader(new FileReader("recensement.csv"));
        while ((line = buff.readLine()) != null) {
            String[] values = line.split(";");

            int values1 = Integer.parseInt(values[9].replace(" ", "").trim());


            System.out.println("code departement : " + values[0] + "  |  ville : " + values[6] + "   |  population : " + values[9]);
        }
    }


}