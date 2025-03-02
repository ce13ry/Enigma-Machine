// Reference: https://github.students.cs.ubc.ca/CPSC210/JsonSerializationDemo

package model;
import persistence.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JsonReaderTest extends JsonTest {

    @Test
    void testReaderNonExistentFile() {
        JsonReader reader = new JsonReader("./data/noSuchFile.json");
        try {
            Enigma enigma = reader.read();
            fail("IOException expected");
        } catch (IOException e) {
            // pass
        }
    }

    @Test
    void testReaderEmptyEnigma() {
        JsonReader reader = new JsonReader("./data/testReaderEmptyEnigma.json");
        try {
            Enigma enigma = reader.read();
            assertEquals(0, enigma.getRotars().size());
        } catch (IOException e) {
            fail("Couldn't read from file");
        }
    }

    @Test
    void testReaderGeneralEnigma() {
        JsonReader reader = new JsonReader("./data/testReaderGeneralEnigma.json");
        try {
            Enigma enigma = reader.read();
            List<Rotar> rotars = enigma.getRotars();
            assertEquals(2, rotars.size());
            checkRotar(3, 14, rotars.get(0));
            checkRotar(2, 71, rotars.get(1));
        } catch (IOException e) {
            fail("Couldn't read from file");
        }
    }
}
