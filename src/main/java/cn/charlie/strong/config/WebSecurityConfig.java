package cn.charlie.strong.config;

import cn.charlie.strong.entity.result.Result;
import cn.charlie.strong.entity.user.AuthUserToken;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @author charlie
 * @date 2024/4/25 21:09
 **/
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String[] WHITE_URL = {
            "/login"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()
                .usernameParameter("username").passwordParameter("password")
                .successHandler((request, response, authentication) -> {
                    response.setContentType("application/json;charset=utf-8");
                    AuthUserToken authUserToken = new AuthUserToken("admin-token");
                    response.getWriter().println(Result.success(authUserToken));
                })
                .and().csrf().disable();
    }
}
