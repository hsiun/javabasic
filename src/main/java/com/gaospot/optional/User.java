package com.gaospot.optional;

import java.util.Optional;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-01 19:15
 */

public class User {
    private Address address;

    public String getCity(User user) {
        return Optional.ofNullable(user)
                .map(u->u.getAddress())
                .map(a->a.getCity())
                .orElse(new String());
    }

    public String getCity1(User user) {
        return user.getAddress().getCity();
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
