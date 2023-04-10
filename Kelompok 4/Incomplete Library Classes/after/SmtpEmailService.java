public class SmtpEmailService implements EmailService {
    private String host;
    private int port;
    private String username;
    private String password;

    public SmtpEmailService(String host, int port, String username, String password){
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public void sendEmail(String to, String subject, String body){
        System.out.println("Email sent to "+to+" Subject: ", +subject+"Body: "+body);
    }
}
