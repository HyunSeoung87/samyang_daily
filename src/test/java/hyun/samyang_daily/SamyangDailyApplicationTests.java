package hyun.samyang_daily;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
class SamyangDailyApplicationTests {

    @RestController
    public class TestApi {

        @Value("${spring.datasource.username}")
        private String userName;

        @GetMapping("/test")
        public String test() {
            return userName;
        }
    }

}
