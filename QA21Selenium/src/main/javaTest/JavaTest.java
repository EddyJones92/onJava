public class JavaTest extends Test {
    private String phone;

    public JavaTest() {
    }

    public JavaTest(long id) {
        super(id);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getName() {
        return "Java " + super.getName();
    }
}
