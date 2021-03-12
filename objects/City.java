package objects;

import java.util.ArrayList;

public class City {

  public ArrayList<Car> cars;
  public ArrayList<Street> streets;

  public Street getStreetByName(String name) {
    return streets.stream().filter(street -> street.getName() == name).findFirst().get();
  }

}
