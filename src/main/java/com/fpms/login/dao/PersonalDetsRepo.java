package com.fpms.login.dao;

import com.fpms.login.entities.PersonalDets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDetsRepo extends JpaRepository<PersonalDets,String> {
}
