import java.util.Objects;

public class Person {
    protected final String firstName;
    protected final String lastName;
    protected int age;
    protected String address;
    protected boolean isAge = false;
    protected boolean isAddress = false;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        isAge = true;
    }

    public boolean hasAge() {
        return isAge;
    }

    public boolean hasAddress() {
        return isAddress;
    }

    public void setAddress(String address) {
        this.address = address;
        isAddress = true;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder pBuilder;
        if(hasAddress()){
            pBuilder = (PersonBuilder) new PersonBuilder()
                    .setLastName(this.lastName)
                    .setAddress(this.address)
                    .setAge(0);
        } else {
            pBuilder = (PersonBuilder) new PersonBuilder()
                    .setLastName(this.lastName)
                    .setAge(0);
        }
        return pBuilder;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, address);
    }

    @Override
    public String toString() {
        return "Person" +
                "\nfirstName: " + firstName +
                ",\nsecondName: " + lastName +
                ",\nage: " + age +
                ",\ncity: " + address ;
    }
}
