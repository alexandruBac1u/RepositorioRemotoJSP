/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author vespertino
 */
public class Paises {
    private String code;
    private String name;
    private String region;
    private int population;

    public Paises(){
    }

    public Paises(String code, String name, String region, int population) {
        this.code = code;
        this.name = name;
        this.region = region;
        this.population = population;
    }

    public Paises(String name, String region, int population) {
        this.name = name;
        this.region = region;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
