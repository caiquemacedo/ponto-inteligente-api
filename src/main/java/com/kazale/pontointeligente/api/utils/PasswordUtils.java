package com.kazale.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param password
	 * @return
	 */
	public static String gerarBCrypt(String password) {
		if ( password == null ) {
			return password;
		}
		
		log.info("Gerando hash com o BCrypt.");
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		
		return bCryptEncoder.encode(password);
	}
}
