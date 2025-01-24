package service;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Users;

public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public void input() {
		Users user = new Users();
		//user.setId(0);
		//user.setAge(0);
		user.setUsername("홍길동");
		userRepository.save(user);
		
	}
}