package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.UserService;

@RestController //@ResponseBody 모든 메소드 위 선언 간주
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/initialinput")
	String input(){
		userService.input();
	}
}