package Google;

public class Parents {
    private String parentName;
    private String birthday;

    public Parents(String parentName, String birthday) {
        this.parentName = parentName;
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.parentName, this.birthday);
    }
}
