package Bank;

public class Bank {
    // private String xx;
    // protected String xy;
    public String name;
    private String password;

    public String getPassword() {

        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;

    }

    public static void main(String[] args) {

        Bank pune = new Bank();
        // pune.setPassword("Test@1234");
        // String password = pune.getPassword();
        pune.password = "Test@1234";
        System.out.println(pune.password);

    }
}
