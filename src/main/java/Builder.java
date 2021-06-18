public interface Builder {
    Builder setName(String name);
    Builder setLastName(String lastName);
    Builder setAge(int age);
    Builder setAddress(String address);
    Person build();
}
