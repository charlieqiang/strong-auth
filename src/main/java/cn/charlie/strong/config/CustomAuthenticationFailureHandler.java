package cn.charlie.strong.config;

import cn.charlie.strong.entity.result.Result;
import cn.charlie.strong.enums.SystemCodeEnum;
import cn.hutool.json.JSONUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author charlie
 * @date 2024/5/10 18:03
 **/
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {



    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter out = httpServletResponse.getWriter();
        out.write(JSONUtil.toJsonStr(Result.error(SystemCodeEnum.NO_ACCOUNT)));
        out.flush();
        out.close();
    }
}
