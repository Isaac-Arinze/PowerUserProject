package com.zikan.PowerUser.Repository;

import com.zikan.PowerUser.model.PowerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PowerUserRepository extends JpaRepository<PowerUser, Integer> {


//    Optional<PowerUser> findByEmail(String email);
//
//     Optional <PowerUser> findByFirstName (String firstName);
}
