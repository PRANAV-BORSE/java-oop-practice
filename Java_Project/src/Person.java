public class Person {

    private String name;
    private int age;

    // Static variables (shared by all objects)
    public static int personCount;
    private static int person_count;

    // Static method
    public static int getPerson_Count() {
        return person_count;
    }

    // Default Constructor
    public Person() {
        this.name = "Micky";
        this.age = 33;

        personCount++;
        person_count++;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        personCount++;
        person_count++;
    }

    // Parameterized Constructor (different order)
    public Person(int age, String name) {
        this.age = age;
        this.name = name;

        personCount++;
        person_count++;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // Setter for Age
    public void setAge(int age) {
        this.age = age;
    }
}