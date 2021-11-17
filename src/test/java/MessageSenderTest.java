import facebook.FacebookUser;
import message_sender.MessageSender;
import my_users.User;
import my_users.my_facebook_user;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class MessageSenderTest {
    private MessageSender msg_sender = new MessageSender();
    private User user = null;

    @BeforeEach
    void setUp() {
        FacebookUser facebookUser = new FacebookUser();
        facebookUser.setUserCountry("USA");
        facebookUser.setUserActiveTime(45);
        user = new my_facebook_user(facebookUser);
        ArrayList<User> users = new ArrayList();
        users.add(user);
        msg_sender.setUsers(users);
    }
    @org.junit.jupiter.api.Test
    void send_test() {
        msg_sender.Send("Hello","USA");
        assertEquals("Hello", user.get_notification());
    }

    @org.junit.jupiter.api.Test
    void user_test() {
        assertEquals(1, msg_sender.getUsers().size());
    }
}
