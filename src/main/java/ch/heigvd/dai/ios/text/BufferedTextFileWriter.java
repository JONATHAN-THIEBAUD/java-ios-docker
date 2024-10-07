package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Writable;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * A class that writes text files. This implementation writes the file using a buffered writer
 * around a file writer. It manages the writer and the buffered writer properly with a
 * try-with-resources block.
 */

public class BufferedTextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
      char[] data = new char[sizeInBytes];
      Random random = new Random();
      for (int i = 0; i < sizeInBytes; i++) {
        data[i] = (char) ('A' + random.nextInt(26)); // Random uppercase letter
      }
      bw.write(data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

