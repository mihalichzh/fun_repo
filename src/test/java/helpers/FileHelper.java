package helpers;

import java.io.File;
import java.nio.file.Paths;

public class FileHelper {

    public static File getCurrentFolder() {
        return new File(Paths.get(".").toAbsolutePath().normalize().toString());
    }
}
