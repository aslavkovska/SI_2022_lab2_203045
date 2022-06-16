import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 silab2 = new SILab2();

    @Test
    void standardAssertions() {
        assert equals( "[#, 3, #, 2, #, 2, 0, 1, 0]" , silab2.function("[#, 0, #, 0, #, 0, 0, 0, 0]"));
    }
}