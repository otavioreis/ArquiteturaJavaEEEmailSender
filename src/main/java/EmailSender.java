
public class EmailSender {
	public static void main(String[] args) {
		final String fromEmail = "otavioareis@gmail.com";
		final String password = "Hjkhjk12";
		final String toEmail = "otavioreis@gmail.com";

		System.out.println("Initializing email send");

		EmailConfig config = new EmailConfig();
		config.sendEmail(fromEmail, password, toEmail, "Assunteo Teste", "Teste de email Body");
	}
}
