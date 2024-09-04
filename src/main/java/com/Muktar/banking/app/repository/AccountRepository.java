package com.Muktar.banking.app.repository;

import com.Muktar.banking.app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
