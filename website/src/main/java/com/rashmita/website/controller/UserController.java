package com.rashmita.website.controller;

import com.rashmita.website.entity.Website;
import com.rashmita.website.repository.WebsiteRepository;
import com.rashmita.website.service.WebsiteService;
import com.rashmita.website.service.impl.WebsiteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Website")
@RequiredArgsConstructor
public class UserController {
    private final WebsiteService websiteServiceImpl;
    private final WebsiteRepository websiteRepository;


    @PostMapping("/create")
    public Website saveWebsite(@RequestBody Website website) {
        return  websiteServiceImpl.saveWebsite(website);

    }
    @GetMapping("/find")
    public List<Website> findAllWebsite() {
        return websiteServiceImpl.findAllWebsites();
    }
    @GetMapping("/find/{id}")
    public void findWebsiteById(@PathVariable Long Id,@RequestParam("id") Long id) {
        websiteServiceImpl.findWebsiteById(id);
    }
    @DeleteMapping("/delete")
    public void deleteWebsiteById(@RequestParam Long id) {
        websiteServiceImpl.deleteWebsiteById(id);
    }
//    @PutMapping("/update/{id}")
//    public void updateWebsite(@PathVariable Long id, @RequestBody Website website) {
//       Website website1 = websiteServiceImpl.findWebsiteById(id);
//       website.setId(website.getId());
//       website.setUsername(website.getUsername());
//       website.setEmail(website.getEmail());
//       website.setPassword(website.getPassword());
//        return websiteRepository.save(website);
//    }

}
