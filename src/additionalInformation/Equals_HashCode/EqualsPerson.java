package additionalInformation.Equals_HashCode;

public class EqualsPerson {
    // https://javarush.ru/groups/posts/1340-peregruzka-metodov-equals-i-hashcode-v-java
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        EqualsPerson guest = (EqualsPerson) obj;
        return id == guest.id
                && (firstName == guest.firstName
                || (firstName != null && firstName.equals(guest.getFirstName()))) && (lastName == guest.lastName
                || (lastName != null && lastName.equals(guest.getLastName())
        ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + id;
        result = prime * result +
                ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }
}

