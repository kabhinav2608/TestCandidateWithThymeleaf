package com.interview.WebTestapplication.candidate.Repository;

import com.interview.WebTestapplication.candidate.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


    List<User> findByUserName(String username);
//
//   UserData findByIdAndUserName(String id, String username);


}
