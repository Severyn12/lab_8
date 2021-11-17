package db;

import my_users.User;

import my_users.my_twitter_user;
import twitter.TwitterUser;

public class Main {
    public static void main(String[] args) {
        БазаДаних db = new БазаДаних();
        TwitterUser user = new TwitterUser();
        User new_user = new my_twitter_user(user);
        authorized_user sign_in_user = new authorized_user(new_user,db);
        if ((sign_in_user.isAuthorise_status())) {
            ReportBuilder br = new ReportBuilder(db);
            System.out.println(br.getUserData());
        }
    }
}
