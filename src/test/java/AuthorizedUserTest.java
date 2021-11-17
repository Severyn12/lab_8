import db.authorized_user;
import db.Авторизація;
import db.БазаДаних;
import my_users.User;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AuthorizedUserTest {
    private User user = null;
    private authorized_user signed_user = new authorized_user(user, new БазаДаних());

    @org.junit.jupiter.api.Test
    void authorize_test() {
        assertEquals(true, signed_user.isAuthorise_status());
    }
    @org.junit.jupiter.api.Test
    void is_instance_test() {
        assertTrue(signed_user instanceof Авторизація);
    }
}
