package com.abdulmansour;

import com.abdulmansour.dao.AccountDAO;
import com.abdulmansour.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //get the bean(s) from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        //call the business method
        for (int i = 0; i < 2; i++)
            accountDAO.addAccount();

        for (int i = 0; i < 2; i++)
            membershipDAO.addMember();

        //close the config context
        context.close();
    }
}
