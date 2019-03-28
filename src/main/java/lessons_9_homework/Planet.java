package lessons_9_homework;
//1. Написать enum, который перечисляет планеты Солнечной системы и возвращает массу планеты, ее радиус и радиус орбиты.
public class Planet {
    enum Planets{
        SUN,MERCURY,VENERUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUN
    }

    int weightPlanet;
    int radiusPlanet;
    int radiusOrbitPlanet;
    Planets namePlanet;

    public Planet(int weightPlanet, int radiusPlanet, int radiusOrbitPlanet, Planets namePlanet) {
        this.weightPlanet = weightPlanet;
        this.radiusPlanet = radiusPlanet;
        this.radiusOrbitPlanet = radiusOrbitPlanet;
        this.namePlanet = namePlanet;
    }

    public static void main(String[] args) {

    }
}
