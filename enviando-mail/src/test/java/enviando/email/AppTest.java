package enviando.email;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
	/*JUnit é a mesma coisa que fazer um método main*/
	@Test
	public void testeEmail() {
		
		/*SMTP - config de propriedades*/
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true"); /*Autorização*/
		properties.put("ail.smtp.starttls", "true"); /*Autenticação*/
		properties.put("mail.smtp.host", "smtp.gmail.com"); /*Servido gmail Google*/
		properties.put("mail.smtp.port", "465"); /*porta do servidor*/
		properties.put("mail.smtp.socketFactory.port", "465"); /*Porta específica conectada pelo socket*/
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); /*Classe socket de conexão ao SMTP*/
		
	}
}

/*edan.testes.java@gmail.com */
/*Olhar configurações "SMTP" de email - cada um tem uma configuração diferente */
