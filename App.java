import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import objects.Car;
import objects.Street;

public class App {
  public static void main(String[] args) {

    File file = new File("./input_files/a.txt");

    int simulationTime;
    int totalIntersections;
    int totalStreets;
    int totalCars;
    int bonusPoints;

    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String string;
      ArrayList<String> fileLines = new ArrayList<String>();
      String[] separated;

      while ((string = br.readLine()) != null) {
        separated = string.split(" ");
        System.out.println(string);
        fileLines.add(string);
      }

      // FIRST LINE
      separated = fileLines.get(0).split(" ");

      simulationTime = Integer.parseInt(separated[0]);
      totalIntersections = Integer.parseInt(separated[1]);
      totalStreets = Integer.parseInt(separated[2]);
      totalCars = Integer.parseInt(separated[3]);
      bonusPoints = Integer.parseInt(separated[4]);

      // Street lines

      ArrayList<Street> streets = new ArrayList<Street>();

      for (int i = 0; i < totalStreets; i++) {
        System.out.println("Reading street: " + fileLines.get(i + 1));
        separated = fileLines.get(i + 1).split(" ");
        streets.add(new Street(Integer.parseInt(separated[0]), Integer.parseInt(separated[1]), separated[2],
            Integer.parseInt(separated[3])));
      }

      // Car lines
      ArrayList<Car> cars = new ArrayList<Car>();

      String[] names;

      for (int i = 0; i < totalCars; i++) {
        System.out.println("Reading Car: " + fileLines.get(i + 1 + totalStreets));
        separated = fileLines.get(i + 1 + totalStreets).split(" ");
        names = Arrays.copyOfRange(separated, 1, separated.length);

        cars.add(new Car(Integer.parseInt(separated[0]), names));

      }



      for (int i = 0; i < simulationTime; i++) {

      }

    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}