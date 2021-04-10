import java.io.*;
import java.util.Currency;

public class Wallet {
    private static String walletName;
    private static double realMomentAmount;

    public static String getWalletName() {
        return walletName;
    }

    public static void setWalletName(String walletName) {
        Wallet.walletName = walletName;
    }
    public static double getRealMomentMoney(){
            String current, last = null;
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(UserInformation.userOperations))){
                while ((current = bufferedReader.readLine()) != null){
                    last = current;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return realMomentAmount = Double.parseDouble(last != null ? last : "0");
    }

    public static double getRealMomentAmount() {

            return realMomentAmount;
    }
    public static double setRealMomentAmount(double realMomentAmount) {
        Wallet.realMomentAmount = realMomentAmount;
        return Wallet.realMomentAmount;
    }
}

