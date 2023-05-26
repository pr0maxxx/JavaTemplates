package practices.pr_7;

public class MessNotification implements  Notification{
    private Notification notification;

    public MessNotification() {
    }

    public MessNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if(notification != null) notification.send();
        System.out.println("Отправка сообщения в приложение");
    }
}
