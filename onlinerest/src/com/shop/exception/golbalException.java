// 
// 
// 

package com.shop.exception;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.HandlerExceptionResolver;

public class golbalException implements HandlerExceptionResolver
{
    public ModelAndView resolveException(final HttpServletRequest request, final HttpServletResponse response, final Object handler, final Exception ex) {
        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setHeader("refresh", "5;url=/onlinerest/index.action");
        zdyException exception = null;
        if (ex instanceof zdyException) {
            exception = (zdyException)ex;
        }
        else {
            exception.setMessage("\u53d1\u751f\u4e86\u672a\u77e5\u5f02\u5e38");
        }
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMessage", (Object)(String.valueOf(exception.getMessage()) + "\u7cfb\u7edf\u5c06\u57285\u79d2\u4e4b\u540e\u8df3\u8f6c\u5230\u9996\u9875......"));
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
