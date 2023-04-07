package com.kazmazschool.kasmazschool.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public class GlobalExceptionController {
    /*
   @ExceptionHandler will register the given method for a given
   exception type, so that ControllerAdvice can invoke this method
   logic if a given exception type is thrown inside the web application.
   * */
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception exception){
        ModelAndView errorPage = new ModelAndView();
        errorPage.setViewName("error");
        errorPage.addObject("errormsg", exception.getMessage());
        return errorPage;
    }
}
