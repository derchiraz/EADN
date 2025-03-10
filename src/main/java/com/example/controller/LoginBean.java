package com.example.controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String email;
    private String password;
    private boolean loginError;

    public String login() {
        if ("user@example.com".equals(email) && "Password123!".equals(password)) {
            return "home?faces-redirect=true"; // Redirection si réussi
        } else {
            loginError = true;
            return null;
        }
    }

    // GETTERS & SETTERS
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isLoginError() { return loginError; }
}

