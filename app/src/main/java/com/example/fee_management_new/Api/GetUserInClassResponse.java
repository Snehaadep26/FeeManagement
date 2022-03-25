package com.example.fee_management_new.Api;

import java.util.ArrayList;

public class GetUserInClassResponse {
    public int id;
    public String name;
    public String email;
    public String phone;
    public String details;
    public ArrayList<String> role;
    public ArrayList<Object> privilage;
    public String permission;
    public Object sessionId;
    public String image;
    public String status;
    public String pushId;
    public String pushOs;
    public StudentGetUser student;

    public GetUserInClassResponse(int id, String name, String email, String phone, String details, ArrayList<String> role, ArrayList<Object> privilage, String permission, Object sessionId, String image, String status, String pushId, String pushOs, StudentGetUser student) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.details = details;
        this.role = role;
        this.privilage = privilage;
        this.permission = permission;
        this.sessionId = sessionId;
        this.image = image;
        this.status = status;
        this.pushId = pushId;
        this.pushOs = pushOs;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDetails() {
        return details;
    }

    public ArrayList<String> getRole() {
        return role;
    }

    public ArrayList<Object> getPrivilage() {
        return privilage;
    }

    public String getPermission() {
        return permission;
    }

    public Object getSessionId() {
        return sessionId;
    }

    public String getImage() {
        return image;
    }

    public String getStatus() {
        return status;
    }

    public String getPushId() {
        return pushId;
    }

    public String getPushOs() {
        return pushOs;
    }

    public StudentGetUser getStudent() {
        return student;
    }
}


