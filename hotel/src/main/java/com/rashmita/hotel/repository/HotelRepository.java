package com.rashmita.hotel.repository;

import com.rashmita.hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
    Optional<Hotel> findByName(String name);

    Hotel findById();

    Hotel deleteById();

    Hotel updateById(Hotel hotel);
}
