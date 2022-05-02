import java.io.File;
// import java.io.IOException;
// import java.awt.TextArea;
import java.awt.event.KeyEvent;
// import java.awt.BorderLayout;
// import java.awt.Component;
// import java.awt.Frame;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.Desktop;
import java.util.concurrent.TimeUnit;
import java.net.*;

public class SimulateMouseMoveAndKeyPress {

  public static void main(String[] args) throws Exception {

    try {
      if (Desktop.isDesktopSupported()) {
        String str = "https://www.airbnb.com/s/Ka%C5%9F-Antalya/homes?tab_id=home_tab&refinement_paths%5B%5D=%2Fhomes&flexible_trip_dates%5B%5D=june&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&query=Ka%C5%9F%2FAntalya&place_id=ChIJw0664n7IwRQRxZg3JObPezc&source=structured_search_input_header&search_type=autocomplete_click";
        URI exampleuri = new URI(str);
        Desktop.getDesktop().browse(exampleuri);
        TimeUnit.SECONDS.sleep(10);
      }

      // These coordinates are screen coordinates

      int xCoord = 320;

      int yCoord = 550;

      // Move the cursor

      Robot robot = new Robot();

      robot.mouseWheel(500);

      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_I);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      robot.keyRelease(KeyEvent.VK_I);
      TimeUnit.SECONDS.sleep(2);
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_F);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_F);
      TimeUnit.SECONDS.sleep(2);
      robot.keyPress(KeyEvent.VK_E);
      robot.keyRelease(KeyEvent.VK_E);
      robot.keyPress(KeyEvent.VK_X);
      robot.keyRelease(KeyEvent.VK_X);
      robot.keyPress(KeyEvent.VK_P);
      robot.keyRelease(KeyEvent.VK_P);

      // Simulate a mouse click
      TimeUnit.SECONDS.sleep(1);
      robot.mouseMove(xCoord, yCoord);
      TimeUnit.SECONDS.sleep(1);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      // Simulate a mouse click
      TimeUnit.SECONDS.sleep(10);
      robot.mouseMove(1000, 300);
      TimeUnit.SECONDS.sleep(2);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      // Simulate a mouse click
      TimeUnit.SECONDS.sleep(2);
      robot.mouseMove(1810, 280);
      TimeUnit.SECONDS.sleep(2);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      // Simulate a mouse click
      TimeUnit.SECONDS.sleep(2);
      robot.mouseMove(1810, 380);
      TimeUnit.SECONDS.sleep(1);
      robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
      robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
      // Simulate a mouse click
      TimeUnit.SECONDS.sleep(1);
      robot.mouseMove(1835, 395);
      TimeUnit.SECONDS.sleep(1);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.SECONDS.sleep(4);
      // copy
      Desktop.getDesktop().open(new File("/home/bk/Desktop/java/copy.json"));
      TimeUnit.SECONDS.sleep(5);
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_V);

    } catch (AWTException e) {

      System.out.println("Low level input control is not allowed " + e.getMessage());
    }

  }

}