import java.awt.Desktop;
import java.io.IOException;
import java.net.*;


public class Simple {
    public static void main(String[] args) throws Exception{
    try {
      if (Desktop.isDesktopSupported()) {
        String str = "https://www.google.com";
        URI exampleuri = new URI(str);
       Desktop.getDesktop().browse(exampleuri);
      }
     } catch (IOException ioe) {
      ioe.printStackTrace();
    }
   }
}