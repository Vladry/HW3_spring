package com.homework3.DAO;

import com.homework3.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//public interface AccountRepository extends CrudRepository<Account, Long> {
public interface AccountRepository extends JpaRepository<Account, Long> {

}

