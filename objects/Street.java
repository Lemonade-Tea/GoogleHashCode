package objects;

public class Street {
  private int intersectionsAtStart;
  private int intersectionsAtEnd;
  private String name;
  private int duration;

  public Street(int B, int E, String name, int L){
    this.intersectionsAtStart = B;
    this.intersectionsAtEnd = E;
    this.name = name;
    this.duration = L;
  }

  public int getStartIntersections(){
    return this.intersectionsAtStart;
  }

  public int getEndIntersections(){
    return this.intersectionsAtEnd;
  }

  public String getName(){
    return this.name;
  }

  public int getDuration(){
    return this.duration;
  }

}
