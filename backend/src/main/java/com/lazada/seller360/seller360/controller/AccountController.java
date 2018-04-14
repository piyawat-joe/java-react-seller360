package com.lazada.seller360.seller360.controller;

import com.lazada.seller360.seller360.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class AccountController {
    private AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/account")
    public Collection<Account> accounts() {
        return repository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Account account) {
        return !account.getName().equals("Budweiser") &&
                !account.getName().equals("Coors Light") &&
                !account.getName().equals("PBR");
    }
}
