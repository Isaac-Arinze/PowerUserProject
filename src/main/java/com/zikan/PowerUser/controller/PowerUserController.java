package com.zikan.PowerUser.controller;

import com.zikan.PowerUser.Repository.PowerUserRepository;
import com.zikan.PowerUser.model.PowerUser;
import com.zikan.PowerUser.service.PowerUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class PowerUserController {

    private final PowerUserService powerUserService;

    public PowerUserController(PowerUserService powerUserService) {
        this.powerUserService = powerUserService;
    }

    @GetMapping(value = "/powerUser")
    public ResponseEntity<List<PowerUser>> getAllPowerUsers(){
        return powerUserService.getAllPowerUsers();
    }

    @GetMapping(value = "/powerUser/{id}")
    public ResponseEntity<PowerUser> getPowerUserById (@PathVariable int id){
        return powerUserService.getPowerById(id);
    }

    @PostMapping(value = "/powerUsers")
    public ResponseEntity<PowerUser>  postPowerUser(@RequestBody PowerUser powerUser){
        powerUserService.postPowerUser(powerUser);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping(value = "/powerUser/{id}")
    public ResponseEntity <PowerUser> updatePowerUserinfo (@PathVariable int id, @RequestBody PowerUser powerUser){
        return powerUserService.updatePowerUserInfo(id, powerUser);
    }
    @DeleteMapping(value = "/powerUser/{id}")
    public ResponseEntity <PowerUser>  deletePowerUser (@PathVariable int id){
        return powerUserService.deletePowerUser(id);
    }
}
