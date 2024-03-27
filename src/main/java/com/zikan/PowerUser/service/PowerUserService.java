package com.zikan.PowerUser.service;

import com.zikan.PowerUser.Repository.PowerUserRepository;
import com.zikan.PowerUser.model.PowerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;

@Service
public class PowerUserService {
    @Autowired
    private PowerUserRepository powerUserRepository;

//    public ResponseEntity <PowerUser> GETbYiD (int id){
//        return new ResponseEntity <> powerUserRepository.findById(id).get();
//    }


    public ResponseEntity <List<PowerUser>> getAllPowerUsers(){
        return new ResponseEntity<>(powerUserRepository.findAll(), HttpStatus.OK);
    }

//    public ResponseEntity <PowerUser> getByEmail(String email){
//        return new ResponseEntity<>(powerUserRepository.findByEmail(email).get())
//    }
    public ResponseEntity<PowerUser> getPowerById(int id) {

        try {
            return new ResponseEntity<>(powerUserRepository.findById(id).get(), HttpStatus.OK);
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    public ResponseEntity<PowerUser> postPowerUser(PowerUser powerUser){
        powerUserRepository.save(powerUser);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity <PowerUser> updatePowerUserInfo(int id, PowerUser powerUser){
        PowerUser  powerUser1 = powerUserRepository.findById(id).get();

        powerUser1.setFirstName(powerUser.getFirstName());
        powerUser1.setLastName(powerUser.getLastName());
        powerUser1.setAddress(powerUser1.getAddress());
        powerUser1.setAddress(powerUser1.getAddress());
        powerUser1.setCourse(powerUser.getCourse());
        powerUser1.setPhoneNumber(powerUser.getPhoneNumber());

        return new ResponseEntity<>(powerUserRepository.save(powerUser1), HttpStatus.OK);

    }

    public ResponseEntity<PowerUser> deletePowerUser(int id){
        PowerUser powerUser = powerUserRepository.findById(id).get();
        powerUserRepository.deleteById(id);

        return new ResponseEntity<>(powerUser, HttpStatus.OK);
    }
}
