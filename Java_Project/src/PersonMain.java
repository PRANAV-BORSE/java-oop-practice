public class PersonMain {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Tom", 25);
        Person p3 = new Person(12, "Jerry");

        System.out.println("Current Person Count : " + Person.personCount);

        new Person();
        new Person("A", 10);

        System.out.println("Current Person Count : " + Person.personCount);

        for (int a = 1; a <= 10; a++) {
            new Person();
        }

        System.out.println("Current Person Count : " + Person.personCount);

        System.out.println("Final count of persons : "
                + Person.getPerson_Count());

        System.out.println();

        System.out.println("P1 Name = " + p1.getName());
        System.out.println("P2 Name = " + p2.getName());
        System.out.println("P3 Name = " + p3.getName());
    }
}