import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinkerTailorTest {

    @Test
    void testWinner(){
        TinkerTailor tinkerTailor = new TinkerTailor(5, 3);
        assertEquals(4, tinkerTailor.getWinner());
    }

    @Test
    void testWinner2(){
        TinkerTailor tinkerTailor = new TinkerTailor(10, 1);
        assertEquals(10, tinkerTailor.getWinner());
    }

    @Test
    void testWinner3(){
        TinkerTailor tinkerTailor = new TinkerTailor(5, 2);
        assertEquals(3, tinkerTailor.getWinner());
    }

}