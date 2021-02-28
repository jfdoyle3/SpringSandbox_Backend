package com.sandbox.backendsandbox.controllers;


import com.sandbox.backendsandbox.api.NewsAPI;
import com.sandbox.backendsandbox.services.NewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    private NewsServices newsServices;

    @GetMapping("/newsSource/{endPoint}")
    public String getNewsBySource(@PathVariable String endPoint, @RequestParam(value="category") String category, @RequestParam(value="country") String country){
        return newsServices.getNewsBySource(endPoint, category, country);
    }

    @GetMapping("/news/{endPoint}")
    public String getNewsByEndPoint(@PathVariable String endPoint, @RequestParam(value = "q") String q) {
        return newsServices.getNewsByEndPoint(endPoint, q);
    }

    @GetMapping("/staticNews")
    public String getStaticNews() {
        return newsServices.getStaticNews();
    }


}
