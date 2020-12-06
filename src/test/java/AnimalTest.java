import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {

    public String animal_name;


    @Test
    public void setupNewAnimal_Name_instantiatesCorrectly_true() {
        animal_id newAnimal_ID = Animal.addNewAnimal_ID();
        assertTrue(newAnimal_ID instanceof animal_id);
    }
    @Test
        public void addAnimal_getName_String () {
            Animal_ID newAnimal_id = Animal.addNewAnimal_ID();
            assertEquals("Lion", newAnimal.getAnimal_name());
        }
    }
