package com.abdulmansour.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount() {
        System.out.println(getClass() + ": addAccount(): adding account in DB...");
    }
}
