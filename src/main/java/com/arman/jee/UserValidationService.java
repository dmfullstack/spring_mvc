package com.arman.jee;

import org.springframework.stereotype.Service;

/**
 * Created by Arman on 2017-05-08.
 */
@Service
public class UserValidationService {

	public boolean isUserValid (String user, String password) {
		if(user.equalsIgnoreCase("arman")
				&& password.equals("123")) return true;
		return false;
	}
}
