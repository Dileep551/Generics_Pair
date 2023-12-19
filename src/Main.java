// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        var employee1 = Pair.of("e146508", new Person("Dileep", "Reddy"));

        System.out.println(employee1.first());
        System.out.println(employee1.second());

        var employee2 = new Pair<String, Person>("e14234", new Person("Tim", "Mark"));

        System.out.println(employee2.first());
        System.out.println(employee2.second());




    }
}