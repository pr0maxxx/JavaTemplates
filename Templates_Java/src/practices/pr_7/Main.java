package practices.pr_7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoxContainer boxContainer1 = new BoxContainer(List.of(new PurchaseLeaf(250)));
        BoxContainer boxContainer2 = new BoxContainer(List.of(new PurchaseLeaf(130)));
        BoxContainer boxContainer3 = new BoxContainer(List.of(new PurchaseLeaf(200), boxContainer2));
        BoxContainer boxContainer4 = new BoxContainer(List.of(boxContainer1, boxContainer2, boxContainer3));
        System.out.println(boxContainer4.countPrice());

        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification(emailNotification);
        Notification messNotification = new MessNotification(smsNotification);
        sendNotification(messNotification);
    }

    private static void sendNotification(Notification notification){
        notification.send();
    }
}
