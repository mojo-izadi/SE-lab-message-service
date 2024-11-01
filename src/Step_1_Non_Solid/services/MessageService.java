package Step_1_Non_Solid.services;

import Step_1_Non_Solid.models.EmailMessage;
import Step_1_Non_Solid.models.SmsMessage;
import Step_1_Non_Solid.models.TelegramMessage;

public interface MessageService {
    public void sendSmsMessage(SmsMessage smsMessage);
    public void sendEmailMessage(EmailMessage emailMessage);
    public void sendTelegramMessage(TelegramMessage telegramMessage);

}
