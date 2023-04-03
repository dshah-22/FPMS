package com.fpms.login.controller;

import com.fpms.login.entities.EducationalDets;
import com.fpms.login.entities.PersonalDets;
import com.fpms.login.services.PersonalDetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.util.List;

@RestController
public class PersonalDetsController {
    @Autowired
    private PersonalDetsService personalDetsService;

    @Autowired
    private EducationalDets educationalDets;

    @GetMapping("/personalDets")
    public List<PersonalDets> getPersonalDets(){
        return this.personalDetsService.getPersonalDets();
    }

    @GetMapping("/personalDets/{email}")
    public PersonalDets getPersonalDets(@PathVariable String email){
        return this.personalDetsService.getPersonalDets(email);
    }

    @PostMapping("/personalDets")
    public PersonalDets addPersonalDets(@RequestBody PersonalDets user){
        System.out.println(user.getEmailId());
        System.out.println(user.getName());
        return this.personalDetsService.addPersonalDets(user);
    }

    @PutMapping("/personalDets")
    public PersonalDets updatePersonalDets(@RequestBody PersonalDets user){
        return this.personalDetsService.updatePersonalDets(user);
    }

    @DeleteMapping("/personalDets/{email}")
    public ResponseEntity<HttpStatus> deletePersonalDets(@PathVariable String email){
        try{
            this.personalDetsService.deletePersonalDets(email);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("/eduDets")
//    public List<EducationalDets> getEducationalDets(){
//        return this.educationalDets.getPersonalDets();
//    }
//
//    @GetMapping("/personalDets/{email}")
//    public PersonalDets getPersonalDets(@PathVariable String email){
//        return this.personalDetsService.getPersonalDets(email);
//    }
//
//    @PostMapping("/personalDets")
//    public PersonalDets addPersonalDets(@RequestBody PersonalDets user){
//        System.out.println(user.getEmailId());
//        System.out.println(user.getName());
//        return this.personalDetsService.addPersonalDets(user);
//    }
//
//    @PutMapping("/personalDets")
//    public PersonalDets updatePersonalDets(@RequestBody PersonalDets user){
//        return this.personalDetsService.updatePersonalDets(user);
//    }
//
//    @DeleteMapping("/personalDets/{email}")
//    public ResponseEntity<HttpStatus> deletePersonalDets(@PathVariable String email){
//        try{
//            this.personalDetsService.deletePersonalDets(email);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @RequestMapping("/excel")
    public ResponseEntity<Resource> download(){
        String fileName = "Info.xlsx";
        ByteArrayInputStream actualData = personalDetsService.getActualData();
        InputStreamResource file = new InputStreamResource(actualData);
        ResponseEntity<Resource> body = ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename="+fileName)
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
                .body(file);
        return body;
    }
}
