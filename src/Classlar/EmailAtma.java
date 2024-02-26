package Classlar;

import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailAtma {

    private static final String GMAIL_PASSWORD = "xgqqilluqydrwwsa";

    // E-posta gönderen metot
    public static void mail(String subject, String message1, List<String> mailList, String kullaniciMailAdresi) {
        try {
            // E-posta gönderenin adresi
            String from = kullaniciMailAdresi;

            // Alıcıların adreslerini diziye çevirme
            String[] to = mailList.toArray(new String[0]);

            // E-posta sunucusu
            String host = "smtp.gmail.com";

            // E-posta ayarlarını içeren Properties nesnesi
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.password", GMAIL_PASSWORD);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");

            // E-posta oturumu
            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(from, GMAIL_PASSWORD);
                }
            });

            // MimeMessage nesnesi oluşturma
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));

            // Alıcı adreslerini InternetAddress dizisine dönüştürme
            InternetAddress[] toAddress = new InternetAddress[to.length];
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            // Alıcıları ekleme
            message.addRecipients(Message.RecipientType.TO, toAddress);

            // E-posta konu ve içeriğini ayarlama
            message.setSubject(subject);
            message.setText(message1);

            // E-posta gönderme
            Transport.send(message);
        } catch (Exception e) {
            // Hata durumunda hata mesajını yazdırma
            System.out.println("hata" + e);
        }
    }
}
