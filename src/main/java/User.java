public class User {
    private String name;
    private String lastName;
    private int age;
    private BankAccount bankAccount;

    public User(String jan, String kowalski, int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setBankAccount(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public  BankAccount getBankAccount(){
        return this.bankAccount;
    }
}
