import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void testPairWithStringAndPerson() {

        //Given
        Person person = new Person("Dileep", "Reddy");
        Pair<String, Person> pair = Pair.of("e146508", person);


        //Then
        assertEquals("e146508", pair.first());
        assertEquals(person, pair.second());

    }


    @Test
    void testPersonRecord() {

        //Given
        Person person = new Person("Dileep", "Reddy");

        //Then
        assertEquals("Dileep", person.givenName());
        assertEquals("Reddy", person.surname());

    }

    @Test
    void testPairEquality(){

        //Given
        Person person1 = new Person("Dileep", "Reddy");
        Pair<String, Person> pair1 = Pair.of("e146508", person1);

        Person person2 = new Person("Dileep", "Reddy");
        Pair<String, Person> pair2 = Pair.of("e146508", person2);


        //Then
        assertEquals(pair1, pair2);

    }

}