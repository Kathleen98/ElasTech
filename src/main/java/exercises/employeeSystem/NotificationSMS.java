package exercises.employeeSystem;

public class NotificationSMS implements Notification {

    @Override
    public String notification() {
        return "SMS has been sent";
    }
}
