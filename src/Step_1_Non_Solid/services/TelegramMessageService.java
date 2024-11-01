package Step_1_Non_Solid.services;

import Step_1_Non_Solid.models.EmailMessage;
import Step_1_Non_Solid.models.SmsMessage;
import Step_1_Non_Solid.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body!
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body!

    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateId(telegramMessage.getReceiverId()) && validateId(telegramMessage.getSenderId())){
            System.out.println("Sending a telegram message from " + telegramMessage.getSenderId() + " to " + telegramMessage.getReceiverId() + " with content : " + telegramMessage.getContent());
        }
        else{
            throw new IllegalArgumentException("Telegram Id is Not Correct!");
        }

    }

    private boolean validateId(String id) {
        String idRegex = "^@[a-zA-Z]+$";

        Pattern pattern = Pattern.compile(idRegex);

        return pattern.matcher(id).matches();

    }
}
