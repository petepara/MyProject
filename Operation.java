public class Operation {
    public static double income(double incomingMoney){
        Wallet.setRealMomentAmount(Wallet.getRealMomentMoney()+incomingMoney);
        return Wallet.getRealMomentAmount();
    }
    public static double expense(double expenseMoney){
        Wallet.setRealMomentAmount(Wallet.getRealMomentMoney()-expenseMoney);
        return Wallet.getRealMomentAmount();
    }

}
