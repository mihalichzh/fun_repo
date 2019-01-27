package myTests;

import helpers.FileHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class Tests {

    @Test
    void testFileExists() {
        File file = new File(FileHelper.getCurrentFolder(),"test.txt");
        System.out.println(FileHelper.getCurrentFolder());
        Assertions.assertTrue(file.exists());
    }
}
