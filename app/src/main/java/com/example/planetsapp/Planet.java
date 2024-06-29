package com.example.planetsapp;

public class Planet {
    private String planetName;
    private String moons;
    private int planetImage;
    public Planet(String planetName, String moons, int planetImage){
        this.planetName = planetName;
        this.moons = moons;
        this.planetImage = planetImage;
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public String getMoons() {
        return moons;
    }

    public void setMoons(String moons) {
        this.moons = moons;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }
}
