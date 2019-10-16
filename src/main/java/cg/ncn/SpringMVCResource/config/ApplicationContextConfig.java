package cg.ncn.SpringMVCResource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration

@ComponentScan( "cg.ncn.SpringMVCResource.*" )
public class ApplicationContextConfig {

    @Bean( name = "viewResolver" )
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix( "/WEB-INF/view/" );
        viewResolver.setSuffix( ".jsp" );

        return viewResolver;
    }

}