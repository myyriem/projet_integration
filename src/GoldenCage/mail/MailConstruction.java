/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.mail;

import java.net.URL;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author FGH
 */
public class MailConstruction {
    
    URL url;
    Properties properties;
    
    String mailPart ;
    Session session;
    Message message;

  
    
    public void getMailProperties(){ 
            this.properties = new Properties();
            this.properties.put("mail.smtp.auth", "true");
            this.properties.put("mail.smtp.starttls.enable", "true");
            this.properties.put("mail.smtp.host", "smtp.gmail.com");
            this.properties.put("mail.smtp.port", "587");   
    }
    
        
    public void getMailMessage(final Mail mail){
        try {
            this.session = Session.getInstance(this.properties, 
            new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(mail.getEmailEmetteur(), mail.getPwd());}});
            this.message = new MimeMessage(this.session);
            InternetAddress	recipient   = new InternetAddress(mail.getEmailRecepteur());
            this.message.setRecipient(Message.RecipientType.TO, recipient);
            this.message.setSubject(mail.getEmailSujet());
 

            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(mail.getEmailObjet());

            
            MimeMultipart mp = new MimeMultipart();
            mp.addBodyPart(mbp1);
            
            this.message.setContent(mp);

        } catch (MessagingException ex) {
            System.out.println(ex.getMessage());
        } 
     
    }
    

    
    public void SendMessage(){
    try {
        Transport.send(this.message);
        } catch (MessagingException ex) {
        System.out.println(ex.getMessage());
        }
    }
}
