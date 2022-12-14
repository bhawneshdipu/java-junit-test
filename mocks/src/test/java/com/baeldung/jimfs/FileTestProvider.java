package com.dipu.jimfs;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface FileTestProvider {
    String FILE_CONTENT = "I'm the file content.";
    String RESOURCE_FILE_NAME = "fileRepositoryRead.txt";

    default Path getResourceFilePath() {
        final String resourceFilePath = getClass()
          .getResource("/" + RESOURCE_FILE_NAME)
          .getPath();
        return Paths.get(resourceFilePath);
    }
}
