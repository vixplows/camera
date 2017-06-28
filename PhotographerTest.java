import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer("Alice");
    camera = new Camera();
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

  @Test
  public void hasName() {
    assertEquals("Alice", photographer.getName());
  }

  @Test
  public void collectionStartsEmpty() {
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(camera);
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canGetAllCameraDetails() {
    // rewrite the test - have a think about what need to do!!??
    // photographer.addCamera(digitalCamera);
    // photographer.addCamerea(analogCamera);
    
    cameraDetails = "Nikon 1 s1, SLR, WIFI Connectivity, Two Lens Kit, Red , Polaroid, Pic-300, Instant Film, Black";
    // how will it return the two strings - what format?
    assertEquals(cameraDetails, photographer.allCameraDetails());
  }


}