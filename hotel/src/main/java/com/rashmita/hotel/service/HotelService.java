package com.rashmita.hotel.service;

import com.rashmita.hotel.entity.Hotel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
 
public interface HotelService {
    public List<Hotel> getAllHotels();
    public Hotel getHotelById(int id);
    public Hotel saveHotel(Hotel hotel);
    public Hotel updateHotel(Hotel hotel);
    public Hotel deleteHotel(int id);

}
