package com.shef.animaladoption.entity;

public class Animal {
    private String address;
    private String animalType;
    private String photo;
    private String id;
    private Boolean adopted;
    public Animal(String address, String animalType, String photo, String id) {
        this.address = address;
        this.animalType = animalType;
        this.photo = photo;
        this.id = id;
        this.adopted = false;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAnimalType() {
        return animalType;
    }
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Boolean getAdopted() {
        return adopted;
    }
    public void setAdopted(Boolean adopted) {
        this.adopted = adopted;
    }
}
