package edu.hi.ex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.hi.ex.security.CustomUserDetailsService;

//시큐리티 설정 클래스 만들기
@Configuration //이 클래스는 설정파일인것을 알려주고, 부모가 @Component  + 설정
@EnableWebSecurity //스프링 시큐리티 필터가 스프링 필터체인에 등록됨
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Override
	//밑에 설정한 경로로 들어오면 시큐리티 예외
	public void configure(WebSecurity web) throws Exception{
	web.ignoring().antMatchers("/resources/**","/css/**","/js**/","/images/**", "/lib/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//우선 CSRF설정을 해제한다.
		//초기 개발시만 해주는게 좋다.
		http.csrf().disable();
		
		http.authorizeHttpRequests()
			.antMatchers("/user/**").hasAnyRole("USER","ADMIN")
			.antMatchers("/member/**").hasAnyRole("MEMBER","ADMIN")
			.antMatchers("/admin/**").hasAnyRole("ADMIN")
			.antMatchers("/index").hasAnyRole("USER")
			.antMatchers("/**").permitAll();
		
		//스프링 시큐리티에서 제공하는 기본 로그인 폼을 사용하겠다.
		http.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/");//로그인 성공시 연결되는 url설정
			//.permitAll();
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//		.withUser("user").password("{noop}user").roles("USER").and()
//		.withUser("member").password("{noop}member").roles("MEMBER").and()
//		.withUser("admin").password("{noop}admin").roles("ADMIN","USER","MEMBER");
		auth.userDetailsService(customUserDetailsService)
			.passwordEncoder(new BCryptPasswordEncoder());
	}

}
