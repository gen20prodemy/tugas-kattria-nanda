package com.example.gen20javaspringbootposrestemplate.RajaOngkir.Dto;

public class OngkirRequestDto {
    private String origin;
    private String destination;
    private int weight;
    private String courier;

    public OngkirRequestDto(String origin, String destination, int weight, String courier) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.courier = courier;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }
}
