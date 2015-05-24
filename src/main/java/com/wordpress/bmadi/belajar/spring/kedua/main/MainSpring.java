package com.wordpress.bmadi.belajar.spring.kedua.main;

import com.wordpress.bmadi.belajar.spring.kedua.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:ioc.xml");
        Person p = (Person) ctx.getBean("andi");

        // menampilkan identitas andi
        System.out.println("firstName : " + p.getFirstName());
        System.out.println("lastName : " + p.getLastName());
        System.out.println("address : " + p.getAddress().getJalan());

    }

}
