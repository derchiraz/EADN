package com.example.controller;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Date;

@Named
@RequestScoped
public class UserBean implements Serializable {

    @NotEmpty(message = "Le nom est obligatoire")
    private String name;

    private String title; // Champ titre non obligatoire

    @NotEmpty(message = "Le service est obligatoire")
    private String service;

    @NotEmpty(message = "Le statut est obligatoire")
    private String status;

    @NotEmpty(message = "L'email professionnel est obligatoire")
    @Email(message = "Veuillez entrer une adresse email valide")
    private String email;

    @NotEmpty(message = "Mot de passe obligatoire")
    @Size(min = 8, message = "Le mot de passe doit contenir au moins 8 caractères")
    private String password;

    private Date statusDate;

    // Getters et Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    // Méthode pour enregistrer l'utilisateur
    public void register() {
        // Logique d'enregistrement de l'utilisateur
        // Par exemple, enregistrer dans la base de données

        // Afficher un message de succès
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Inscription réussie !"));
        
        // Réinitialiser les champs après l'enregistrement
        resetFields();
    }

    // Méthode pour réinitialiser les champs
    private void resetFields() {
        name = null;
        title = null; // Réinitialiser le champ titre
        service = null;
        status = null;
        email = null;
        password = null;
        statusDate = null;
    }
}