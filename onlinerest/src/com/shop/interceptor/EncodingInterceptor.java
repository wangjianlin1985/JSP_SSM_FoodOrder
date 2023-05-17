// 
// 
// 

package com.shop.interceptor;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;

public class EncodingInterceptor implements HandlerInterceptor
{
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object arg2) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        return true;
    }
    
    public void postHandle(final HttpServletRequest request, final HttpServletResponse response, final Object arg2, final ModelAndView arg3) throws Exception {
    }
    
    public void afterCompletion(final HttpServletRequest request, final HttpServletResponse arg1, final Object arg2, final Exception arg3) throws Exception {
    }
}
