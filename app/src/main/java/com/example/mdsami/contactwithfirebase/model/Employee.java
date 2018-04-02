package com.example.mdsami.contactwithfirebase.model;

/**
 * Created by mdsami on 4/2/18.
 */
public class Employee {


    private String eid;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String phoneofc;
    private String phonehome;
    private String gender;
    private String bloodgroup;
    private String depaerment;
    private String propic;
    private String type;

    public Employee() {

    }


    public Employee(String eid, String name, String email, String password, String address, String phone, String phoneofc, String phonehome, String gender, String bloodgroup, String depaerment, String propic, String type) {
        this.eid = eid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.phoneofc = phoneofc;
        this.phonehome = phonehome;
        this.gender = gender;
        this.bloodgroup = bloodgroup;
        this.depaerment = depaerment;
        this.propic = propic;
        this.type = type;
    }




    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneofc() {
        return phoneofc;
    }

    public void setPhoneofc(String phoneofc) {
        this.phoneofc = phoneofc;
    }

    public String getPhonehome() {
        return phonehome;
    }

    public void setPhonehome(String phonehome) {
        this.phonehome = phonehome;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getDepaerment() {
        return depaerment;
    }

    public void setDepaerment(String depaerment) {
        this.depaerment = depaerment;
    }

    public String getPropic() {
        return propic;
    }

    public void setPropic(String propic) {
        this.propic = propic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}









