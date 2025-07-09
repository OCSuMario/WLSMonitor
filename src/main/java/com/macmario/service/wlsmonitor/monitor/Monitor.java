package com.macmario.service.wlsmonitor.monitor;

import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author SuMario
 */
public class Monitor {

    String getResponse(HttpServletRequest request) {
        StringBuilder sw = new StringBuilder();
        sw.append("<h1>WLSMonitor at " + request.getContextPath() + "</h1>");
        
        
        return sw.toString();
    }
    
}
