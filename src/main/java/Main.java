import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main<userList> {
    public static void main(String[] args) {


    BankAccount bankAccount1 = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
    BankAccount bankAccount2 = new BankAccount(2, "BankNowoczesny", 4444, 6532455);
    BankAccount bankAccount3 = new BankAccount(3, "Bank", 3333, 234234);
    BankAccount bankAccount4 = new BankAccount(4, "BigBank", 2222, 2342);

    User user1 = new User("Jan", "Kowalski", 44);
    User user2 = new User("Marcin", "Nowak", 66);
    User user3 = new User("Katarzyna", "Dobron", 33);
    User user4 = new User("Ola", "Lewandowska", 33);

    List<User> userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
    ObjectMapper objectMapper=new ObjectMapper();

try {

        objectMapper.writeValue(new File("userList.json"), userList);
    } catch (
    IOException e) {
        e.printStackTrace();

    }
    }
}


