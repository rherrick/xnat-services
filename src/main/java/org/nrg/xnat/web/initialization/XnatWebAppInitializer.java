package org.nrg.xnat.web.initialization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@SuppressWarnings("unused")
@Slf4j
public class XnatWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
