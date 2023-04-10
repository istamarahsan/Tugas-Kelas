public class AnEmailServiceImplementation implements EmailService {

    public AnEmailServiceImplementation(){
    }

    public void sendEmail(String to, String subject, String body){
        System.out.println("Email sent to "+to+" Subject: " + subject +"Body: "+body);
    }
}
