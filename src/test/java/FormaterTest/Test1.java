package FormaterTest;

import static org.junit.Assert.assertEquals;
import formatation.formater.Formater;
import formatation.reader.FileReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

    private String fileName = "src/test/resources/input1.txt";

    @Before
    public void setUp() throws IOException {    // complete input.txt
        try {

            String content = "{  }";

            File file = new File(fileName);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done input");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @After
    public void tearDown() throws IOException {
//        reader.close();
    }

    @Test
    public void evaluatesExpression() throws IOException{

        Formater formater = new Formater();
        FileReader reader = new FileReader(fileName);
        String result = formater.formate(reader);
        assertEquals("{}", result);
    }
}
