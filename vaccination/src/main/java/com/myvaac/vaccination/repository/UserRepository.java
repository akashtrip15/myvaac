package com.myvaac.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myvaac.vaccination.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmailId(String userId);

	User findByEmailIdAndMobile(String emailId, int mobile);

	User findByEmailIdAndPassword(String userId, String password);

}
