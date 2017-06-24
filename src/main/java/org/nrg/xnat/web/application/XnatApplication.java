package org.nrg.xnat.web.application;

import org.apache.catalina.startup.Tomcat;
import org.apache.commons.lang3.StringUtils;

public class XnatApplication {
    private static final String _port = System.getenv("PORT");

    public static void main(String[] args) throws Exception {
        final String contextPath = "/";
        final String appBase     = ".";
        final Tomcat tomcat      = new Tomcat();

        tomcat.setPort(Integer.valueOf(StringUtils.defaultIfBlank(_port, "8080")));
        tomcat.getHost().setAppBase(appBase);
        tomcat.addWebapp(contextPath, appBase);
        tomcat.start();
        tomcat.getServer().setPort(8005);
        tomcat.getServer().setShutdown("shutdown-xnat");
        tomcat.getServer().await();
    }
}
