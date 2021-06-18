public class Person {
    private final String firstName;
    private final String lastName;
    private int age;
    private String address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
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

    public int happyBirthday(int age){
        return age ++;
    }

    public boolean hasAge(){
        int age;
        age = getAge();
        return age != 0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddress(){
        String address;
        address = getAddress();
        return address != null;
    }

    public Builder newChildBuilder() {
        PersonBuilder personBuilder;
        if (hasAddress()) {
            personBuilder = (PersonBuilder) new PersonBuilder()
                    .setAddress(this.address)
                    .setLastName(this.lastName)
                    .setAge(0);
        } else {
            personBuilder = (PersonBuilder) new PersonBuilder()
                    .setLastName(this.lastName)
                    .setAge(0);
        }
        return  personBuilder;
    }

    @Override
    public String toString() {
        return " имя: " + firstName + '\'' +
                ", фамилия: " + lastName + '\'' +
                ", возраст: " + age + '\'' +
                ", город: " + address + '\'';
    }


}
