package com.zcw.osals.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zcw.osals.admin.domain.User;
import com.zcw.osals.admin.service.UserManager;
import com.zcw.osals.base.service.impl.GenericManagerImpl;

@Service("userManager")
public class UserManagerImpl extends GenericManagerImpl<User, Long> implements UserManager {

	@Override
	public String sayHello(String name) {
		String result = "Hello, " + name + "!";
		if (logger.isInfoEnabled()) {
			logger.info("sayHello(String) - String result={}", result); //$NON-NLS-1$
		}

		return result;
	}

	@Override
	public List<User> getAll() {
		List<User> all = new ArrayList<User>();
		for (int i = 0; i < 5; i++) {
			User u = new User();
			u.setUsername("User_" + i);
			all.add(u);
		}

		if (logger.isInfoEnabled()) {
			logger.info("getAll() - List<User> all={}", all); //$NON-NLS-1$
		}
		return all;
	}

}
