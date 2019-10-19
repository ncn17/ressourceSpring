package cg.ncn.SpringMVCResource.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan( "cg.ncn.SpringMVCResource.controller" )
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers( ViewResolverRegistry registry ) {
        // Our prefix and suffix for jsp files
        registry.jsp( "/WEB-INF/views/", ".jsp" );
    }

    @Override
    public void addResourceHandlers( ResourceHandlerRegistry registry ) {
        // css resource.
        registry.addResourceHandler( "/styles/**" ) //
                .addResourceLocations( "/WEB-INF/resources/css/" ).setCachePeriod( 31556926 );

        // js ressource
        registry.addResourceHandler( "/scripts/**" ) //
                .addResourceLocations( "/WEB-INF/resources/js/" ).setCachePeriod( 31556926 );
    }
}