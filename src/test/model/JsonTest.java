// Reference: https://github.students.cs.ubc.ca/CPSC210/JsonSerializationDemo

package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonTest {
    protected void checkRotar(int setting, int initialPostion, Rotar rotar) {
        assertEquals(setting, rotar.getSettingNum());
        assertEquals(initialPostion, rotar.getInitialPosition());
    }
}
