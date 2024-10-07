package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Writable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * A class that writes text files. This implementation write the file byte per byte. It manages the
 * file writer properly with a try-catch-finally block.
 */

public class TextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (FileWriter writer = new FileWriter(filename)) {
      char[] data = new char[sizeInBytes];
      Random random = new Random();
      for (int i = 0; i < sizeInBytes; i++) {
        data[i] = (char) ('A' + random.nextInt(26)); // Random uppercase letter
      }
      writer.write(data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

