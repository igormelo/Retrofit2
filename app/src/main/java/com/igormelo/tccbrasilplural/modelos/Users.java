package com.igormelo.tccbrasilplural.modelos;

import com.igormelo.tccbrasilplural.Address;

/**
 * Created by root on 01/11/16.
 */

public class Users {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String website;
    Address address = new Address();



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
