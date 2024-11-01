package Step_3_With_SOLID.services;

import Step_3_With_SOLID.models.EmailMessage;
import Step_3_With_SOLID.models.Message;
import Step_3_With_SOLID.models.SmsMessage;

public interface MessageService {
    public void sendMessage(Message message);
}
