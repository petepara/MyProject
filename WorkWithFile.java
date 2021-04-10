import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFile {
    public static void writeToFileIncome(double incomeMoney){
        try  (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(UserInformation.userOperations, true))){
            fileWriter.append("\nПоступление (рублей):\n" + incomeMoney + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
    }
    public static void addToFileRealMomentMoney() {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(UserInformation.userOperations, true))) {
            fileWriter.append("Остаток:\n" + Wallet.getRealMomentAmount());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
        public static void writeToFileExpense(double expenseMoney){
        try  (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(UserInformation.userOperations, true))){
            fileWriter.append("\nРасход (рублей):\n" + expenseMoney  + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
    }
}
