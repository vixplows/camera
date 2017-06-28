import java.util.ArrayList;

public class Photographer {
  private String name;
  private ArrayList<Printable> cameraCollection;

  public Photographer(String name){
    this.name = name;
    this.cameraCollection = new ArrayList<Printable>();
  }

  public String getName() {
    return this.name;
  }

  public int cameraCount() {
    return this.cameraCollection.size();
  }

  public void addCamera(Printable camera) {
    this.cameraCollection.add(camera);
  }

  public void removeCamera() {
    if (cameraCount() > 0){
      this.cameraCollection.remove(0);
    }
  }

  public void allCameraDetails() {
    String allDetails = "";
    for (Printable camera : this.cameraCollection) {
      allDetails += camera.printDetails();
    }
      return allDetails;
// printDetails method to get the camera details
  }

}