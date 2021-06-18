
public class PersonBuilder implements Builder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private Person newPerson;


    @Override
    public Builder setFirstName(String name) {
        this.firstName = name;
        return this;
    }

    @Override
    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст человека не может быть < 0 !!!");
        this.age = age;
        return this;
    }

    @Override
    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if(firstName==null || lastName==null){
            throw new IllegalArgumentException("Невозможно создать экземпляр - отсутствует имя и/или фамилия.");
        }
        if (age == null) {
            newPerson = new Person(firstName, lastName);
        } else {
            newPerson = new Person(firstName, lastName, age);
        }
        if (address != null) newPerson.setAddress(address);
        return newPerson;
    }
}