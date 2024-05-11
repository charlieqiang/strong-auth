package cn.charlie.strong.config;

import cn.charlie.strong.entity.result.Result;
import cn.charlie.strong.entity.user.AuthUserToken;
import cn.hutool.json.JSONUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author charlie
 * @date 2024/5/10 18:01
 **/
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter out = httpServletResponse.getWriter();
        AuthUserToken authUserToken = new AuthUserToken("admin-token");
        out.write(JSONUtil.toJsonStr(Result.success(authUserToken)));
        out.flush();
        out.close();
    }
}
