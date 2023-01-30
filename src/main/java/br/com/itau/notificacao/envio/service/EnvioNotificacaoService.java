package br.com.itau.notificacao.envio.service;

import org.springframework.stereotype.Service;

import br.com.itau.notificacao.envio.domain.EmailVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EnvioNotificacaoService {
	
	private static final String nomeRemetente = "Itaú S/A";
	private static final String remetente = "tmad.testes@gmail.com";

	
	public void enviaEmail(EmailVO emailVO) {
		
			/*Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.auth", "true");
	        
	        Authenticator auth = new Authenticator() {
				//override the getPasswordAuthentication method
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("user", "[assword");
				}
			};
			Session session = Session.getInstance(props, auth);
		
	        try {
	            MimeMessage msg = new MimeMessage(session);
		      //set message headers
		      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
		      msg.addHeader("format", "flowed");
		      msg.addHeader("Content-Transfer-Encoding", "8bit");
		      msg.setFrom(new InternetAddress(remetente));
		      msg.setSubject(emailVO.getAssunto(), "UTF-8");
		      msg.setText(emailVO.getMensagem(), "UTF-8");
		      msg.setSentDate(new Date());
		      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailVO.getDestinatario(), false));
		      System.out.println("mensagem enviada.");
	    	  Transport.send(msg); 
					
			} catch (MessagingException ex) {
				throw new EmailException(ex.getMessage(), ex.getCause());
			}catch (Exception e) {
				throw new EmailException(e.getMessage(), e.getCause());
			}*/
	        System.out.println("enviou o email.");
		}
	  
	/*private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT, GsonFactory gsonFactory)
		      throws IOException {
		    // Load client secrets.
		    InputStream in = EnvioNotificacaoService.class.getResourceAsStream("*...json");
		   
		    GoogleClientSecrets clientSecrets =
		        GoogleClientSecrets.load(gsonFactory, new EnvioNotificacaoService.class.getResourceAsStream("*...json"));

		    // Build flow and trigger user authorization request.
		    GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
		        HTTP_TRANSPORT, gsonFactory, clientSecrets, Set.of(GmailScopes.GMAIL_SEND))
		        .setDataStoreFactory(new FileDataStoreFactory(Paths.get("tokens").toFile()))
		        .setAccessType("offline")
		        .build();
		    LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
		    return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
		  }
		  */
}
