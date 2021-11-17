package db;

import lombok.Getter;
import my_users.User;

@Getter
public class authorized_user extends Авторизація{

    private boolean authorise_status = false;
    private User user_data;


    public authorized_user(User user, БазаДаних db){
        this.user_data = user;
        authentication(db);

    }

    public void authentication(БазаДаних db){
        if (this.authorise_status != true){
            авторизуватися(db);
            authorise_status = true;
        }
    }

}
