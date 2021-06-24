public class Person {
    private final String name;
    private final String surname;
    private final String phone;
    private final String email;
    private final String address;
    private final String age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public Person(String name, String surname, String phone, String email, String address, String age) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "" + name + '\'' +
                " " + surname + '\'' +
                " " + phone + '\'' +
                " " + email + '\'' +
                " " + address + '\'' +
                " " + age;
    }
}
