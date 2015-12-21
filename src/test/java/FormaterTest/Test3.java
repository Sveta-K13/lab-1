package FormaterTest;

import formatation.formater.Formater;
import formatation.reader.FileReader;
import formatation.writer.FileWriter;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 * Created by Светлана on 20.12.2015.
 */

public class Test3 {

    private String fileName = "src/test/resources/input3.txt";
    private String fileNameOut = "src/test/resources/output3.txt";
    private String fileNameOutR = "src/test/resources/output3_right.txt";

    @Before
    public void setUp() throws IOException {    // complete input.txt
        try {

            String content = "{  }";
            String contentFormatted = "{}";

            File file = new File(fileName);

            // if file doesnt exists, then create it and complete
            if (!file.exists()) {
                file.createNewFile();
                java.io.FileWriter fw = new java.io.FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(content);
                bw.close();
            }

            File fileOut = new File(fileNameOutR);
            // if fileOut doesnt exists, then create it and complete
            if (!fileOut.exists()) {
                fileOut.createNewFile();
                java.io.FileWriter fwOut = new java.io.FileWriter(fileOut.getAbsoluteFile());
                BufferedWriter bwOut = new BufferedWriter(fwOut);
                bwOut.write(contentFormatted);
                bwOut.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @After
    public void tearDown() throws IOException {
//        reader.close();
    }

    @Test
    public void evaluatesExpression() throws IOException {

        Formater formater = new Formater();
        FileReader reader = new FileReader(fileName);
        FileWriter writer = new FileWriter(fileNameOut);
        formater.formate(reader, writer);

        Assert.assertEquals(FileUtils.readLines(new File(fileNameOutR)), FileUtils.readLines(new File(fileNameOut)));
    }

}
