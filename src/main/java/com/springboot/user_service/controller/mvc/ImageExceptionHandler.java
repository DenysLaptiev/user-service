package com.springboot.user_service.controller.mvc;


import org.apache.tomcat.util.http.fileupload.impl.SizeLimitExceededException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


//TODO: this is not working
//@ControllerAdvice
//public class ImageExceptionHandler {
//
//    @ExceptionHandler(value = SizeLimitExceededException.class)
//    public String nullPointerHandler(Model model) {
//        model.addAttribute("err", "Uplod failed! File size exceeds the configured maximum!");
//        return "errorPage";
//    }
//
//    @ExceptionHandler(value = Exception.class)
//    public String AnyOtherHandler() {
//        return "errorPage";
//    }
//
//}
