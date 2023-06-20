public class EmailServiceFactory {
    public EmailService stub() {
        return new AnEmailServiceImplementation();
    }
}
