package com.wdx.controller;

import com.wdx.util.validatecode.SimpleCharVerifyCodeGen;
import com.wdx.util.validatecode.VerifyCode;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: myworklab
 * @description: 登录的controller
 * @author: wdx
 * @create: 2020-07-13 15:47
 **/
@RestController
@Slf4j
public class LoginController {
    @ApiOperation(value = "验证码")
    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) {
        try {
            //设置长宽
            VerifyCode verifyCode = SimpleCharVerifyCodeGen.generate(80, 28);
            String code = verifyCode.getCode();
            log.info("LoginController.code= {}", code);
            //redisTemplateService.set("code",code, 120000);
            //判断用户是否点击了验证码按钮
            //redisTemplateService.set("hasVerifyCode", "1");
            //将VerifyCode绑定session
            request.getSession().setAttribute("VerifyCode", code);
            //设置响应头
            response.setHeader("Pragma", "no-cache");
            //设置响应头
            response.setHeader("Cache-Control", "no-cache");
            //在代理服务器端防止缓冲
            response.setDateHeader("Expires", 0);
            //设置响应内容类型
            response.setContentType("image/jpeg");
            response.getOutputStream().write(verifyCode.getImgBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
            log.info("", e);
        }
    }
}
