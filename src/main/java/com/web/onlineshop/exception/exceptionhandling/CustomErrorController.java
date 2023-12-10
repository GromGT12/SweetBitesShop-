package com.web.onlineshop.exception.exceptionhandling;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Здесь вы можете вернуть свою собственную страницу ошибки или обработать ошибку иначе
        return "error";
    }
}