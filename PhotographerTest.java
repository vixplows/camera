import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer("Alice");
    camera = new Camera();
  }

  @Test
  public void hasName() {
    assertEquals("Alice", photographer.getName());
  }

  @Test
  public void collectionStartsEmpty() {
    assertEquals(0, photographer.cameraCount());
  }

}