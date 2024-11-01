package Step_3_With_SOLID.models;

public class TelegramMessage extends Message{

    private String senderId;
    private String receiverId;

    public String getSenderId(){
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
}
