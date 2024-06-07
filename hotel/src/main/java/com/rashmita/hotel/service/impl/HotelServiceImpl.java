package com.rashmita.hotel.service.impl;

import com.rashmita.hotel.entity.Hotel;
import com.rashmita.hotel.repository.HotelRepository;
import com.rashmita.hotel.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {
 private  HotelRepository hotelRepository;
    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(int id) {
        return hotelRepository.findById();
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
     return hotelRepository.updateById(hotel);
    }

    @Override
    public Hotel deleteHotel(int id) {
return hotelRepository.deleteById();
    }
}
