package idv.huichieh.user.service;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import idv.huichieh.user.model.dto.LoginDTO;
import idv.huichieh.user.model.entity.User;
import idv.huichieh.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;
	
	public User findByPhoneNum(String phoneNum) {
		return this.userRepository.findByPhoneNum(phoneNum);
	}

    public User verify(LoginDTO dto, HttpServletRequest req) throws Exception {
        
        User user = this.findByPhoneNum(dto.getPhoneNum());
        
        if (user == null) {
        	throw new Exception("User with this phone number doesn't exist.");
        } else if (!dto.getPassword().equals(user.getPassword())) {
        	throw new Exception("The password isn't correct.");
        } else {
        	HttpSession session = req.getSession();
        	session.setAttribute("user", user);
        	
        	// 更新最後登入時間為當前時間
            user.setLastLoginTime(LocalDateTime.now());
            userRepository.save(user);
            
            return user;
        }
        
    }
    
    public User validate(HttpServletRequest req) throws Exception {
    	User user = (User) req.getSession().getAttribute("user");
    	if(Objects.isNull(user)) throw new Exception("You should log in to access this page.");
        return user;
    }
	
}
