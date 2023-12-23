import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void testPairWithStringAndPerson() {

        //Given
        Person person = new Person("Dileep", "Reddy");
        Pair<String, Person> pair1 = Pair.of("e146508", person);

        Customer customer = new Customer("John", "Wick");
        Pair<Integer, Customer> pair2 = Pair.of(146508, customer);


        //Then
        assertEquals("e146508", pair1.first());
        assertEquals(person, pair1.second());

        assertEquals(146508, pair2.first());
        assertEquals(customer, pair2.second());

    }


    @Test
    void testPairEquality(){

        //Given
        Person person1 = new Person("Dileep", "Reddy");
        Pair<String, Person> pair1 = Pair.of("e146508", person1);

        Person person2 = new Person("Dileep", "Reddy");
        Pair<String, Person> pair2 = Pair.of("e146508", person2);

        Customer customer = new Customer("John", "Wick");
        Pair<Integer, Customer> pair3 = Pair.of(146508, customer);


        //Then
        assertEquals(pair1, pair2);
        assertNotEquals(pair1, pair3);

    }

}