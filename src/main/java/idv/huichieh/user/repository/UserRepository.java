package idv.huichieh.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idv.huichieh.user.model.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByPhoneNum(String phoneNum);
	
}
