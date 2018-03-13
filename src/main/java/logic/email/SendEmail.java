
package logic.email;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
    /**
     * Sends email of the ticket information.
     * Will send an email to the users input of the email address
     *
     * @param toEmail the email that the user has inputted
     * @param destin the destination of the trip
     * @param station the station that the trip is starting at
     * @param startTime the start time of the trip
     * @param returnTime the end time of the trip
     */
    public SendEmail(String toEmail, String destin, String station, String startTime, String returnTime) {
        /**
         * The email address and password of the email address it will be sent from
         */
        final String username = "urbantransportcity@gmail.com";
        final String password = "VKthegreat";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("urbantransportcity@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));
            message.setSubject("Urban Transport Ticket");
            /**
             * Sends the information needed for the ticket
             */
            message.setContent("<h3>Your urban transport ticket is available</h3><br>" +
                    "<h4>Destination - " + destin + "</h4><br>" +
                    "<h4>Station - " + station + "</h4><br>" +
                    "<h4>Set off Time - " + startTime + "</h4><br>" +
                    "<h4>Return Time - " + returnTime + "</h4><br>", "text/html");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}