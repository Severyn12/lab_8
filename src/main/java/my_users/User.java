package my_users;



public abstract class User {
    public abstract String get_email();
    public abstract String get_country();
    public abstract int get_active_time();
    public abstract String get_notification();

    public abstract void message_receive(String message);

    public abstract String toString();
    }

