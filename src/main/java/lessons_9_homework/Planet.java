package lessons_9_homework;
//1. Написать enum, который перечисляет планеты Солнечной системы и возвращает массу планеты, ее радиус и радиус орбиты.
public class Planet {
  enum SolarySystem{
    SUN("Солнце",465461,21213,6566),
    MERCURY("Венера",32121,321321,231),
    VENUS("МАРС",123321,1321,321),
    EARTH("Земля",131456,6464,546),
    MARS("Марс",4987,4679,987),
    JUPITER("Юпитер",13211,5679,46546),
    SATURN("Сатурн",451313,13213,87879),
    URANUS("Уран",544846587,8898,46565),
    NEPTUNE("Нептун",1233211,79,98);


    private String name;
    private int weightPlanet;
    private int radiusPlanet;
    private int radiusOrbitPlanet;

    SolarySystem(String name, int weightPlanet, int radiusPlanet, int radiusOrbitPlanet) {
      this.name = name;
      this.weightPlanet = weightPlanet;
      this.radiusPlanet = radiusPlanet;
      this.radiusOrbitPlanet = radiusOrbitPlanet;
    }

    public String getName() {
      return name;
    }

    @Override
    public String toString() {
      return "SolarySystem{" +
              "name='" + name + '\'' +
              ", weightPlanet=" + weightPlanet +
              ", radiusPlanet=" + radiusPlanet +
              ", radiusOrbitPlanet=" + radiusOrbitPlanet +
              '}';
    }

    public void setName(String name) {
      this.name = name;
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
  }

  public static void getInfo(String namePlanet){
    for(SolarySystem planet:SolarySystem.values()){
      if(planet.getName()==namePlanet){
        System.out.println(planet);
      }
    }
  }
  public static void main(String[] args) {
    getInfo("Солнце");

    for(SolarySystem planet:SolarySystem.values()){

        System.out.println(planet);

  }

}}
