package com.rashmita.website.service;

import com.rashmita.website.entity.Website;

import java.util.List;
import java.util.Optional;

public interface WebsiteService {
public Optional<Website> findWebsiteById(Long id);
public Website saveWebsite(Website website);
//public Website updateWebsite(Website website);
public void deleteWebsiteById(Long id);
public List<Website> findAllWebsites();


}
