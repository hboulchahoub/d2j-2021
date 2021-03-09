package ma.cigma.pfe.module1.controllers.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private PasswordEncoder encoder;
	
	
	@Bean
	PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	// AUTHENTIFICATION
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(encoder)
		.withUser("user1").password(encoder.encode("1234")).roles("USER")
		.and()
		.withUser("admin1").password(encoder.encode("1234")).roles("ADMIN");
	}
	
	
	// AUTHORIZATION
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/clients/crud").hasRole("ADMIN")
		.antMatchers("/clients/update/**").hasRole("ADMIN")
		.antMatchers("/clients/delete/**").hasRole("ADMIN")
		.antMatchers("/clients/home", "/").hasAnyRole("ADMIN", "USER")
		.and().formLogin()
		.defaultSuccessUrl("/clients/home", true)
		.and().logout()
		.logoutSuccessUrl("/login").permitAll()
		.and();
	}

}
