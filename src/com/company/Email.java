package com.company;

/**
 * Created by 027937 on 3/12/2019.
 */
public class Email extends Contact {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    }
}
