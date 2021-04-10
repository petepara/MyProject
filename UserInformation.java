import java.io.File;
import java.nio.file.Path;
import java.util.Currency;

public class UserInformation {
    private static UserInformation user;
    public static File userOperations = Path.of("src","resources", "operations.txt").toFile();
    private static String userPassword;

    private UserInformation() {
    }
    public static UserInformation getUser(String password){
        if(user == null){
            user = new UserInformation();
            userPassword = password;
        }
        return user;
    }
    public static UserInformation getUser(){
        return user;
    }
    public static String getUserPassword() {
        return userPassword;
    }
}
