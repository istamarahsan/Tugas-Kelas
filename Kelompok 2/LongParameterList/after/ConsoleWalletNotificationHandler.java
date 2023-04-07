class ConsoleWalletNotificationHandler implements WalletNotificationHandler {
	private User user;

	public ConsoleWalletNotificationHandler(User targetUser) {
		this.user = targetUser;
	}

	@Override
	public void handleCheck() {
		var body = String.format(
				"Halo %s, Saldo mu sekarang ada %2d ", user.getName(), user.getWallet().getBalance());
		printMessage(body);
	}

	@Override
	public void handleDeposit(int amountDeposited) {
		var body = String.format(
				"Halo %s, ada %2d masuk ke akunmu nih. " +
						"Sekarang balance-mu menjadi %2d", user.getName(), amountDeposited, user.getWallet().getBalance());
		printMessage(body);
	}

	@Override
	public void handleWithdraw(int amountWithdrawn) {
		var body = String.format(
				"Halo %s, ada %2d keluar dari akunmu nih. " +
						"Sekarang balance-mu menjadi %2d", user.getName(), amountWithdrawn, user.getWallet().getBalance());
		printMessage(body);
	}
	
	private void printMessage(String messageBody) {
		System.out.printf("Email terkirim ke %s\n", user.getEmail());
		System.out.println("Isi email: ");
		System.out.println(messageBody);
	}
}