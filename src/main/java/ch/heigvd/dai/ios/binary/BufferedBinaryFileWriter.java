package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */

public class BufferedBinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filename))) {
      byte[] data = new byte[sizeInBytes];
      new Random().nextBytes(data);
      bos.write(data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

