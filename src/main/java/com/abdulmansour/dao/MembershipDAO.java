package com.abdulmansour.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addMember() {
        System.out.println(getClass() + ": addAccount(): adding member in DB...");
    }
}
