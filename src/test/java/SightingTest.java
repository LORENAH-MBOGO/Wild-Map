import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SightingTest {

    @Test
    public void sighting_instantiatesCorrectly_true() {
        Animal testAnimal = new Animal("Leopard");
        testAnimal.save();
        Sighting testSighting = new Sighting(testAnimal.getId(), "zone A", "Ranger Arunda");
        assertEquals(true, testSighting instanceof Sighting);
    }
}

