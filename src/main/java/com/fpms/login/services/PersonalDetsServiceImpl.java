package com.fpms.login.services;

import com.fpms.login.dao.PersonalDetsRepo;
import com.fpms.login.entities.PersonalDets;
import com.fpms.login.helper.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class PersonalDetsServiceImpl implements PersonalDetsService{

    @Autowired
    private PersonalDetsRepo personalDetsRepo;

    public PersonalDetsServiceImpl(){
    }

    @Override
    public List<PersonalDets> getPersonalDets() {
        return personalDetsRepo.findAll();
    }

    @Override
    public PersonalDets getPersonalDets(String email){
        return personalDetsRepo.findById(email).get();
    }

    @Override
    public PersonalDets addPersonalDets(PersonalDets user) {
        personalDetsRepo.save(user);
        return user;
    }

    @Override
    public PersonalDets updatePersonalDets(PersonalDets user) {
        personalDetsRepo.save(user);
        return user;
    }

    @Override
    public void deletePersonalDets(String email) {
        PersonalDets entity = personalDetsRepo.getOne(email);
        personalDetsRepo.delete(entity);
    }

    @Override
    public ByteArrayInputStream getActualData() {
        List<PersonalDets> all = personalDetsRepo.findAll();
        ByteArrayInputStream b = Helper.dataToExcel(all);
        return b;
    }
}
