package com.coolcoder.banking.repository;

import com.coolcoder.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account,Long> {
}
