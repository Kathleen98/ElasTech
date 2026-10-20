package exercises.employeeSystem;



public class NotificationEmail implements Notification {

    @Override
    public String notification() {
        return "Email has been sent";
    }

}
