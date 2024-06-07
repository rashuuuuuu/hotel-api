package com.rashmita.hotel.controller;

import com.rashmita.hotel.entity.Hotel;
import com.rashmita.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hotel")
@RequiredArgsConstructor
public class HotelController {
    private final HotelService hotelService;

    @PostMapping("/create")
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @GetMapping("/find")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id) {
        Optional<Hotel> hotel = hotelService.findById(id);
        return hotel.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("byname/{name}")
    public ResponseEntity<Optional<Hotel>> getHotelByName(@PathVariable String name){
        Optional<Hotel> hotel = hotelService.getHotelByName(name);
        return ResponseEntity.ok(hotel);
    }
    @PutMapping("byid/{id}")
    public String updateHotel(@PathVariable Long id, @RequestBody Hotel hotel) {
        hotelService.updateHotel(id,hotel);
        return  ("dsfghjklk");

        return ResponseEntity.ok(hotel);
    }
}