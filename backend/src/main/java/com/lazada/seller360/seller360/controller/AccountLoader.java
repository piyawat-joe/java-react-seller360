package com.lazada.seller360.seller360.controller;

import com.lazada.seller360.seller360.model.Account;
import com.lazada.seller360.seller360.model.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class AccountLoader implements CommandLineRunner {

    private final AccountRepository repository;

    @Autowired
    public AccountLoader(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        // Top beers from https://www.beeradvocate.com/lists/top/
        /*Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR").forEach(name ->
                repository.save(new Account(name))
        );*/
        repository.findAll().forEach(System.out::println);
    }
}
