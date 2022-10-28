package hyun.samyang_daily.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/healthcheck")
@RequiredArgsConstructor
public class healthcheck {

    @GetMapping()
    public String healthcheck(HttpServletRequest request) {
        return "content/healthcheck";
    }
}
