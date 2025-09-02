package com.anwar.ecommerse.multivendor.repository;

import com.anwar.ecommerse.multivendor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository
/*
@Repository is not required on Spring Data JPA interfaces (JpaRepository etc.), since Spring auto-detects them.
@Repository is required on custom DAO classes where you write database logic manually.
 */
public interface HomeRepository extends JpaRepository<User,Long> {
}
