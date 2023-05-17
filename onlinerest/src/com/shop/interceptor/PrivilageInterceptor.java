// 
// 
// 

package com.shop.interceptor;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import com.shop.po.Adminuser;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;

@Controller
public class PrivilageInterceptor implements HandlerInterceptor
{
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object object) throws Exception {
        final String uri = request.getRequestURI();
        if (uri.indexOf("admin.action") >= 0) {
            return true;
        }
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin != null) {
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/admin/index.jsp").forward((ServletRequest)request, (ServletResponse)response);
        return true;
    }
    
    public void postHandle(final HttpServletRequest arg0, final HttpServletResponse arg1, final Object arg2, final ModelAndView arg3) throws Exception {
    }
    
    public void afterCompletion(final HttpServletRequest arg0, final HttpServletResponse arg1, final Object arg2, final Exception arg3) throws Exception {
    }
}
