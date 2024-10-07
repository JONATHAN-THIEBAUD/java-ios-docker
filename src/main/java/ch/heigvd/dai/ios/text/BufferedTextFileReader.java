package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Readable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * A class that reads text files. This implementation reads the file using a buffered reader around
 * a file reader. It manages the reader and the buffered reader properly with a try-with-resources
 * block.
 */


public class BufferedTextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line;
      while ((line = br.readLine()) != null) {
        // Process each line of the text file
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
