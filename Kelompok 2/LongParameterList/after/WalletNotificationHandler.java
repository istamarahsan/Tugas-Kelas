public interface WalletNotificationHandler {
    void handleCheck();
    void handleDeposit(int amountDeposited);
    void handleWithdraw(int amountWithdrawn);
}
