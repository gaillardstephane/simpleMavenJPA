package org.formation.spring.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
 * Configuration class dispatcher-servlet.xml
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "org.formation.spring" })
@Import({ ApplicationConfig.class })
@PropertySource("classpath:application.properties")
public class WebConfig extends WebMvcConfigurerAdapter {


	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// index mapping
		// / - > index.jsp
		registry.addViewController("/").setViewName("index");
	}

	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	
	 }
	//
	// @Override
	// public void addInterceptors(InterceptorRegistry registry) {
	// registry.addInterceptor(localeChangeInterceptor());
	// }
	//
	// @Bean
	// public static PropertySourcesPlaceholderConfigurer
	// propertyPlaceholderConfigure(){
	// return new PropertySourcesPlaceholderConfigurer();
	//
	// }
	//
	// @Bean
	// public MessageSource messageSource() {
	// ResourceBundleMessageSource messageSource = new
	// ResourceBundleMessageSource();
	// messageSource.setBasename("lang");
	// messageSource.setDefaultEncoding("UTF-8");
	// return messageSource;
	// }
	//
	// @Bean
	// public LocaleChangeInterceptor localeChangeInterceptor() {
	// LocaleChangeInterceptor localeChangeInterceptor = new
	// LocaleChangeInterceptor();
	// localeChangeInterceptor.setParamName("language");
	// return localeChangeInterceptor;
	//
	// }
	//
	// @Bean
	// public CookieLocaleResolver localeResolver() {
	// CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
	// cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
	// return cookieLocaleResolver;
	//
	// }
	//
	//

}
