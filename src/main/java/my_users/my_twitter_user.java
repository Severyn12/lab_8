package my_users;


import twitter.TwitterUser;


public class my_twitter_user extends User{

    private TwitterUser user;
    private String notification;

    public my_twitter_user(TwitterUser user){
        this.user = user;
    }

    @Override
    public String get_email() {
        return user.getUserMail();
    }

    @Override
    public String get_country() {
        return user.getCountry();
    }

    @Override
    public int get_active_time() {
        return user.getLastActiveTime();
    }

    @Override
    public String get_notification() { return notification; }

    @Override
    public void message_receive(String message) {
        notification = message;
    }

    @Override
    public String toString(){
        String data = "Twitter user: email " + get_email() +
                ", country " + get_country() +
                ", last online " + get_active_time();
        return  data;
    }
}
