package com.karbelkardesigns.parkinglot.service;

import com.karbelkardesigns.parkinglot.bean.Vehicle;
import com.karbelkardesigns.parkinglot.cache.Cache;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
public class VehicleService {

    @PostMapping(value = "/add")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle){
        Cache.instance.getParkedList().put(vehicle.getPlate(), "P1");
        return ResponseEntity.status(HttpStatus.OK).body(Cache.instance.getParkedList().get(vehicle.getPlate()));
    }

    @GetMapping(value = "/find/{plate}")
    public String findVehicle(@PathVariable String plate) {
        return Cache.instance.getParkedList().get(plate);
    }

    @DeleteMapping(value = "/remove/{plate}")
    public String removeVehicle(@PathVariable String plate){
        Cache.instance.getParkedList().remove(plate);
        return "OK";
    }
}
