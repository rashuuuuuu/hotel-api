package com.rashmita.website.service.impl;

import com.rashmita.website.entity.Website;
import com.rashmita.website.repository.WebsiteRepository;
import com.rashmita.website.service.WebsiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class WebsiteServiceImpl implements WebsiteService {
    @Autowired
    private WebsiteRepository websiteRepository;


    @Override
    public Optional<Website> findWebsiteById(Long id) {
        return websiteRepository.findById(id);
    }

//    @Override
//    public Optional <Website> findWebsiteById(Long id) {
//        return websiteRepository.findById(id);
//    }


    @Override
    public Website saveWebsite(Website website) {
        return websiteRepository.save(website);
    }

//    @Override
//    public Website updateWebsite(Website website) {
//        return websiteRepository.updateById(website);
//    }

    @Override
    public void deleteWebsiteById(Long id) {
        websiteRepository.deleteById(id);
    }



    @Override
    public List<Website> findAllWebsites() {
        return websiteRepository.findAll();
    }
}
