package Step_3_With_SOLID.services;

import Step_3_With_SOLID.models.EmailMessage;
import Step_3_With_SOLID.models.SmsMessage;
import Step_3_With_SOLID.models.TelegramMessage;

public interface MessageService {
    public void sendSmsMessage(SmsMessage smsMessage);
    public void sendEmailMessage(EmailMessage emailMessage);

}
