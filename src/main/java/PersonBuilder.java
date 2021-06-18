
public class PersonBuilder implements Builder {
    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected String address;
    private Person newPerson;


    @Override
    public Builder setName(String name) {
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
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
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
            throw new IllegalArgumentException("Невозможно создать экземпляр. Отсутствует имя и/или фамилия.");
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