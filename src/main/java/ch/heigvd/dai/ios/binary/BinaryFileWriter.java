package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class BinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (FileOutputStream fos = new FileOutputStream(filename)) {
      byte[] data = new byte[sizeInBytes];
      new Random().nextBytes(data);
      fos.write(data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
