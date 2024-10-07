package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename))) {
      int byteData;
      while ((byteData = bis.read()) != -1) {
        // Process byte data
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
