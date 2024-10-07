package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Readable;
import java.io.FileReader;
import java.io.IOException;

/**
 * A class that reads text files. This implementation reads the file byte per byte. It manages the
 * file reader properly with a try-catch-finally block.
 */

public class TextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (FileReader reader = new FileReader(filename)) {
      int charData;
      while ((charData = reader.read()) != -1) {
        // Process character data
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
