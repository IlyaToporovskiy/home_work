package lessons_9_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//1. Написать enum, который перечисляет планеты Солнечной системы и возвращает массу планеты, ее радиус и радиус орбиты.
public class Planet {
    enum Planets{
        SUN,MERCURY,VENERUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUN;

    public static Planets getInfo(Planets namePlanet){
        for (Planets pl: values()){
            if(namePlanet==pl){
                return pl;
            }
        }

        throw new AssertionError("Wrong namePlanet: " );
    }
    }

    private int weightPlanet;
    private int radiusPlanet;
    private int radiusOrbitPlanet;
    private Planets namePlanet;

    public Planet(int weightPlanet, int radiusPlanet, int radiusOrbitPlanet, Planets namePlanet) {
        this.weightPlanet = weightPlanet;
        this.radiusPlanet = radiusPlanet;
        this.radiusOrbitPlanet = radiusOrbitPlanet;
        this.namePlanet = namePlanet;
    }

    public int getWeightPlanet() {
        return weightPlanet;
    }

    public void setWeightPlanet(int weightPlanet) {
        this.weightPlanet = weightPlanet;
    }

    public int getRadiusPlanet() {
        return radiusPlanet;
    }

    public void setRadiusPlanet(int radiusPlanet) {
        this.radiusPlanet = radiusPlanet;
    }

    public int getRadiusOrbitPlanet() {
        return radiusOrbitPlanet;
    }

    public void setRadiusOrbitPlanet(int radiusOrbitPlanet) {
        this.radiusOrbitPlanet = radiusOrbitPlanet;
    }

    public Planets getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(Planets namePlanet) {
        this.namePlanet = namePlanet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return weightPlanet == planet.weightPlanet &&
                radiusPlanet == planet.radiusPlanet &&
                radiusOrbitPlanet == planet.radiusOrbitPlanet &&
                namePlanet == planet.namePlanet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightPlanet, radiusPlanet, radiusOrbitPlanet, namePlanet);
    }

    public static void main(String[] args) {
        new PlanetObject();


    }
}
class PlanetObject{
    public static List<Planet> create(){
        List<Planet> solarySystem =new ArrayList<>(9);
        solarySystem.add(
                new Planet(1334,424,4242, Planet.Planets.SUN)
        );solarySystem.add(
                new Planet(3132,312,534, Planet.Planets.MERCURY)
        );solarySystem.add(
                new Planet(7675,657,57, Planet.Planets.JUPITER)
        );solarySystem.add(
                new Planet(75,765,36, Planet.Planets.EARTH)
        );solarySystem.add(
                new Planet(1334,424,4242, Planet.Planets.NEPTUN)
        );solarySystem.add(
                new Planet(1334,424,4242, Planet.Planets.MARS)
        );solarySystem.add(
                new Planet(1334,424,4242, Planet.Planets.SATURN)
        );solarySystem.add(
                new Planet(1334,424,4242, Planet.Planets.VENERUS)
        );solarySystem.add(
                new Planet(1334,424,4242, Planet.Planets.URANUS)
        );
        return solarySystem;
    }
}