package hyun.samyang_daily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class SamyangDailyApplication {
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception{
            http
                    .csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/", "/user/availability/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/user/login")
                    .permitAll()
                    .and()
                    .logout()
                    .permitAll();
        }

    }
    public static void main(String[] args) {
        SpringApplication.run(SamyangDailyApplication.class, args);

    }

}
