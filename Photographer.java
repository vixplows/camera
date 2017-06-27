import java.util.ArrayList;

public class Photographer {
  private ArrayList<Camera> cameraCollection;

  public Photographer(){
    this.cameraCollection = new ArrayList<Camera>();
  }


  public int cameraCount() {
    return this.cameraCollection.size();
  }

}