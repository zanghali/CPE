package fr.cpe.impl;

import javax.inject.Inject;
import org.jboss.logging.Logger;
import fr.cpe.model.User;
import fr.cpe.model.UserDao;
import fr.cpe.IUserRestService;

public class UserRestService implements IUserRestService {
	
	Logger logger = Logger.getLogger(UserRestService.class.getName());

	@Inject
	UserDao userDao;

//	@Override
//	public void saveUser (String login, String password) {
//		User user = new User();
//		user.setLogin(login);
//		user.setPassword(password);
//		userDao.save(user);
//	}
	
	@Override
	public void saveUser (User user) {
		userDao.save(user);
	}
}
