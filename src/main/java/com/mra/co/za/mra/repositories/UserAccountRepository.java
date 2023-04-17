package com.mra.co.za.mra.repositories;

import com.mra.co.za.mra.models.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {
}
