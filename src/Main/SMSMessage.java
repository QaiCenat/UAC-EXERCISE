public class SMSMessage extends Message {
    public SMSMessage(ILogin login, String sender, String recipient, String content) {
        super(login, sender, recipient, content);
    }

    @Override
    public void send(String username, String password) {
        if (login.authenticate(username, password)) {
            System.out.println("SMS sent from " + sender + " to " + recipient + ": " + content);
        } else {
            System.out.println("SMS authentication failed for user: " + username);
        }
    }
}
