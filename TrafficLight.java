public class TrafficLight {
  private boolean _isGreen;

  public void changeLight() {
    this._isGreen = !this._isGreen;
  }

  public boolean getLight() {
    return this._isGreen;
  };
}