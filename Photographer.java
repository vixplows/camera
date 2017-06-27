import java.util.ArrayList;

public class Photographer {
  private String name;
  private ArrayList<Camera> cameraCollection;

  public Photographer(String name){
    this.name = name;
    this.cameraCollection = new ArrayList<Camera>();
  }

  public String getName() {
    return this.name;
  }

  public int cameraCount() {
    return this.cameraCollection.size();
  }

  public void addCamera(Camera camera) {
    this.cameraCollection.add(camera);
  }

  public void removeCamera() {
    if (cameraCount() > 0){
      this.cameraCollection.remove(0);
    }
  }

}