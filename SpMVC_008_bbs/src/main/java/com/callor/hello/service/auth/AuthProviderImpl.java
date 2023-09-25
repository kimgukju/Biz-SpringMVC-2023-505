package com.callor.hello.service.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("authProviderImpl")
public class AuthProviderImpl implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		String username = (String)authentication.getPrincipal();
		String password = (String)authentication.getCredentials();
		
		if(!username.equalsIgnoreCase("callor")) {
			throw new UsernameNotFoundException(username + " 이 없음");
		}
		if(!password.equals("!Korea1234")) {
			throw new BadCredentialsException("비밀번호 오류");
		}
		
		// username 과 비밀번호가 일치한다..
		// 로그인 실행
		// 정상적인 사용자 이면 token 을 발행하고 session 에 사용자 정보를
		// 등록하기
		// GRANT : 권한을 부여한다.
		
		List<GrantedAuthority> grantList = new ArrayList<>();
		
		// USER 라는 권한을 설정하기
		/*
		 * context.xml 에서 권한을 검사할때
		 * hasRole("권한") 처럼 사용한다
		 * Provider 에서 권한을 설정할 때는 "ROLE_권한" 과 같은 형식으로
		 * 지정을 해주어야 한다.
		 * 다수의 권한을 동시에 부여하여 검사 할 수 있다.
		 */
				grantList.add( new SimpleGrantedAuthority("ROLE_ADMIN"));
				grantList.add( new SimpleGrantedAuthority("ROLE_USER"));
		//		grantList.add( new SimpleGrantedAuthority("GUEST"));
				
				// 정상적인 사용자임을 증명하는 Token 을 발행하여 return
				// 이 Token 을 사용하여 Spring Security 는 정상적인 로그인 절차를
				// 마무리 한다.
				// security 에게 정상적인 사용자이니 login 절차를 마무리하라 라는 의미
				return new UsernamePasswordAuthenticationToken(
						username, password, grantList);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
