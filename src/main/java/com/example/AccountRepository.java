package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Created by ehc on 7/7/15.
 */
@Repository
@Transactional
public interface AccountRepository extends CrudRepository<User, Integer> {
    Optional<User> findOneByEmail(String email);
}
