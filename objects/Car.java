package objects;

public class Car {
  private int _score;

  public int getScore() {
    return this._score;
  }

  public void addPoints(int points) {
    this._score += points;
  }

  private int streets;
  private String[] names;

  public Car(int totalStreets, String[] names) {
    this.streets = totalStreets;
    this.names = names;
  };

  public String[] getStreetNames() {
    return this.names;
  }

  public int getAmountOfStreets() {
    return this.streets;
  }
}
