package Step_3_With_SOLID.services;

import Step_3_With_SOLID.models.Message;
import Step_3_With_SOLID.models.SmsMessage;

public class SmsMessageService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        SmsMessage smsMessage = (SmsMessage) message;
        if(validatePhoneNumber(smsMessage.getSourcePhoneNumber()) && validatePhoneNumber(smsMessage.getTargetPhoneNumber())){
            System.out.println("Sending a SMS from " + smsMessage.getSourcePhoneNumber() + " to " + smsMessage.getTargetPhoneNumber() + " with content : " + smsMessage.getContent());
        }else{
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }
    private boolean validatePhoneNumber(String phoneNumber) {
        // Check if the phone number is exactly 11 characters long
        if (phoneNumber.length() != 11) {
            return false; // Phone number length is not valid
        }

        // Check if the phone number contains only numeric digits
        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false; // Phone number contains non-numeric characters
            }
        }

        // If all checks pass, return true (valid phone number)
        return true;
    }
}
