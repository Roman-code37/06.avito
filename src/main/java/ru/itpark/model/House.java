package ru.itpark.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class House {
    private int id;
    private int price;
    private String district;
    private String metro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public House(int id, int price, int rooms, String district, String metro) {
    }
}
