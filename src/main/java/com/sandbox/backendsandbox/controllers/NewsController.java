package com.sandbox.backendsandbox.controllers;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/news"){
        public
    }
    @GetMapping("/news/list")
    public List<Cryptocurrency> findAllCryptocurrencys(@PathVariable String username) {
        return service.getCryptocurrencyList();
    }

    @GetMapping("/news/{country}")
    public Cryptocurrency findCryptocurrencyById(@PathVariable Integer country) {
        return service.getCryptocurrencyById(country);
    }

}
