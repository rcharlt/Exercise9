package com.company;

/**
 * Created by 027937 on 3/12/2019.
 */
public class PhoneNumber extends Contact {
    private String phone;

    public PhoneNumber(String phone) {
        this.phone = phone;
    }

    @Override
    public void contact() {
        System.out.println("Calling " +phone);
    }
}
