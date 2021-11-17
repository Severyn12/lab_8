package my_users;

import facebook.FacebookUser;


public class my_facebook_user extends User {

    private FacebookUser user;
    private String notification;
    public my_facebook_user(FacebookUser user){
        this.user = user;
    }

    @Override
    public String get_email() {
        return user.getEmail();
    }

    @Override
    public String get_country() {
        return user.getUserCountry();
    }

    @Override
    public int get_active_time() {
        return user.getUserActiveTime();
    }

    @Override
    public void message_receive(String message) {
        notification = message;
    }

    @Override
    public String get_notification() { return notification; }

    @Override
    public String toString(){
        String data = "FaceBook user: email "
                + get_email() + ", country "
                + get_country() + ", last online "
                + get_active_time();
        return  data;
    }
}
