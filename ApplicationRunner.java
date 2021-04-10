import java.io.IOException;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        String password;
        String operationType;
        double money;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter password:");
//        password = scanner.nextLine();
        if(UserInformation.getUser()==null){
            try {
                UserInformation.userOperations.createNewFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        UserInformation.getUser("password");
//        while (!(password.equals(UserInformation.getUserPassword()))){
//            System.out.println("Password is incorrect. Try again:");
//            password = scanner.nextLine();
//        }
        System.out.println("Choose type of operation:");
        System.out.println("1 - income;");
        System.out.println("2 - expense.");
        operationType = scanner.nextLine();
        while(!(operationType.equals("1")||operationType.equals("2"))){
            System.out.println("Operation type chosen incorrectly. Try again:");
            operationType = scanner.nextLine();
        }

        if(operationType.equals("1")){
            System.out.println("Введите сумму поступлений: ");
            money = scanner.nextDouble();
            Operation.income(money);
            WorkWithFile.writeToFileIncome(money);
            WorkWithFile.addToFileRealMomentMoney();
            System.out.println("На данный момент в кошельке " + Wallet.getRealMomentAmount() + " рублей");
        }
        if(operationType.equals("2")){
            System.out.println("Введите сумму расходов: ");
            money = scanner.nextDouble();
            Operation.expense(money);
            WorkWithFile.writeToFileExpense(money);
            WorkWithFile.addToFileRealMomentMoney();
            System.out.println("На данный момент в кошельке " + Wallet.getRealMomentAmount() + " рублей");
        }
    }
}
