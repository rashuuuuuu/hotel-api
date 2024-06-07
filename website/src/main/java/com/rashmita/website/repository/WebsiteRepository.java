package com.rashmita.website.repository;

import com.rashmita.website.entity.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteRepository extends JpaRepository<Website, Long> {

    Website updateById(Website website);

}
