package myTests;

import helpers.FileHelper;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Tests {

    @Test
    void testFileExists() {
        File file = new File(FileHelper.getCurrentFolder(),"test.txt");
        System.out.println(FileHelper.getCurrentFolder());
        Assertions.assertTrue(file.exists());
    }

    @Test
    void testFileContentIsExpected() throws IOException {
        File actual = new File(FileHelper.getCurrentFolder(),"test.txt");
        File expected = new File("src/test/resources","test.txt");
        Assertions.assertTrue(FileUtils.contentEquals(actual,expected));
    }
}
