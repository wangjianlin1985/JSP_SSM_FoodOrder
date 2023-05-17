// 
// 
// 

package com.shop.Utils;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import java.util.Properties;

public class MailUtils
{
    public static void sendMail(final String email, final String emailMsg) throws AddressException, MessagingException {
        final Properties props = new Properties();
        props.setProperty("mail.host", "localhost");
        final Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("service@shop.com", "111");
            }
        };
        final Session session = Session.getInstance(props, auth);
        final Message message = (Message)new MimeMessage(session);
        message.setFrom((Address)new InternetAddress("service@shop.com"));
        message.setRecipient(MimeMessage.RecipientType.TO, (Address)new InternetAddress(email));
        message.setSubject("\u7528\u6237\u6fc0\u6d3b");
        message.setContent((Object)emailMsg, "text/html;charset=utf-8");
        Transport.send(message);
    }
}
