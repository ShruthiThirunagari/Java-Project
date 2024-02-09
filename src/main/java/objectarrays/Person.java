package objectarrays;

public class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return ssn.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                ", ssn='" + ssn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

