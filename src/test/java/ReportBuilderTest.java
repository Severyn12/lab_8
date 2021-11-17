import db.ReportBuilder;
import db.БазаДаних;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportBuilderTest {

    private ReportBuilder rb = new ReportBuilder(new БазаДаних());

    @org.junit.jupiter.api.Test
    void get_user_info_test() {

        assertEquals("user data", rb.getUserData());
    }

    @org.junit.jupiter.api.Test
    void get_static_info_test(){
        assertEquals("static data", rb.getStatisticData());
    }
}
