package br.com.nat.domain.entities;

public class Fish {
    private String name;
    private Boolean sea;

    public String getName() {
        return name;
    }

    public Boolean getSea() {
        return sea;
    }

    public String getName(String tucunaré) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSea(Boolean sea) {
        this.sea = sea;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", sea=" + sea +
                '}';
    }
}
