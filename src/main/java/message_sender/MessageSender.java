package message_sender;

import lombok.Getter;
import lombok.Setter;
import my_users.User;

import java.util.ArrayList;

@Setter
@Getter
public class MessageSender {

    private ArrayList<User> users = new ArrayList();

    public void Send(String text, String country){

        for (User my_user: users){
            if (my_user.get_country().equals(country) && (my_user.get_active_time() <= 60)){
                my_user.message_receive(text);

            }
        }

    }
}
