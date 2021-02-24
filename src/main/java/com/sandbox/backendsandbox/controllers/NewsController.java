package com.sandbox.backendsandbox.controllers;


import com.sandbox.backendsandbox.api.NewsAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/news")
        public String getNews(){
            String newsJson= NewsAPI.getNews();
            return newsJson;
        }
        @GetMapping("/news/{country}")
    public String getNews(@RequestParam String country){
        String newsJson= NewsAPI.getNews(country);
        return newsJson;
    }

//    @GetMapping("/news/list")
//    public List<Cryptocurrency> findAllCryptocurrencys(@PathVariable String username) {
//        return service.getCryptocurrencyList();
//    }
//
//    @GetMapping("/news/{country}")
//    public Cryptocurrency findCryptocurrencyById(@PathVariable Integer country) {
//        return service.getCryptocurrencyById(country);
//    }

}
