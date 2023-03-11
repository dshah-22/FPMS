package com.fpms.login.services;

import com.fpms.login.entities.PersonalDets;

import java.io.ByteArrayInputStream;
import java.util.List;

public interface PersonalDetsService {
    List<PersonalDets> getPersonalDets();
    PersonalDets getPersonalDets(String email);
    PersonalDets addPersonalDets(PersonalDets user);
    PersonalDets updatePersonalDets(PersonalDets user);
    void deletePersonalDets(String email);
    ByteArrayInputStream getActualData();
}
