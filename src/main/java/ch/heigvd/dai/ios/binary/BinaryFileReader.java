package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (FileInputStream fis = new FileInputStream(filename)) {
      int byteData;
      while ((byteData = fis.read()) != -1) {
        // Process byte data
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
