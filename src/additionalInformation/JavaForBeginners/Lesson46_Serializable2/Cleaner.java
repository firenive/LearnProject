package additionalInformation.JavaForBeginners.Lesson46_Serializable2;

public class Cleaner extends PersonSerializable2{
    private String nameCompany;
    public Cleaner (String name,int age, String nameCompany) {
        super(name, age);
        this.nameCompany = nameCompany;
    }
    public String getNameCompany() {
        return nameCompany;
    }
    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
    @Override
    public String toString() {
        return super.toString() + " : " + "Name company: " + nameCompany;
    }
}
